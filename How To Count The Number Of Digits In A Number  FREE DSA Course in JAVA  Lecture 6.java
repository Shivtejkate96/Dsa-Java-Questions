/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	while(no>0)
	{
	    no=no/10;
	    count++;
	}
	System.out.println(count);
	}
}
