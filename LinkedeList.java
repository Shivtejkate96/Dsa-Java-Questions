/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    LinkedList<Integer> list=new LinkedList<Integer>();
	    list.add(2);
	    list.add(4);
	    list.add(6);
	    list.add(9);
	    System.out.println(list);
	    list.addFirst(23);
	    list.addLast(34);
	    System.out.println(list);
	}
}
