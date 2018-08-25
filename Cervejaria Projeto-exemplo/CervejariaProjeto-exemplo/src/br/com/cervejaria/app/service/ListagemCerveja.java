package br.com.cervejaria.app.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.cervejaria.app.dao.CervejaDao;
import br.com.cervejaria.app.model.Cerveja;
import br.com.cervejaria.app.model.Usuario;

@WebService
public class ListagemCerveja {

	@WebResult(name = "cerveja")
	public List<Cerveja> listarCerveja() throws UsuarioNaoAutorizadoException {
		CervejaDao cervejaDao = new CervejaDao();
		return cervejaDao.getCervejas();
	}

	public void criarCerveja (
			@WebParam(name="cerveja") Cerveja cerveja,
			@WebParam(name="usuario", header=true) Usuario usuario)
			throws UsuarioNaoAutorizadoException {
		
		if (usuario.getLogin().equals("cat") && usuario.getSenha().equals("cat")){
			CervejaDao cervejaDao = new CervejaDao();
			cervejaDao.adiciona(cerveja);			
		} else {
			throw new UsuarioNaoAutorizadoException("Usurio nao autorizado!");
		}
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8181/cervejas", new ListagemCerveja());
		System.out.println("Servico Inicializado!");
	}

}
