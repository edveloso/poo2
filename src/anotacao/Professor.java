package anotacao;

@Entidade(nome="XUXU")
public class Professor {

	private String nome;
	
	private Integer matricula;
	
	private String cpf;

	public Professor(String nome, int matricula, String cpf) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
	}

	public Professor(String nome) {
		this.nome = nome;
	}

	@Coluna(nome="prf_nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Coluna(nome="MAT")
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Coluna(nome="CPF")
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
