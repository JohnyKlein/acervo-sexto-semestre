package br.com.cervejaria.app.service;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.cervejaria.app.dao.PedidoDao;
import br.com.cervejaria.app.model.*;

@WebService
public class ListagemPedido {

	@WebResult(name = "pedido")
	public List<Pedido> listarPedidos(){
		PedidoDao pedidoDao = new PedidoDao();
		return pedidoDao.getPedidos();
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8182/pedidos", new ListagemPedido());
		System.out.println("Servico Inicializado!");	
	}
}
