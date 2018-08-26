package Banco;

public class Empresa {
	Funcionario[] empregados;
	String cnpj;
	
	void adiciona(Funcionario f) {
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i] == null) {
				empregados[i] = f;
				break;
			}		
		}		
	}
	
	
	
	void mostrarEmpregados() {
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i] != null) {
				System.out.println("Teste");
			}
		}
	}
}
