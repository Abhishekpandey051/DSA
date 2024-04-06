import java.util.Arrays;

public class StringAnagram {
    public static void stringAnagram(String str1, String str2) {
        char x[] = str1.toCharArray();
        char y[] = str2.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        Boolean result = Arrays.equals(x, y);
        if (result == true) {
            System.out.println( "are anagram string ");
        }else {
            System.out.println("It is not anagram string ");
        }
    }
    public static void main(String[] args) {
        String str1 = "ARA";
        String str2 = "ARA";
        stringAnagram(str1, str2);
    }
}
