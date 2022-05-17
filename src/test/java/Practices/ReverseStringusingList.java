package Practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseStringusingList {


 public static void main(String args[])
    {
        String str1="Loganathan";
        char[] ch=str1.toCharArray();
        List<Character> list1=new ArrayList<>();
        for(char ch1:ch)
        {
            list1.add(ch1);
        }
        Collections.reverse(list1);
        ListIterator it=list1.listIterator() ;
        while (it.hasNext())
        {
            System.out.print(it.next());
        }

    }
}
