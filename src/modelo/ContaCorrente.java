package modelo;


//Visibilidade
public class ContaCorrente {
	
	//3 operadores de visibilidade
	//Modificadores de visibilidade
	//protected
	
	
	//construtor default e implícito
	//inicializar as variáveis de sua classe
	private String correntista; //só é acessível pela própria classe

	private String numeroConta;
	
	//é visível em todo o escopo
	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	
	

}
