import org.w3c.dom.ls.LSOutput;
import java.util.Random;
import java.util.Scanner;
public class Practice1 {

    public static void main(String[] args) {
        System.out.println("Enter your Website ");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("his is the organisational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is the commercial website");
        }
        else if(website.endsWith(".in")) {
            System.out.println("This is the Indian website");
        }


    }

}
