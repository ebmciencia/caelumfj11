package br.com.tn.cap16;

import java.util.HashSet;
import java.util.Set;

public class TestaForEach {

	public static void main(String args[]) {
		Set<String> conjunto = new HashSet<>();

		conjunto.add("Swift");
		conjunto.add("Java");
		conjunto.add("VRaptor");
		conjunto.add("Scala");

		for (String palavra : conjunto) {
			System.out.println(palavra);
		}
	}

}