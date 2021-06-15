package com.example.yieldstreet.rest.accreditation.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Apex of the accreditation dtos hierarchy of the customer request for accreditation.
 * @author mbarr
 *
 */
public class AccreditationDto {

	private String user_id;
	PayloadDto payload;

	@JsonCreator
	public AccreditationDto(@JsonProperty(required = true) String user_id, 
							@JsonProperty(required = true)PayloadDto payload) {
		super();
		this.user_id = user_id;
		this.payload = payload;
	}

	public String getUser_id() {
		return user_id;
	}

	public PayloadDto getPayload() {
		return payload;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((payload == null) ? 0 : payload.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
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
		AccreditationDto other = (AccreditationDto) obj;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccreditationDto [user_id=" + user_id + ", payload=" + payload + "]";
	}
}
