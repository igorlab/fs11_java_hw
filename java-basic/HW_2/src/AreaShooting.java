import java.util.Arrays;

import static helpers.Numbers.*;

public class AreaShooting {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        int[][] area = new int[5][5];

        int[] target = {getRandomInt(1, 5), getRandomInt(1, 5)};
        System.out.println(Arrays.toString(target));

        while (true){ // Сам процесс игры обрабатывается в бесконечном цикле.
            System.out.print("Input a row number : ");
            int numberV = readIntNumbersRange(1,5);
            System.out.print("Input a column number : ");
            int numberH = readIntNumbersRange(1,5);

            area[numberV-1][numberH-1] = 1;

            for (int i = 0; i < 6; i++) {
                for (int n = 0; n < 6; n++) {
                    if (i == 0){
                        System.out.print( (n) + " | ");
                    } else if (n == 0) {
                        System.out.print( (i) + " |");
                    } else {
                        if (area[i-1][n-1] == 0) { // did not shoot
                            System.out.print(" - |");
                        } else if (area[target[0]-1][target[1]-1] == 1 && target[0]-1 == i-1 && target[1]-1 == n-1 ) { // hit the target
                            System.out.print(" X |");
                        } else { // miss the target
                            System.out.print(" * |");
                        }
                    }
                }
                System.out.println("");
            }
            if (area[target[0]-1][target[1]-1] == 1){
                System.out.println("You have won!");
                break;
            }
        }
    }
}
