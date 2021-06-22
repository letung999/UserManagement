package rand;


import java.util.ArrayList;
import java.util.Random;


public class RandIDStudent {
    public static final String id = "0123456789";
    public static final String alpha = "abcdefghijklmnopqw";
    public static final String alphaNumber = id + alpha.toUpperCase();
    public static Random rand = new Random();

    public static String getStudentID() {
        var list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        int number;
        for (int i = 0; i < 5; ++i) {
            do {
                number = generation(0, alphaNumber.length() - 1);
                if (checkExist(list, number) == false) {
                    list.add(number);
                    char characters = alphaNumber.charAt(number);
                    sb.append(characters);
                    break;

                }
            } while (true);
        }
        return sb.toString();
    }

    public static boolean checkExist(ArrayList<Integer> list, int element) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) == element) {
                return true;
            }
        }
        return false;
    }


    public static int generation(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }


}
