package AreaTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double a,b,c,areaTrapezio, perimetroTriangulo;
		boolean eTriangulo;
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		if (Math.abs(b-c) < a && a < b+c) {
			if (Math.abs(b-c) < a && a < b+c) {
				if (Math.abs(b-c) < a && a < b+c) {
					eTriangulo = true;
				}else {
					eTriangulo = false;
				}
			}else {
				eTriangulo = false;
			}
		}else {
			eTriangulo = false;			
		}
		if (eTriangulo) {
			perimetroTriangulo = a+b+c;
			System.out.println("Perimetro = " + perimetroTriangulo);
		} else {
			areaTrapezio = ((a+b)*c)/2;
			System.out.println("Area = " + areaTrapezio);
		}
		
		entrada.close();
	}
}
