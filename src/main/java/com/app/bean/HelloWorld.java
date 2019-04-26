package com.app.bean;
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void Hello(){
        System.out.println("Welcome "+name+ " To Spring Framework programming");
    }
}
