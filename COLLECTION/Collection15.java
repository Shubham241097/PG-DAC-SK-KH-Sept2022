//15. Write a Java program to iterate through all elements in a hash list.

import java.util.*;
public class Collection15{
	public static void main(String[]args){
		
		Set<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}