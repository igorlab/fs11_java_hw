package helpers;

import java.util.Scanner;

public class Strings {
    public static String readString() {
        Scanner in = new Scanner(System.in);
        String value;
        while(true){
            value = in.nextLine();
            if(value.length() > 0){
                break;
            } else {
                System.out.println("The string should contain at least one character");
            }
        }
        in.close();
        return value;
    }
}
