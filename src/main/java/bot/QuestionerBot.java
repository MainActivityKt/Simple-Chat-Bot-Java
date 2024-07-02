package bot;

public class QuestionerBot extends CounterBot {
    static void testKnowledge() {
        System.out.println("Let's test your programming knowledge.");
        String question = "What are the names of two categories of data types?";
        String optionA = "1. static and instance";
        String optionB = "2. mutable and immutable";
        String optionC = "3. primitive and reference";
        String optionD = "4. number and string";
        StringBuilder fullQuestionTest = new StringBuilder();
        fullQuestionTest.append(question + "\n" + optionA + "\n" + optionB + "\n" + optionC + "\n" + optionD + "\n");

        System.out.println(fullQuestionTest);
        int answer = sc.nextInt();
        while (answer != 3) {
            System.out.println("Please, try again.");
            System.out.println(fullQuestionTest);
            answer = sc.nextInt();
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }

    public static void run() {
        greet("Lindsey", 2024);
        remindNme();
        guessAge();
        performCount();
        testKnowledge();
        end();
    }

    public static void main(String[] args) {
        run();
    }
}
