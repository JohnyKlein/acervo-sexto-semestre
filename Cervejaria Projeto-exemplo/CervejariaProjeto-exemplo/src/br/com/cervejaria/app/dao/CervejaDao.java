package br.com.cervejaria.app.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import br.com.cervejaria.app.model.Cerveja;
import br.com.cervejaria.app.model.CervejaArtesanal;
import br.com.cervejaria.app.model.Criador;

public class CervejaDao {

	private static List<Cerveja> cervejas = new ArrayList<>(); 
	
	static {
		CervejaArtesanal ceva1 = new CervejaArtesanal();
		ceva1.setDescricao("Lalala");
		ceva1.setNome("Jana");
		ceva1.setPreco(2.40);
		ceva1.setQuantidade(5);
		ceva1.setUnidadeDeMedida("Ml");
		Cerveja ceva2 = new Cerveja("Malte", "Meio Amarga", "Litro", 1.8, 2, 2.10, Arrays.asList(
																						new Criador("Johny", new Date()),
																						new Criador("Klein", new Date())
																					));
		Cerveja ceva3 = new Cerveja("Malte", "Meio Amarga", "Litro", 1.8, 2, 2.10, Arrays.asList(
																						new Criador("Matheus", new Date()),
																						new Criador("Riese", new Date())
																					));
		cervejas.add(ceva1);
		cervejas.add(ceva2);
		cervejas.add(ceva3);
	}
	
	public List<Cerveja> getCervejas() {
		return cervejas;
	}
	
	public void adiciona(Cerveja cerveja) {
		cervejas.add(cerveja);
	}
}
