package java_pilha;
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {        	        	
        	metodo1();
//        /* } catch(ArithmeticException | NullPointerException | MinhaExcecao e) { */
        	// multi-catch ^
        } catch(Exception e) { // como esses métodos unchecked e checked são filhos da Exception basta referenciá-la
        	String msg = e.getMessage();
        	System.out.println("Ocorreu uma exceção do tipo: " + msg);
        	e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        	metodo2();        	
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        // ArithmeticException ex = new ArithmeticException("deu erro");
        // throw ex;
        
       // throw new ArithmeticException("erro");
        
        throw new MinhaExcecao("deu errado");
        
        // a partir daqui ele não funciona pois sai desse método
        // System.out.println("Fim do metodo2");
    }
}