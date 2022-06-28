package com.java.jdk8;

interface IHello {
    void sayHello();
}

public class LambdaExp1 {

    public static void main(String[] args) {
        IHello h1 = () -> {
            System.out.println("Welcome to Lambda Expression...");
        };
        h1.sayHello();

        IHello h2 = () -> {
            System.out.println("Hi I am Prasanna Trainer...");
        };
        h2.sayHello();
    }
}
