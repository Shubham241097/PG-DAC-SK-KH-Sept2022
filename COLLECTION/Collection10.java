//10. Write a Java program to insert elements into the linked list at the first and last position.

import java.util.*;
public class Collection10{
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
		
		ll.addFirst(5);
		ll.addLast(65);
		
		for(Integer x : ll){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}