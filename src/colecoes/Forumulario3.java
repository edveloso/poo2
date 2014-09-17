package colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;


public class Forumulario3 {

	public static void main(String[] args) {
		//Criar uma instancia para cada tipo
		//concreto da API de coleções, atravez da 
		//interface: List, Set e SortedSet
		//Usando toda a API: add, remove, contains, etc...
		//exemplo:
		List<Aluno> listaAluno = new ArrayList<Aluno>();
		listaAluno.add(new Aluno("jose"));
		listaAluno.remove(listaAluno.get(0));
	System.out.println(listaAluno.contains(new Aluno("maria")));
	listaAluno.add(new Aluno("godofreda"));
	Aluno aluno = listaAluno.get(0);
	//... este foram alguns exemplos,
	//façam com o restante dos métodos e das classes concretas
	
	List<Aluno> vectList = new Vector<Aluno>();
	
	
	
	Set<Aluno> setColec = new HashSet<Aluno>();
	
	Aluno aluno1 = new Aluno("antoin");
	setColec.add(aluno1);
	
	for (Aluno al : setColec) {
		if(al.getNome().equals("antoin"))
			setColec.remove(al);
	}
	
	setColec.remove(aluno1);
	setColec.contains(aluno1);
	
	SortedSet<Aluno> sset = new TreeSet<Aluno>();
		
		
		
		
	}
	
}
