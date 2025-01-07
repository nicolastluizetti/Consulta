package com.example.consulta.api.exception;

public class DoutorEmUso extends EntidadeNaoEncontradaException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DoutorEmUso(String mensagem) {
		super(mensagem);
		
	}
	
	public DoutorEmUso(Long id) {
		this(String.format("o cadastro de numero:%d, não pde ser apagado pois esta em uso",id));
	}
}
