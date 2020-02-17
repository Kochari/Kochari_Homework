package hw02;

import java.util.Random;
import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[][] array = new String[5][5];
        int i = rand.nextInt(5 - 0 + 1) + 1;
        int j = rand.nextInt(5 -0 + 1) + 1;

        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < 5; m++) {
                array[n][m] = "-";
                System.out.print(array[n][m]);

            }
            System.out.println();
        }
        System.out.println(i);
        System.out.println(j);



        System.out.println("All set. Get ready to rumble!");
        boolean b=true;
        for (int infinive = 0;b ; infinive++) {
            for (int row = 0; row < 5&&b; row++) {
                for (int col = 0; col < 5&&b; col++) {
                    System.out.println("Enter row between 0 to 5:");
                    row = sc.nextInt();
                    System.out.println("Enter column between 0 to 5:");
                    col = sc.nextInt();
                    if (isInteger(row) && isInteger(col)) {
                        if (row <= 5 && row > 0 && col <= 5 && col >= 0) {
                            if (i == row && j == col) {
                                array[row][col]="x";
                                System.out.println("You have won!");
                               b=false;
                            }
                            else{
                                array[row][col]="*";
                            }
                        }
                        for( int g=0;g<5;g++){
                            for(int h=0;h<5;h++){
                                System.out.print(array[g][h]);
                            }
                            System.out.println();
                        }
                    }
                }
            }
        }
    }

    public static boolean isInteger(Object object) {
        if (object instanceof Integer) {
            return true;
        } else {
            String string = object.toString();

            try {
                Integer.parseInt(string);
            } catch (Exception e) {
                return false;
            }
        }

        return true;
    }
}
