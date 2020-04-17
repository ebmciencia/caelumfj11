package br.com.tn.cap16;

import java.util.*;

public class Exercicio01 {

	public static void main(String args[]) {
		System.out.println("Iniciando...");
		Collection<Integer> testeArrayList = new ArrayList<>();
		Collection<Integer> testeHashSet = new HashSet<>();
		long inicio = System.currentTimeMillis();

		int total = 30000;

		for (int i = 0; i < total; i++) {
			testeArrayList.add(i);
		}

		for (int i = 0; i < total; i++) {
			testeArrayList.contains(i);
		}

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;

		System.out.println("Tempo Gasto ArrayList: " + tempo);

		inicio = System.currentTimeMillis();

		for (int i = 0; i < total; i++) {
			testeHashSet.add(i);
		}

		for (int i = 0; i < total; i++) {
			testeHashSet.contains(i);
		}

		fim = System.currentTimeMillis();
		tempo = fim - inicio;

		System.out.println("Tempo Gasto HashSet: " + tempo);
	}

}