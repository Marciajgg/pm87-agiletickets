package br.com.caelum.agiletickets.models;

import java.math.BigDecimal;

public class OutrosEventos implements PrecoIngresso {
	
	public BigDecimal calculaPreco(Sessao sessao) {
		return sessao.getPreco();
	}
}
