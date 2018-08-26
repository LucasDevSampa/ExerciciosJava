package TratamentoDeErros;

public class TesteDeErro {
	public static void main(String[] args) {
		System.out.println("Inicio do metodo");
		try {
			metodo1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: "+ e);
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("inicio do metodo 1");
		
			metodo2();
		
		
		System.out.println("Fim do metodo 1");
	}

	private static void metodo2() {
		System.out.println("Inicio do metodo 2");
		int[] array = new int[10];
		for (int i = 0; i < 15; i++) {
				
			array[i] = i;
			System.out.println(i);
		}
		
		System.out.println("Fim do metodo 2");
	}
	

}
