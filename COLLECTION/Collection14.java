//14. Write a Java program to replace an element in a linked list

import java.util.*;
public class Collection14{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);
		ll1.add(50);
		ll1.add(60);
		
		for(int i=0;i<ll1.size();i++){
			System.out.println(i+" "+ll1.get(i));
		}
		
		System.out.println("Enter the Element to replace and its index");
		int element= sc.nextInt();
		int index= sc.nextInt();
		
		
		if(ll1.contains(element) && ll1.get(index) == element){
			System.out.println("Enter the element to add");
			int add = sc.nextInt();
			
			ll1.add(index,add);
			
		}
		else
			System.out.println("Element does not exits at the given index : Enter appropiate element and index");
		
		for(int i=0;i<ll1.size();i++){
			System.out.println(i+" "+ll1.get(i));
		}
		
		
		/*
		System.out.println("Enter the Element to replace");
		int remove = sc.nextInt();
		System.out.println("Enter the Element to add");
		int add = sc.nextInt();
		
		if(ll1.contains(remove)){
			Collections.replaceAll(ll1,remove,add);
		}
		
		for(int i=0;i<ll1.size();i++){
			System.out.println(i+" "+ll1.get(i));
		}
		*/
	}
}