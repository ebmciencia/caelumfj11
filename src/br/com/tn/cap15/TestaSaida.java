package br.com.tn.cap15;

import java.io.*;

public class TestaSaida {

	public static void main(String[] args) throws IOException {
			OutputStream os = new FileOutputStream("C:/TEMP/saida.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			bw.write("Caelum");

			bw.close();
	}

}