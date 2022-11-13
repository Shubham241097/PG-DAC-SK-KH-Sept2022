//17. Java Program to Illustrate Use of Constructor

class Rectangle{
	private double height;
	private double width;
	
	public Rectangle(){
		
	}
	public Rectangle(double height,double width){
		this.height=height;
		this.width=width;
	}
	
	public double calArea(){
		double result = 2*height*width;
		
		return result;
	}
	
	public void printDetails(){
		System.out.println("Height of rectangle : "+height);
		System.out.println("Width of Recatangle : "+width);
		System.out.println("Area of Rectangle : "+(2*height*width));
	}
}

public class Q17{
	public static void main(String[]args){
		
		
		//Constructor are special method with same name as Class name.
		//Constructors are used to initialize the local class variables on every object creation.
		//Contructors are of three types
		//1)Default Constructor ,2)User defined Parameterless Contructor, 3)Parameterized Constructor
		
		
		//Making use of Parameterized Constructor
		Rectangle r = new Rectangle(15,12.5);
		
		
		
	}
}