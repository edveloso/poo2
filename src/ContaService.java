
public class ContaService {

	private Movimentacao movimentacao;

	public void sacar(ContaCorrente conta, double valor){
		movimentacao.sacar(valor);
	}
	
	public void depositar(ContaCorrente conta, double valor){
		movimentacao.depositar(valor);
	}
	
	
	public Movimentacao getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(Movimentacao movimentacao) {
		this.movimentacao = movimentacao;
	}
	
	
	
}
