package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListEmploy3 {
    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<Employ>();
        employList.add(new Employ(1, "Hafeeza","bangalore",84823));
        employList.add(new Employ(2, "Rohit","hyderabad",904243));
        employList.add(new Employ(6, "Shaik Sufiyan","hyderabad",98844));
        employList.add(new Employ(3, "Basha","vijayawada",76424));
        employList.add(new Employ(4, "Pooja","delhi",98332));
        employList.add(new Employ(7, "ShivaKundan","bangalore",80823));
        employList.add(new Employ(5, "Shilpa","chennai",79034));
        employList.add(new Employ(8, "Roopa","hyderabad",88243));
        employList.add(new Employ(9, "Rithisree","bangalore",84823));
        employList.add(new Employ(10, "Hemanth","hyderabad",904243));

        Stream<Employ> employFilter = employList.stream().filter(x -> x.getCity().equals("bangalore"));
        System.out.println("Filterd Data is   ");
        employFilter.forEach(x -> {
            System.out.println(x);
        });

        // Display all records whose basic > 90000
        Stream<Employ> employFilter2 = employList.stream().filter(x -> x.getBasic() >= 90000);
        System.out.println("Filter By Basic is  ");
        employFilter2.forEach(x -> {
            System.out.println(x);
        });
    }
}
