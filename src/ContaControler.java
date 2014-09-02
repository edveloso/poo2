
public class ContaControler {

	private ContaService contaService;
	
	public void sacar(String correntista, double valor){
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setCorrentista(correntista );
		contaService.sacar(contaCorrente, valor);
	}
	
	
	public void depositar(String correntista, double valor){
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setCorrentista(correntista );
		contaService.sacar(contaCorrente, valor);
	}
	
}
