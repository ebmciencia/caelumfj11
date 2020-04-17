package br.com.tn.cap07;

import br.com.tn.cap04.Funcionario;

public class Gerente extends Funcionario {
	private int senha;
	int numeroDeFuncionariosGerenciados;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica (int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		}
		else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public double getBonificacao() {
		return this.salario * 0.15;
	}

}