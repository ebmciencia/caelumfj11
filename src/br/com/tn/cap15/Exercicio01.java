package br.com.tn.cap15;

import java.io.*;

public class Exercicio01 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Digite sua mensagem: ");
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println("Palavra Digitada:");
			System.out.println(linha);
			linha = br.readLine();
		}
	}

}