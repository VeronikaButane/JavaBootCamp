package sef.module6.activity;

import java.awt.*;

public class AbstractionActivity {

    public static void main(String[] args) {

        Shape p1 = new Square(5);
        Shape p2 = new Rectangle(5, 6);

        p1.setColor("Red");
        p2.setColor("Violet");

        System.out.println("*** Prints the information for Square***");
        System.out.println("Color of square: " + p1.getColor());
        System.out.println("Area of square: " + p1.calculateArea());
        System.out.println("Perimeter of square: " + p1.calculatePerimeter());

        System.out.println();

        System.out.println("*** Prints the information for Rectangle***");
        System.out.println("Color of rectangle: " + p2.getColor());
        System.out.println("Area of rectangle: " + p2.calculateArea());
        System.out.println("Perimeter of rectangle: " + p2.calculatePerimeter());
    }

}