//22. Write a Java program to count the number of key-value (size) mappings in a map

import java.util.*;

public class Collection22{
	public static void main(String[]args){
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1,"ARMY");
		map1.put(2,"NAVY");
		map1.put(3,"AIR FORCE");
		map1.put(4,"PARA SPECIAL FORCES");
		map1.put(5,"MARCOS");
		map1.put(6,"GARUD");
		
		Set<Map.Entry<Integer,String>> set = map1.entrySet();
		
		int count=0;
		for(Map.Entry<Integer,String> x : set){
			count++;
		}
		System.out.println("Total key-value pairs : "+count);
	}
}