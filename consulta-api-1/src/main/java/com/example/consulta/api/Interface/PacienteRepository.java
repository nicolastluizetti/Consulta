package com.example.consulta.api.Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.consulta.api.Model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
