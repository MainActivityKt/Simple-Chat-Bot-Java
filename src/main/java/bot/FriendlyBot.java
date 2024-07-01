package bot;

import java.util.Scanner;

class FriendlyBot extends SimpleBot {
    final static Scanner sc = new Scanner(System.in);
    static void remindNme() {
        System.out.println("Please, remind me your name.");
        String name = sc.nextLine();
        System.out.format("What a great name you have, %s!\n", name);
    }

    public static void main(String[] args) {
        greet("Lindsey", 2024);
        remindNme();
    }

}