package Programa1;

public class Pessoa {
	String nome;
	int idade;
	
	void fazAniversario() {
		this.idade++;
	}
	void mostra() {
		System.out.println("Nome: "+ this.nome +"\n"+"Idade: "+this.idade+" Anos");
	}
}
