package br.com.cervejaria.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pedido {
	private List<Produto> produtos = new ArrayList<Produto>();
	private Cliente cliente;
	private Double valorTotalPedido = 0D;
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	private void setValorTotalPedido(Double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}
	
	public Double getValorTotalPedido() {
		return valorTotalPedido;
	}
	
	public void updateValorTotalPedido() {
		Double total = 0D;
		for (Produto produto : produtos){
			total += produto.getValorTotal();
		}
		
		setValorTotalPedido(total);
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
