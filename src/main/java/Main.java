import bot.*;

import java.util.Scanner;

public class Main {

    static final Scanner sc = new Scanner(System.in);
    static int getStageNumber() {
        System.out.println("Please enter the number of the stage you'd like to run:");
        int num = sc.nextInt();
        while (num <= 0 || num > 5) {
            System.out.println("Wrong input, please input the stage number, from 1 to 5:");
            num = sc.nextInt();
        }
        return num;

    }

    public static void main(String[] args) {
        int num = getStageNumber();
        switch (num) {
            case 1 -> SimpleBot.greet("Lindsey", 2024);
            case 2 -> FriendlyBot.run();
            case 3 -> SmartBot.run();
            case 4 -> CounterBot.run();
            case 5 -> QuestionerBot.run();
        }
    }
}