package br.com.cervejaria.app.model;

public class CervejaArtesanal extends Cerveja {
	
	private Tipo fermentacao = Tipo.ARTESANAL;

	public Tipo getFermentacao() {
		return fermentacao;
	}

	public void setFermentacao(Tipo fermentacao) {
		this.fermentacao = fermentacao;
	}
	
}
