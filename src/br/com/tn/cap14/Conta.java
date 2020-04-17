package br.com.tn.cap14;

public class Conta {

	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public boolean equals(Object object) {
		Conta outraConta = (Conta) object;
		if (this.saldo == outraConta.saldo) {
			return true;
		}

		return false;
	}

	public boolean equalsTunado(Object object) {
		if (!(object instanceof Conta))
			return false;
		Conta outraConta = (Conta) object;
		return this.saldo == outraConta.saldo;
	}

}