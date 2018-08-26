package Banco;

public class TestaCasses {

	public static void main(String[] args) {
		Funcionario f = new Gerente();
		f.salario = 5000;
		ControleDeBonificacoes c1 = new ControleDeBonificacoes();
		
		c1.registra(f);
		System.out.println(c1.getTotalDeBonificacoes());
	}

}
