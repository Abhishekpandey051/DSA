import java.util.Scanner;
public class LengthOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the number:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your number that you have entered: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +"\t");
        }
        System.out.println("\nEnter the  number for Search");
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                System.out.println("Found at index is: " + i);
                break;
            }
        }
        System.out.println("Not Found: ");
    }
}
