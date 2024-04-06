import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {
    public static void main(String[] args) {
        String s = "aeeeeccddd";
        HashMap<Character,Integer> hm = new HashMap<>();
        char c[] = s.toCharArray();
        for (char ch : c) {
            if (hm.containsKey(ch)){
                hm.put(ch, hm.get(ch) + 1);
            }else {
                hm.put(ch,1);
            }
        }
        int maxCount = 0;
        char maxChar = ' ';
        for (Map.Entry<Character,Integer> me : hm.entrySet()) {
            if (maxCount < me.getValue()) {
                maxCount = me.getValue();
                maxChar = me.getKey();
            }
        }
        System.out.println("Maximum repeated char is " + maxChar + " " + maxCount);
    }
}
