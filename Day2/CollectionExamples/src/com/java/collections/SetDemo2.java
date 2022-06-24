package com.java.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		Set names = new LinkedHashSet();
		names.add("Shubham");
		names.add("Ritesh");
		names.add("Swaroop");
		names.add("Shiva");
		names.add("Shilpa");
		names.add("Ritesh");
		names.add("Swaroop");
		names.add("Shiva");
		names.add("Shilpa");
		names.add("Ritesh");
		names.add("Swaroop");
		names.add("Shiva");
		names.add("Shilpa");
		names.add("Shubham");
		names.add("Ritesh");
		names.add("Swaroop");
		names.add("Shiva");
		names.add("Shilpa");
		names.add("Shubham");
		names.add("Ritesh");
		names.add("Swaroop");
		names.add("Shiva");
		names.add("Shilpa");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
