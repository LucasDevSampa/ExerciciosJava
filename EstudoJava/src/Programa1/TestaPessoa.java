package Programa1;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Lucas";
		p1.idade = 30;
		int x = 0;
		while (x<10) {
			++x;
			p1.fazAniversario();
		}
		p1.mostra();
		

	}

}
