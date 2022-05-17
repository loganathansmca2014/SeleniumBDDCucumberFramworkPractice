package Practices;

public class DuplicateCharStringarray {

    public static void main(String[] args) {
        String arr[] = {"a,b,c,a,b"};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("the duplicate number is:" + arr[i] + "\n" + "no of times repeated:" + count);
            }
        }
    }
}
