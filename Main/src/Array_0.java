import java.util.Scanner;
public class Array_0 {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter your number");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("your number is " );
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Duplicate number is ");
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
