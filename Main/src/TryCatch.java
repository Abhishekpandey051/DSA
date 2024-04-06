import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        marks[0] = 66;
        marks[1] = 80;
        marks[2] = 76;
        System.out.println("Enter the index of an array");
        int idx = sc.nextInt();
        System.out.println("Enter the number that you want divide the number");
        int n = sc.nextInt();
        try {
            System.out.println("Welcome to the Try Catch Exception");
            try{
                System.out.println("The number present at index " + marks[idx]);
                System.out.println("Divide the number " + marks[idx] / n);
                try {
                    System.out.println("This index tells us to find the ArrayOutIndex area" + marks[idx]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Level 2 exception occurs");
                    System.out.println(e);
                }
            }
            catch (ArithmeticException e) {
                System.out.println("This is the Arithmetic exception ");
                System.out.println(e);
            }
        }
        catch (Exception e) {
            System.out.println("This is the other type Exception ");
        }
        }
    }

