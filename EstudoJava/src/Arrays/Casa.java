package Arrays;

public class Casa {
	private Porta[] portas;
	private String cor = "Neutro";
	private int totalDePortas = 0;
	
	public Porta[] getPortas() {
		return portas;
	}

	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}

	
		
	public int getTotalDePortas() {
		return totalDePortas;
	}

	public void setTotalDePortas(int totalDePortas) {
		this.totalDePortas = totalDePortas;
	}
	
	void pinta (String cor) {
		this.setCor(cor);
	}	
	
	void adicionaPorta(Porta p) {
		for (int i = 0; i < portas.length; i++) {
			if (portas[i] == null) {
				portas[i] = p;
				portas[i].aberta = true;
				setTotalDePortas(getTotalDePortas()+1);
				break;
			}			
		}
	}
	
	
	
	int quantasPortasEstaoAbertas() {
		int total = 0;
		for (int i = 0; i < getTotalDePortas(); i++) {
				if(portas[i].estaAberta() == true) {
				total+=1;
			}
		}
			return total;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
