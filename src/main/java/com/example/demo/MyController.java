package com.example.demo;

import java.math.BigDecimal;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
public class MyController {
	@GetMapping
	public MonetaryValue getMonetaryValue() {
		return new MonetaryValue(BigDecimal.ONE, "EUR");
	}
}
