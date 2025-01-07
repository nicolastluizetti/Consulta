package com.example.consulta.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.consulta.api.Interface.AgendamentoRepository;
import com.example.consulta.api.Model.Agendamento;

@Controller
@RequestMapping("/agendamentos")
public class AgendamentoController {
	
	@Autowired
	AgendamentoRepository agendamentos;
	
	@PostMapping
	public Agendamento salvar(Agendamento agendamento) {
		return agendamentos.save(agendamento);
	}
	
	@GetMapping
	public List<Agendamento> Listar(){
		return agendamentos.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void deletar(Long id) {
		agendamentos.deleteById(id);
	}

}
