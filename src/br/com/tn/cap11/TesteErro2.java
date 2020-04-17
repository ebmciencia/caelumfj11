package br.com.tn.cap11;

// Código com try/catch em volta do for
public class TesteErro2 {

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
		try {
			for (int i = 0; i <= 15; i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: " + e);
		}
		System.out.println("Fim do Método2");
	}
}