package java_pilha;

public class TesteConexao {
	public static void main(String[] args) {

		// ctry-with-resources
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(Exception ex) {
			System.out.println("Deu erro");
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
