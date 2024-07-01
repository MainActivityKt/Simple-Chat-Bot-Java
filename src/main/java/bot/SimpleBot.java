package bot;

class SimpleBot {
    public static void printGreeting(String botName, int creationYear) {
        System.out.printf("Hello! My name is %s\n", botName);
        System.out.printf("I was created in %s.\n", creationYear);
    }

    public static void main(String[] args) {
        printGreeting("Lindsey", 2024);
    }

}