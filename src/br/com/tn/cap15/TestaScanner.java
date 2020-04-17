package br.com.tn.cap15;

import java.io.*;
import java.util.*;

public class TestaScanner {

	public static void main(String args[]) throws IOException {
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream("C:/TEMP/arquivo.txt");

		while (s.hasNextLine()) {
			ps.println(s.nextLine());
		}
	}

}