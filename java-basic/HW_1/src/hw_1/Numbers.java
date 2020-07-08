package hw_1;

public class Numbers {
    public static void main(String[] args) {

        int random = helpers.Numbers.getRandomInt(0, 5);
        System.out.printf("Your number: %s \n", random);

        System.out.println("Hi! Type your name: ");
        String user_name = helpers.Strings.readString();
        System.out.printf("%s, Let the game begin! \n", user_name);

        while (true){
            int number = helpers.Numbers.readIntNumbers();
            if (number == random) {
                System.out.printf("Congratulations, %s! \n", user_name);
                break;
            }
            else if (number > random) {
                System.out.println("Your number is too big. Please, try again.");
                break;
            }
            else if (number < random) {
                System.out.println("Your number is too small. Please, try again.");
                break;
            }
        }

    }
}