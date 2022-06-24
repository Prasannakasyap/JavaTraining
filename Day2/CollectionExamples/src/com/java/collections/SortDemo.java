package com.java.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Shubham");
		names.add("Ritesh");
		names.add("Sheik");
		names.add("Gopi");
		names.add("Swaroop");
		names.add("Abhishek");
		names.add("Shiva");
		names.add("Hemanth");
		names.add("Shilpa");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
