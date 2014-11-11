package anotacao;


@Entity
public class Pessoa {

	@Column(name="nome_pessoa", size=20)
	private String nome;

}
