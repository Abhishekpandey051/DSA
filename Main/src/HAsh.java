import java.util.HashMap;
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [ [-1,-1,2] , [-1,0,1]]

public class HAsh {
    public static void main(String[] args) {
        int a[] = {-1, 0, 1, 2, -1, -4};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (i > 0 && a[k] != a[i - 1]) {
                        if (a[i] + a[j] + a[k] == 0) {
                            System.out.println(a[i] + ", " + a[j] + " ," + a[k]);
                        }
                    }
                }
            }
        }
    }
}
