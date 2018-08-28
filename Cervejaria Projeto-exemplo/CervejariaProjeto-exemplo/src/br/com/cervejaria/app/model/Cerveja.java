package br.com.cervejaria.app.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.com.cervejaria.app.service.AdapterDate;

@XmlSeeAlso({CervejaArtesanal.class})
@XmlAccessorType(XmlAccessType.FIELD)
public class Cerveja {

	String nome; 
	String descricao;
	String unidadeDeMedida;
	Double volume;
	Integer quantidade;
	Double preco;
	@XmlElementWrapper(name="criadores")
	@XmlElement(name= "criador")
	List<Criador> criadores;
	@XmlJavaTypeAdapter(AdapterDate.class)
	private Date dataDeCiracao = new Date();
	
	public Cerveja() {
		super();
	}
	
	public Cerveja(String nome, String descricao, String unidadeDeMedida, Double volume, Integer quantidade,
			Double preco, List<Criador> criadores) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.unidadeDeMedida = unidadeDeMedida;
		this.volume = volume;
		this.quantidade = quantidade;
		this.preco = preco;
		this.criadores = criadores;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidadeDeMedida() {
		return unidadeDeMedida;
	}
	public void setUnidadeDeMedida(String unidadeDeMedida) {
		this.unidadeDeMedida = unidadeDeMedida;
	}
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public List<Criador> getCriadores() {
		return criadores;
	}
	public void setCriadores(List<Criador> criadores) {
		this.criadores = criadores;
	}
}
