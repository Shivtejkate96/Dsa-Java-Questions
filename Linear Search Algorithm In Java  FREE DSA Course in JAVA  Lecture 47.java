/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int linearsearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        
                
            
        }return -1;
    }
	public static void main(String[] args) {
		int arr[]={12,22,45,88,46};
		System.out.println(linearsearch(arr,22));
	}
}
