package com.aawesh.microservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Environment environment;
	@Autowired
	CurrExchangeService service;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = service.getExchangeValue(from.toUpperCase(), to.toUpperCase());
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		logger.info("{}",exchangeValue);
		
		return exchangeValue;
	}
}
