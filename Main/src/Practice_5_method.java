import java.util.Scanner;
public class Practice_5_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int i;
        System.out.println("Enter your number ");
        for(i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("your number is ");
        for(i=0;i<n;i++){
            System.out.format("%d\t\n" ,arr[i]);
        }

        System.out.println("Enter the number that you want to be search");
        int element = sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==element){
                System.out.println("It is present at index " +i );

            }
            System.out.println("The positive number is: ");
            for(i=0;i<n;i++){
                if(arr[i]>0){
                    System.out.printf("%d\t\n",arr[i]);
                }

                else{
                    System.out.printf("The negative number is %d\t\n " ,arr[i]);
                }
            }
        }
    }
}
