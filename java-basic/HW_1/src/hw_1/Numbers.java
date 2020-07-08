package hw_1;

import helpers.Strings;

public class Numbers {
    public static void main(String[] args) {

//        int number = helpers.Numbers.readIntNumbers();
//        System.out.printf("Your number: %s \n", number);

        int random = helpers.Numbers.getRandomInt(0, 5);
        System.out.printf("Your number: %s \n", random);

        System.out.println("Hi! Type your name: ");
        String user_name = helpers.Strings.readString();
        System.out.printf("%s, Let the game begin! \n", user_name);

    }
}
