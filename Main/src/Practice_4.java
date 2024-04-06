import java.util.Scanner;

public class Practice_4 {

    public static void main(String[] args) {
        int n=5,sum=0,m;
        for(int i=0;i<n;i++){
            sum = sum + (2*i);
            System.out.println(2*i);
        }
        System.out.println("sum of natural number is " +sum);
        for(m=1;m<10+1;m++) {
            for (int j = 1; j <= 10; j++) {
//                int l = m * j;
                System.out.printf("%d X %d = %d\n",m,j,m*j);
            }
            System.out.println();
        }
          int p = 5;
//        // What is factorial n = n * n-1 * n-2 ..... 1
        // 5! = 5*4*3*2*1 = 120
        int l = 1;
        int factorial = 1;
        while(l<=p){
            factorial *= l;
            l++;
        }
        System.out.println(factorial);

    }
}
