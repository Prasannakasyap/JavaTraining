package com.java.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEmploy2 {
    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<Employ>();
        employList.add(new Employ(1, "Hafeeza","bangalore",84823));
        employList.add(new Employ(2, "Rohit","hyderabad",904243));
        employList.add(new Employ(3, "Basha","vijayawada",76424));
        employList.add(new Employ(4, "Pooja","delhi",98332));
        employList.add(new Employ(5, "Shilpa","chennai",79034));
        System.out.println("Default Values are ");
        System.out.println("-------------------------");
        employList.forEach(x -> {
            System.out.println(x);
        });
        System.out.println("Sorted By Name  ");
        System.out.println("----------------------");
        Collections.sort(employList, (e1, e2) -> {
            return e1.getName().compareTo(e2.getName());
        });
        employList.forEach(x -> {
            System.out.println(x);
        });
        System.out.println("Sorted By Salary  ");
        System.out.println("--------------------");
        Collections.sort(employList, (e1, e2) -> {
            return (int) ( e1.getBasic() - e2.getBasic());
        });
        employList.forEach(x -> {
            System.out.println(x);
        });
    }
}
