package bot;

public class CounterBot extends SmartBot {
    static void performCount() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    public static void main(String[] args) {
        greet("Lindsey", 2024);
        remindNme();
        guessAge();
        performCount();
    }
}
