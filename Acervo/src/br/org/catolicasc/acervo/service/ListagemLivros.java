package br.org.catolicasc.acervo.service;

import java.util.List;

import br.org.catolicasc.acervo.dao.LivroDao;
import br.org.catolicasc.acervo.model.Livro;

public class ListagemLivros {

	public List<Livro> listarLivro(){
		LivroDao livroDao = new LivroDao();
		return livroDao.getLivros();
	}
	
}
