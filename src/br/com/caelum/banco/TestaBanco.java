package br.com.caelum.banco;

import br.com.caelum.banco.conta.Banco;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;

public class TestaBanco {

	public static void main(String[] args) {
		Banco banco = new Banco();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		ContaPoupanca cp2 = new ContaPoupanca();
		ContaPoupanca cp3 = new ContaPoupanca();
		ContaPoupanca cp4 = new ContaPoupanca();
		
		cc.deposita(100);
		cc.setNome("Joao");
		cp.deposita(200);
		cp.setNome("Pedro");
		cp2.deposita(300);
		cp2.setNome("Maria");
		cp3.deposita(400);
		cp3.setNome("Joaquim");
		cp4.deposita(500);
		cp4.setNome("Ana");
		
		banco.adiciona(cc);
		banco.adiciona(cp);
		banco.adiciona(cp2);
		banco.adiciona(cp3);
		banco.adiciona(cp4);
		
		System.out.println("testando o pega: "+banco.pega(0));
		System.out.println("testando o total:" +banco.pegaTotalContas());
		
		System.out.println(banco.buscaPorNome("Anas"));
	}

}
