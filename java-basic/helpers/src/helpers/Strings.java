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
                System.out.println("String should contains at last one character");
            }
        }
        in.close();
        return value;
    }
}
