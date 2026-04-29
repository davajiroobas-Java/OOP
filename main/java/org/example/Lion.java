package org.example;

public class Lion  extends Animal{
    public Lion(String name){
        super(name);
    }


    public void roar() {
        System.out.println(name + ": rooar");
        eat(" meat");

    }
}
