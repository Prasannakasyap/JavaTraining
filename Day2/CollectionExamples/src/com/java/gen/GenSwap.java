package com.java.gen;

class Data<T> {
	public void swap(T a, T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value is  " +a+ " B value is  " +b);
	}
}

public class GenSwap {
	public static void main(String[] args) {
		Data obj1 = new Data();
		int a = 5, b = 7;
		obj1.swap(a, b);
		String s1 = "Hemanth", s2 = "Gopi";
		obj1.swap(s1, s2);
		boolean b1 = true, b2 = false;
		obj1.swap(b1, b2);
	}
}
