package br.com.cervejaria.app.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private List<Produto> produtos = new ArrayList<Produto>();
	private Double valorTotal = 0D;
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Double getValorTotal() {
		for (Produto produto : produtos){
			valorTotal += produto.getValorTotal();
		}
		
		return valorTotal;
	}
}
