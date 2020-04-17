package br.com.tn.cap07;

public class Banco {
	private Conta[] CarteiraContas;
	private int qtdContas = 0;

	public Banco(int tamanho) {
		CarteiraContas = new Conta[tamanho];
	}

	public void adiciona(Conta c) {
		int i;
		for (i = 0; i < CarteiraContas.length; i++) {
			if (CarteiraContas[i] == null) {
				CarteiraContas[i] = c;
				qtdContas = qtdContas + 1;
				break;
			}
		}
		if (i == CarteiraContas.length) {
			System.out.println("Número Máximo de Contas Atingido!");
		}
	}

	public Conta pegaConta(int x) {
		return CarteiraContas[x];
	}

	public int pegaTotalDeContas() {
		return qtdContas;
	}

	public void mostraContas() {
		for (int i = 0; i < CarteiraContas.length; i++) {
			if (CarteiraContas[i] == null) {
				break;
			}
			System.out.println("Conta: " + i);
			System.out.println("Saldo: " + CarteiraContas[i].getSaldo());
		}
	}

}