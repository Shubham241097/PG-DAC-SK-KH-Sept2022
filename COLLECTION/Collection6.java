//6. Write a Java program of swap two elements in an array list.

import java.util.*;
public class Collection6{
	public static void main(String[]args){
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=100;i+=4){
			list.add(i);
		}
		for(Integer x : list){
			System.out.print(x+" ");
		}
		System.out.println();
		
		Collections.swap(list,10,15);
		
		for(Integer x : list){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}