package Practices;


public class sample {

    public static void main(String args[]) {
        int number = 545, reverse = 0, reminder;
        int temp = number;
        while (number != 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;

        }
        System.out.println("Reverse no is :" + reverse);
        if (temp == reverse) {
            System.out.println("given String is Plaindrom");

        }

        else
            System.out.println("Given String is not paindrom");

    }

}
