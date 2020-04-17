package br.com.tn.cap07;

public class TestaBanco {

	public static void main(String[] args) {
		int maxContas = 10;
		Banco banco = new Banco(maxContas);
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		Conta c3 = new ContaPoupanca();

		c1.deposita(1000);
		c2.deposita(2000);
		c3.deposita(3000);

		banco.adiciona(c1);
		banco.adiciona(c2);
		banco.adiciona(c3);

		banco.mostraContas();
		System.out.print("\n");

		for (int i = 0; i < maxContas; i++) {
			if (banco.pegaConta(i) == null) {
				break;
			}
			adc.roda(banco.pegaConta(i));
		}

		banco.mostraContas();

		System.out.println("Quantidade de Contas: " + banco.pegaTotalDeContas());
	}

}