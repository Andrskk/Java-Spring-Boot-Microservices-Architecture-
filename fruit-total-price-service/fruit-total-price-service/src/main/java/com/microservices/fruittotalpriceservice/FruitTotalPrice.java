package com.microservices.fruittotalpriceservice;

import java.math.BigDecimal;

public class FruitTotalPrice {

	private Long id;
	private BigDecimal price;
	private String fruit;
	private String month;
	private BigDecimal quantity;
	private String environment;
	
	public FruitTotalPrice() {}
	
	public FruitTotalPrice(Long id, BigDecimal price, String fruit, String month, BigDecimal quantity,
			String environment) {
		super();
		this.id = id;
		this.price = price;
		this.fruit = fruit;
		this.month = month;
		this.quantity = quantity;
		this.environment = environment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	} 
}
