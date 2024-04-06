package FunctonCallBy;

public class ArrayCallBy {
    static void Display(int a[]) {
        System.out.println("main Function");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]  +" ");
        }
        for (int i = 0; i < a.length; i++) {
            a[i]+=10;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        Display(arr);
        System.out.println("\nDisplay Function");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]  +" ");
        }
    }
}
