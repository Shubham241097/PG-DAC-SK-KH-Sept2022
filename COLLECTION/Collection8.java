//8. Write a Java program to append the specified element to the end of a linked list.

import java.util.*;
public class Collection8{
	public static void main(String[]args){
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(40);
		list1.addLast(50);
		list.addFirst(30);
		//LinkedList method gives problem when we keep List as reference 
		//ie List<Integer> list = new LinkedList<Integer>();
		
		
		for(Integer x : list1){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}