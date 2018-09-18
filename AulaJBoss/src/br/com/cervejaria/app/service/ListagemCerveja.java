package br.com.cervejaria.app.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.cervejaria.app.dao.CervejaDao;
import br.com.cervejaria.app.model.Cerveja;
import br.com.cervejaria.app.model.Usuario;

@WebService
@Stateless
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
			throw new UsuarioNaoAutorizadoException("Usuario nao autorizado!");
		}
	}
}
