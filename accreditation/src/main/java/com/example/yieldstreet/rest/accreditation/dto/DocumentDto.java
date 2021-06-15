package com.example.yieldstreet.rest.accreditation.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentDto {

	private String name;
	private String mime_type;
	private String content;

	@JsonCreator
	public DocumentDto(@JsonProperty(required = true) String name, 
						@JsonProperty(required = true) String mime_type, 
						@JsonProperty(required = true) String content) {
		super();
		this.name = name;
		this.mime_type = mime_type;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public String getMime_type() {
		return mime_type;
	}

	public String getContent() {
		return content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((mime_type == null) ? 0 : mime_type.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		DocumentDto other = (DocumentDto) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (mime_type == null) {
			if (other.mime_type != null)
				return false;
		} else if (!mime_type.equals(other.mime_type))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DocumentDto [name=" + name + ", mime_type=" + mime_type + ", content=" + content + "]";
	}
}
