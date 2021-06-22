package exception;

public class InvalidFullNameException extends Exception {

    private String fullName;

    public InvalidFullNameException(String fullName) {
        this.fullName = fullName;
    }

    public InvalidFullNameException(String message, String fullName) {
        super(message);
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
