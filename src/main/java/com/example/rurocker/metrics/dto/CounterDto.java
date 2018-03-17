package com.example.rurocker.metrics.dto;

/**
 * Just another DTO.
 * 
 * @author ricky
 *
 */
public class CounterDto {

	private long timestamp;
	private Integer counter;
	private String message;

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
