package com.java.jdk8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ListEmploy4 {
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

        double sum = employList.stream().mapToDouble(x -> x.getBasic()).sum();
        System.out.println("Sum is   " +sum);

        Optional<Employ> employMax =employList.stream().max(Comparator.comparing(x -> x.getBasic()));
        System.out.println("Max Salary Employ is  " +employMax);
        Optional<Employ> employMin = employList.stream().min(Comparator.comparing(x -> x.getBasic()));
        System.out.println("Min Salary Employ is  " +employMin);
    }
}
