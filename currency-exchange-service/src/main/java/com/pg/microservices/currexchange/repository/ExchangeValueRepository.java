package com.pg.microservices.currexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pg.microservices.currexchange.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
