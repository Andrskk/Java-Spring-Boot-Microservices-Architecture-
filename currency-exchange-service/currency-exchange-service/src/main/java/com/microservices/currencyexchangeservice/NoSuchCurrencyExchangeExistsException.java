package com.microservices.currencyexchangeservice;

public class NoSuchCurrencyExchangeExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String message;

	public NoSuchCurrencyExchangeExistsException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
