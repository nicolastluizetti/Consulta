package com.example.consulta.api.exception;

public class PacienteEmUso extends EntidadeNaoEncontradaException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PacienteEmUso(String mensagem) {
		super(mensagem);
		
	}
	
	public PacienteEmUso(Long id) {
		this(String.format("o cadastro de numero:%d, não pde ser apagado pois esta em uso",id));
	}
}
