package hw01;

import java.util.Random;
import java.util.Scanner;


public class HomeworkOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (100 * Math.random());

        int[] playerNumber = new int[100];

        System.out.println("Enter player name: ");
        String name = sc.nextLine();
        System.out.println("Let the game begin!");
        int count = 0;

        for (int infinitive = 0; ; infinitive++) {
            System.out.println("Enter player number between 0 to 100: ");
            playerNumber[infinitive] = sc.nextInt();
            count++;

             if(playerNumber[infinitive] < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (playerNumber[infinitive] > randomNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name);
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (playerNumber[i] < playerNumber[j]) {
                    playerNumber[i] = playerNumber[i] + playerNumber[j];
                    playerNumber[j] = playerNumber[i] - playerNumber[j];
                    playerNumber[i] = playerNumber[i] - playerNumber[j];

                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(playerNumber[i]);
        }

    }
}
