/*
17. You are given two string arrays, queries and words. For any string, s, f(s) is equal to the 
number of times the smallest lexicographical characters occurs in s. For each query, 
queries[i] count the total number of words where f(queries[i]) < f(word) and return the 
answer as an array.
Note: Both queries and words will only contain lowercase alphabetical characters and 
contain at most ten strings each.
Ex: Given the following queries and words…
queries = ["abc"], words = ["def"], return 0 ('a' and 'd' both occur once so f("abc") and 
f("def") are equal).
Ex: Given the following queries and words…
queries = ["abc"], words = ["ddef", "xxyz"], return 2 ('a' appears once and 'd' and 'x' 
appear twice so f("abc") is less than both f("ddef") and f("xxyz")).
*/



import java.util.*;
public class Q17
{
   static int check(String s,char c)
   {
       int sum=0;
       for(int i=0;i<s.length();i++)
       {
          if(s.charAt(i)==c)
                sum++;
       }
       return sum;
   }
   static HashMap<String,Integer> fun(String []a)
   {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:a)
        {
            char []ch=s.toCharArray();
            Arrays.sort(ch);
            int val=check(s,ch[0]);
            map.put(s,val);
        }
      return map;
   }
   public static void main(String []args)
   {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of words");
      n=sc.nextInt();
      System.out.println("Enter the words");
      sc.nextLine();
      String []words=new String[n];
      for(int i=0;i<n;i++)
            words[i]=sc.nextLine();
      System.out.println("Enter the number of Queries");
      int p=sc.nextInt();
      String []queries=new String[p];
      System.out.println("Enter the Queries");
      sc.nextLine();
      for(int i=0;i<p;i++)
            queries[i]=sc.nextLine();
      HashMap<String,Integer> wordlist=fun(words); 
      HashMap<String,Integer> querylist=fun(queries);
      int res[]=new int[p];
      int j=0;
      for(String s:queries)
      {    
           int sum=0;
           for(String w:words)
           {
                  if(querylist.get(s)<wordlist.get(w))
                          sum++;
           }
        res[j++]=sum;
      }
      for(int i=0;i<p;i++)
         System.out.print(res[i]+" ");
      
   }
}