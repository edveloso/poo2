package modelo;

public class Aluno implements Comparable<Aluno>{
    
	//Atributo instância 
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	void matricular(int mat){
		int matricula;
	}

	@Override
	public int compareTo(Aluno al) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(al.getNome());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
