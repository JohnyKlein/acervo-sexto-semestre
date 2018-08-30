package br.com.cervejaria.app.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.cervejaria.app.dao.PedidoDao;
import br.com.cervejaria.app.model.Pedido;
import br.com.cervejaria.app.model.Usuario;

@WebService
public class ListagemPedido {

	public void criarPedido(
			@WebParam(name="pedido") Pedido pedido,
			@WebParam(name="usuario", header=true) Usuario usuario)
			throws UsuarioNaoAutorizadoException {
		
		if (usuario.getLogin().equals("pedi") && usuario.getSenha().equals("pedi")){
			PedidoDao pedidoDao = new PedidoDao();
			pedidoDao.adiciona(pedido);			
		} else {
			throw new UsuarioNaoAutorizadoException("Usuario nao autorizado! Consulte o administrador.");
		}
	}
	
	@WebResult(name = "pedido")
	public List<Pedido> listarPedidos(){
		PedidoDao pedidoDao = new PedidoDao();
		return pedidoDao.getPedidos();
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8181/pedidos", new ListagemPedido());
		System.out.println("Servico Inicializado!");
	}
	
}
