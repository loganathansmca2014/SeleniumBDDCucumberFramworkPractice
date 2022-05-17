package Practices.Test;

public class ReverseString {

    public static void main(String args[])
    {
        String s="loganathan";
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }

StringBuffer buffer=new StringBuffer(s);

        StringBuffer str1=buffer.reverse();
        System.out.println(str1);
    }


}
