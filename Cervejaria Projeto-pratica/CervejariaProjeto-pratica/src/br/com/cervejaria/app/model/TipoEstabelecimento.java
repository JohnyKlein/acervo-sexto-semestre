package br.com.cervejaria.app.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum TipoEstabelecimento {
	@XmlEnumValue("bar")
	BAR,
	@XmlEnumValue("pub")
	PUB,
	@XmlEnumValue("restaurante")
	RESTAURANTE, 
	@XmlEnumValue("lanchonete")
	LANCHONETE;
}
