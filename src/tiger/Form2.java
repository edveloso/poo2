package tiger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Form2 {

	
	public static void main(String[] args) {
		
		List<Pet>  pets = new ArrayList<Pet>();
		pets.add(new Pet("pitbull", 6, "arranca perna"));
		pets.add(new Pet("pintcher", 2, "marrentin"));
		pets.add(new Pet("vira-lata", 35, "perebis" ));
		
		for(Pet pet : pets){
			System.out.print("Nome: "+ pet.getNome());
			System.out.print(" Idade: " + pet.getIdade());
			System.out.println(" Raça: "+ pet.getRaca());
		}
		
		Scanner scan = new Scanner(System.in);
		Pet pet = new Pet();
		System.out.println("informe o nome");
		String nome = scan.nextLine();
		pet.setNome(nome);
		
		System.out.println("informe a raça");
		String raca = scan.nextLine();
		pet.setRaca(raca);
		
		System.out.println("informe a idade");
		int idade = scan.nextInt();
		pet.setIdade(idade);
		
		System.out.println("valores digitados");
		
		System.out.print("Nome: "+ pet.getNome());
		System.out.print(" Idade: " + pet.getIdade());
		System.out.println(" Raça: "+ pet.getRaca());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}


