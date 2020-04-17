package br.com.tn.cap09;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;

	public void registra(Funcionario f) {
		System.out.println("Adicionando Bonificação do Funcionário: " + f);
		this.totalDeBonificacoes += f.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

}