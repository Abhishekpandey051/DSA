import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the number: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("your number is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        System.out.println("Sorted number is ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
