package br.com.tn.cap04;

public class Conta {
	int numero;
	public double saldo;
	public double limite;
	Cliente titular;

	public double getSaldo() {
		return this.saldo;
	}

	public void saca (double valor) {
		this.saldo -= valor;
	}

	void deposita (double valor) {
		this.saldo += valor;
	}

	void transfere (Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}

}