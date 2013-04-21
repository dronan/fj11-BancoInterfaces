package br.com.caelum.banco;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.banco.conta.ContaCorrente;

public class TestaMapa {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		c1.deposita(1000);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(3000);
		
		Map<String, ContaCorrente> mapaDeContas = new HashMap<String, ContaCorrente>();
		mapaDeContas.put("diretor",c1);
		mapaDeContas.put("gerente", c2);
		
		//ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
		//System.out.println(contaDoDiretor.getSaldo());
		//System.out.println(mapaDeContas.get("diretor").getSaldo());
		
		System.out.println(mapaDeContas.keySet());
		
		System.out.println(mapaDeContas.values());
		
	}

}
