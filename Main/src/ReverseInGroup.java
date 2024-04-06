import java.util.Scanner;

public class ReverseInGroup {
    public static void main(String[] args) {
        String str = "LIRIL";
        char x[] = str.toCharArray();
        int size = x.length;
        char y[] = new char[size];
        for (int i = size-1; i >= 0; i--) {
            System.out.println(x[i]);
        }
    }
}
