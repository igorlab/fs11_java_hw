import static helpers.Strings.readString;

public class TaskPlanner {

    public static void main(String[] args) {

        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";    schedule[0][1] = "do nothing";
        schedule[1][0] = "Monday";    schedule[1][1] = "go to courses or watch a film";
        schedule[2][0] = "Tuesday";   schedule[2][1] = "do home work3";
        schedule[3][0] = "Wednesday"; schedule[3][1] = "go to courses and watch a film";
        schedule[4][0] = "Thursday";  schedule[4][1] = "do home work5";
        schedule[5][0] = "Friday";    schedule[5][1] = "watch a film1";
        schedule[6][0] = "Saturday";  schedule[6][1] = "watch a film2";


       outHere: while (true){ // Используя цикл и оператор switch, запросите у пользователя ввести день недели в консоль

            System.out.print("Please, input the day of the week: ");
            String inputString = readString().trim();

            if(inputString.indexOf("change ") == 0){
                String changeDay = inputString.replace("change ","");
                System.out.println("Please, input new tasks for " + changeDay);
                String newTask =  readString().trim();
                for (int i = 0; i < schedule.length; i++) {
                    if(schedule[i][0].equals(changeDay)){
                        schedule[i][1] = newTask;
                        System.out.println(changeDay + " is changed");
                        break;
                    }
                }
            } else {
                switch (inputString.toLowerCase()){
                    case "sunday": // не можем использовать schedule[0][0] потому что в case должна быть константа, можно это как-то обойти?
                        System.out.println(schedule[0][1]);
                        break;
                    case "monday":
                        System.out.println(schedule[1][1]);
                        break;
                    case "tuesday":
                        System.out.println(schedule[2][1]);
                        break;
                    case "wednesday":
                        System.out.println(schedule[3][1]);
                        break;
                    case "thursday":
                        System.out.println(schedule[4][1]);
                        break;
                    case "friday":
                        System.out.println(schedule[5][1]);
                        break;
                    case "saturday":
                        System.out.println(schedule[6][1]);
                        break;
                    case "exit":
                        break outHere;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                }
            }
        }
    }
}
