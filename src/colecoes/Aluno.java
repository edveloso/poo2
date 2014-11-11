package colecoes;

public class Aluno implements Comparable<Aluno>{

	private Integer matricula;
	
	private String nome;
	
	public Aluno(String nome){
		this.nome = nome;
	}
	
	public Integer getMatricula(){
		return matricula;
	}
	
	public void setMatricula(Integer matricula){
		this.matricula = matricula;
	}
	
	public int compareTo(Aluno aluno){
		return this.nome.compareTo(aluno.getNome()); 
	}
	
	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	
}
