import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i=0;i<=n;i++){
//            if(i==2){
//                System.out.println("Java is the great ");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("End the java loop");
//        }
        int i;

        int [] a = new int [n];
        for(i =0;i<n;i++) {
            a[i]= sc.nextInt();

        }
        System.out.println("Your number is : ");
        for(i=0;i<n;i++){
            System.out.printf("%d\t\n", a[i]);
        }

        System.out.println("Total length of an array  "   + a.length);
        System.out.println("Displaying a value using for each loop");
        int sum = 0;
        for(int element: a){
            sum = sum+element;
            System.out.println(element);

        }
        System.out.println("Sum of an aaray is " +sum);
        System.out.println("Printing in reverse order");
        for(int j=a.length-1;j>=0;j--){
            System.out.println(a[j]);

        }

        }

    }

