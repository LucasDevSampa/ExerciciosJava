package Programa2;

public class TestaCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casa c1 = new Casa();
		c1.porta1 = new Porta();
		c1.porta2 = new Porta();
		c1.porta3 = new Porta();
		
		c1.porta1.aberta = false;
		c1.porta2.aberta = false;
		c1.porta3.aberta = false;
		
		System.out.println(c1.quantaPortasEstaoAbertas());
		
				

	}

}
