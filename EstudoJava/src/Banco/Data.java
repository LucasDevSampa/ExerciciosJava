package Banco;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String mostra() {
		return String.valueOf(this.dia)+"/"+String.valueOf(this.mes)+"/"+String.valueOf(this.ano);
	}
}
