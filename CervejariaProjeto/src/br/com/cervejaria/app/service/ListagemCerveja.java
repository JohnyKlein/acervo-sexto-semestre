package br.com.cervejaria.app.service;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.cervejaria.app.dao.CervejaDao;
import br.com.cervejaria.app.model.Cerveja;

@WebService
public class ListagemCerveja {
	
	@WebResult(name="cerveja")
	public List<Cerveja> listarCerveja(){
		CervejaDao cervejaDao = new CervejaDao();
		return cervejaDao.getCervejas();
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8181/cervejas", new ListagemCerveja());
		System.out.println("Servico Inicializado!");
	}
	
	
}
