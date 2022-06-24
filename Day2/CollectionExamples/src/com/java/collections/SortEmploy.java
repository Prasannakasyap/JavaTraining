package com.java.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		// Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		Set employs = new TreeSet(c);
		employs.add(new Employ(1, "Girish", 88423));
	//	employs.add(1);
		employs.add(new Employ(2, "Deepika", 90483));
		employs.add(new Employ(3, "Aditi", 89323));
		employs.add(new Employ(7, "Gopi", 84234));
		employs.add(new Employ(4, "Hemanth", 86744));
		employs.add(new Employ(5, "Sreelatha", 91044));
		employs.add(new Employ(6, "Irfan", 85893));
		employs.add(new Employ(8, "Kavya",84245));
		employs.add(new Employ(9, "Likhitha",91123));
		System.out.println("Employ Details are  ");
		for (Object ob : employs) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
