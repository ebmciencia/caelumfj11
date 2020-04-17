package br.com.tn.cap10;

public class Circulo {
	private int raio;

	public Circulo(int raio) {
		this.raio = raio;
	}

	public double calculaArea() {
		return Math.PI * raio * raio;
	}

}