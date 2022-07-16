package com.devsuperior.bds03.controllers.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Classe para interceptar as exceções
 * 
 * @ExceptionHandler informa qual a classe que será tratada
 */
@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ValidationError> validation(MethodArgumentNotValidException e, HttpServletRequest req) {
		HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
		ValidationError error = new ValidationError(Instant.now(), status.value(), "Validation exception!", e.getMessage(), req.getRequestURI());

		for (FieldError f : e.getBindingResult().getFieldErrors()) {
			Object rejectedValue = f.getRejectedValue();
			error.addError(f.getField(), f.getDefaultMessage(), (rejectedValue != null ? rejectedValue.toString() : ""));
		}

		return ResponseEntity.status(status).body(error);
	}

}
