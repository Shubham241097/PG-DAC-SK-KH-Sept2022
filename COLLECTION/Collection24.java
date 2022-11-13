//24. Write a Java program to check whether a map contains key-value mappings (empty) or not

import java.util.*;

public class Collection24{
	public static void main(String[]args){
		
		Map<Integer,String> map1 = new LinkedHashMap<Integer,String>();
		map1.put(1,"ARMY");
		map1.put(2,"NAVY");
		map1.put(3,"AIR FORCE");
		map1.put(4,"PARA SPECIAL FORCES");
		map1.put(5,"MARCOS");
		map1.put(6,"GARUD");
		
		System.out.print( map1.isEmpty() );
	}
}
