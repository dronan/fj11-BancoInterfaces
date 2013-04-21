package br.com.caelum.banco.conta;

public abstract class Conta {
	protected double saldo;
	protected double limite;

	public String toString() {
		return "O dono da conta Ž " + this.getNome() + ", o saldo da conta "
				+ this.getNumero() + " Ž " + this.saldo; // traduz o
															// identificador
															// ContaXXX@1234
	}
	
	
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Conta))
			return false;
		Conta outraConta = (Conta) obj;

		if ((this.numero == outraConta.numero)
				&& (this.nome == outraConta.nome)) {
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor) {
		synchronized (this) {
			if (valor < 0) {
				throw new ValorInvalidoException(valor);
			} else {
				this.saldo += valor;
			}
		}
	}

	public void saca(double valor) {
		if (!isSaldoSuficiente(valor)) {
			throw new SaldoInsuficienteException(
					"Saldo Insuficiente, tente um valor menor");
		} else {
			this.saldo -= valor;
		}
	}
	
	private boolean isSaldoSuficiente(double valor){
		return (this.saldo + this.limite) > valor;
	}
	

	public abstract void atualiza(double taxa);
	// public void atualiza(double taxa){
	// this.saldo *= taxa;
	// }
}
