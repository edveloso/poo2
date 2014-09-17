package pacotexterno;

import modelo.Aluno;
import pacoteinterno.ClasseA;

public class ClasseC {

	public static void main(String[] args) {
		
		int[] inteiros = new int[20000];	
		inteiros[2] = 50;
		
		Aluno aluno = new Aluno("veloso");
		Aluno[] alunos = new Aluno[10];
		alunos[0] = aluno;
		alunos[9] = aluno;
		
		
		
		
		
		
		ClasseA classeA = new ClasseA();
	//	classeA.atrPrivado = 10;
		classeA.atrPublico = 20;
	//	classeA.atrProtegido = 30;
	//	classeA.atrDefault = 40;
		
	//	classeA.metPrivado();
		classeA.metodoPublico();
	//	classeA.metodoProtegido();
	//	classeA.metodoDefault();
		
	}
}
