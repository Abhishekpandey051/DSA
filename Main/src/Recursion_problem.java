import java.util.Scanner;

public class Recursion_problem {
    static int rec(int a, int b){
        if(b==0){
            return 1;
        }
        if(b%2==0){
            return rec(a*a,b/2);
        }
        else{
            return a*rec(a,b-1);
        }

    }

    public static void main(String[] args) {

        System.out.println(rec(3,5));
    }
}

