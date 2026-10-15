package code_orbitTASK;

import java.util.Scanner;

class Shape {
	public void calculateArea() {
		System.out.println("Area formula is not defined for a generic shape.");
	}
}

class Circle extends Shape {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		double area = Math.PI * radius * radius;
		System.out.printf("Circle Area (Radius: %.2f) = %.2f\n", radius, area);
	}
}

class Square extends Shape {
	double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public void calculateArea() {
		double area = side * side;
		System.out.printf("Square Area (Side: %.2f) = %.2f\n", side, area);
	}
}

class Triangle extends Shape {
	double base;
	double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		double area = 0.5 * base * height;
		System.out.printf("Triangle Area (Base: %.2f, Height: %.2f) = %.2f\n", base, height, area);
	}
}

public class InheritancePolymorphismPractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter radius for Circle: ");
		double radius = scanner.nextDouble();
		Shape shape1 = new Circle(radius);

		System.out.print("Enter side length for Square: ");
		double side = scanner.nextDouble();
		Shape shape2 = new Square(side);

		System.out.print("Enter base for Triangle: ");
		double base = scanner.nextDouble();
		System.out.print("Enter height for Triangle: ");
		double height = scanner.nextDouble();
		Shape shape3 = new Triangle(base, height);

		System.out.println("\n--- Calculated Results ---");
		shape1.calculateArea();
		shape2.calculateArea();
		shape3.calculateArea();

		scanner.close();
	}
}