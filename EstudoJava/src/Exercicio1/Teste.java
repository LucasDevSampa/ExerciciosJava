package Exercicio1;

public class Teste {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.deposita(5000.0);
		contaCorrente.saque(100);
		System.out.println(contaCorrente.getSaldo());
		
		ContaCorrente contaEspecial = new ContaCorrenteEspecial();
		
		contaEspecial.deposita(1000.0);
		contaEspecial.saque(1100);
		System.out.println(contaEspecial.getSaldo());
		
	
		
	}

}
