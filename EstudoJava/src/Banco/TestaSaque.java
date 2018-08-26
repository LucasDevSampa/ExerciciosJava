package Banco;

public class TestaSaque {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.deposita(100);
		try {
			c.saca(110);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		try {
			c.deposita(-100);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	
	
	}

}
