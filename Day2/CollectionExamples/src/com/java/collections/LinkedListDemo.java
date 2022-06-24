package com.java.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.add("Shubham");
		names.add("Ritesh");
		names.add("Swaroop");
		names.add("Shiva");
		names.add("Shilpa");
		names.addFirst("Sireesha");
		names.addLast("Sundaram");
		System.out.println(names);
//		System.out.println("Linked List Data is   ");
//		for (Object ob : names) {
//			System.out.println(ob);
//		}
	}
}
