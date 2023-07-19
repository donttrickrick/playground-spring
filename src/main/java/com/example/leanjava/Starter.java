package com.example.leanjava;

public class Starter {

    public static void main(String[] args) {
        HelloWorldImpl helloWorld = new HelloWorldImpl();
        helloWorld.setName("Rick");
        System.out.printf(helloWorld.say());
    }
}
