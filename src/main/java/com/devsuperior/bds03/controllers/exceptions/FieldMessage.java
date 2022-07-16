package com.devsuperior.bds03.controllers.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 301779923009120584L;
	private String fieldName;
	private String message;
	private String rejectedValue;
	
	public FieldMessage () {
		
	}

	public FieldMessage(String fieldName, String message, String rejectedValue) {
		this.fieldName = fieldName;
		this.message = message;
		this.rejectedValue = rejectedValue;
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the rejectedValue
	 */
	public String getRejectedValue() {
		return rejectedValue;
	}

	/**
	 * @param rejectedValue the rejectedValue to set
	 */
	public void setRejectedValue(String rejectedValue) {
		this.rejectedValue = rejectedValue;
	}
	
}
