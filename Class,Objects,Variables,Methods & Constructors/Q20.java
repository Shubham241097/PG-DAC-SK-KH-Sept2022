//20. String Constructor Program in Java

class Car{
	private String brand;
	private String carname;
	
	public Car(){
		
	}
	public Car(String brand,String carname){
		this.brand=brand;
		this.carname=carname;
	}
	
	public void printCarDetails(){
		System.out.println("Car brand : "+brand+", Car Name : "+carname);
	}
}

public class Q20{
	public static void main(String[]args){
		
		
		//Calling parameterized String Constructor
		Car c1 = new Car("Tata","EV Nexon");
		Car c2 = new Car("Tata","Tigor");
		
		c1.printCarDetails();
		c2.printCarDetails(); 
	}
}