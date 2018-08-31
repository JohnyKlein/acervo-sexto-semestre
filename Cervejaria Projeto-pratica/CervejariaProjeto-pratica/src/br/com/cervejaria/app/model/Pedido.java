package br.com.cervejaria.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pedido {
	private List<Produto> produtos = new ArrayList<Produto>();
	private Double valorTotalPedido = 0D;
	private Cliente cliente;
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Double getValorTotalPedido() {
		updateValorTotalPedido();
		return valorTotalPedido;
	}
	
	public void updateValorTotalPedido() {
		Double total = 0D;
		for (Produto produto : produtos){
			total += produto.getValorTotal();
		}
		
		this.valorTotalPedido = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
