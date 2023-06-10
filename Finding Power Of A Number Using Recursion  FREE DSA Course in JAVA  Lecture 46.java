/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static int findpower(int x,int y)
    {
        if(y==0)
        {
            return 1;
        }
        if(y%2==0)
        {
        return findpower(x,y/2)*findpower(x,y/2);
        }
       else
        {
        return findpower(x,y-1)*x;
        }
    }
	public static void main(String[] args) {
	    int x=5;
	    int y=1000;
	    System.out.println(findpower(x,y));
	}
}
