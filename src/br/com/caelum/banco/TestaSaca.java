package br.com.caelum.banco;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaPoupanca;

public class TestaSaca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta conta = null;// new ContaPoupanca(1000);
		conta.deposita(200);
		conta.saca(100);
	}

}
