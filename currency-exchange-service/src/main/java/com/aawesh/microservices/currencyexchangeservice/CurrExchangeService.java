package com.aawesh.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrExchangeService {
	
	@Autowired
	CurrExchangeRepository currExchangeRepository;
	
	public ExchangeValue getExchangeValue(String from,String to) {
		return currExchangeRepository.findByFromAndTo(from, to);
	}

}
