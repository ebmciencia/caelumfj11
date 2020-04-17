package br.com.tn.cap05;

import br.com.tn.cap04.Funcionario;

public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa(10);

		for (int i = 0; i < 10; i++) {
			Funcionario f = new Funcionario();
			f.setSalario(100 + 100 * i);
			empresa.adiciona(i, f);
		}
		
		empresa.mostraEmpregados();
	}

}