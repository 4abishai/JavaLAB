// Define an interface Motor with a data member–”capacity” and two
// methods such as run() and consume(). Define a Java class ‘Washing machine’
// which implements this interface and write the code to check the value of the
// interface data member through an object of the class.

interface Motor {
    int capacity = 10;

    void run();

    void consume();
}

class WashingMachine implements Motor {

    @Override
    public void run() {
        System.out.println("Washing machine is running");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine is consuming energy.");
    }
}

public class B {
    public static void main(String[] args) {
        WashingMachine wash = new WashingMachine();

        System.out.println("Capacity of the washing machine: " + Motor.capacity);

        wash.run();
        wash.consume();
    }

}
