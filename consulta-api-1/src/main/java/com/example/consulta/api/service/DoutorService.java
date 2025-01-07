package com.example.consulta.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.consulta.api.Interface.DoutorRepository;
import com.example.consulta.api.Model.Doutor;
import com.example.consulta.api.exception.DoutornaoEncontradoException;
import com.example.consulta.api.exception.EntidadeEmUsoException;

@Service
public class DoutorService {
	
	 @Autowired
	    private DoutorRepository doctorRepository;
	 
	 public Doutor salvar(Doutor doutor) {
	
			
			return doctorRepository.save(doutor);
		}

		public void excluir(Long doutorId) {
			try {
				doctorRepository.deleteById(doutorId);
				
			} catch (EmptyResultDataAccessException e) {
				throw new DoutornaoEncontradoException(doutorId);
			
			} catch (DataIntegrityViolationException e) {
				throw new EntidadeEmUsoException(null);
			}
		}
	 
	 
	 public Doutor criar(@RequestBody  Doutor doutor) {
		return doctorRepository.save(doutor);
		 
	 }
	 public Doutor buscarOuFalhar(Long doutorId) {
			return doctorRepository.findById(doutorId)
				.orElseThrow(() -> new DoutornaoEncontradoException(doutorId));
		}

}
