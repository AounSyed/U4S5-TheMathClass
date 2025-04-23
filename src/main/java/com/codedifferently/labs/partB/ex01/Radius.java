package com.codedifferently.labs.partB.ex01;
import java.util.Scanner;
public class Radius {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = input.nextInt();

        double area = Math.PI * (radius * radius);
        System.out.println("The area of the circle is: " + area);
    }
}
