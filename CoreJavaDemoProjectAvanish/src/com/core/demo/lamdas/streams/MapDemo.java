package com.core.demo.lamdas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MapDemo {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1, "Sony Speaker", 5000.0));
		products.add(new Product(2, "Dell Laptop", 50000.0));
		products.add(new Product(3, "Logitech Mouse", 2000.0));
		products.add(new Product(4, "IBall Keyboard", 3000.0));
		products.add(new Product(5, "HP Pendrive", 500.0));
		
		
		//List<Double> prices = products.stream().map(product -> product.getPrice()).collect(Collectors.toList());
		
		
		//Optional<Double> totalPrice1 = products.stream().map(product -> product.getPrice()).reduce((price1 , price2) -> price1 + price2);
		
	
		
		
		Optional<Double> totalPrice = products.stream().map(Product::getPrice).reduce(Double::sum);
		
		Optional<Double> totalMaxPrice = products.stream().map(Product::getPrice).max(Double::compareTo);
		System.out.println("Total Price: "+ totalPrice.get());
		
		System.out.println("Max Price: "+totalMaxPrice.get());
		
		
		totalMaxPrice.ifPresent(System.out::println);

	}

}

class Product {
	int productId;
	String productName;
	double price;
	
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
