package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List numbers = new ArrayList();
		numbers.add(new Integer(23));
		numbers.add(new Integer(42));
		numbers.add(new Integer(11));
		numbers.add(new Integer(19));
		
		int sum=0;
		for (Object ob : numbers) {
			int x = (Integer)ob;
			sum+=x;
		}
		System.out.println("Sum is   " +sum);
	}
}
