package com.bridgelabz.oopsconcepts;

public class Overriding {
    void run(){
        System.out.println("Vehicle running sucessfully");
    }
   static class Bike extends Overriding{
        void run() {
            System.out.println("bike running sucessfully");
        }

        public static void main(String[] args) {
            Bike obj = new Bike();
            obj.run();

        }}}