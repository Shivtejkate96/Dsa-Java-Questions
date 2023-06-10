/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static void towerhanoi(int n,char src,char aux,char dest)
    {
        if(n==1)
        {
            System.out.println(src+"->"+dest);
            return;
        }
        towerhanoi(n-1,src,dest,aux);
        towerhanoi(1,src,aux,dest);
        towerhanoi(n-1,aux,src,dest);
    }
	public static void main(String [] args)
	{
	      towerhanoi(3,'A','B','c');
	    
	}
}
