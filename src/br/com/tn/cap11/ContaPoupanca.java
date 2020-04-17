package br.com.tn.cap11;

public class ContaPoupanca {
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new IllegalArgumentException("Saldo Insuficiente na Poupança");
		} else {
			this.saldo -= valor;
		}
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

}