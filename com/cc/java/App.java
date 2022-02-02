package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat("Grizabella", "white", 29);
        output("Name: " + cat.getStringAttributes("#name"));
        output("Fellfarbe " + cat.getStringAttributes("#furColor"));
        output("Alter: " + cat.getAge());
        output("Alter: " + cat.getAge());
        output("Alter: " + cat.getAge());
        output("Alter: " + cat.getAge());

        output("-------------");

        Tomcat tomcat = new Tomcat("Alonzo", "grey", 35);
        output("Name: " + tomcat.getStringAttributes("#name"));
        output("Fellfarbe " + tomcat.getStringAttributes("#furColor"));
        output("Alter: " + tomcat.getAge());
        
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

