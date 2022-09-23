package com.educandoweb.workshopmongo.resouces.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long timestampLong;
	private Integer status;
	private String message;
	private String error;
	private String path;
	
	public StandardError() {
		
	}

	public StandardError(Long timestampLong, Integer status, String message, String error, String path) {
		super();
		this.timestampLong = timestampLong;
		this.status = status;
		this.message = message;
		this.error = error;
		this.path = path;
	}

	public Long getTimestampLong() {
		return timestampLong;
	}

	public void setTimestampLong(Long timestampLong) {
		this.timestampLong = timestampLong;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
