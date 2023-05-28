/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
Brute force
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int min=0;
	if(a<b)
	{
	    min=a;
	    
	}
	else
	
	{
	    min=b;
	}
	for(int i=min;i>=0;i--)
	{
	    if(a%i==0 && b%i==0)
	    {
	       System.out.println(i);
	        break;
	    }
	    
	}
	}
}
