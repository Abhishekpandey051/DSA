import java.util.Scanner;

public class Array2D_1 {

    public static void main(String[] args) {
        int i, j;
        int sum = 0;
        int sumR = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first and second array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Enter the element of first element");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your number is ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Diagonal sum of matrix is ->");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (i == j) {
                    sum = sum + a[i][j];
                }
            }
        }
        System.out.println(sum);
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            if(i+j==n-1){
                sumR = sumR+a[i][j];
            }
        }
    }
        System.out.println(sumR);
    }
}