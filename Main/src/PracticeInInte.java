import java.util.Scanner;

public class PracticeInInte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the number: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your number is : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.print("Enter the number that you want to search: ");
        int elm = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (elm == arr[i]) {
                System.out.println("Found at index: " + i);
            }
        }

    }

}
