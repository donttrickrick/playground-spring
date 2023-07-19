package com.example.leanjava;

public class HelloWorldImpl implements HelloWorld {
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String say() {
        return this.name == null ? "Hello World!" : String.format("Hello %s", this.name);
    }
}
