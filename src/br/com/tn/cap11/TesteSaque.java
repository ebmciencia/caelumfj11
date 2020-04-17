package br.com.tn.cap11;

public class TesteSaque {

	public static void main (String args[]) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.saca(50);
		System.out.println("Consegui Sacar da Corrente!");
		cp.saca(50);
		System.out.println("Consegui Sacar da Poupança!");
	}

}