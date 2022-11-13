//21. Write a Java program to remove all the elements from a priority queue.

import java.util.*;

public class Collection21{
	public static void main(String[]args){
		
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		q1.add(10);
		q1.add(30);
		q1.add(60);
		q1.add(90);
		q1.add(50);
		q1.add(80);
		
		q1.clear();
		System.out.println(q1.isEmpty());
	}
}