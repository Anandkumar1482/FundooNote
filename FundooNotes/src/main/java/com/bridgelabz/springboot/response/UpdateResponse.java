package com.bridgelabz.springboot.response;

public class UpdateResponse {
	private String response_message;
	private int status_code;
	private Object object;

	public UpdateResponse() {

	}

	public UpdateResponse(String response_message, int status_code, Object object) {
		super();
		this.response_message = response_message;
		this.status_code = status_code;
		this.object = object;
	}

	public String getResponse_message() {
		return response_message;
	}

	public void setResponse_message(String response_message) {
		this.response_message = response_message;
	}

	public int getStatus_code() {
		return status_code;
	}

	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "UpdateResponse [response_message=" + response_message + ", status_code=" + status_code + ", object="
				+ object + "]";
	}

}
