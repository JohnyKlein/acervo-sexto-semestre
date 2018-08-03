package br.org.catolicasc.acervo.service;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.org.catolicasc.acervo.dao.LivroDao;
import br.org.catolicasc.acervo.model.Livro;

@WebService
public class ListagemLivros {

	public List<Livro> listarLivro(){
		LivroDao livroDao = new LivroDao();
		return livroDao.getLivros();
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8180/livros", new ListagemLivros());
		System.out.println("Servico Inicializado!");
	}
	
}
