class SharedResource {
    synchronized void display(String message) {
        for (String word : message.split(" ")) {
            System.out.println(Thread.currentThread().getName() + ": " + word);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    SharedResource sharedResource;
    String message;

    MyThread(SharedResource sharedResource, String message) {
        this.sharedResource = sharedResource;
        this.message = message;
    }

    public void run() {
        sharedResource.display(message);
    }
}

public class B {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        MyThread thread1 = new MyThread(sharedResource, "I Love Java Very Much");
        MyThread thread2 = new MyThread(sharedResource, "I Love Java Very Much");
        MyThread thread3 = new MyThread(sharedResource, "I Love Java Very Much");

        thread2.start();
        thread3.start();
    }
}
