package br.com.caelum.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ContaPoupanca c1 = new ContaPoupanca();
		ContaPoupanca c2 = new ContaPoupanca();
		ContaPoupanca c3 = new ContaPoupanca();
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		
		c1.setNumero(123);
		c2.setNumero(12233);
		c3.setNumero(1);
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		//Collections.sort(contas);
		
		for(int x = 0; x < contas.size(); x++){
			//ContaPoupanca cp = contas.get(x);
			//System.out.println("numero "+cp.getNumero());
			System.out.println("numero: "+ contas.get(x).getNumero() );
		}
		
		
		Collections.reverse(contas);
		System.out.println("Invertida");
		for(int x = 0; x < contas.size(); x++){
			System.out.println("numero: "+ contas.get(x).getNumero() );
		}
		
		Collections.shuffle(contas);
		System.out.println("aleatoria");
		for(int x = 0; x < contas.size(); x++){
			System.out.println("numero: "+ contas.get(x).getNumero() );
		}
		
		
		Collections.rotate(contas, 2);
		System.out.println("rotacionar");
		for(int x = 0; x < contas.size(); x++){
			System.out.println("numero: "+ contas.get(x).getNumero() );
		}
		
		System.out.println("**************************************************");
		System.out.println("Exercicio 7");
		System.out.println("**************************************************");
	
		List<ContaPoupanca> listaCP = new ArrayList<ContaPoupanca>();
		
		for (int x = 0; x < 100; x++){
			Random rd = new Random();
			//System.out.println(rd.nextInt(60));
			ContaPoupanca cp = new ContaPoupanca();
			cp.setNumero(rd.nextInt(5000));
			cp.setNome("Correntista "+x);
			listaCP.add(cp);
		}
		
		Collections.sort(listaCP);
		
		for(int x = 0; x < listaCP.size(); x++){
			System.out.println("nome: "+ listaCP.get(x).getNome());
			System.out.println("numero: "+ listaCP.get(x).getNumero());
			System.out.println("**************************************************");
		}
		
		System.out.println(listaCP.size() + " contas adicionadas");
		
	}

}
