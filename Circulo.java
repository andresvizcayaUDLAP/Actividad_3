package Geometria;

public class Circulo {
	
	float radio = 178190;
	
	public double circunferencia() {
		double c = (2 * 3.141592) * radio;
		return c;
	}
	
	public double area() {
		double a = 3.141592 * Math.pow(radio, 2);
		return a;
	}
	
	public void cambiarValorRadio(float radio) {
		this.radio = radio;
	}
}
