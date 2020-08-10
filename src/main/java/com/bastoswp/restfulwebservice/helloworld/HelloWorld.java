package com.bastoswp.restfulwebservice.helloworld;

public class HelloWorld {
    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("HelloWorldBean [message='%s']", this.message);
    }

    private String message;
}
