//18. Java Program to Illustrates Use of Chaining Constructor

class Rectangle{
	private double height;
	private double width;
	
	public Rectangle(){
		this(0,0);
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
	
	public double getHeight(){
		return this.height;
	}
	public double getWidth(){
		return this.width;
	}
}

public class Q18{
	public static void main(String[]args){
		
		//Making use of Parameterless Constructor  
		//height and width, getting initialized to value as zero, as we are passsing parameterized constructor
		//from parameterless constructor
		
		Rectangle r = new Rectangle();
		System.out.println("Rectangle Height : "+r.getHeight());
		System.out.println("Rectangle Width : "+r.getWidth());
		
		
	}
}