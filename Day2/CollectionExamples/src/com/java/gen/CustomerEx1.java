package com.java.gen;

public class CustomerEx1 {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustsId(1);
		c1.setCustName("Gopi");
		c1.setPremium(99324.33);
		
		System.out.println("Customer Id   " +c1.getCustsId());
		System.out.println("Customer Name   " +c1.getCustName());
		System.out.println("Premium   " +c1.getPremium());
	}
}
