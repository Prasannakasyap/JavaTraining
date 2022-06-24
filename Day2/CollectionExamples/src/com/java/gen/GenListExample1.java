package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenListExample1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Hemanth");
		names.add("Irfan");
		names.add("Aditi");
		names.add("Kavya");
		names.add("Gopi");
		names.add("Latha");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
