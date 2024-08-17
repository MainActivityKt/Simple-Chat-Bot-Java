# Simple Chat Bot (Java)

A simple console chatbot that will be able to engage in basic conversation and perform simple arithmetic!

**In order to run any stages of the project**: you can run the java file for that stage
which you can find below, or the [Main.java](src/main/java/Main.java) file and inputting the number of
that stage.

[Open project on Hyperskill](https://hyperskill.org/projects/113)

## Stage 1/5: Meet the chat bot

In this stage, the name and the creation date of the chat
bot is printed to the console.
Run [SimpleBot.java](src/main/java/bot/SimpleBot.java).

Example

    Hello! My name is Aid.
    I was created in 2023.

## Stage 2/5: Introduce yourself

Extending the previous stage by adding a greet feature to the bot.
Run [FriendlyBot.java](src/main/java/bot/FriendlyBot.java).

Example

    Hello! My name is Aid.
    I was created in 2023.
    Please, remind me your name.
    > Amina
    What a great name you have, Amina!

## Stage 3/5: Let the chat bot guess your age

In this stage, the bot gets smarter and finds out someone's age by using
the popoular formula, getting the remainder of their age divided by 3, 5, and 7.

Run [SmartBot.java](src/main/java/bot/SmartBot.java)

Example

    Hello! My name is Aid.
    I was created in 2023.
    Please, remind me your name.
    What a great name you have, Max!
    Let me guess your age.
    Enter remainders of dividing your age by 3, 5 and 7.
    Your age is {yourAge}; that's a good time to start programming!

## Stage 4/5: Teach your bot to count

Now our bot can count to any number the user wants.
P.S. she is getting smarter : )

Run [CounterBot.java](src/main/java/bot/CounterBot.java)

Example

    Hello! My name is Aid.
    I was created in 2023.
    Please, remind me your name.
    > Max
    What a great name you have, Max!
    Let me guess your age.
    Enter remainders of dividing your age by 3, 5 and 7.
    > 1
    > 2
    > 1
    Your age is 22; that's a good time to start programming!
    Now I will prove to you that I can count to any number you want.
    > 5
    0!
    1!
    2!
    3!
    4!
    5!
    Completed, have a nice day!

## Stage 5/5: Play a simple quiz together

In this final stage, the bot asks a programming question and checks whether the user provide the
correct answer, or not.

Run [QuestionerBot.java](src/main/java/bot/QuestionerBot.java)

Example

    Hello! My name is Aid.
    I was created in 2023.
    Please, remind me your name.
    > Max
    What a great name you have, Max!
    Let me guess your age.
    Enter the remainders of dividing your age by 3, 5 and 7.
    > 1
    > 2
    > 1
    Your age is 22: that's a good time to start programming!
    Now I will prove to you that I can count to any number you want.
    > 3
    0!
    1!
    2!
    3!
    Let's test your programming knowledge.
    Why do we use methods?
    1. To repeat a statement multiple times.
       2. To decompose a program into several small subroutines.
       3. To determine the execution time of a program.
       4. To interrupt the execution of a program.
    > 4
    Please, try again.
    > 2
    Congratulations, have a nice day!
