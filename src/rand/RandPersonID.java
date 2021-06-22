package rand;

import java.util.ArrayList;
import java.util.Random;

public class RandPersonID {
    public static final String id = "0123456789";
    public static Random rand = new Random();

    public static String getPersonID() {
        var list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        int number;
        for (int i = 0; i < 9; ++i) {
            do {
                number = generation(0, id.length() - 1);
                if (checkExist(list, number) == false) {
                    list.add(number);
                    char characters = id.charAt(number);
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
