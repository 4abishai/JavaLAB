class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class C {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Exception occurred - CheckArgument");
            } else {
                int sumOfSquares = 0;
                for (String arg : args) { // ALTERNATIVE: for (int i = 0; i < args.length; i += 2)
                    int num = Integer.parseInt(arg);
                    sumOfSquares += num * num;
                }
                System.out.println(sumOfSquares);
            }
        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        }
    }
}
