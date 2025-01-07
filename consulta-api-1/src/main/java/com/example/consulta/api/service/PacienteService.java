package com.example.consulta.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.consulta.api.Interface.PacienteRepository;
import com.example.consulta.api.Model.Paciente;
import com.example.consulta.api.exception.EntidadeEmUsoException;
import com.example.consulta.api.exception.PacientenaoEncontradoException;

@Service
public class PacienteService {
	
	 @Autowired
	    private PacienteRepository pacienteRepository;
	 
	 public Paciente salvar(Paciente paciente) {
	
			
			return pacienteRepository.save(paciente);
		}

		public void excluir(Long doutorId) {
			try {
				pacienteRepository.deleteById(doutorId);
				
			} catch (EmptyResultDataAccessException e) {
				throw new PacientenaoEncontradoException(doutorId);
			
			} catch (DataIntegrityViolationException e) {
				throw new EntidadeEmUsoException(null);
			}
		}
	 
	 
	 public Paciente criar(@RequestBody  Paciente paciente) {
		return pacienteRepository.save(paciente);
		 
	 }
	 public Paciente buscarOuFalhar(Long PacienteId) {
			return pacienteRepository.findById(PacienteId)
				.orElseThrow(() -> new PacientenaoEncontradoException(PacienteId));
		}

}
