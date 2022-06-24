package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set names = new HashSet();
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
		System.out.println("Names are ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
