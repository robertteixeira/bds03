package com.devsuperior.bds03.controllers.exceptions;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandartError {

	private static final long serialVersionUID = -5233594180013813351L;
	private List<FieldMessage> errors = new ArrayList<>();

	public ValidationError() {

	}

	public ValidationError(Instant timestamp, Integer status, String error, String message, String path) {
		this.setTimestamp(timestamp);
		this.setStatus(status);
		this.setError(error);
		this.setMessage(message);
		this.setPath(path);
	}

	/**
	 * @return the errors
	 */
	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String name, String message, String rejectedValue) {
		errors.add(new FieldMessage(name, message, rejectedValue));
	}

}
