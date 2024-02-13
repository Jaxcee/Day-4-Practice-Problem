package com.bridgelabz.oopsconcepts;

public class Default {

    public Default() {
        System.out.println("Default constructor is printed");
    }public Default(int a) {
        System.out.println("Parameterized constructor is called");
    }

    public static void main(String[] args) {
        Default objone = new Default();
        Default objtwo = new Default(10);
    }
}
