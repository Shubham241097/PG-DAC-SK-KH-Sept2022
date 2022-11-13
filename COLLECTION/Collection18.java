//18. Write a Java program to compare two sets and retain elements which are same on both sets.

import java.util.*;

public class Collection18{
	public static void main(String[]args){
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(30);
		set1.add(60);
		set1.add(90);
		set1.add(50);
		set1.add(80);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(15);
		set2.add(30);
		set2.add(67);
		set2.add(92);
		set2.add(50);
		set2.add(83);
		
		set1.retainAll(set2);
		
		System.out.println("Elements inside set1");
		for(Integer x : set1){
			System.out.println(x);
		}
	}
}