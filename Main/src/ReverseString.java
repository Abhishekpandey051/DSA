public class ReverseString {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        System.out.println("Reverse number is :");
        for (int i = a.length-1; i >= 0; i--) {

            System.out.print(a[i] + " ");
        }
    }
}
