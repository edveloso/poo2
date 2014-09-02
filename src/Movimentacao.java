
public class Movimentacao {
	private double saldo;
	
	public void sacar(double valor){
		if(valor > saldo)
			saldo = saldo - valor;
		else
			System.out.println("não há saldo");
	}
	
	public void depositar(double valor){
		if(valor > 0){
			saldo = valor + saldo;
		}
	}
	
	
}
