package br.com.tn.cap16;

import java.util.HashMap;
import java.util.Map;

import br.com.tn.cap07.ContaCorrente;

public class TestaMap {

	public static void main(String args[]) {
		ContaCorrente c1 = new ContaCorrente();
		c1.deposita(10000);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(3000);
		
		Map<String, ContaCorrente> mapaDeContas = new HashMap<>();

		mapaDeContas.put("Diretor", c1);
		mapaDeContas.put("Gerente", c2);

		ContaCorrente contaDoDiretor = mapaDeContas.get("Diretor");
		System.out.println(contaDoDiretor.getSaldo());

	}

}