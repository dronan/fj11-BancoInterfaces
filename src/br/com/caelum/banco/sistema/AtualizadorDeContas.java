package br.com.caelum.banco.sistema;

import br.com.caelum.banco.conta.Conta;


public class AtualizadorDeContas {
	private double saldoTotal = 0;

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public double getSelic() {
		return selic;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}

	private double selic;

	public AtualizadorDeContas() {
	}

	public AtualizadorDeContas(double selic) {
		this();
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("Saldo inicial:" + c.getSaldo());
		c.atualiza(selic);
		setSaldoTotal(getSaldoTotal() + c.getSaldo());
		System.out.println("Saldo Atualizado:" + c.getSaldo());

		System.out.println("----------------------");
	}
}
