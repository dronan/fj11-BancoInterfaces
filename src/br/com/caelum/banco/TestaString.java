package br.com.caelum.banco;

import java.io.PrintStream;
import java.math.BigDecimal;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;

public class TestaString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);

		String frase = "quero ver se a outra string encontra a palavra abc aqui no meio";
		String verificacao = "abc";

		if (frase.contains(verificacao))
			System.out.println("encontrou");

		String removeEspacos = "   palavra com espacos   ";
		removeEspacos = removeEspacos.trim().replaceAll(" ", "");
		System.out.println(removeEspacos);
		removeEspacos = "";
		if (!(removeEspacos.isEmpty())) {
			System.out.println("N‹o esta vazia");
		} else {
			System.out.println("Esta vazia");
		}

		System.out.println(s.length());

		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1 == x2) {
			System.out.println("em memoria iguais");
		} else {
			System.out.println("em memoria diferentes");
		}

		if (x1.equals(x2)) {
			System.out.println("conteudo iguais");
		} else {
			System.out.println("conteudo diferentes");
		}
		
		String str = "1";
		int xpto = Integer.parseInt(str);
		System.out.println(xpto);
		
		PrintStream saida = System.out;
		saida.println("ola");
		
		Conta conta = new ContaCorrente();
		System.out.println(conta);
		
		double valDbl = 123.45612312345430006363634634690; 
		BigDecimal big = new BigDecimal(valDbl);
		System.out.println(valDbl);
		System.out.println(big);
		
	}

}
