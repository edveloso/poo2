package tiger;

public class Pet {
	
	private String raca;
	
	private int idade;
	
	private String nome;
	
	public Pet() {
	}

	public Pet(String raca, int idade, String nome) {
		super();
		this.raca = raca;
		this.idade = idade;
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pet [" + (raca != null ? "raca=" + raca + ", " : "") + "idade="
				+ idade + ", " + (nome != null ? "nome=" + nome : "") + "]";
	}
	
	
	
	
	

}
