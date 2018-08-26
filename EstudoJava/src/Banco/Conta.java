package Banco;

public class Conta {
	private static int totalDeContas;
	private int numero;
	private double saldo;
	private double limite;
	Cliente titular = new Cliente();
	
	Conta(){
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}
	Conta(Cliente titular){
		Conta.totalDeContas = Conta.totalDeContas + 1;
		this.titular = titular;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido");
		} else {
			this.saldo+=valor;
		}
		
	}
	
	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	public boolean saca(double valor) {
		if(this.saldo >= valor && valor >= 0) {
			this.saldo-=valor;
			return true;
		}
		else {
			throw new SaldoInsuficienteException("Saldo insulficiente");
		}
		
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}

	

}
