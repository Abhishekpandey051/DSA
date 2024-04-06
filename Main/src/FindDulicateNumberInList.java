import java .util.*;
public class FindDulicateNumberInList {
    public static void main(String[] args) {
        int a [] = {10,9,8,7,6,5,4,4,3,3};
        Arrays.sort(a);

        for (int i = 0; i < a.length -1 ; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Distinct value in an array: ");
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
