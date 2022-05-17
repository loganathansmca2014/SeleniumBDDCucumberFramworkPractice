package Practices;

public class ReverseString {

    public static void main(String[] args)
    {
        String s="Selenium";

        String reverse="";

            StringBuilder reversed = new StringBuilder();
            for (int i=s.length()-1;i>=0;i--) {
                reverse= reverse+(s.charAt(i));
            }
        System.out.println(reverse);

            String replaces=s.replace("Selenium","nathan");
            System.out.println(replaces);

            String str1="loganathan";
            char[] ch=str1.toCharArray();
            for(int j=str1.length()-1;j>=0;j--)
            {
                System.out.print(ch[j]);
            }


    }
}
