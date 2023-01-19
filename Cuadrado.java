package Geometria;

public class Cuadrado {
	
	float lado = 178190;
	
	public double diagonal() {
		double d = Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2));
		return d;
	}
	
	public float perimetro() {
		float p = 4 * lado;
		return p;
	}
	
	public float area() {
		float a = lado * lado;
		return a;
	}
	
	public void cambiarValorLado(float lado) {
		this.lado = lado;
	}
}
