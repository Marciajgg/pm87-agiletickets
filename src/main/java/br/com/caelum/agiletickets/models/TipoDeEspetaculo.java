package br.com.caelum.agiletickets.models;

public enum TipoDeEspetaculo {
	
	CINEMA(new CinemaShow()), 
	SHOW(new CinemaShow()), 
	TEATRO(new OutrosEventos()), 
	BALLET(new BalletOrquestra()), 
	ORQUESTRA(new BalletOrquestra());

	private PrecoIngresso preco;
	
	private TipoDeEspetaculo(PrecoIngresso preco) {
		this.preco = preco;
	}
	
	public PrecoIngresso getPreco() {
		return preco;
	}
	
	
}
