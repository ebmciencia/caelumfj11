package br.com.tn.cap04;

public class Funcionario {
	private static int id;
	protected String nome;
	private String departamento;
	protected double salario;
	private Data dataEntrada;
	private String rg;

	public Funcionario() {
		Funcionario.id = Funcionario.id + 1;
	}

	public Funcionario(String nome) {
		Funcionario.id = Funcionario.id + 1;
		this.nome = nome;
	}

	public static int getId () {
		return Funcionario.id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataEntrada() {
		return this.dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg (String rg) {
		this.rg = rg;
	}

	public double getBonificacao() {
		return this.salario * 0.10;
	}

	void recebeAumento (double aumento) {
		this.salario += aumento;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}

	public void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário Atual: " + this.salario);
		System.out.println("Ganho Anual: " + this.calculaGanhoAnual());
	}

}