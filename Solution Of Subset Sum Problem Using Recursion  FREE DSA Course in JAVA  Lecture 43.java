/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static int subset(int [] arr,int sum,int i)
    {
        if(sum==0)
        {
            return 1;
        }
        if(sum<0)
        {
            return 0;
        }
        if(i==arr.length)
        {
            return 0;
        }
        return subset(arr,sum-arr[i],i+1)+subset(arr,sum,i+1);
    }
	public static void main(String[] args) {
	    int arr[]={10,15,20,5,5};
	    int sum=20;
	    System.out.println(subset(arr,sum,0));
	    
	}
}
