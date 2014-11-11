package anotacao;

@Entidade(nome="tbl_aluno")
public class Aluno {

	private String nome;
	
	private Integer idade;

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Aluno(String nome) {
		this.nome = nome;
	}

	@Coluna(nome="alu_nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Coluna(nome="alu_idade")
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
}
