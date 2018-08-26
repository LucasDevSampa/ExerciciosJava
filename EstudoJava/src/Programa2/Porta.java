package Programa2;

public class Porta {
	String cor;
	Boolean aberta;
	double dimencaoX;
	double dimencaoY;
	double dimencaoZ;
	
	void abre() {
		if (aberta == true) {
			System.out.println("Porta ja esta aberta!");
		} else {
			aberta=true;
			System.out.println("Porta aberta");	
		}
	}
	
	void fecha() {
		if (aberta == false) {
			System.out.println("Porta ja esta fechada!");
		} else {
			aberta=false;
			System.out.println("Porta fechada");	
		}
	}
	
	void pinta(String cor) {
		this.cor = cor;
	}
	
	boolean estaAberta() {
		if (aberta == false) {
			return false;
		} else {
			return true;
		}
	}
	
	void dimencione(double x, double y, double z) {
		this.dimencaoX = x;
		this.dimencaoY = y;
		this.dimencaoZ = z;
	}
	
	void mostra() {
		
	}
		
}
