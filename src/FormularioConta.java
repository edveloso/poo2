import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;

//Separar as classes em espaços 
//lógicos e coerentes

//Resolver este problema
public class Formulario {

	public static void main(String[] args) {
		
		ContaControler controler = new  ContaControler();
		controler.sacar("jose herminio", 100);
		
	
		Date dataSql = new Date(123);
	    PreparedStatement ps = null;
	
	    //Resolva este erro;
	    ps.setDate(1, dataSql);
		
		
		
		
	}
	
}
