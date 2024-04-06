public class SumOfPair {
    public static void main(String[] args) {
//        3 4 -2 4
//        9
        int a[] = {-1 - 2, 3, 4, -2, 4, -4, 2};
        System.out.println(maxSum(a));
    }
    public static int maxSum(int[]a) {
        int n = a.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int currSum = 0;
            for (int j = i; j < a.length; j++) {
                currSum += a[j];
                if (currSum > max) {
                    max = currSum;
                }
            }
        }
        return max;
    }
}
