package SortSimples;

import java.util.Scanner;

public class SortSimples {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] seq = new int[3];
		int[] ori = new int[3];
		int temp;
		
		for (int i = 0; i < seq.length; i++) {
			ori[i] = seq[i] = Integer.parseInt(entrada.next());
		}
		
		for (int i = 0; i < seq.length; i++) {
			for (int j = 0; j < seq.length - 1; j++) {
				if(seq[j] >= seq[j+1]) {
					temp = seq[j];
					seq[j] = seq[j+1];
					seq[j+1] = temp;
				}
			}
		}	
		for (int i = 0; i < seq.length; i++) {
			System.out.println(seq[i]);
		}
		System.out.println();
		for (int i = 0; i < seq.length; i++) {
			System.out.println(ori[i]);
		}
	}
}
