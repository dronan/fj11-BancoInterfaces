package br.com.caelum.banco.conta;
public class SaldoInsuficienteException extends  RuntimeException {
	public SaldoInsuficienteException(String message) {
		super(message);
	}
}
