import java.util.*;
public class PaireInArrayOfNegPost {
    public static void main(String[] args) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>();
        int array[] = {1, 2, -8, 0, -5, 7, -8, -4};
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            // Simple check for +ve/-ve
            if (n >= 0) {
                 positive.add(n);
            } else {
                negative.add(n);
            }
            // Check for duplicates.
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == n) {
                    duplicate.add(n);
                }
            }
        }
         System.out.print(positive);
    System.out.print( negative);

    }
}
