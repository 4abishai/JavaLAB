import java.util.Scanner;

class CounterThread extends Thread {
    private String name;
    private int lowerRange;
    private int upperRange;

    public CounterThread(String name, int lowerRange, int upperRange) {
        this.name = name;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    public void run() {
        System.out.println("Thread - " + name);
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.print("Counter - " + i + " ");
            try {
                Thread.sleep(5); // sleep for 5 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of the thread: ");
        String name = scanner.next();
        System.out.print("Lower range of counter: ");
        int lowerRange = scanner.nextInt();
        System.out.print("Upper range of counter: ");
        int upperRange = scanner.nextInt();

        CounterThread counterThread = new CounterThread(name, lowerRange, upperRange);
        counterThread.start();
    }
}
