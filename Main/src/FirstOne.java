import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
//Input: {-3, 1, 4, -5, -4, 2, 3}
//Output: {-3, 1, 2} {1, 4, -5} {2, 3, -5} {1, 3, -4}
public class FirstOne {
    public static void triplate(int [] arr , int n){
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<Integer>();
            for (int j = i + 1; j < n; j++) {
                int x = -(arr[i] + arr[j]);
                if (set.contains(x)) {
                    System.out.println(x + " " + arr[i] + " " + arr[j]);
                }else {
                    set.add(arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-3, 1, 4, -5, -4, 2, 3};
        int size = arr.length;
        triplate(arr,size);
    }
}