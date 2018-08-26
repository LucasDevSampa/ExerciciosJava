package Programa2;

public class TestaPorta {

	public static void main(String[] args) {
		Porta p1 = new Porta();
		
		p1.pinta("Amarelo");
		p1.aberta = true;
		p1.dimencione(10, 10, 3);
		
		
		p1.abre();
		p1.fecha();
		p1.fecha();
		p1.abre();
		p1.abre();
	}

}
