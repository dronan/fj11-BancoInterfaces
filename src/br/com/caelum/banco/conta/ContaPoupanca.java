package br.com.caelum.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {
	
	
	
	public ContaPoupanca(){
		
	}
	
	public ContaPoupanca(double limite){
		this();
		super.limite = limite;
	}
	
	public void atualiza(double taxa) {
		synchronized (this) {
			super.saldo *= (taxa * 3);	
		}
		
	}
	
//	public String toString(){
//		return "teste";
//	}

	@Override
	public int compareTo(ContaPoupanca o) {
//		if (this.getNumero() < o.getNumero()) {
//			return -1;
//		}
//		if (this.getNumero() > o.getNumero()) {
//			return 1;
//		}
//		return 0;
		
		//return this.getNumero() - o.getNumero();
		
		return this.getNome().compareTo(o.getNome());
	}

}
