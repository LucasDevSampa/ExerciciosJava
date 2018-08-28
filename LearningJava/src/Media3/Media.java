package Media3;

import java.util.Locale;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		float mp, n1, n2, n3, n4, n5, nf;
		Scanner entrada = new Scanner(System.in);
		n1 = Float.parseFloat(entrada.next());
		n2 = Float.parseFloat(entrada.next());
		n3 = Float.parseFloat(entrada.next());
		n4 = Float.parseFloat(entrada.next());
		
		mp = (n1*2+n2*3+n3*4+n4*1)/(1+2+3+4);
		
		if(mp >= 7) {
			System.out.printf("Media: %.1f%nAluno aprovado.%n", mp);
		}else if(mp < 4.9) {
			System.out.printf("Media: %.1f%nAluno reprovado.%n", mp);
		}else if(mp>=5 && mp<=6.9) {
			Scanner notar = new Scanner(System.in);
			n5 = Float.parseFloat(entrada.next());
			nf = (mp+n5)/2;
			System.out.printf("Media: %.1f%nAluno em exame.%nNota do exame: %.1f%n", mp, n5);
			if(nf > 4.9) {
				System.out.printf("Aluno aprovado.%nMedia final: %.1f%n", nf);
			}else{
				System.out.printf("Aluno reprovado.%nMedia final: %.1f%n", nf);
			}
		}
		entrada.close();
	}
}
