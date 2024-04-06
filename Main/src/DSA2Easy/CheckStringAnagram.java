package DSA2Easy;

import java.util.Arrays;

public class CheckStringAnagram {
    public static boolean isAnagram(String s1, String s2) {
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.toString(c1).equals(Arrays.toString(c2)))
            return true;
            return false;
        }


    public static void main(String[] args) {
        String s1 = "abcde";
        String s2  = "eacdb";
        boolean checkAnagram = isAnagram(s1,s2);
        if (checkAnagram)
            System.out.println("It is anagram");
        else
            System.out.println("not a anagram");

    }
}
