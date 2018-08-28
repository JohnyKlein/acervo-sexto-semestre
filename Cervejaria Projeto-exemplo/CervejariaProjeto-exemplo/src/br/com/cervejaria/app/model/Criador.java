package br.com.cervejaria.app.model;

import java.util.Date;

public class Criador {

	private String nome;
	private Date dataNascimento;
	
	public Criador() {
		super();
	}
	public Criador(String nome, Date dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
