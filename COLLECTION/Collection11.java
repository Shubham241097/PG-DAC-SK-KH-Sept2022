//11. Write a Java program to display the elements and their positions in a linked list.

import java.util.*;
public class Collection11{
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
		
		System.out.println( ll.getFirst() );
		System.out.println( ll.getLast() );
		System.out.println( ll.get(1) );
		System.out.println( ll.get(3) );
	}
}