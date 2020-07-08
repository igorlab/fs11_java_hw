package helpers;

import java.util.Scanner;
import static helpers.Numbers.isInteger;

public class Strings {
    public static String readString() {
        Scanner in = new Scanner(System.in);
        String value;
        while(true){
            value = in.nextLine();
            if(value.length() > 0){
                break;
            } else {
                System.out.printf("%s is not number\n", value);
            }
        }
        in.close();
        return value;
    }
}
