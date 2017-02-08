package br.com.caelum.agiletickets.models;

import java.math.BigDecimal;

public class BalletOrquestra implements PrecoIngresso {

	public BigDecimal calculaPreco(Sessao sessao) {
		BigDecimal preco;
		if((sessao.getTotalIngressos() - sessao.getIngressosReservados()) / sessao.getTotalIngressos().doubleValue() <= 0.50) { 
			preco = sessao.getPreco().add(sessao.getPreco().multiply(BigDecimal.valueOf(0.20)));
		} else {
			preco = sessao.getPreco();
		}
		
		if(sessao.getDuracaoEmMinutos() > 60){
			preco = preco.add(sessao.getPreco().multiply(BigDecimal.valueOf(0.10)));
		}
		return preco;
	}
	
}
