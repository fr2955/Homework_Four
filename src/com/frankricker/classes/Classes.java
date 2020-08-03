package com.frankricker.classes;

/**
 *
 * This Class will take a Integer as input and then give the area as a Double.
 *
 */

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Classes {


    public void Classes(){
    }
    private double Triangle(int base, int height){

        int intA = height;
        int intB = base;
        double result;
        result = .5 * (base * height);
        return result;

    }
    private double Circle(int radius){

        double result;
        result = Math.PI * (radius ^ 2);

        return result;

    }
    private double Rectangle(int sideA, int sideB){

        return (sideA * sideB);

    }
    private double Square(int side){

        return (side * side);

    }
    private double Cylinder(int height, int radi){

        return ((2 * Math.PI * radi * radi) + ( 2 * radi * height * Math.PI));

    }
    public void CircleMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int input = scanner.nextInt();
        System.out.println("The area of the circle is: " + this.Circle(input));
    }
    public void TriangleMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = scanner.nextInt();
        System.out.print("Enter Height: ");
        int height = scanner.nextInt();
        System.out.println("The area of the triangle is: " + Triangle(base, height));
    }
    public void RectangleMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("The area of the rectangle is: " + Rectangle(height, width));
    }
    public void SquareMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        System.out.println("The area of the square is: " + Square(height));
    }
    public void CylinderMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int rad = scanner.nextInt();
        System.out.print("Enter Height: ");
        int height = scanner.nextInt();
        System.out.println("The area of the Cylinder is " + Cylinder(height, rad));
    }
    public void Menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the shape solver!");
        System.out.println("Enter 1 for Circle");
        System.out.println("Enter 2 for Triangle");
        System.out.println("Enter 3 for Rectangle");
        System.out.println("Enter 4 for Square");
        System.out.println("Enter 5 for Cylinder");
        System.out.print("Enter Menu Choice Input: ");
        int choice = scanner.nextInt();


        switch (choice)
        {
            case 1:

                CircleMenu();
                break;

            case 2:
                TriangleMenu();

                break;

            case 3:
                RectangleMenu();

                break;

            case 4:
                SquareMenu();

                break;

            case 5:
                CylinderMenu();
                break;


            default:

                System.out.println("Error Bad Input");
                break;

        }
    }
}
