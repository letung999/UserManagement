package exception;

public class InvalidPhoneException extends Exception {
    private String phone;

    public InvalidPhoneException(String phone) {
        this.phone = phone;
    }

    public InvalidPhoneException(String message, String phone) {
        super(message);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
}
