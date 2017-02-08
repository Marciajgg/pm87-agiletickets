package br.com.caelum.agiletickets.domain.precos;

import java.math.BigDecimal;

import br.com.caelum.agiletickets.models.BalletOrquestra;
import br.com.caelum.agiletickets.models.CinemaShow;
import br.com.caelum.agiletickets.models.Espetaculo;
import br.com.caelum.agiletickets.models.OutrosEventos;
import br.com.caelum.agiletickets.models.PrecoIngresso;
import br.com.caelum.agiletickets.models.Sessao;
import br.com.caelum.agiletickets.models.TipoDeEspetaculo;

public class CalculadoraDePrecos {

	public static BigDecimal calcula(Sessao sessao, Integer quantidade) {
		BigDecimal preco;
		PrecoIngresso ingresso;
		Espetaculo espetaculo = sessao.getEspetaculo();
		TipoDeEspetaculo tipo = espetaculo.getTipo();
		
		if(tipo.equals(TipoDeEspetaculo.CINEMA) || tipo.equals(TipoDeEspetaculo.SHOW)) {
			ingresso = new CinemaShow(); 
			preco = ingresso.calculaPreco(sessao);
		} else if(tipo.equals(TipoDeEspetaculo.BALLET) || tipo.equals(TipoDeEspetaculo.ORQUESTRA)) {
			ingresso = new BalletOrquestra();
			preco = ingresso.calculaPreco(sessao);
		}  else {
			ingresso = new OutrosEventos();
			preco = ingresso.calculaPreco(sessao);
		} 

		return preco.multiply(BigDecimal.valueOf(quantidade));
	}

}