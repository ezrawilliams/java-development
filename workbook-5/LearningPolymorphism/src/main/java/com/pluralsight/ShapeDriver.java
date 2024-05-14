package com.pluralsight;

import java.util.Scanner;

public class ShapeDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double length, width, height;
        System.out.println("This is the area calculator:");
        System.out.println("1. Area of a PLAIN old Rectangle (not a square)");
        System.out.println("2. Area of a Box");
        System.out.println("3. Area of a SQUARE");
        System.out.println("-1 to exit");

        choice = scanner.nextInt();

        while (choice != -1){
            switch (choice){
                case 1:
                    System.out.println("For the area of a rectangle:");
                    System.out.println("Enter the length:");
                    length=scanner.nextDouble();
                    System.out.println("Enter the width:");
                    width=scanner.nextDouble();
                    Rectangle rectangle = new Rectangle();
                    rectangle.setLength(length);
                    rectangle.setWidth(width);
                    System.out.println("The area of your rectangle is "+
                            rectangle.getArea());
                    break;
                case 2:
                    System.out.println("For the area of a box:");
                    System.out.println("Enter the length:");
                    length=scanner.nextDouble();
                    System.out.println("Enter the width:");
                    width=scanner.nextDouble();
                    System.out.println("Enter the height");
                    height = scanner.nextDouble();
                    Box box = new Box();
                    box.setLength(length);
                    box.setWidth(width);
                    box.setWidth(height);
                    System.out.println("The area of your box is "+
                            box.getArea());
                    break;
                case 3:
                    System.out.println("For the area of a square:");
                    System.out.println("Enter the length:");
                    length=scanner.nextDouble();
                    System.out.println("Enter the width:");
                    width=scanner.nextDouble();
                    Square square = new Square();
                    square.setLength(length);
                    square.setWidth(width);
                    if (square.getArea()==0){
                        System.out.println("I do not think that this is a square");
                    } else {
                        System.out.println("The area of your square is "+
                                square.getArea());
                    }

                    break;
            }
            System.out.println("Do you want to go again?");
            choice=scanner.nextInt();
        }

    }
}
