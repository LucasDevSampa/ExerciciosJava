package Banco;

abstract class Funcionario {
	//private static int qtdFuncionario = 0;
	protected int identificador;
	protected double salario;
	
	
	/*Funcionario(){
		Funcionario.qtdFuncionario+=1;
		identificador = Funcionario.qtdFuncionario;
	}*/
	
	abstract double getBonificacao();
}