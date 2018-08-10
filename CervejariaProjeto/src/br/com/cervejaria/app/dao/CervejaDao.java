package br.com.cervejaria.app.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cervejaria.app.model.Cerveja;

public class CervejaDao {

	private static List<Cerveja> cervejas = new ArrayList<>(); 
	
	static {
		Cerveja ceva1 = new Cerveja("Bock", "Amarga", "Litro", 2.0, 8, 5.10);
		Cerveja ceva2 = new Cerveja("Malte", "Meio Amarga", "Litro", 1.8, 2, 2.10);
		Cerveja ceva3 = new Cerveja("Pilsen", "Tradicional", "ML", 500.0, 10, 3.10);
		cervejas.add(ceva1);
		cervejas.add(ceva2);
		cervejas.add(ceva3);
	}
	
	public List<Cerveja> getCervejas() {
		return cervejas;
	}
}