package br.com.caelum.agiletickets.models;

import java.math.BigDecimal;

public class CinemaShow implements PrecoIngresso {

	public BigDecimal calculaPreco(Sessao sessao) {
		BigDecimal preco = sessao.getPreco();
		Integer totalIngressos = sessao.getTotalIngressos();
		
		if((totalIngressos - sessao.getIngressosReservados()) / totalIngressos.doubleValue() <= 0.05) { 
			preco = preco.add(preco.multiply(BigDecimal.valueOf(0.10)));
		} else {
			preco = sessao.getPreco();
		}
		return preco;
	}
	
}
