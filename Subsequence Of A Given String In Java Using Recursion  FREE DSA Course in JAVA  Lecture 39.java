/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static void gss(String s,String  ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        gss(s.substring(1),ans+s.charAt(0));
        gss(s.substring(1),ans);
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		gss(s,"");
	}
}
