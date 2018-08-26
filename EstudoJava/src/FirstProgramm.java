
public class FirstProgramm {
	public static void main(String[] args) {
		System.out.println("Ola mundo!!!");
		int fatorial = 0, temp;
		for (int i = 0; i <= 10; i++) {
			fatorial = i;
			if(fatorial == 0) {
				System.out.println(1);				
			}else {
				temp = (fatorial - 1);
				while (temp > 0) {
					fatorial *= temp;
					temp--;
				}
				System.out.println(fatorial);
			}			
		}
	
	}

}
