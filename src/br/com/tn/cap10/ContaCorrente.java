package br.com.tn.cap10;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	void atualiza(double taxa) {
		this.saldo = this.saldo + (this.saldo * taxa * 2);
	}

	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor - 0.10;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}