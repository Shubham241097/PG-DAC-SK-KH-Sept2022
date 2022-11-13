//8. Java Program to Count Number of Objects Created for Class

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

public class Q8{
	public static void main(String[]args){
		Student s1 = new Student();
		Student s2 = new Student("ABC",21,16);
		//s1.printDetails();
		//s2.printDetails();
		System.out.println("No of objects created : "+Student.getCount());
	}
}