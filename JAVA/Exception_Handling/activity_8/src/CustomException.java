public class CustomException extends Exception {

    private String mssg;

    public CustomException(String message) {
        this.mssg = message;
    }

    @Override
    public String getMessage() {
        return mssg;
    }
}
