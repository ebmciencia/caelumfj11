package br.com.tn.cap14;

public class Ex02 {

	public static void main(String[] args) {
		String s = " String 01 ";   // String com espaços na frente e atrás
		String sVazia = "";

		// Descobrir se uma string se encontra dentro de outra
		if (s.contains("01")){
			System.out.println("A String contém o que pesquisei!");
		} else {
			System.out.println("A String não contém o que pesquisei!");
		}

		// Tirar espaços em branco das pontas de uma String
		System.out.println("String com espaços: " + s);
		System.out.println("String sem espaços: " + s.trim());

		// Descobrir se uma String está vazia
		if (sVazia.isEmpty()) {
			System.out.println("String Vazia");
		} else {
			System.out.println("String não está Vazia");
		}

		// Conta quantos caracteres a String possui
		System.out.println("String possui: " + s.length());
	}

}
