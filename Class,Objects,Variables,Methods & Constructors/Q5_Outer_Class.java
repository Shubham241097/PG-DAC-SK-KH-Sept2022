/*
5. Java Program to Illustrates Use of Referencing the Object from Inner Class
*/

public class Q5_Outer_Class
{
    static Q5_Outer_Class.InnerClass obj;
	
    void test1()
    {
        System.out.println("Success");
    }
	
    static public class InnerClass
    {
    	private String name = "Peakit";
        public void test2()
        {
            Q5_Outer_Class outer = new Q5_Outer_Class();
            outer.test1();
        }
    }
	
    public static void main(String[] args)
    {
        obj = new Q5_Outer_Class.InnerClass();
        obj.test2();
    }
}

