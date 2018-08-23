package br.com.cervejaria.app.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cervejaria.app.model.*;

public class PedidoDao {

	private static List<Pedido> pedidos = new ArrayList<Pedido>();
	
	static {
		Usuario user = new Usuario();
		user.setLogin("user");
		user.setSenha("senha");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Johny Klein");
		cliente1.setCNPJ("455563155");
		cliente1.setTelefone("5555555555");
		cliente1.setUsuario(user);
		
		Usuario user2 = new Usuario();
		user2.setLogin("user2");
		user2.setSenha("senha2");

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Jana Girl");
		cliente2.setCNPJ("115454555");
		cliente2.setTelefone("99999999999");
		cliente2.setUsuario(user2);
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto produto1 = new Produto();
		produto1.setNome("Cerveja Pilsen");
		produto1.setQuantidade(5);
		produto1.setValorUnit(4.5);
		produtos.add(produto1);
		
		Produto produto2 = new Produto();
		produto2.setNome("Cerveja Bock");
		produto2.setQuantidade(2);
		produto2.setValorUnit(10.0);
		produtos.add(produto2);
		
		Produto produto3 = new Produto();
		produto3.setNome("Cerveja Puro Malte");
		produto3.setQuantidade(18);
		produto3.setValorUnit(20.0);
		produtos.add(produto3);
		
		Pedido pedido1 = new Pedido();
		pedido1.setProdutos(produtos);
		pedido1.setCliente(cliente1);
		pedido1.updateValorTotalPedido();
		
		pedidos.add(pedido1);
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
}
