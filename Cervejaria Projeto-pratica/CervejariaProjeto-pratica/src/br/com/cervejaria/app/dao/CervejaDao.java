package br.com.cervejaria.app.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.cervejaria.app.model.Cerveja;

public class CervejaDao {

	private static List<Cerveja> cervejas = new ArrayList<>(); 
	
	static {
		Cerveja ceva1 = new Cerveja();
		ceva1.setNome("Bock");
		ceva1.setCriadores(Arrays.asList("Johny", "Luka", "Mauricio"));
		ceva1.setDescricao("Amarga");
		ceva1.setQuantidade(10);
		ceva1.setPreco(50.3);
		ceva1.setEstoque(100);
		ceva1.setUnidadeDeMedida("ml");
		ceva1.setValorUnit(10.0);
		ceva1.setVolume(5.0);
		
		Cerveja ceva2 = new Cerveja();
		ceva2.setNome("Pilsen");
		ceva2.setCriadores(Arrays.asList("Klein", "Jana", "Pablo"));
		ceva2.setDescricao("Tradicional");
		ceva2.setQuantidade(4);
		ceva2.setPreco(20.2);
		ceva2.setEstoque(30);
		ceva2.setUnidadeDeMedida("l");
		ceva2.setValorUnit(50.0);
		ceva2.setVolume(10.0);
		
		Cerveja ceva3 = new Cerveja();
		ceva3.setNome("Ipa");
		ceva3.setCriadores(Arrays.asList("Kuester", "Luciano"));
		ceva3.setDescricao("Sabor suave");
		ceva3.setQuantidade(40);
		ceva3.setPreco(80.3);
		ceva3.setEstoque(100);
		ceva3.setUnidadeDeMedida("ml");
		ceva3.setValorUnit(10.0);
		ceva3.setVolume(5.0);
		
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
