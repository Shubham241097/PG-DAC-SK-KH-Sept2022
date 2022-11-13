//23. Write a Java program to convert a priority queue to an array containing all of the elements of the queue

import java.util.*;

public class Collection23{
	public static void main(String[]args){
		
		Queue<String> q1 = new PriorityQueue<String>();
		q1.add("ARMY");
		q1.add("NAVY");
		q1.add("AIR FORCE");
		q1.add("PARA SPECIAL FORCES");
		q1.add("MARCOS");
		q1.add("GARUD");
		
		String arr[] = q1.toArray(new String[q1.size()]);
		
		System.out.print(Arrays.toString(arr));
		
		//for(String x : arr){
		//	System.out.print(x+" ,");
		//}
		
	}
}