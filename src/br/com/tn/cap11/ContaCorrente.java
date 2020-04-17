package br.com.tn.cap11;

public class ContaCorrente {
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente, " + "tente um valor menor");
		} else {
			this.saldo -= valor;
		}
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor inválido");
		} else {
			this.saldo += valor;
		}
	}

}