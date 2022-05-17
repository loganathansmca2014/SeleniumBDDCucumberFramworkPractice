package Practices;

public class SamllandLargenumber {

    public static void main(String asrgs[])
    {

        int num=20,num2=40;
        System.out.println(Math.max(num,num2));


    int[] number={33,44,22,11,55,77};
    for(int i=0;i<number.length;i++) {
        for (int j = i + 1; j <number.length; j++) {
            if (number[i] < number[j]) {
                int temp = number[i];
                number[i] = number[j];
                number[j] = temp;

            }

        }
    }
        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

    }
        int smallest =number[0];
        int large=number[0];
        for(int i=0;i<number.length;i++)
        {
            if(number[i]>large)
            {
                large=number[i];
            } else if (number[i]<smallest) {
                smallest=number[i];

            }
        }
        System.out.println("\n");

        System.out.println(large);
        System.out.println(smallest);


    }


}
