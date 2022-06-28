package com.java.jdk8;

interface ITest {
    String greeting();
}

//class Sreelatha implements ITest {
//
//    @Override
//    public String greeting() {
//        return null;
//    }
//}
//
//class Hafeeza implements ITest {
//
//    @Override
//    public String greeting() {
//        return null;
//    }
//}
public class LambdaExpr2 {
    public static void main(String[] args) {

        ITest objHafeeza = () -> {
          return "Hi I am Hafeeza...";
        };

        ITest objBasha = () -> {
          return "Hi I am Irfan Basha...";
        };

        System.out.println(objHafeeza.greeting());
        System.out.println(objBasha.greeting());
    }
}
