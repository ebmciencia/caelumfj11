package br.com.tn.cap09;

abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;

	abstract double getBonificacao();

}