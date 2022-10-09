package q3;

public class Circulo {
	public double raio;
	
	public double area(double raio){
		this.raio=raio;
		double area=(3.14)*raio*raio;
		return area;
	}
	public double circunferencia(double raio) {
		this.raio=raio;
		double circunf=2*(3.14)*raio;
		return circunf;
	}
	public double aumento(double aumento, double raio) {
		this.raio=raio;
		double novoraio=raio+(aumento/100)*raio;
		return novoraio;
	}
}
