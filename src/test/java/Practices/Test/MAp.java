package Practices.Test;


import java.util.LinkedHashMap;
import java.util.Map;

public class MAp {
    public static void main(String args[])
    {
       String str="apple";
       char[] ch =str.toCharArray();
        Map<Character,Integer> map= new LinkedHashMap<>();
        for(char c:ch)
        {
            if(map.containsKey(c))
            {
                int count=map.get(c);
                map.put(c,++count);

            }
            else
                map.put(c,1);
        }
        System.out.println("Dulplicate char is and repat:"+map);
        for(char c :map.keySet())
        {
            if(map.get(c)>1)
            {
                System.out.println("duplicate Char"+c);
            }
        }
        for(char c:map.keySet())
        {
            if(map.get(c)==1) {
                System.out.println("Uniques:" + c);
            }
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println("Duplicate Char :"+entry.getKey()+""+""+""+"No.Of times:"+entry.getValue());
            }
        }

    }
}
