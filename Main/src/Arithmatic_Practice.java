import java.util.Scanner;
public class Arithmatic_Practice {
    public static void main(String[] args) {
        //Practice 1
//        int tol_mark = 281, practicle_mark = 58, Total_mark = 500;
//        float Percentage = ((tol_mark + practicle_mark )*100f)/Total_mark;
//        System.out.println(Percentage);

        // Practice 2

//        double value = 12.56;
//        double factorial_part = value % 1;
//        double integral_part = value - factorial_part;
//        System.out.println("Original value is " +value);
//        System.out.println("Factorial Value is " +factorial_part);
//        System.out.println("Integral part "+integral_part);

        //Practice 3
        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a  = new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int count = 0;
        for(i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
             if(a[i]==a[j] ){
                 count++;
//                 else if(a[i]!=a[j]){
//                     count++;
//                 }
             }

         }
        }
        System.out.println("Total number " +count);
    }
}

