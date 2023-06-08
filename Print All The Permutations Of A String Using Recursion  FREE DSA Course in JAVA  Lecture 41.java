/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static void permutations(char[] ar,int fi)
    {
        if(fi==ar.length-1)
        {
            System.out.println(ar);
            return;
        }
        for(int i=fi;i<ar.length;i++)
        {
            swap(ar,i,fi);
            permutations(ar,fi+1);
            swap(ar,i,fi);
        }
       
        
    } static void swap(char [] ar,int i,int fi)
        {
            char temp=ar[i];
            ar[i]=ar[fi];
            ar[fi]=temp;
        }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    permutations(s.toCharArray(),0);
		
	}
}
