//16. Java Program to Illustrate Use of Final Keyword

class Circle{
	private double radius;
	private final double PI=(22/7);
	
	public Circle(){
		
	}
	public Circle(double radius){
		this.radius=radius;
	}
	
	public double calArea(){
		double result = PI*radius*radius;
		
		return result;
	}
	
	public void printArea(){
		System.out.println("Radius of Circle : "+radius);
		System.out.println("Area of Circle : "+(PI*radius*radius));
	}
	
	public void setRadius(double radius){
		this.radius=radius;
	}
	
	public void setPI(double PI){
		this.PI=PI;
	}
}

public class Q16{
	public static void main(String[]args){
		
		Circle c = new Circle(12.5);
		c.printArea();
		
		
		//final keyword is used when we don't want to change that particular variable. 
		//trying to change final variables
		c.setPI(3.14);  //Not OK  gives error: cannot assign a value to final variable PI
	}
}