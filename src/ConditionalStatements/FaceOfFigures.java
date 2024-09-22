package ConditionalStatements;

import java.util.Scanner;

public class FaceOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of figure (square, rectangle, circle, triangle): ");
        String figureType = scanner.next().toLowerCase();

        switch (figureType) {
            case "square":
                System.out.print("Enter the length of the side: ");
                double side = scanner.nextDouble();
                double squareArea = calculateSquareArea(side);
                System.out.printf("Area of the square: %.2f%n", squareArea);
                break;

            case "rectangle":
                System.out.print("Enter the lengths of the sides: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double rectangleArea = calculateRectangleArea(length, width);
                System.out.printf("Area of the rectangle: %.2f%n", rectangleArea);
                break;

            case "circle":
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = calculateCircleArea(radius);
                System.out.printf("Area of the circle: %.2f%n", circleArea);
                break;

            case "triangle":
                System.out.print("Enter the length of the side and the height: ");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                double triangleArea = calculateTriangleArea(base, height);
                System.out.printf("Area of the triangle: %.2f%n", triangleArea);
                break;

            default:
                System.out.println("Unknown figure type.");
                break;
        }

    }

    // Function to calculate the area of a square
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // Function to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Function to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Function to calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
