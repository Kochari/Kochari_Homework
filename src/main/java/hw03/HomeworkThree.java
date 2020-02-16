package hw03;

import java.util.Scanner;

public class HomeworkThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String daysOfWeek;
        String newTask;
        boolean exit = true;
        String[][] schedule = {{"monday", "go to course"}, {"tuesday", "do home work"},
                {"wednesday", "watch tv"}, {"thursday", "go to GYM"}, {"friday", "check mail"}, {"saturday", "play game"}, {"sunday", "watch film"}};
        for (int i = 0; exit; i++) {
            System.out.println("Please, input the day of the week:");
            daysOfWeek = sc.nextLine();
            switch (daysOfWeek.toLowerCase()) {
                case "monday":
                    System.out.println("Your tasks for Monday:" + schedule[0][1]);
                    exit = true;
                    break;
                case "tuesday":
                    System.out.println("Your tasks for Tuesday:" + schedule[1][1]);
                    exit = true;
                    break;
                case "wednesday":
                    System.out.println("Your tasks for Wednesday:" + schedule[2][1]);
                    exit = true;
                    break;
                case "thursday":
                    System.out.println("Your tasks for Thursday:" + schedule[3][1]);
                    exit = true;
                    break;
                case "friday":
                    System.out.println("Your tasks for Friday:" + schedule[4][1]);
                    exit = true;
                    break;
                case "saturday":
                    System.out.println("Your tasks for Saturday:" + schedule[5][1]);
                    exit = true;
                    break;
                case "sunday":
                    System.out.println("Your tasks for Sunday:" + schedule[6][1]);
                    exit = true;
                    break;
                case "exit":
                    exit = false;
                    System.out.println("End of program");
                    break;
                default:
                    switch (daysOfWeek) {
                        case "change monday":
                            System.out.println("Please, input new tasks for Monday.");
                            schedule[0][1] = sc.nextLine();
                            System.out.println("Your tasks for Monday:" + schedule[0][1]);
                            exit = true;
                            break;
                        case "change tuesday":
                            System.out.println("Please, input new tasks for Tuesday.");
                            schedule[1][1] = sc.nextLine();
                            System.out.println("Your tasks for Tuesday:" + schedule[1][1]);
                            exit = true;
                            break;
                        case "change wednesday":
                            System.out.println("Please, input new tasks for Wednesday.");
                            schedule[2][1] = sc.nextLine();
                            System.out.println("Your tasks for Wednesday:" + schedule[2][1]);
                            exit = true;
                            break;
                        case "change thursday":
                            System.out.println("Please, input new tasks for Thursday.");
                            schedule[3][1] = sc.nextLine();
                            System.out.println("Your tasks for Thursday:" + schedule[3][1]);
                            exit = true;
                            break;
                        case "change friday":
                            System.out.println("Please, input new tasks for Friday.");
                            schedule[4][1] = sc.nextLine();
                            System.out.println("Your tasks for Friday:" + schedule[4][1]);
                            exit = true;
                            break;
                        case "change saturday":
                            System.out.println("Please, input new tasks for Saturday.");
                            schedule[5][1] = sc.nextLine();
                            System.out.println("Your tasks for Saturday:" + schedule[5][1]);
                            exit = true;
                            break;
                        case "change sunday":
                            System.out.println("Please, input new tasks for Sunday.");
                            schedule[6][1] = sc.nextLine();
                            System.out.println("Your tasks for Sunday:" + schedule[6][1]);
                            exit = true;
                            break;
                        default:
                            System.out.println("Sorry, I don't understand you, please try again.");
                            exit = true;
                    }
            }
        }
    }
}
