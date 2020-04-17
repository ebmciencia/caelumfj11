package br.com.tn.cap10;

import br.com.tn.cap04.Funcionario;

public class Diretor extends Funcionario implements Autenticavel {
	private int senha;
	
	public boolean autentica(int senha) {
		if (this.senha != senha) {
			return false;
		}
		return true;
	}

}