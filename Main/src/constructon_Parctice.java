import java.util.Scanner;
class Animal{
    void milk(){
        System.out.println("Any animal can drink the milk..");
    }
    void meat(){
        System.out.println("Some Animal are eat meat..");
    }
    public void bread(){
        System.out.println("Animal also eat the bread ");
    }

}
class dog extends Animal{
     @Override
     public void meat(){
        System.out.println("Dog eat a meat...");
    }
    @Override
    public void bread(){
        System.out.println("Dog also eat the bread ");
    }
}

public class constructon_Parctice {
    public static void main(String[] args) {
        Animal a = new dog();
        dog d = new dog();
        a.meat();
//        a.milk();
         a.bread();
//        d.bread();
    }

}
