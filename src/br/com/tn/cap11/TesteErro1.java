package br.com.tn.cap11;

// Código com Erro e que não possui nenhum tratamento de Exception
public class TesteErro1 {

	public static void main(String[] args) {
		System.out.println("Inicio do Main");
		metodo1();
		System.out.println("Fim do Main");
	}

	static void metodo1() {
		System.out.println("Inicio do Método1");
		metodo2();
		System.out.println("Fim do Método1");
	}

	static void metodo2() {
		System.out.println("Inicio do Método2");
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("Fim do Método2");
	}
}