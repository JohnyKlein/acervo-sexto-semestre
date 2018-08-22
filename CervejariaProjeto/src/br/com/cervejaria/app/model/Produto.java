package br.com.cervejaria.app.model;

public class Produto {
	private String nome;
	private Cliente cliente;
	private Double valorUnit;
	private Double valorTotal;
	private Integer quantidade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Double getValorUnit() {
		return valorUnit;
	}
	
	public void setValorUnit(Double valorUnit) {
		this.valorUnit = valorUnit;
	}

	public Double getValorTotal() {
		valorTotal = quantidade * valorUnit;
		 
		return valorTotal;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
