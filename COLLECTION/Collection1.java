//Collection1
//1. Write a Java program to create a new array list, add some colors (string) and print out the 
//collection.

import java.util.*;
public class Collection1{
	public static void main(String[]args){
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter no of lines");
		//int n=sc.nextInt();
		
		List<String> stringlist = new ArrayList<String>();
		
		//for(int i=0;i<=n;i++){
		//	System.out.print("Enter Line "+i);
		//	stringlist.add(sc.next());
			//System.out.println();
		//}
		stringlist.add("Army");
		stringlist.add("Navy");
		stringlist.add("Air Force");
		
		for(String x : stringlist){
			System.out.println(x);
		}
	}
}