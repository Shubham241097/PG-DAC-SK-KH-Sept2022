//19. Java Program to Create an Object for Class and Assign Value in the Object using Constructor

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

public class Q19{
	public static void main(String[]args){
		
		//Creating an object of class Rectangle whose storage location is stored in reference r.
		//Assiging value to height and width using parameterized constructor. 
		Rectangle r = new Rectangle(15,12.5);
		r.printDetails();
	}
}