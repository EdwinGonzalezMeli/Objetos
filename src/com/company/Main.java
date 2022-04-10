package com.company;

public class Main {

    public static void main(String[] args) {
        Person boy = new Person();
        Person boy1 = new Person("Carlos",16,"1234567890");
        Person boy2 = new Person("Edwin",17,"1234567890",90f,1.82f);
        System.out.println(boy2.toString());
    }
}
