//7. Write a Java program to print all the elements of a ArrayList using the position of the elements.


import java.util.*;
public class Collection7{
	public static void main(String[]args){
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<=100;i+=4){
			list.add(i);
		}
		
		for(Integer x : list){
			System.out.print(x+" ");
		}
		System.out.println();
		
		
		for(int i=0;i<list.size();i++){
			System.out.println(i+" "+list.get(i)+" ");
		}
		//System.out.println();
		
	}
}