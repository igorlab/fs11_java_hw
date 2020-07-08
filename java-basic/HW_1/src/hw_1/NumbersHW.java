package hw_1;

import static helpers.Numbers.*;
import static helpers.Strings.*;

public class NumbersHW {

    public static void main(String[] args) {

        int random = getRandomInt(0, 5);
        System.out.printf("Your secret number: %s \n", random);

        System.out.print("Hi! Type your name: ");
        String user_name = readString();

        System.out.printf("%s, Let the game begin! \n", user_name);

        while (true){
            int number = readIntNumbers();
            if (number == random) {
                System.out.printf("Congratulations, %s! \n", user_name);
                break;
            }
            else if (number > random) {
                System.out.println("Your number is too big. Please, try again.");
            }
            else if (number < random) {
                System.out.println("Your number is too small. Please, try again.");
            }
        }

    }
}