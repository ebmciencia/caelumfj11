package br.com.tn.cap05;

import br.com.tn.cap04.Funcionario;

public class Empresa {
	private Funcionario[] empregados;
	private String cnpj;

	public Empresa (int tamanho) {
		empregados = new Funcionario[tamanho];
	}
	public String getCnpj () {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario getFuncionario (int posicao) {
		return this.empregados[posicao];
	}

	void adiciona (int i, Funcionario f) {
		this.empregados[i] = f;
	}

	void mostraEmpregados () {
		for (int i = 0; i < this.empregados.length; i++) {
			System.out.println(empregados[i].getSalario());
		}
	}

}