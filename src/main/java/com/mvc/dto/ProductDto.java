package com.mvc.dto;

public class ProductDto {
  String productId;
  String productName;
  String type;
  String manufacturer;
  Integer price;
  
  
public ProductDto() {
	super();
}
public ProductDto(String productId, String productName, String type, String manufacturer, Integer price) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.type = type;
	this.manufacturer = manufacturer;
	this.price = price;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
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
	return "ProductDto [productId=" + productId + ", productName=" + productName + ", type=" + type + ", manufacturer="
			+ manufacturer + ", price=" + price + "]";
}
  
  
}
