package com.bridgelabz.oopsconcepts;
//polymorphism with method overloading
public class Polymorphism {
    public static void main(String[] args) {
        Method obj1 = new Method();
        obj1.min(6,5);
        obj1.min(5,6,7);
    }
}
class Method{
    void min (int a , int b){
        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }



        }void min(int a ,int b,int c){
        System.out.println(a);

    }
}
