package br.com.tn.cap10;

public class SistemaInterno {

	void login(Autenticavel a) {
		int senha = 123456;
		boolean ok = a.autentica(senha);
	}

}