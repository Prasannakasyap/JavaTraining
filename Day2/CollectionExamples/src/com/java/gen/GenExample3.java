package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenExample3 {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Girish", 88423));
		employList.add(new Employ(2, "Deepika", 90483));
		employList.add(new Employ(3, "Aditi", 89323));
		employList.add(new Employ(4, "Hemanth", 86744));
		employList.add(new Employ(5, "Sreelatha", 91044));
		employList.add(new Employ(6, "Irfan", 85893));
		System.out.println("Employ List is  ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
