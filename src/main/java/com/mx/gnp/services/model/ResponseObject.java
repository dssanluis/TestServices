package com.mx.gnp.services.model;

import java.util.ArrayList;

public class ResponseObject extends ModelBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Object> responseArray;
	private Object responseObject;
	
	public ArrayList<Object> getResponseArray() {
		return responseArray;
	}
	public void setResponseArray(ArrayList<Object> responseArray) {
		this.responseArray = responseArray;
	}
	public Object getResponseObject() {
		return responseObject;
	}
	public void setResponseObject(Object responseObject) {
		this.responseObject = responseObject;
	}
}
