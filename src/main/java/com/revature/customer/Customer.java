package com.revature.customer;

public class Customer {

private String name;
private double price;
private int itemsInCart;
private final double salesTax = 6.67;
private static String salesManager = "Dollar Moneypenny";

public Customer() {
	super();
}
public Customer(String name, double price) {
	super();
	this.name = name;
	this.price = price;
	this.itemsInCart = 0;
}

public Customer(String name) {
	super();
	this.name = name;
	this.price = 0;
	this.itemsInCart = 0;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getItemsInCart() {
	return itemsInCart;
}
public void setItemsInCart(int itemsInCart) {
	this.itemsInCart = itemsInCart;
}
public static String getSalesManager() {
	return salesManager;
}
public static void setSalesManager(String salesManager) {
	Customer.salesManager = salesManager;
}
public double getSalesTax() {
	return salesTax;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", price=" + price + " Items in Cart= " +itemsInCart + ", salesTax=" + salesTax + ", sales manager= " + salesManager+ "]";
}
public void toReceipt() {
	System.out.println("Customer = " +name);
	System.out.println("Number of Items = "+itemsInCart);
	System.out.println("Subtotal = "+price);
	System.out.println("Sales tax = "+salesTax);
	System.out.println("Total = "+totalPrice());
	System.out.println("Your sales manager is "+salesManager);
}
public double totalPrice() {
	return price*salesTax;
}
public double totalPrice(double discount) {
	return discount*price*salesTax;
}
public void addItem() {
	itemsInCart++;
	System.out.println("New Item Added");
}
public void addItem(double itemPrice) {
	itemsInCart++;
	price = price+itemPrice;
}
}
