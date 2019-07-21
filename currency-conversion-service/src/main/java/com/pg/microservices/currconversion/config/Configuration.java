package com.pg.microservices.currconversion.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("currency-conversion-service")
public class Configuration {
	private String currencyExchangeUri;

	public String getCurrencyExchangeUri() {
		return currencyExchangeUri;
	}

	public void setCurrencyExchangeUri(String currencyExchangeUri) {
		this.currencyExchangeUri = currencyExchangeUri;
	}
	
	
}
