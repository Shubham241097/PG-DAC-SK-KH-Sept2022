//25. Write a Java program to get the value of a specified key in a map
import java.util.*;
public class Collection25{
	public static void main(String[]args){
		Map<Integer,String> map1 = new LinkedHashMap<Integer,String>();
		map1.put(1,"ARMY");
		map1.put(2,"NAVY");
		map1.put(3,"AIR FORCE");
		map1.put(4,"PARA SPECIAL FORCES");
		map1.put(5,"MARCOS");
		map1.put(6,"GARUD");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key to get value");
		int n= sc.nextInt();
		System.out.println( map1.get(n) );
	}
}