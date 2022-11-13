//12. Write a Java program to check if a particular element exists in a linked list.
import java.util.*;
public class Collection12{
	public static void main(String[]args){
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		
		for(Integer x : ll){
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println(ll.contains(30));
		System.out.println(ll.contains(35));
	}
}