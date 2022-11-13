//2. Write a Java program to insert an element into the array list at the first position.

import java.util.*;
public class Collection2{
	public static void main(String[]args){
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=100;i+=4){
			list.add(i);
		}
		for(Integer x : list){
			System.out.print(x+" ");
		}
		System.out.println();
		
		list.add(1,24);
		
		for(Integer x : list){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}