package com.example.demo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="price", description = "Monetary value")
@JacksonXmlRootElement(localName = "price")
//@XmlRootElement(name = "price")
public class MonetaryValue {
	@Schema(example = "EUR")
	@JsonProperty("cur")
	@JacksonXmlProperty(localName = "cur", isAttribute = true)
	@XmlAttribute(name = "cur")
	private String currency;
	
	@Schema(example = "1.00")
	@JsonProperty("val")
	@JacksonXmlText
	@XmlValue
	private BigDecimal value;
	
	// getters, setter ...

	public MonetaryValue() {
	}

	public MonetaryValue(BigDecimal value, String currency) {
		super();
		this.currency = currency;
		this.value = value;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
