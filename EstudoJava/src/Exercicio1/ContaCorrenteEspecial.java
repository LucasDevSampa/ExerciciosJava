package Exercicio1;

public class ContaCorrenteEspecial extends ContaCorrente {
	
	@Override
	public void saque(double valor) {
		double taxaDeOperacao = valor * 0.1;
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo = this.saldo - valor - taxaDeOperacao;
		}
	}
	
}
