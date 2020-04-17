package br.com.tn.cap07;

public class ContaCorrente extends Conta {

	@Override
	void atualiza(double taxa) {
		this.saldo = this.saldo + (this.saldo * taxa * 2);
	}

	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor - 0.10;
	}

}