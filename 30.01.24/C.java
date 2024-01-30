// Write a program in Java having three classes Apple, Banana and Cherry. Class
// Banana and Cherry are inherited from class Apple and each class has their own
// member function show() . Using the Dynamic Method Dispatch concept displays
// all the show() method of each class.

public class C {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        apple.show();
        banana.show();
        cherry.show();
    }
}

class Apple {

    void show() {
        System.out.println("Apple");
    }

}

class Banana extends Apple {
    @Override
    void show() {
        System.out.println("Banana");
    }
}

class Cherry extends Apple {
    @Override
    void show() {
        System.out.println("Cherry");
    }
}