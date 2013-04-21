package br.com.caelum.banco;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;


public class TestaContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		//Conta [] arrayContas;
		//arrayContas = new Conta[10];
		
		//arrayContas[0].setSaldo(100);
		//arrayContas[0].deposita(200);
		//arrayContas[0].getSaldo();
		
		System.out.println("**********");
		
		c.deposita(100);
		cc.deposita(100);
		cp.deposita(100);
		
		//c.saca(100);
		
		
		c.atualiza(0.01);
		cp.atualiza(0.01);
		cc.atualiza(0.01);
		
		System.out.println(c.getSaldo());
		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());
	
	}

}
