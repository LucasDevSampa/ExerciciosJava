package Arrays;

public class TestaCasaArray {

	public static void main(String[] args) {
		Casa c = new Casa();
		Casa c1 = new Casa();
		c.setPortas(new Porta[5]);
		
		for (int i = 0; i < 5; i++) {
			c.adicionaPorta(new Porta());
		}
		
		System.out.println(c.getTotalDePortas());
		System.out.println(c1.getTotalDePortas());
	
		
		
		System.out.println(c.getPortas()[0].estaAberta());
		c.getPortas()[0].fecha();
		System.out.println(c.getPortas()[0].estaAberta());


	}

}
