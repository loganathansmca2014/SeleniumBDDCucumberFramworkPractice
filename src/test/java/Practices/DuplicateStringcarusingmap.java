package Practices;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStringcarusingmap {

    public static void main(String args[]) {
        String name="loganathan";
        char[] charValue=name.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char stringchar:charValue)
        {
            if(map.containsKey(stringchar))
            {
                int count=map.get(stringchar);
                map.put(stringchar,++count);

            }
            else
                map.put(stringchar,1);
        }
        System.out.println("No.Of Char and repeatedtime :"+map);

        for(char stringchar:map.keySet())
        {
            if(map.get(stringchar)==1)
            System.out.println("Unique Char is :"+stringchar);
        }

        for(char stringchar:map.keySet())
        {
            if(map.get(stringchar)>1)
                System.out.println("Duplicate Char is :"+stringchar);
        }


        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println("Then Duplicate Char from given String is :"+entry.getKey() +"No.Of times Repeated :"+entry.getValue());
            }
        }


    }
}
