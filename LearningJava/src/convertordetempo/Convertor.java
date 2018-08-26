package convertordetempo;
import java.util.Scanner;

public class Convertor {

	public static void main(String[] args) {
	int hora,minuto,segundo;
	Scanner entrada = new Scanner(System.in);
	segundo = entrada.nextInt();
	hora = segundo/3600;
	segundo = segundo - (hora*3600);
	minuto = segundo/60;
	segundo = segundo - (minuto*60);
	System.out.printf("%d:%d:%d\n",hora,minuto,segundo);
		
	}

}
