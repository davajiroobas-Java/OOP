package org.example;

//BasKlass
public class Shape {
    protected  double width;
    protected  double height;


    // Constructor
    public Shape(double width, double height){
        this.width=width;
        this.height=height;
    }

    //Getters
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }


    //Area
    public double getArea() {
      return width * height;
    }
}
