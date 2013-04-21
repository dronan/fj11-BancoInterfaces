package br.com.caelum.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;

public class TestaContasListas {

	public static void main(String[] args) {
		Conta c = new ContaPoupanca();
		Conta c1 = new ContaPoupanca();
		Conta c3 = new ContaPoupanca();
		
		c.deposita(1000);
		c.setNumero(1234);
		c1.deposita(200);
		c1.setNumero(3210);
		c3.deposita(400);
		c3.setNumero(987);
		
		List contas = new ArrayList();
		contas.add(c);
		contas.add(c1);
		contas.add(c3);
		
		System.out.println(contas.size());
		
		System.out.println(contas);
		
		Collections.sort(contas);
		
		System.out.println(contas);
		
		
		for (int i = 0; i < contas.size(); i++) {
			Conta retornaConta = (Conta) contas.get(i);
			System.out.println(retornaConta.getSaldo());
		}
		
//		
//		
//		List<ContaCorrente> listaDeCC = new ArrayList<ContaCorrente>();
//		
//		ContaCorrente cc1 = new ContaCorrente();
//		ContaCorrente cc2 = new ContaCorrente();
//		ContaCorrente cc3 = new ContaCorrente();
//		
//		cc1.deposita(300);
//		cc2.deposita(400);
//		cc3.deposita(500);
//		
//		listaDeCC.add(cc1);
//		listaDeCC.add(cc2);
//		listaDeCC.add(cc3);
//		
//		for(int x = 0; x < listaDeCC.size(); x++){
//			ContaCorrente ccx = listaDeCC.get(x);
//			System.out.println(ccx.getSaldo());
//		}
//		
	}

}
