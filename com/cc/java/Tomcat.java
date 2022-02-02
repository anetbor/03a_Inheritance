package com.cc.java;

public class Tomcat {
    
    private String name;
    private String furColor;
    private int age;

    public Tomcat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    /** Getter */
    public String getStringAttributes(String flag) {
        switch (flag) {
            case "#name":
                return this.name; 
            case "#furColor":
                return this.furColor; 
            default:
                return "ERROR: ???";
        }
    }

    public String getAge() {
        return String.valueOf(this.age);
    }



}
