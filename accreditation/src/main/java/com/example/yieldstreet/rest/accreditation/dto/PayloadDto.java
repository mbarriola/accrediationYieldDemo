package com.example.yieldstreet.rest.accreditation.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PayloadDto {

	private String accreditation_type;
	List<DocumentDto> documents = new ArrayList<>();

	@JsonCreator
	public PayloadDto(@JsonProperty(required = true) String accreditation_type, 
						@JsonProperty(required = true) List<DocumentDto> documents) {
		super();
		this.accreditation_type = accreditation_type;
		this.documents = documents;
	}

	public String getAccreditation_type() {
		return accreditation_type;
	}

	public List<DocumentDto> getDocuments() {
		return documents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accreditation_type == null) ? 0 : accreditation_type.hashCode());
		result = prime * result + ((documents == null) ? 0 : documents.hashCode());
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
		PayloadDto other = (PayloadDto) obj;
		if (accreditation_type == null) {
			if (other.accreditation_type != null)
				return false;
		} else if (!accreditation_type.equals(other.accreditation_type))
			return false;
		if (documents == null) {
			if (other.documents != null)
				return false;
		} else if (!documents.equals(other.documents))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PayloadDto [accreditation_type=" + accreditation_type + ", documents=" + documents + "]";
	}
}
