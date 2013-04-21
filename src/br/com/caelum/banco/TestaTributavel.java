package br.com.caelum.banco;

import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.sistema.Tributavel;

public class TestaTributavel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		
	}

}
