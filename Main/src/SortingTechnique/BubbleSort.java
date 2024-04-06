package SortingTechnique;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the number that you want to sort: ");
        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sort number is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +"\t");
        }
    }
}
