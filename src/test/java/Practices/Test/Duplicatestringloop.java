package Practices.Test;

public class Duplicatestringloop {
    public static void main(String args[])

    {
        String str="apple";
        //int [] num={1,2,3,1,2,3};
       char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            for(int j=i;j<str.length();j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                }

            }
            if(count>1)
            {
                System.out.println("Dulpicate char is :"+ch[i]+"No of Repat:"+count);
            }
        }
    }}
