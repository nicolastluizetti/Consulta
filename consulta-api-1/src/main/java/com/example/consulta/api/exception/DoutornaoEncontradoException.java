package com.example.consulta.api.exception;

public class DoutornaoEncontradoException extends EntidadeNaoEncontradaException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DoutornaoEncontradoException(String mensagem) {
		super(mensagem);
		
	}
	
	public DoutornaoEncontradoException(Long id) {
		this(String.format("não existe cadastro de doutor com codigo %d",id));
	}

}
