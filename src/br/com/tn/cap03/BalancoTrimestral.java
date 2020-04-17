package br.com.tn.cap03;

public class BalancoTrimestral {

	public static void main (String[] args) {
		int gastosJaneiro   = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco     = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		float mediaMensal   = gastosTrimestre/3;
		
		System.out.println(gastosTrimestre);

		System.out.println("Valor da Média Mensal = " + mediaMensal);

	}

}