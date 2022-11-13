/*
Given an array of strings, return the longest common prefix that is shared amongst all 
strings.
Note: you may assume all strings only contain lowercase alphabetical characters.
Ex: Given the following arrays...
["colorado", "color", "cold"], return "col"
["a", "b", "c"], return ""
["spot", "spotty", "spotted"], return "spot"
*/

/*
import java.util.Scanner;
public class Q6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		String suffix = "";
		
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==s2.charAt(i) && s1.charAt(i)==s3.charAt(i)){
				suffix = suffix + s1.charAt(i);
			}
			else 
				break;
		}
		
		System.out.println(suffix);
	}
}
*/

import java.util.Scanner;
public class Q6{
	public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String strarr[]=new String[3];
	System.out.println("Enter Strings : ");
	for(int i=0;i<3;i++){
		strarr[i]=sc.nextLine();
	}
	System.out.println("Result : \""+longestCommonPrefix(strarr)+"\"");
}	
}