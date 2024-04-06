import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 66;
        marks[1] = 70;
        marks[2] = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of an array");
        int idx = sc.nextInt();
        System.out.println("Enter the number that you want to divide it!");
        int n = sc.nextInt();
        try {
            System.out.println("The number present at index " + marks[idx]);
            System.out.println("Divide the number is " + marks[idx]/n);
        } catch (ArithmeticException e) {
            System.out.println("Failed to ArithmeticException block");
            System.out.println(e);
        }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Failed to ArrayIndexOutOfBoundsException block");
                System.out.println(e);
            }
            catch (Exception e) {
            System.out.println("Failed to compile the other code");
            System.out.println(e);
        }
    }
}
