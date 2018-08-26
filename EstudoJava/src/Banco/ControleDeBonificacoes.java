package Banco;

public class ControleDeBonificacoes {
	
	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario funcionario) {
		System.out.println("Adiociona funcionario " + funcionario);
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}
	
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
