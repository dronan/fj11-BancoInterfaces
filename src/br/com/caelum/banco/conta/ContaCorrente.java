package br.com.caelum.banco.conta;

import br.com.caelum.banco.sistema.Tributavel;


public class ContaCorrente extends Conta implements Tributavel, Comparable<ContaCorrente> {
	public void atualiza(double taxa) {
		synchronized (this) {
			//super.atualiza(taxa * 2);
			super.saldo *=  (taxa * 2);	
		}
	}

	
	public void deposita(double valor) {
		synchronized (this) {
			this.saldo = this.saldo + valor - 0.10;	
		}
		
	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}


	@Override
	public int compareTo(ContaCorrente outra) {
		if (this.saldo < outra.saldo)
			return 1;
		if (this.saldo > outra.saldo){
			return 1;
		}
		return 0;
	}

}
