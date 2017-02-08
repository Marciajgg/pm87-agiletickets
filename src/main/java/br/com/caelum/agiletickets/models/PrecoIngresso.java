package br.com.caelum.agiletickets.models;

import java.math.BigDecimal;

public interface PrecoIngresso {

	public abstract BigDecimal calculaPreco(Sessao sessao);

}