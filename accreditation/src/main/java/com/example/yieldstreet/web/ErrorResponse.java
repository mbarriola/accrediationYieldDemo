package com.example.yieldstreet.web;

public class ErrorResponse {

	private boolean success;
	private String errorMessage;
	private int httpErrorCode;

	public ErrorResponse(boolean success, String errorMessage, int httpErrorCode) {
		super();
		this.success = success;
		this.errorMessage = errorMessage;
		this.httpErrorCode = httpErrorCode;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public int getHttpErrorCode() {
		return httpErrorCode;
	}
}
