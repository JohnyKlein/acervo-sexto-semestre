package br.com.cervejaria.app.model;

public class ClienteJuridico extends Cliente {
	private String cpf;
	private TipoEstabelecimento tipoEstabeleciomento;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public TipoEstabelecimento getTipoEstabeleciomento() {
		return tipoEstabeleciomento;
	}

	public void setTipoEstabeleciomento(TipoEstabelecimento tipoEstabeleciomento) {
		this.tipoEstabeleciomento = tipoEstabeleciomento;
	}
}
