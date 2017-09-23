package com.mx.gnp.services.model;

import java.io.Serializable;

public class ModelBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codeMessage;
	private String message;
	
	public String getCodeMessage() {
		return codeMessage;
	}
	public void setCodeMessage(String codeMessage) {
		this.codeMessage = codeMessage;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
