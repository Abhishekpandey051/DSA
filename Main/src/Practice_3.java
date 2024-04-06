import java.util.Scanner;
public class Practice_3 {

    public static void main(String[] args) {

        System.out.println("Enter the size of number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
//        System.out.println("In reverse pattern");
        for(int l=n;l>0;l--){
            for(int p=0;p<l;p++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
