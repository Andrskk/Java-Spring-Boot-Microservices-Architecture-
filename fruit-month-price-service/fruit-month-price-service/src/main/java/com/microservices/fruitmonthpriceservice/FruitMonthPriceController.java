package com.microservices.fruitmonthpriceservice;

//import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitMonthPriceController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private FruitMonthPriceRepository repository;
	
	
	
	@GetMapping("/fruit-month-price/fruit/{fruit}/month/{month}")
	public FruitMonthPrice retrieveFruitMonthPrice(@PathVariable String fruit, @PathVariable String month) {
		
		//FruitMonthPrice fruitMonthPrice = new FruitMonthPrice(1000L,fruit,month,BigDecimal.valueOf(9.2));
		FruitMonthPrice fruitMonthPrice = repository.findByFruitAndMonth(fruit, month);
		if(fruitMonthPrice==null) {throw new RuntimeException("Unable to find data for " + fruit);}
		
		String port = environment.getProperty("local.server.port");
		fruitMonthPrice.setEnvironment(port);
		
		return fruitMonthPrice;
	}
}
