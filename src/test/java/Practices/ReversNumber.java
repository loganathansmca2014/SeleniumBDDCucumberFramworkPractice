package Practices;

public class ReversNumber {

    public static void main(String[] args)
    {
        int number = 545, reverse = 0;
        int temp=number;
        while(number !=0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
        if(temp==reverse)
        {
            System.out.println("Give string is Plaindrom");
        }
        else
            System.out.println("Not Plindrom");
    }
}
