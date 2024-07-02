package bot;

public class CounterBot extends SmartBot {
    static void performCount() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
        System.out.println("Completed, have a nice day!");
    }

    public static void run() {
        greet("Lindsey", 2024);
        remindNme();
        guessAge();
        performCount();
    }

    public static void main(String[] args) {
        run();
    }
}
