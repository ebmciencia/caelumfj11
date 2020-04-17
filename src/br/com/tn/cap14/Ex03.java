package br.com.tn.cap14;

public class Ex03 {

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		System.out.println("Utilizando ==");
		if (x1 == x2) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}

		System.out.println("Utilizando equals");
		if (x1.equals(x2)) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
		
	}

}
