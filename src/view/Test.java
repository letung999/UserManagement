package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        //String regex = "^[a-zA-Z\\s]+$";
        String regex ="^[a-zA-Z0-9]+@gmail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fullName);
        if(matcher.find()){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
