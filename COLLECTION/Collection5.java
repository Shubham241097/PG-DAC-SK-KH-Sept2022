//5. Write a Java program to reverse elements in a array list

import java.util.*;
public class Collection5{
	public static void main(String[]args){
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=100;i+=4){
			list.add(i);
		}
		for(Integer x : list){
			System.out.print(x+" ");
		}
		System.out.println();
		
		Collections.reverse(list);
		
		for(Integer x : list){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}