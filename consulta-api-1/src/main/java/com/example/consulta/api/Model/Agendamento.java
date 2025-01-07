package com.example.consulta.api.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public LocalDateTime consulta;
	public String status;
	@ManyToOne
	public Paciente paciente;
	@ManyToOne
	public Doutor doutor;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getConsulta() {
		return consulta;
	}
	public void setConsulta(LocalDateTime consulta) {
		this.consulta = consulta;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Doutor getDoutor() {
		return doutor;
	}
	public void setDoutor(Doutor doutor) {
		this.doutor = doutor;
	}
	
	

	
}
