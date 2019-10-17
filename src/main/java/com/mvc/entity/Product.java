package com.mvc.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Product {
	@NotEmpty
	String productName;
	@NotEmpty
	String type;
	@NotEmpty
	String manufacturer;
	@Min(value=10)
	@Max(value=10000)
	Integer price;
	
	public Product() {
		super();
	}
	
	public Product(String productName, String type, String manufacturer, Integer price) {
		super();
		this.productName = productName;
		this.type = type;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", type=" + type + ", manufacturer=" + manufacturer + ", price="
				+ price + "]";
	}
	
	
}
