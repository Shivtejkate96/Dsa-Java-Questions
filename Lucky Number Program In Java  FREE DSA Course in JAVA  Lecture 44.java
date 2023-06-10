/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static boolean isluckynumber(int n,int counter)
    {
        if(n%counter==0)
        {
            return false;
        }
        if(n<counter)
        {
            return true;
        }
        return isluckynumber(n-(n/counter),counter+1);
        
        
    }
	public static void main(String[] args) {
	    System.out.println(isluckynumber(9,2));
		
	}
}
