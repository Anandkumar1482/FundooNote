package com.bridgelabz.springboot.response;

public class RegistorResponse {
	private String response_message;
	private int status_code;
	private String object;
	
	public RegistorResponse(String response_message, int status_code) {
		super();
		this.response_message = response_message;
		this.status_code = status_code;
	}

	public String getResonse_message() {
		return response_message;
	}

	public void setResonse_message(String resonse_message) {
		this.response_message = resonse_message;
	}

	public int getStatus_code() {
		return status_code;
	}

	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}

}