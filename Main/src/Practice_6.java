import java.util.Scanner;
public class Practice_6 {
    public static void main(String[] args) {
        System.out.println("Enter the size of number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3==0){
                System.out.println("fizzBuzz");

            }
           else if(i%5==0){
                System.out.println("Buzz");
            }

             else if (i%3==0){
                System.out.println("Fizz");
             }

            else
            {
            System.out.println(i);
        }
        }
    }
}
