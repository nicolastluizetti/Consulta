package com.example.consulta.api.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.consulta.api.Interface.AgendamentoRepository;
import com.example.consulta.api.Interface.DoutorRepository;
import com.example.consulta.api.Interface.PacienteRepository;
import com.example.consulta.api.Model.Agendamento;
import com.example.consulta.api.Model.Paciente;
import com.example.consulta.api.Model.Doutor;

public class ConsultaService {
	   @Autowired
	    private AgendamentoRepository appointmentRepository;
	    @Autowired
	    private PacienteRepository patientRepository;
	    @Autowired
	    private DoutorRepository doctorRepository;

	    public Agendamento scheduleAppointment(Long patientId, Long doctorId, LocalDateTime appointmentDate) {
	        Paciente patient = patientRepository.findById(patientId)
	                .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
	        Doutor doctor = doctorRepository.findById(doctorId)
	                .orElseThrow(() -> new RuntimeException("Médico não encontrado"));

	        Agendamento appointment = new Agendamento();
	        appointment.setPaciente(patient);
	        appointment.setDoutor(doctor);
	        appointment.setConsulta(appointmentDate);
	        appointment.setStatus("Agendada");

	        return appointmentRepository.save(appointment);
	    }

}
