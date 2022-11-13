//15. Java Program to Illustrate the Use of HashCode() Method

class Student{
	private String name;
	private int age;
	private int rollno;
	public static int count=0;
	
	public Student(){
		count++;
	}
	public Student(String name,int age,int rollno){
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		count++;
	}
	
	public void printDetails(){
		System.out.println("Name : "+name+", Age : "+age+", Rollno : "+rollno);
	}
	
	public static int getCount(){
		return count;
	}
}

public class Q15{
	public static void main(String[]args){
		Student s1 = new Student("ABC",21,16);
		Student s2 = new Student("ABC",21,16);
		//s1.printDetails();
		//s2.printDetails();
		
		//Ussing HashCode() method to illustrate two new objects are created 
		System.out.println("Student s1 storage address : "+s1.hashCode());
		System.out.println("Student s2 storage address : "+s2.hashCode());
		
		
		//System.out.println("No of objects created : "+Student.getCount());
	}
}