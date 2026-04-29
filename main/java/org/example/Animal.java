package org.example;

//BasKlass
public class Animal {
    protected  String name;

    // Constructor
    public Animal(String name){
        this.name=name;
    }

    //Method
    public void eat(String food) {
        System.out.println(name +" Eating " + food);
    }
}
