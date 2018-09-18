package br.com.cervejaria.app.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum Tipo {
	
	@XmlEnumValue("artesanal")
	ARTESANAL, 
	@XmlEnumValue("caseira")
	CASEIRA, 
	@XmlEnumValue("tradicional")
	TRADICIONAL;
	
}
