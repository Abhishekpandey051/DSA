package PracticeOnGFG;
//arr[] = {1,2,3,4,5}
//        Output: 3 2 1 5 4
public class ReverseInGroupOfArray {
    public static void main(String[] args) {
        int a[] = {5,6,8,9};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        System.out.println("Reverse in a group" );
        for (int j = 2; j >= 0; j-- ) {
            System.out.print(a[j]+"\t");
        }

        for (int k = 3; k >=3; k--) {
            System.out.print(a[k]+"\t");
        }
    }
}
