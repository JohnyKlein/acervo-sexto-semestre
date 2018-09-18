	package br.com.cervejaria.app.service;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import br.com.cervejaria.app.model.Criador;

public class AdaptadorCriadores extends XmlAdapter<String, Criador>{

	@Override
	public String marshal(Criador criador) throws Exception {
		return criador.getNome();
	}

	@Override
	public Criador unmarshal(String criador) throws Exception {
		return new Criador(criador, null);
	}
	
}
