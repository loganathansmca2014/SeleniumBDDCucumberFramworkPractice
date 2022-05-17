package Practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {
    public static void main(String args[]) {
        String s1 = "LISTEN";
        String s2 = "SILENT";
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        List<Character> list1 = new ArrayList<>();
        for (char stringch1 : ch1) {
            list1.add(stringch1);

        }
        List<Character> list2 = new ArrayList<>();
        for (char strch2 : ch2) {
            list2.add(strch2);
        }

        Collections.sort(list1);
        Collections.sort(list2);
        if (list1.equals(list2)) {
            System.out.println("Given String is anagram");
        } else

            System.out.println("Given String is not anagram");


    }

}
