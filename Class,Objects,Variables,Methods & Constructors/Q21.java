//21. Java Program to Allocate and Initialize Super Class Members using Constructor

class Person{
	private String name;
	private int age;
	
	public Person(){
		
	}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
}

class Employee extends Person{
	private int id;
	private double salary;
	
	public Employee(){
		super();
	}
	public Employee(String name,int age,int id,double salary){
		super(name,age);
		this.id=id;
		this.salary=salary;
	}
	
	public String toString(){
		return "Employee [ Name : "+getName()+", Age : "+getAge()+", EmpID : "+id+", Salary : "+salary+" ]\n";
	}
}

public class Q21{
	public static void main(String[]args){
		
		Employee e1 = new Employee("ABC",23,123,123343);
		System.out.println( e1.toString() );
	}
}