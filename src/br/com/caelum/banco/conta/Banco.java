package br.com.caelum.banco.conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

	private List<Conta> contas = new ArrayList<Conta>();
	private Map<String, Conta> contaMapa = new HashMap<String, Conta>();

	public void adiciona(Conta c) {
		contas.add(c);
		contaMapa.put(c.getNome(), c);
	}

	public Conta pega(int x) {
		return this.contas.get(x);
	}

	public int pegaTotalContas() {
		return contas.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contaMapa == null) ? 0 : contaMapa.hashCode());
		result = prime * result + ((contas == null) ? 0 : contas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		if (contaMapa == null) {
			if (other.contaMapa != null)
				return false;
		} else if (!contaMapa.equals(other.contaMapa))
			return false;
		if (contas == null) {
			if (other.contas != null)
				return false;
		} else if (!contas.equals(other.contas))
			return false;
		return true;
	}

	public Conta buscaPorNome(String nome) {
		Conta c = contaMapa.get(nome);
		return c;
		
//		for (int i = 0; i < contas.size(); i++) {
//			Conta c = (Conta) contas.get(i);
//			if (c.getNome().equals(nome)) {
//				return c;
//			}
//		}
//		return null;

	}

}
