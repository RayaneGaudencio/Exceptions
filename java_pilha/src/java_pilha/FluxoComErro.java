package java_pilha;
public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {        	        	
        	metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecaoExtendException e) {
        	String msg = e.getMessage();
        	System.out.println("Ocorreu uma exceção do tipo: " + msg);
        	e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecaoExtendException{
        System.out.println("Ini do metodo1");
        	metodo2();        	
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecaoExtendException{
    	throw new MinhaExcecaoExtendException("hierarquia vindo diretamente Exception");
    	// para ser filho direto da classe Exception sem passar pela RuntimeException é preciso ter a assinatura do método
    	// checked
    	// é usado com checked pra forçar o uso da assinatura do método ou de um bloco try catch
    	
    	
        // System.out.println("chamando método dois");
    	// metodo2();
    	// System.out.println("fim do método dois");
    	// isso lança um erro do tipo StackOverFlowError que está do outro lado da hierarquia do Throwable
    }
}