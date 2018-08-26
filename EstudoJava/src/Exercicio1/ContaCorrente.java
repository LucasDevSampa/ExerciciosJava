package Exercicio1;

public class ContaCorrente {
	protected double saldo;
	
	public ContaCorrente() {
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		double taxaDeOperacao = valor * 0.5;
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo = this.saldo - valor - taxaDeOperacao;
		}
		
	}
}
