package com.hardik.sapient.common;

public class Response {

	private String message;
	private Object data;

	public String getMessage() {
		return message;
	}

	public Response setMessage(String message) {
		this.message = message;
		return this;
	}

	public Object getData() {
		return data;
	}

	public Response setData(Object data) {
		this.data = data;
		return this;
	}

}
