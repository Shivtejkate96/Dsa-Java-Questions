/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static int span(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
           
        }
        return max-min;
    
    } 
	public static void main(String[] args) {
	    int arr[]={12,44,76,545,1000};
	    System.out.println(span(arr));
	    
	    
	
	}
}
