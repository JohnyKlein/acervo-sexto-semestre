package br.com.cervejaria.app.model;

public class Cerveja {

	String nome; 
	String descricao;
	String unidadeDeMedida;
	Double volume;
	Integer quantidade;
	Double preco;
	
	public Cerveja(String nome, String descricao, String unidadeDeMedida, Double volume, Integer quantidade,
			Double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.unidadeDeMedida = unidadeDeMedida;
		this.volume = volume;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidadeDeMedida() {
		return unidadeDeMedida;
	}
	public void setUnidadeDeMedida(String unidadeDeMedida) {
		this.unidadeDeMedida = unidadeDeMedida;
	}
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
