package br.com.caelum.banco;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;
import br.com.caelum.banco.sistema.GuardadorDeObjetos;

public class TestaGuardador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente();
		GuardadorDeObjetos guarda = new GuardadorDeObjetos();
		
		guarda.adicionaObjeto(cc);
		
		//ContaPoupanca cp = (ContaPoupanca) guarda.pegaObjeto(0);
		
		Integer i = 5;
		int i2 = 10;
		
		System.out.println(i);
		System.out.println(i2);
		
	}

}
