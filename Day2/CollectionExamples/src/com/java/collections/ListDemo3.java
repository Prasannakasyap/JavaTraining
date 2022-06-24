package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		List employs = new ArrayList();
		employs.add(new Employ(1, "Girish", 88423));
		employs.add(new Employ(2, "Deepika", 90483));
		employs.add(new Employ(3, "Aditi", 89323));
		employs.add(new Employ(4, "Hemanth", 86744));
		employs.add(new Employ(5, "Sreelatha", 91044));
		employs.add(new Employ(6, "Irfan", 85893));
		
		System.out.println("Employ Records are  ");
		for (Object ob : employs) {
		//	int x = (Integer)ob;
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
