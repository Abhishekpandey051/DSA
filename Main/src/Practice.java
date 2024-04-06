import java.util.Locale;

public class Practice {
    public static void main(String[] args) {
        String name;
        name = new String("Abhishek");
       // System.out.println(name);
        System.out.println(name.length());
        //System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.trim());
        System.out.println(name.substring(4));
        String trimString = "   Abhishek   ";
        trimString = trimString.trim() ;
        //System.out.println(trimString);
        //System.out.println(name.substring(2));
        //System.out.println(name.substring(0,8));
        //System.out.println(name.replace("shek","."));
        //System.out.println(name.startsWith("Ab"));
       // System.out.println(name.charAt(7));
        System.out.println(name.indexOf("k"));
        System.out.println(name.indexOf("s",5));
        System.out.println(name .equalsIgnoreCase("abhISheK"));
        System.out.println(name.equals("Abhishek"));

    }
}
