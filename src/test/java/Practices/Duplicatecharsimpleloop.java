package Practices;

public class Duplicatecharsimpleloop {
    public static void main(String[] args) {
        String str = "Loganathan";
        char[] strchr=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (strchr[i] == strchr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("the duplicate number is:" + strchr[i] + "\n" + "no of times repeated:" + count);
            }
        }

    }
}
