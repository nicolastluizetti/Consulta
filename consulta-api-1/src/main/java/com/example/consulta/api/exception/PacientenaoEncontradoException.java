package com.example.consulta.api.exception;

public class PacientenaoEncontradoException extends EntidadeNaoEncontradaException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PacientenaoEncontradoException(String mensagem) {
		super(mensagem);
		
	}
	
	public PacientenaoEncontradoException(Long id) {
		this(String.format("não existe cadastro de Paciente com codigo %d",id));
	}

}
