import java.util.Scanner;

public class SelctionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of an array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the number");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Your number: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        System.out.println("Selection sort is ");
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min=j;
                    int temp = a[min];
                    a[min] = a[i];
                    a[i] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
