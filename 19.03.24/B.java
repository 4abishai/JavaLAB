import java.util.Scanner;

class InvalidHourException extends Exception {
    public InvalidHourException(String message) {
        super(message);
    }
}

class InvalidMinuteException extends Exception {
    public InvalidMinuteException(String message) {
        super(message);
    }
}

class InvalidSecondException extends Exception {
    public InvalidSecondException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public void setTime(int hours, int minutes, int seconds)
            throws InvalidHourException, InvalidMinuteException, InvalidSecondException {
        if (hours < 0 || hours > 24) {
            throw new InvalidHourException("hour is not between 0 and 24");
        }
        if (minutes < 0 || minutes > 60) {
            throw new InvalidMinuteException("minutes are not between 0 and 60");
        }
        if (seconds < 0 || seconds > 60) {
            throw new InvalidSecondException("seconds are not between 0 and 60");
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter hours: ");
            int hours = scanner.nextInt();
            System.out.print("Enter minutes: ");
            int minutes = scanner.nextInt();
            System.out.print("Enter seconds: ");
            int seconds = scanner.nextInt();

            Time time = new Time();
            time.setTime(hours, minutes, seconds);

            System.out.println("Correct Time-> " + time);
        } catch (InvalidHourException | InvalidMinuteException | InvalidSecondException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}
