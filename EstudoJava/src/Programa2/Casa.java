package Programa2;

public class Casa {
	Porta porta1;
	Porta porta2;
	Porta porta3;
	String cor;
	void pinta (String cor) {
		this.cor = cor;
	}
	int quantaPortasEstaoAbertas() {
		int qtd = 0;
		if (porta1.aberta == true) {
			qtd+=1;
		} 
		if(porta2.aberta == true) {
			qtd+=1;
		}
		if(porta3.aberta == true) {
			qtd+=1;
		}
		return qtd;
	}
}
