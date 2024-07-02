package bot;

public class SmartBot extends FriendlyBot {
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remByThree = sc.nextInt();
        int remByFive = sc.nextInt();
        int remBySeven = sc.nextInt();
        int age = (remByThree * 70 + remByFive * 21 + remBySeven * 15) % 105;
        System.out.format("Your age is %d; that's a good time to start programming!\n", age);
    }

    public static void run() {
        greet("Lindsey", 2024);
        remindNme();
        guessAge();
    }

    public static void main(String[] args) {
        run();
    }
}
