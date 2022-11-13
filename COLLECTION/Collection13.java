//13. Write a Java program to compare two linked lists.

import java.util.*;

//class MyCollection implements 

public class Collection13{
	
	public static void main(String[]args){
		int count=0;
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);
		
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		ll2.add(10);
		ll2.add(20);
		ll2.add(30); //ll2.add(35);  try 
		ll2.add(40);
		//ll2.add(50);

		if(ll1.size() == ll2.size() ){
			for(int i=0;i<ll1.size();i++){
				if( (ll1.get(i)) == (ll2.get(i)) ){
					count++;
				}
			}
			if(count == (ll1.size()) )
				System.out.println("List are equal");
			else
				System.out.println("List elements do no match");
		}
		else
			System.out.println("List size do no match");

	}
}