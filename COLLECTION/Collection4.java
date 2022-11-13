//4. Write a Java program to sort a given array list

import java.util.*;
public class Collection4{
	public static void main(String[]args){
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(65);
		list.add(45);
		list.add(90);
		list.add(23);
		
		System.out.println("Before Sorting ");
		for(Integer x : list){
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println();
		
		Collections.sort(list);
		
		
		System.out.println("After Sorting");
		for(Integer x : list){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}