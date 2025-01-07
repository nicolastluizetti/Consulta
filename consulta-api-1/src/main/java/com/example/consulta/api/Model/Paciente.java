package com.example.consulta.api.Model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	public String nome;
	public String email;
	public String telefone;
	public LocalDate datanascimento;
	
	@OneToMany(mappedBy = "id")
	public List<Agendamento> agendamentos;
}
