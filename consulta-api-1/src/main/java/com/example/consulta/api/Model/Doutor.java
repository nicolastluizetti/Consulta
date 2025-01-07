package com.example.consulta.api.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Doutor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	public String nome;
	public String especialidade;
	public String email;
	public String telefone;
	 @OneToMany
	 public List<Agendamento> agendamentos;

}
