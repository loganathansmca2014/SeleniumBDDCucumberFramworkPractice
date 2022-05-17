package Practices;

public class ReverseStrigusingStringbuilder {
    public static void main(String[] args)
    {

        // create a StringBuilder object
String str1="Loganathan";

StringBuffer str
                = new StringBuffer("Loganathan");

        // print string
        System.out.println("String = "
                + str.toString());

        // reverse the string
        StringBuffer reverseStr = str.reverse();

        // print string
        System.out.println("Reverse String = "
                + reverseStr.toString());
    }
}
