package br.com.tn.cap11;

import br.com.tn.cap10.Conta;

public class TestandoReferenciaNula {

	public static void main (String args[]) {
		Conta c = null;
		System.out.println("Saldo Atual " + c.getSaldo());
	}

}