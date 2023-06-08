/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    
    static int recursion(int n)
		{
		    if(n==0||n==1)
		    {
		        return 1;
		    }
		   return n*recursion(n-1);
		   
		   }
	public static void main(String[] args) {
	    int n=5;
	    System.out.println(recursion(n));
		
	
}
}