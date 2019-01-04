package com.exam;

public class Ticket {
	String start;
	String destination;
	int price;
	int num;
	public Ticket(String start,String destination,int price, int num){
		this.start=start;
		this.destination=destination;
		this.price=price;
		this.num=num;
}
	public String get() {
		String s =(start+" "+destination+" "+price+" "+num+" "+price*num);
		return s;
	}
}
