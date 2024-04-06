import java.util.Arrays;

//Input:X[] = { 1, 4, 7, 8, 10 }
//        Y[] = { 2, 3, 9 }
//        Output: X[] = { 1, 2, 3, 4, 7 }
//        Y[] = { 8, 9, 10 }
public class ReverseDtring1 {
    public static void sort(int a[], int b[]) {
        int m = a.length;
        int n = b.length;
        for (int i = 0; i < m; i++) {
            if (a[i] > b[0]) {
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;
                int first = b[0];
                int k;
                for (k = 1; k < n && b[k] < first; k++) {
                    b[k - 1] = b[k];
                }
                b[k - 1] = first;
            }
        }

    }
    public static void main(String[] args) {
        int a[] = {5,12,28,33,49,55,62,78,89,102};
        int b[] = {-3,0,6,34,90};
        sort(a, b);
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
    }
}
