package ArrayRelatedQue;
import java.util.*;

public class SumProductAlternate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter n:");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                sum-=input.nextInt();
            } else {
                sum+=input.nextInt();
            }
        }
        System.out.println("The total sum is:"+sum);
     }
}
