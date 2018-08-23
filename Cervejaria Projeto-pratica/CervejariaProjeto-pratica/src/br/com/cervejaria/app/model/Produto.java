package br.com.cervejaria.app.model;

public class Produto {
	private String nome;
	private Double valorUnit;
	private Double valorTotal;
	private Integer quantidade;
	private Integer estoque;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getValorUnit() {
		return valorUnit;
	}
	
	public void setValorUnit(Double valorUnit) {
		this.valorUnit = valorUnit;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public Double getValorTotal() {
		setValorTotal(quantidade * valorUnit);
		 
		return valorTotal;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	
	public void updateEstoque() {
		Integer estoque = this.estoque - quantidade;
		setEstoque(estoque);
	}
	
}
