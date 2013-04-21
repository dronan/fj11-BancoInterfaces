package br.com.caelum.banco;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;

public class TestaComparacaoContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cc = new ContaCorrente();
		cc.setNumero(123);
		cc.setNome("diego");

		Conta cc2 = new ContaCorrente();
		cc2.setNumero(123);
		cc2.setNome("fulano");

		if (cc == cc2) {
			System.out.println("iguais 1");
		} else {
			System.out.println("diferentes 1");
		}

		if (cc.equals(cc2)) {
			System.out.println("valores iguais");
		} else {
			System.out.println("valores diferentes");
		}

	}

}
