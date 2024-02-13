package com.bridgelabz.oopsconcepts;
//Enscapsulation

public class AppForm {

        String name;
        int rollno;

        public void display(){
            System.out.println(name);
            System.out.println(rollno);
        }

        public static void main(String[] args) {
            AppForm candidateone=new AppForm();
            candidateone.name="jaga";
            candidateone.rollno=15;
            candidateone.display();

        }

    }



