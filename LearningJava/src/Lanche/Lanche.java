package Lanche;
import java.util.Locale;
import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int selecao, qtd;
		double preco;
		Scanner entrada = new Scanner(System.in);
		selecao = entrada.nextInt();
		qtd = entrada.nextInt();
		entrada.close();
		switch(selecao) {
		case 1: preco = qtd*4.00;
				System.out.printf("Total: R$ %.2f%n", preco);
				break;
		case 2: preco = qtd*4.50;
				System.out.printf("Total: R$ %.2f%n", preco);
				break;
		case 3: preco = qtd*5.00;
				System.out.printf("Total: R$ %.2f%n", preco);
				break;
		case 4: preco = qtd*2.00;
				System.out.printf("Total: R$ %.2f%n", preco);
				break;
		case 5: preco = qtd*1.50;
				System.out.printf("Total: R$ %.2f%n", preco);
				break;
		}
	}

}
