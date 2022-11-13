// 4. Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).
/*Note: neither binary string will contain leading 0s unless the string itself is 0
Ex: Given the following binary strings...
"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return "1" */

import java.util.Scanner;
class Q4{
	public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) 
				sum = sum + a.charAt(i--) - '0';
            if(j >= 0) 
				sum = sum + b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String result = addBinary(s1,s2);
		System.out.println(result);
    }
}