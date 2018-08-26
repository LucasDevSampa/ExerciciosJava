import java.util.Scanner;

public class cedulas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float valor;
		int div;
		int[] cedulas = {100,50,20,10,5,2,1};
		Scanner entrada = new Scanner(System.in);
		valor = entrada.nextInt();
		for (int i = 0; i < cedulas.length; i++) {
			div = valor/cedulas[i];
			if(div == 0) {
				System.out.println(valor + " nota(s) de R$"+ cedulas[i] + " reais");
			}else {
				System.out.println(valor + " nota(s) de R$"+ cedulas[i] + " reais");
				valor = valor - (cedulas[i] * div);
			}
			
		}
	}

}
