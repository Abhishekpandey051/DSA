
//Input : arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
//        Output : 1  3  2  11  6  -1  -7  -5

public class MockQUe {
    public static void main(String[] args) {
        int P,N;
        int [] temp;
        int [] a = {1, -1, 3, 2, -7, -5, 11, 6 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 ) {
                P = a[i];
                System.out.print(P + " ");
            }
        }
    }
}

