package com.bridgelabz.oopsconcepts;
//inheritance
class Vehicle {
    String model;
    public void work(){
        System.out.println("I can run ");

    }
}
class Bike extends Vehicle{

    public void display() {
        System.out.println("my model name "+model);
    }
}
class name{
    public static void main(String[] args) {
        Bike pulsar = new Bike();
        pulsar.model="Pulsar200";
        pulsar.display();
        pulsar.work();

    }
}