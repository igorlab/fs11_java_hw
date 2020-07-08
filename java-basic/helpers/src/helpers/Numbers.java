package helpers;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static int readIntNumbers(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String num;
        while(true){
            num = in.nextLine();
            if(isInteger(num)){
                break;
            } else {
                System.out.printf("%s is not number\n", num);
            }
        }
        in.close();
        return Integer.parseInt(num);
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

    public static int getRandomInt(int min, int max){
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
