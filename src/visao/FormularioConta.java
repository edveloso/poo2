package visao; 

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import controle.ContaControler;

//Separar as classes em espaços 
//lógicos e coerentes

//Resolver este problema
public class FormularioConta {
	
	//o nome totalmente qualificado de uma classe 
	//é composto pelo nome da classe mais seu pacote completo
	
	
	public static void main(String[] args) throws SQLException {
		
		ContaControler controler = new  ContaControler();
		controler.sacar("jose herminio", 100);
		
		Date dataUtil = new Date(123);
	    PreparedStatement ps = null; 
	    		
	    //Resolva este erro;
	    //conflito de nomes
	    java.sql.Date dataSql = new java.sql.Date(123);
	    ps.setDate(1, dataSql);
		
		
		
		
	}
	
}
