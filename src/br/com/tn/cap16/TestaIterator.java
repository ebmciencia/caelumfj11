package br.com.tn.cap16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestaIterator {

	public static void main(String args[]) {
		Set<String> conjunto = new HashSet<>();
		conjunto.add("Item 01");
		conjunto.add("Item 02");
		conjunto.add("Item 03");
		
		Iterator<String> i = conjunto.iterator();

		while (i.hasNext()) {
			String palavra = i.next();
			System.out.println(palavra);
		}
	}

}