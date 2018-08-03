package br.org.catolicasc.acervo.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.org.catolicasc.acervo.model.Livro;

public class LivroDao {

	private static List<Livro> livros = new ArrayList<>();
	
	static {
		Livro l1 = new Livro();
		l1.setAnoDePublicacao(2016);
		l1.setEditora("Epoca");
		l1.setNome("O aprendiz de feiticeiro");
		l1.setResumo("Ola Marilene");
		l1.setAutores(Arrays.asList("Sebastian", "Johny Klein"));
		livros.add(l1);
		
		Livro l2 = new Livro();
		l2.setAnoDePublicacao(2018);
		l2.setEditora("Veja");
		l2.setNome("As visoes de Raiven");
		l2.setResumo("Muito secso");
		l2.setAutores(Arrays.asList("Marilene", "Sr Tainha"));
		livros.add(l2);
		
		Livro l3 = new Livro();
		l3.setAnoDePublicacao(2015);
		l3.setEditora("Puta editora");
		l3.setNome("Haaa, tin!");
		l3.setResumo("Ola Marilene 2");
		l3.setAutores(Arrays.asList("Sebastian Jr", "Watson"));
		livros.add(l3);
	}
	
	public List<Livro> getLivros(){
		return livros;
	}
	
	
}
