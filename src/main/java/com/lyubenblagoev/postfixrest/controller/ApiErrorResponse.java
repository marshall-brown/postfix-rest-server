package com.lyubenblagoev.postfixrest.controller;

public class ApiErrorResponse {

	private String message;
	private String path;
	private String method;

	public ApiErrorResponse(String error, String path, String method) {
		this.message = error;
		this.path = path;
		this.method = method;
	}

	public String getMessage() {
		return message;
	}

	public String getPath() {
		return path;
	}
	
	public String getMethod() {
		return method;
	}

	@Override
	public String toString() {
		return "ApiErrorResponse [message=" + message + ", path=" + path + ", method=" + method + "]";
	}
	
}
