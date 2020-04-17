package br.com.tn.cap09;

public class Gerente extends Funcionario {

	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}

}
