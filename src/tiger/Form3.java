package tiger;

import java.util.ArrayList;
import java.util.List;


public class Form3 {

	public static void main(String[] args) {
		
		DAO<Pet> dao = new DAO<Pet>();
		dao.add(new Pet("cachoro", 4, "cão"));
		
		Pet pet = dao.retorna();
		System.out.println("mostra pet"); 
		System.out.println(pet);
		
		DAO<String> string = new DAO<String>();
		string.add("minha string");
		System.out.println(string.retorna());
		
		List<Integer> inteiross = new ArrayList<Integer>();
		
		double i;
		Double c;
		
		int a = 10;
		Integer x = new Integer("50");//wrapper
		char cd ;
		Character f ;
		
		
		x = a;
		
	}
	
}
