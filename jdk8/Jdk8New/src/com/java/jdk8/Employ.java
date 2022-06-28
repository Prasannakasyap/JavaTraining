package com.java.jdk8;

public class Employ {
    private int empno;
    private String name;
    private String city;
    private double basic;

    @Override
    public String toString() {
        return "Employ{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", basic=" + basic +
                '}';
    }

    public Employ(int empno, String name, String city, double basic) {
        this.empno = empno;
        this.name = name;
        this.city = city;
        this.basic = basic;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }
}
