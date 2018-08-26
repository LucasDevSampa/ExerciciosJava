package TratamentoDeErros;

import java.io.FileNotFoundException;

public class TesteArquivo {
	public static void main(String[] args)  {
		try {
			metodo();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@SuppressWarnings("resource")
	public static void metodo() throws FileNotFoundException {
		new java.io.FileInputStream("arquivo.txt");
	}
}
