//3. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.*;
public class Collection3{
	public static void main(String[]args){
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=100;i+=4){
			list.add(i);
		}
		for(Integer x : list){
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("Element at index 10 : "+list.get(10));
		
	}
}