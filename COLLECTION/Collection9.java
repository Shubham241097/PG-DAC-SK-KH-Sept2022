//9. Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.*;
public class Collection9{
	public static void main(String[]args){
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		
		for(Integer x : ll){
			System.out.print(x+" ");
		}
		System.out.println();
		
		ll.add(3,35);
		
		for(Integer x : ll){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}