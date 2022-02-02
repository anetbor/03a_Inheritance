package com.cc.java;

public class SuperCat {

    private String name;
    private String furColor;
    protected int age;
    

        public SuperCat(String name, String furColor, int age) {
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

}
