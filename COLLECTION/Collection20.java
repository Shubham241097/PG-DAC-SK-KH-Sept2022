//20. Write a Java program to find the numbers less than 7 in a tree set.

import java.util.*;

public class Collection20{
	public static void main(String[]args){
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(1);
		ts.add(9);
		ts.add(6);
		ts.add(4);
		
		for(Integer x : ts){
			if(x<7)
				System.out.println(x);
		}
		
	}
}