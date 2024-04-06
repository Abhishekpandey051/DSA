class PrintNum{
    void num(int i ,int n, int sum){
        if(i==n){
             sum +=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        num(i+1 , n , sum);
        System.out.println(i);
    }

}
public class Recursion_Preactice {
    public static void main(String[] args) {
        PrintNum P = new PrintNum();
        P.num(1,5,0);
    }
}
