package com.example.consulta.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.consulta.api.Interface.PacienteRepository;
import com.example.consulta.api.Model.Paciente;

@Controller
@RequestMapping("/Pacientes")
public class PacienteController {
	
	@Autowired
	PacienteRepository Pacientes;
	
	@PostMapping
	public Paciente salvar(Paciente Paciente) {
		return Pacientes.save(Paciente);
	}
	
	@GetMapping
	public List<Paciente> Listar(){
		return Pacientes.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void deletar(Long id) {
		Pacientes.deleteById(id);
	}

}
