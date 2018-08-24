package br.com.cervejaria.app.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
	
	@XmlAccessorType(XmlAccessType.FIELD)
	public class UsuarioFaultInfo {
		public String message;
		
		public UsuarioFaultInfo(){
			
		}
		
		public UsuarioFaultInfo(String message){
			this.message = message;
		}
		
	}
}
