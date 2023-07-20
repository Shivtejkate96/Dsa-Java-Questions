import java.util.ArrayList;
class Main
{
    public static void main(String [] args)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(2);
         list.add(4);
          list.add(6);
          list.add(8);
          System.out.println(list);
          list.add(2,4);
            System.out.println(list);
            list.set(2,5);
              System.out.println(list);
              list.remove(3);
              list.size();
              for(int i=0;i<=list.size();i++)
              {
                  System.out.println(list.get(i));
              }
    }
}