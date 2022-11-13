//19. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

import java.util.*;

public class Collection19{
	public static void main(String[]args){
		
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("ARMY");
		set1.add("NAVY");
		set1.add("AIR FORCE");
		set1.add("PARA SPECIAL FORCES");
		set1.add("MARCOS");
		set1.add("GARUD");
		
		//String arr[] = set1.toArray(new String[set.size()]);
		
		Iterator itr = set1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}