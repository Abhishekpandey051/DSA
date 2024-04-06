import java.util.Scanner;
class Circle{
    int radius;
    void setRadius(int r){
        radius = r;
    }
    int getRadius(){
        return radius*radius;
    }
}
public class MethodOnJava {
    public static void main(String[] args) {
        Circle E = new Circle();
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        E.setRadius(a);;
        System.out.println(E.getRadius());

    }
}
