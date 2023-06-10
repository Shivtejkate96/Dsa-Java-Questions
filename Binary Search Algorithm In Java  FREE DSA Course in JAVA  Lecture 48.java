/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static int binarysearch(int arr[],int key)
    {
        int start =0;
        int last=arr.length-1;
        int mid=(start+last)/2;
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[mid])
            {
                return mid;
            }
            if(key<arr[mid])
            {
                mid--;
            }
            else
            {
                mid++;
            }
            if(arr[mid]==key)
            {
            return mid;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int arr[]={20,39,56,89,113,115};
		System.out.println(binarysearch(arr,113));
	}
}
