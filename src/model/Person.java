package model;

import exception.InvalidDateOfBirthException;
import exception.InvalidEmailException;
import exception.InvalidFullNameException;
import exception.InvalidPhoneException;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person implements Serializable {

    private String personId;
    private String fullName;
    private String address;
    private String dateOfBirth;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(String personId) {
        this.personId = personId;
    }

    public Person(String personId, String fullName, String address, String dateOfBirth, String email, String phoneNumber) {
        this.personId = personId;
        this.fullName = fullName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws InvalidFullNameException {
        String regex = "^[a-zA-Z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fullName);
        if (matcher.find()) {
            this.fullName = fullName;
        } else {
            this.fullName = null;
            var msg = "Full Name is not true";
            throw new InvalidFullNameException(msg, fullName);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws InvalidDateOfBirthException {
        String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateOfBirth);
        if (matcher.find()) {
            this.dateOfBirth = dateOfBirth;
        } else {
            this.dateOfBirth = null;
            var msg = "Date Of Birth is not suitable";
            throw new InvalidDateOfBirthException(msg, dateOfBirth);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmailException {
        String regex = "^[a-zA-Z0-9]+@gmail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            this.email = email;
        } else {
            this.email = null;
            var msg = "Email is not suitable";
            throw new InvalidEmailException(msg, email);
        }

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws InvalidPhoneException {
        String regex = "\\d{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.find()) {
            this.phoneNumber = phoneNumber;
        } else {
            this.phoneNumber = null;
            var msg = "Phone is not suitable";
            throw new InvalidPhoneException(msg, phoneNumber);
        }
    }
}
