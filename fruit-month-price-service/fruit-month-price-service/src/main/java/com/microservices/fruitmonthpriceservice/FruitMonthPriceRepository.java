package com.microservices.fruitmonthpriceservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitMonthPriceRepository extends JpaRepository<FruitMonthPrice, Long> {

	FruitMonthPrice findByFruitAndMonth(String fruit, String month);
}
