package com.microservices.fruitmonthpriceservice;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FruitMonthPrice {

	@Id
	private Long id;
	
	@Column(name="fruit_col")
	private String fruit;
	
	@Column(name="month_col")
	private String month;
	private BigDecimal price;
	private String environment;
	
	public FruitMonthPrice (){}

	public FruitMonthPrice(Long id, String fruit, String month, BigDecimal price) {
		super();
		this.id = id;
		this.fruit = fruit;
		this.month = month;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
}
