package org.example;

public class User {
    private Computer com;
    public User() {

    }
    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("User is Coding");
        com.coding();
    }
}
