//17. Write a Java program to convert a hash set to an array.

import java.util.*;
public class Collection17{
	public static void main(String[]args){
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		
		
		Integer arr[] = hs.toArray(new Integer[hs.size()]);
		//doesn't work with  
		
		System.out.print(Arrays.toString(arr));
		
		//for(Integer x : arr){
			//System.out.println(x);
		//}
	}
}