//2. Java Program to Illustrates Use of Abstract Class and Method

import java.util.*;
abstract class Shape{
	
	abstract public void calArea();
}



class Rectangle extends Shape{
	private double height;
	private double width;
	
	public Rectangle(){}
	public Rectangle(double height,double width){
		this.height=height;
		this.width=width;
	}
	
	public void calArea(){
		System.out.println("Rectangle Area :  "+ (height*width) );
	}
	
}



class Circle extends Shape{
	private double radius;
	
	public Circle(){}
	public Circle(double radius){
		this.radius=radius;
	}
	
	public void calArea(){
		System.out.println("Circle Area :  "+ Math.PI*radius*radius );
	}
}



public class Q2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle height and width");
		Rectangle r = new Rectangle(sc.nextDouble(),sc.nextDouble());
		r.calArea();
		
		
		System.out.println("Enter the radius of circle");
		Circle c = new Circle(sc.nextDouble());
		c.calArea();
	}
}