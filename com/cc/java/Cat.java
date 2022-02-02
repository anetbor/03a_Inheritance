package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;
  
    private int counter;

    public Cat(String name, String furColor, int age) {
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
        return checkEscalationLevel(); 
    }

    private String checkEscalationLevel() {

        counter++;

        switch (counter) {
            case 1:
                return "This is an inappropriate question!"; 
            case 2:
                return "I've told you once!"; 
            case 3:
                return "Talk to the hand!"; 
            default:
                return "1#!?&&%"; 
        }

    }

}

