package colecoes;

import java.util.Vector;

public class Forumulario2 {

	public static void main(String[] args) {
		//Generics e Templates é a mesma coisa
		//Classe template é uma classe que usa
		//uma notação de < e >, dentro da notação 
		//informa o tipo que ela pode conter
		
		//Classes de coleção template e não template
		Vector lista = new Vector();
		lista.add(new Aluno("jose"));
		lista.add(23);
		lista.add(false);
		lista.add("texto");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		Vector<Aluno> listaAluno = new Vector<Aluno>();
		listaAluno.add(new Aluno("jose"));
		listaAluno.add(new Aluno("maria"));
		listaAluno.add(new Aluno("joao"));

		System.out.println(" ");
		System.out.println("======================");
		
		//foreach, enhanced for, novo for
		for(Aluno aluno : listaAluno){
			System.out.println(aluno.getNome());
		}
		
		System.out.println(" ");
		System.out.println("======================");
		
		
		listaAluno.remove(2);
		
		Aluno mary = listaAluno.get(1);
		mary.setNome("josefina");
		
		for(Aluno aluno : listaAluno){
			System.out.println(aluno.getNome());
		}
		
		
		
		
		
		
		
		
		
	}
	
}
