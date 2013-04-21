package br.com.caelum.banco.conta;

public class ValorInvalidoException extends RuntimeException {
	public ValorInvalidoException(double valor){
		super("valor invalido" + valor);
	}
}
