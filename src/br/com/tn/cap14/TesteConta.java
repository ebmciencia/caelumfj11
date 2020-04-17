package br.com.tn.cap14;

public class TesteConta {

	public static void main(String[] args) {

		Conta conta1 = new Conta(1500);
		Conta conta2 = new Conta(1000);

		if (conta1.equals(conta2)) {
			System.out.println("Contas com Valores Iguais");
		} else {
			System.out.println("Contas com Valores Diferentes");
		}
	}

}