package java_pilha;

public class TesteConexao {
	public static void main(String[] args) {

		// try-with-resources, a classe conexão extende a classe AutoCoseable, não sendo necessário o fechamento de todas conexões
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
//		// forma de fazer conexão 
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexão");
//			con.fecha();
//		} finally {
//			con.fecha();
//		}
	}
}
