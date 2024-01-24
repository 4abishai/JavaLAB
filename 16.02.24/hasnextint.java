import java.util.*;

public class hasnextint {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean see = scan.hasNextInt();
        if (see) {
            int x = scan.nextInt();
            System.out.println("Captured value: " + x);
        } else {
            System.out.println("Can't capture");
        }

        scan.close();
    }
}
