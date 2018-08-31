package br.com.cervejaria.app.model;

public class ClienteFisico extends Cliente {
	private String cnpj;

	public String getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
