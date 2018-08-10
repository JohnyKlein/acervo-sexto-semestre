package br.com.cervejaria.app.client;

import java.util.List;

import br.com.cervejaria.app.service.Cerveja;
import br.com.cervejaria.app.service.ListagemCerveja;
import br.com.cervejaria.app.service.ListagemCervejaService;

public class Client {

	public static void main(String[] args) {
		ListagemCervejaService factory = new ListagemCervejaService();
		
		ListagemCerveja listagem = factory.getListagemCervejaPort();
		
		List<Cerveja> cervejas = listagem.listarLivro();
		
		for (Cerveja cerveja : cervejas){
			System.out.println("Nome: " + cerveja.getNome());
		}			
	}
	
}
