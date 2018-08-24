package br.com.cervejaria.app.service;

import javax.xml.ws.WebFault;

@WebFault(targetNamespace="http://service.app.cervejaria.com.br/excessoes/",
		name="UsuarioNaoAutorizadoException")
public class UsuarioNaoAutorizadoException extends RuntimeException {

	public UsuarioNaoAutorizadoException() {
		super();
	}

	public UsuarioNaoAutorizadoException(String mensagem) {
		super(mensagem);
	}
	
}
