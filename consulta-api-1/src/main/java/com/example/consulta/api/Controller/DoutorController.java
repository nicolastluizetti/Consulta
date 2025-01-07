package com.example.consulta.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.consulta.api.Interface.DoutorRepository;
import com.example.consulta.api.Model.Doutor;

@Controller
@RequestMapping("/doutores")
public class DoutorController {
	
	@Autowired
	DoutorRepository repository;
	@PostMapping
	public Doutor salvar(Doutor doutor) {
		return repository.save(doutor);
	}
	
	@GetMapping
	public List<Doutor> Listar(){
		return repository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void deletar(Long id) {
		repository.deleteById(id);
	}

}
