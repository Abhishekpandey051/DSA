import org.w3c.dom.ls.LSOutput;

abstract class Vehicle{
    int NoOfTyre;
    abstract void start();
}
class car extends Vehicle {
    void start() {
        System.out.println("Star with key..");
    }
}
    class scooter extends car{
        void start(){
            System.out.println("Star with kick..");
        }
    }
    abstract class truck extends scooter{
    void load(){

        System.out.println("Truck can load high things..");
    }

    }

public class AbstractPractice {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        scooter s = new scooter();
        s.start();
//        truck t = new truck();
//        t.start();

    }
}
