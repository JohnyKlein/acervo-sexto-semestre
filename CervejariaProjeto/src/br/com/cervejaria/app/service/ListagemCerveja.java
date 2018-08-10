package br.com.cervejaria.app.service;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.cervejaria.app.dao.CervejaDao;
import br.com.cervejaria.app.model.Cerveja;

@WebService
public class ListagemCerveja {
	
	public List<Cerveja> listarLivro(){
		CervejaDao cervejaDao = new CervejaDao();
		return cervejaDao.getCervejas();
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8181/cervejas", new ListagemCerveja());
		System.out.println("Servico Inicializado!");
	}
	
}
