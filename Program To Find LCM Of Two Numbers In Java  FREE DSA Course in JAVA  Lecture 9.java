/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int optimizedeuclid(int a,int b)
    {
        while(a!=0&&b!=0)
        {
            if(a>b)
            {
                a=a%b;
            }
            else{
                b=b%a;
            }
            
        }
        if(a==0)
        {
            return b;
        }
        else
        
        {
        return a;
    }
   }
   static int lcm(int a,int b)
   {
       return(a*b)/optimizedeuclid(a,b);
   }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    System.out.println(lcm(a,b));
	    
		
	}
}
