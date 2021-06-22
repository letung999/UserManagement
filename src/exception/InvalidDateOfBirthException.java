package exception;

public class InvalidDateOfBirthException extends Exception {
    private String dateOfBirth;

    public InvalidDateOfBirthException(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public InvalidDateOfBirthException(String message, String dateOfBirth) {
        super(message);
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
