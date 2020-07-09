package helpers;

import java.util.Random;
import java.util.Scanner;

public class Numbers {

    public static int readIntNumbers() {
        Scanner in = new Scanner(System.in);
        String num;
        while (true) {
            num = in.nextLine();
            if (isInteger(num)) {
                break;
            } else {
                System.out.printf("{%s} is not number, repeat pls: ", num);
            }
        }
        return Integer.parseInt(num);
    }

    public static int readIntNumbersRange(int min, int max) {
        int value;
        while (true) {
            value = readIntNumbers();
            if (value >= min && value <= max) break;
            else System.out.printf(" number not in range [%s-%s], repeat pls: ", min, max);
        }
        return value;
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }

    public static int getRandomInt(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
