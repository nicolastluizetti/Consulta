package com.example.consulta.api.ExceptionHandler;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class Problem {

	private Integer status;
	private LocalDateTime timestamp;
	private String type;
	private String title;
	private String detail;
	private String userMessage;
	
}
