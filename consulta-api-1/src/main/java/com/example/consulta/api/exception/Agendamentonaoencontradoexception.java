package com.example.consulta.api.exception;

public class Agendamentonaoencontradoexception extends EntidadeNaoEncontradaException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Agendamentonaoencontradoexception(String mensagem) {
		super(mensagem);
	}
	

	public Agendamentonaoencontradoexception(Long id) {
		this(String.format("não existe cadastro de agendamento com codigo %d",id));
	}
}
