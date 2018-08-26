package conversordedias;

import java.util.Scanner;

public class ConverteDias {

	public static void main(String[] args) {
			int ano,mes,dia;
			Scanner entrada = new Scanner(System.in);
			dia = entrada.nextInt();
			entrada.close();
			ano = dia/365;
			dia = dia - (ano*365);
			mes = dia/30;
			dia = dia - (mes*30);
			System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",ano,mes,dia);
	}

}
