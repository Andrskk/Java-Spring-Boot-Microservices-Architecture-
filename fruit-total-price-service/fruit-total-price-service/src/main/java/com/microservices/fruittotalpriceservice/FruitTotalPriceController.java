package com.microservices.fruittotalpriceservice;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class FruitTotalPriceController {

	@GetMapping("/fruit-total-price/fruit/{fruit}/month/{month}/quantity/{quantity}")
	public FruitTotalPrice calculateTotal(
			@PathVariable String fruit, 
			@PathVariable String month, 
			@PathVariable BigDecimal quantity) {
		
		HashMap<String,String> uriVariables = new HashMap<>();
		uriVariables.put("fruit", fruit);
		uriVariables.put("month", month);
		
		ResponseEntity<FruitTotalPrice> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8200/fruit-month-price/fruit/{fruit}/month/{month}", FruitTotalPrice.class, uriVariables);
		
		FruitTotalPrice fruitTotalPrice = responseEntity.getBody();
		 return new FruitTotalPrice (fruitTotalPrice.getId(), fruitTotalPrice.getPrice(), fruit, month, 
				 quantity.multiply(fruitTotalPrice.getPrice()), fruitTotalPrice.getEnvironment());
		
	}
}
