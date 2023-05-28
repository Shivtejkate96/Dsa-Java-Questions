/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int lonelyinterger(int []arr)
    {
        int result=0;
        for(int i:arr)
        {
            result=result^i;
            
        }
        return result;
    
    }
	public static void main(String[] args) {
	    int arr[]={1,2,3,5,1,2,3,8,8,5,10};
	    System.out.println(lonelyinterger(arr));
	}}
