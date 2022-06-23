package com.revature.customer;

public class CustomerManager {
public static void main(String[] args) {

	Customer.setSalesManager("Reigen Arataka");
	
	Customer c1 = new Customer("Taylor Swift", 5.3);
	c1.addItem();
	c1.addItem(20.50);
	System.out.println(c1.toString());
	c1.toReceipt();
	
	Customer c2 = new Customer("Zendaya");
	c2.addItem(80.90);
	c2.addItem(100);
	c2.toReceipt();
	
	Customer c3 = new Customer();
	c3.setName("Homer Simpson");
	c3.setPrice(1000.69);
	c3.setItemsInCart(30);
	System.out.println("Name: "+c3.getName());
	System.out.println("Price: "+c3.getPrice());
	System.out.println("Items In Cart: "+c3.getItemsInCart());
	System.out.println("New Price: "+c3.totalPrice(30001.1));
}
}
