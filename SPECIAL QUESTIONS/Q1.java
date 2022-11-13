// 1. To check if the given string is Palindrome or not.

//import java.util.StringTokenizer;
//import java.util.Stack;

public class Q1{
	
	static boolean isPallindrome(String s1)
	{
		s1=s1.replaceAll("[^A-Za-z0-9]","");
		System.out.println(s1);
		for(int i=0,j=s1.length()-1;i<s1.length() && j>=0;i++,j--)
		{
			if(Character.toLowerCase(s1.charAt(i))!=Character.toLowerCase(s1.charAt(j)))
				return false;
		}
		return true;
	}

	
	public static void main(String[]args){
		/*
		Stack<String> s = new Stack<String>();
        String str1="", y="";
        StringTokenizer str = new StringTokenizer("A man,a plan,a canal: Panama",".,: ");
        
        while(str.hasMoreTokens()){
            String x = str.nextToken();
            str1 = str1+x;
            s.push(x);
        }
        System.out.println(str1);
        
        while(!s.isEmpty()){
            y = y+s.pop();
        }
        boolean check = str1.equalsIgnoreCase(y);
        
        
        System.out.println("Is String Palindrome : "+check);
		*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1");
		String s1=sc.nextLine();
		boolean t=isPallindrome(s1);
		System.out.println(t);
		sc.close();

	}
}