//13. Java Program to Create a Method without Parameters and Return Type

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

public class Q13{
	public static void main(String[]args){
		
		Rectangle r = new Rectangle(15,12.5);
		
		
		//Method with no parameters and no return type
		r.printDetails();
	}
}