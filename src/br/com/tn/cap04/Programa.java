package br.com.tn.cap04;

public class Programa {

	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		Cliente c = new Cliente();
		minhaConta.titular = c;

		minhaConta.titular.nome = "Duke";
		minhaConta.deposita(1000);
		
		System.out.println("Saldo Inicial: " + minhaConta.getSaldo());
	}

}