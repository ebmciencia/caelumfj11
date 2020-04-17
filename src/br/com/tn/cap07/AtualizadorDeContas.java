package br.com.tn.cap07;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public double getSaldo() {
		return this.saldoTotal;
	}

	public void roda(Conta c) {
		System.out.println("Atualizador de Contas");
		System.out.println("Saldo Anterior: " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo Atual: " + c.getSaldo());
		this.saldoTotal = this.saldoTotal + c.getSaldo();
		System.out.println();
	}

}