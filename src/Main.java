import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Awesome Game!");
        System.out.println("Your goal is to get to Zone 100 by rolling a die before the lava catches up to you!");
        System.out.println("Which difficulty would you like to play on? Easy (Lava +2 each turn), Medium (Lava +3 each turn), Hard (Lava +4 each turn,): ");
        String difficulty = scan.nextLine();
        int lavaDifficulty = 0;
        if (difficulty.equalsIgnoreCase("easy")) {
            lavaDifficulty = 2;
        }
        if (difficulty.equalsIgnoreCase("medium")) {
            lavaDifficulty = 3;
        }
        if (difficulty.equalsIgnoreCase("hard")) {
            lavaDifficulty = 4;
        }

        int zone = 0;
        int lava = 0;
        while (zone < 100) {
            int roll = Game.rollDice();
            System.out.println("Rolling... You got a " + roll);
            zone += roll;
            System.out.println("You are now in zone: " + zone);
            if ((zone % 6 == 0) || (zone % 8 == 0) || (zone % 9 == 0)) {
                int a = Game.rollDice();
                System.out.println(Game.askQuestion(a));
                String answer = scan.nextLine();
                if (answer.equalsIgnoreCase(Game.getAnswer(a))) {
                    System.out.println("That's correct you get 5 points! " + zone + " + 5:");
                    zone += 5;
                    System.out.println("You are now in zone: " + zone);
                } else {
                    System.out.println("That's wrong! You don't move up!");
                }
            } else if (zone % 7 == 0) {
                System.out.println("You landed in a danger zone! Go back 5!");
                zone -= 5;
                System.out.println("You are now in zone: " + zone);
            }

            System.out.println("End of round.");

            if (zone > 10) {
                lava += lavaDifficulty;
                System.out.println("The lava is now at zone: " + lava);
                if (lava >= zone) {
                    System.out.println("The lava caught up to you! You lose!");
                    zone = 100;
                    lava = 101;
                }
            }
            if ((zone > lava) && (zone < 100)) {
                System.out.println("Type y to continue to the next round");
                String nextRound = scan.nextLine();
            }
        }

        if (zone > lava) {
            System.out.println("Congrats! You beat the Awesome Game!");
        }
    }
}


