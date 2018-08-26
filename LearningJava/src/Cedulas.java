import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		int[] cedulas = {100,50,20,10,5,2,1};
		int x, div;
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextInt();
		System.out.println(x);
		entrada.close();
		for (int i = 0; i < cedulas.length; i++) {
			div = x/cedulas[i];
			if(div==0) {
				System.out.println(div + " nota(s) de "+"R$ "+ cedulas[i]+",00");
			}else {
				System.out.println(div + " nota(s) de "+"R$ "+ cedulas[i]+",00");
				x = x - (cedulas[i]*div);
			}
		}

	}

}
