package Baskara;

import java.util.Scanner;

public class Baskara {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double a, b, c, delta, r1, r2; 
	
	a = Double.parseDouble(input.next()) ;
	b = Double.parseDouble(input.next());
	c = Double.parseDouble(input.next());
	delta = (Math.pow(b, 2)-4*a*c);
	if (delta < 0) {
		System.out.println("Impossivel calcular");
	}else {
		if(a == 0) {
			System.out.println("Impossivel calcular");
		}else {
			r1 = (-b+Math.sqrt(delta))/(2*a);
			r2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.printf("R1 = %.5f\n",r1);
			System.out.printf("R2 = %.5f\n",r2);
		}
	
	}
	input.close();
  }
}