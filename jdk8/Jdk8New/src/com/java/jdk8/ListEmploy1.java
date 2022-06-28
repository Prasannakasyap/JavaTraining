package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;

public class ListEmploy1 {

    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<Employ>();
        employList.add(new Employ(1, "Hafeeza","bangalore",84823));
        employList.add(new Employ(2, "Rohit","hyderabad",904243));
        employList.add(new Employ(3, "Basha","vijayawada",76424));
        employList.add(new Employ(4, "Pooja","delhi",98332));
        employList.add(new Employ(5, "Shilpa","chennai",79034));
//        for (Employ e:employList
//             ) {
//            System.out.println(e);
//        }
        employList.forEach(x -> {
            System.out.println(x);
        });
    }
}
