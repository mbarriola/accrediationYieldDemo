package com.example.yieldstreet.rest.accreditation.dto;

public class ResponseDto {

	private boolean success;
	private boolean accredited;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean isAccredited() {
		return accredited;
	}

	public void setAccredited(boolean accredited) {
		this.accredited = accredited;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (accredited ? 1231 : 1237);
		result = prime * result + (success ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseDto other = (ResponseDto) obj;
		if (accredited != other.accredited)
			return false;
		if (success != other.success)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ResponseDto [success=" + success + ", accredited=" + accredited + "]";
	}

}
