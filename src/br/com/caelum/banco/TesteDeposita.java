package br.com.caelum.banco;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaPoupanca;


public class TesteDeposita {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cp = new ContaPoupanca();
		try {
			cp.deposita(-100);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
