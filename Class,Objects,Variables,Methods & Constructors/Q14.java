//14. Java Program to Create a Method with 2 Parameters and without Return Type

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

public class Q14{
	public static void main(String[]args){
		
		//Constructor is also a method
		//Constructor with 2 parameters and no return type
		Rectangle r = new Rectangle(15,12.5);
		
		//Method with no parameters and no return type
		r.printDetails();
	}
}