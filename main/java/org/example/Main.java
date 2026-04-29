package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[]args){

        Rectangle rect= new Rectangle(4,5);
        Triangle tri= new Triangle(4,5);

        System.out.println("Rectangle area " +  rect.getArea());
        System.out.println("Triangle area " + tri.getArea());
    }
}
