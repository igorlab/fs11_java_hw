package hw_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import static helpers.Numbers.*;
import static helpers.Strings.*;

public class NumbersHW {

    public static void main(String[] args) {

        int random = getRandomInt(0, 100);
        System.out.printf("Your secret number: %s \n", random);

        System.out.print("Hi! Type your name: ");
        String userName = readString();

        System.out.printf("%s, Let the game begin! \n", userName);

        int[] yourNumbers = new int[100]; // так как игрок не склеротик, а случайное число находится в диапазоне [0-100], то 100 элементов достаточно
        int i = 0;

        while (true){ // Сам процесс игры обрабатывается в бесконечном цикле
            if (i > 99) break;

            System.out.print("Input a number: ");
            int number = readIntNumbers();
            yourNumbers[i] = number;
            i++;
            if (number == random) {
                System.out.printf("Congratulations, %s! \n", userName);
                if (i>1) {
                    int temp =0;
                    for (int n = 0; n < i - 1; n++) {
                        for (int j = 0; j < i - n - 1; j++) {
                            if (yourNumbers[j] < yourNumbers[j + 1]) {
                                temp = yourNumbers[j];
                                yourNumbers[j] = yourNumbers[j + 1];
                                yourNumbers[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("your numbers: "+ Arrays.toString(Arrays.copyOf(yourNumbers, i)));
                } else System.out.println("Your number is: " + number);
                break;
            }
            else if (number > random) {
                System.out.println("Your number is too big. Please, try again.");
            }
            else {
                System.out.println("Your number is too small. Please, try again.");
            }
        }

    }
}