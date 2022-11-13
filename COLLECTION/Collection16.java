//16. Write a Java program to empty an hash set.

import java.util.*;

public class Collection16{
	public static void main(String[]args){
		Set<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		
		hs.clear();
		
		for(Integer x : hs){
			System.out.println(x);
		}
	}
}