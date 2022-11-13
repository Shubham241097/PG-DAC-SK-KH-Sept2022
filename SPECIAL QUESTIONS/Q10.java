/*
10. Given a string representing your stones and another string representing a list of jewels, 
return the number of stones that you have that are also jewels.
Ex: Given the following jewels and stones...
jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0
*/

import java.util.Scanner;
public class Q10{
	
	public static int match(String jewels,String stones){
		int count=0;
		for(int i=0;i<jewels.length();i++){
			for(int j=0;j<stones.length();j++){
				if(jewels.charAt(i)==stones.charAt(j))
					count++;
			}
		}
		return count;
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String jewels = sc.nextLine();
		String stones = sc.nextLine();
		
		System.out.println(match(jewels,stones));
	}
}