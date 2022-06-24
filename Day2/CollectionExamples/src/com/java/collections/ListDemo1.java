package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Aditi");
		names.add("Saurabh");
		names.add("Girish");
		names.add("Vikram");
		System.out.println("Names are  ");
		for(Object ob : names) {
			System.out.println(ob);
		}
		names.add(3, "Srikar");
		System.out.println("Names after adding new Item  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove(0);
		System.out.println("Names after removing by Index...");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove("Girish");
		System.out.println("Names after removing by Object Name   ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
