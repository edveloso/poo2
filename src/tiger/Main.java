package tiger;

import java.util.List;

import colecoes.Aluno;

public class Main {
	
	public static void main(String[] args) {
		
		DAO2<Aluno> daoPessoa = new DAO2<Aluno>();
		
		DAO2 dao =  new DAO2();
		dao.salvar2(new Pessoa());
		dao.salvar2(new Aluno(null));
		
		
		
		
		
	}
	
}
