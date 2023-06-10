/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static int secondlargest(int  arr[])
    {
        int max1=0;
        int max2=0;
        if(arr[0]<arr[1])
        {
            max1=arr[1];
            max2=arr[0];
            
        }
        else
        {
            max1=arr[0];
            max2=arr[1];
        }
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {  max2=max1;
                max1=arr[i];
               
            }
            else if(arr[i]>max2)
            {
                max2=arr[i];
            }
        }
        return max2;
        
            }
	public static void main(String[] args) {
	    int arr[]={12,32,44,54,3,};
	    System.out.println(secondlargest(arr));
	
	}
}
