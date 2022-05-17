package Practices;

import java.util.Arrays;

public class Maxusingmath {

    public static void main(String args[])
    {
        int[] a= {56,65,78,34};
        System.out.println("Largee:"+Arrays.stream(a).max());

        int size=a.length-2;
        System.out.println(size);
    }
}
