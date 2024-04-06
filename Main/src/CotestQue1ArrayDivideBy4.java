public class CotestQue1ArrayDivideBy4 {
    public static void main(String[] args) {
        long n = 506;
        long ans = 0;
        if (n >= 500) {
            ans += (n / 500) * 1000;
            n = n - (500 * (n / 500));
        }
        //System.out.println("n "+n);
        if (n >= 5) {
            ans += n / 5 * 5;
        }
        System.out.println(ans);
        // Your code here
    }
    }


