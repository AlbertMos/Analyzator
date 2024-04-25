public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Dont use negative numbers");
    }

    public NegativeNumberException(String message) {
        super(message);
    }


}
