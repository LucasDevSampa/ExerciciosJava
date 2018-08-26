package Interfaces;

public class Retangulo implements AreaCalculavel{
	
	private int ladoA;
	private int ladoB;
	
	public Retangulo(int ladoA, int ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return this.ladoA * this.ladoB;
	}
	

}
