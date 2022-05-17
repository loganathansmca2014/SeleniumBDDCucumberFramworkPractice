package Practices.Test;

public class ReversString {

    public static void main(String args[])
    {
        int num=878,      temp=num,revs=0;
        System.out.println("Given no is:"+num);
        while(num>0)
        {
            int reminder=num%10;
            revs=revs*10+reminder;
            num=num/10;
        }
        System.out.println("Reverse no:"+revs);

        if(temp==revs)
        {
            System.out.println("Given num is plaindrom:"+revs);
        }
        else {
            System.out.println("Given num is not plaindrom:"+revs);

        }
    }
}
