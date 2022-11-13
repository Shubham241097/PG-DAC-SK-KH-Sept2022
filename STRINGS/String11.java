//11. How to replace each given character to other e.g. blank with %20?
//For example, if the input is "Java is Great" and asked to replace space with %20 then it 
//should be "Java%20is%20Great".

public class String11{
	public static void main(String[]args){
		
		String s ="Java is Great";
		System.out.println(s.replace(" ","%20"));
	}
}