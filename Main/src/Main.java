import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter the size of number");
        int n = ch.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
        System.out.print("convert number is");
        for(int j = n; j>=0; j--){
            System.out.println(j);
        }
    }
}
