package modelo.persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoComBanco {

	
	//Sinalise aqui o método para que ele avise que é um código sensível
	public void conecta() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306");
		} catch (ClassNotFoundException e) {
			System.out.println("Erro de driver: "+ e.getMessage());
		} catch (SQLException e) {
			System.out.println("Erro de conexão com o banco "+ e.getMessage());
		}
		
	}

	
	
}
