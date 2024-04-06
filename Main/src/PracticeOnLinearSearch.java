import java.util.Scanner;

public class PracticeOnLinearSearch {
    public static void main(String[] args) {
        int[] a = {4, 3, 6, 78, 9, 7};
        int search = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == search) {
                System.out.println("your number is: " + a[i] + "At index " + i);
                temp = temp+1;
            }
        }
        if (temp == 0) {
            System.out.println("Not found ");
        }
    }
}

