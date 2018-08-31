package br.com.cervejaria.app.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cervejaria.app.model.*;

public class PedidoDao {

	private static List<Pedido> pedidos = new ArrayList<Pedido>();
	
	static {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Johny Klein");
		cliente1.setCNPJ("455563155");
		cliente1.setTelefone("5555555555");
		cliente1.setLogin("johny");
		cliente1.setSenha("1234");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Jana Girl");
		cliente2.setCNPJ("115454555");
		cliente2.setTelefone("99999999999");
		cliente2.setLogin("jana");
		cliente2.setSenha("123465");
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto cerveja1 = new Produto();
		cerveja1.setNome("Cerveja Pilsen");
		cerveja1.setEstoque(1000);
		cerveja1.setQuantidade(5);
		cerveja1.setValorUnit(4.5);
		cerveja1.updateEstoque();
		produtos.add(cerveja1);
		
		Produto cerveja2 = new Produto();
		cerveja2.setNome("Cerveja Bock");
		cerveja2.setQuantidade(2);
		cerveja2.setEstoque(200);
		cerveja2.setValorUnit(10.0);
		cerveja2.updateEstoque();
		produtos.add(cerveja2);
		
		Produto cerveja3 = new Produto();
		cerveja3.setNome("Cerveja Puro Malte");
		cerveja3.setEstoque(50);
		cerveja3.setQuantidade(18);
		cerveja3.setValorUnit(20.0);
		cerveja3.updateEstoque();
		produtos.add(cerveja3);
		
		Pedido pedido1 = new Pedido();
		pedido1.setProdutos(produtos);
		pedido1.updateValorTotalPedido();
		
		pedidos.add(pedido1);
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void adiciona(Pedido pedido) {
		pedidos.add(pedido);
	}
	
}
