package Practices;

public class DulpicateNumber {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 4, 2, 3, 5,1};
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
        };
    }
}

