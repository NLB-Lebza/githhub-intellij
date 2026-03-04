package com.lebo.stringtester.model;

public abstract class BaseClass {

    private String entryPoint;
    //getter
    public String getEntryPoint() {

        return entryPoint;
    }
    //setter
    public  void setEntrypoint(String entryPoint) {

        this.entryPoint = entryPoint;

    }
    //this make the class to be overriden(in this case it forces the child class to define the routing)
    public abstract String RouterKeyOne();
    public abstract String RouterKeyTwo();
   // public abstract String RouterKeyThree();
}
