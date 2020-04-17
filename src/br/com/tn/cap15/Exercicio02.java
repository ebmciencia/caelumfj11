package br.com.tn.cap15;

import java.io.*;

public class Exercicio02 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/TEMP/Cap15Ex02.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
	}

}