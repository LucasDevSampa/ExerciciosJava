package Interfaces;

public class Quadrado implements AreaCalculavel{
	
	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return this.lado * this.lado;
	}
	
	
	

}
