import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Awesome Game!");
        System.out.println("Your goal is to get to Zone 100 by rolling a die before the lava catches up to you!");
        System.out.println("Which difficulty would you like to play on?: Easy (Lava +2 each turn), Medium (Lava +3 each turn), Hard (Lava +4 each turn,)");
        String difficulty = scan.nextLine();
        int lavaDifficulty = 0;
        if (difficulty.toLowerCase().equals("easy")) {
            lavaDifficulty = 2;
        }
        if (difficulty.toLowerCase().equals("medium")) {
            lavaDifficulty = 3;
        }
        if (difficulty.toLowerCase().equals("hard")) {
            lavaDifficulty = 4;
        }

        String answer = "";
        int a = 0;
        int zone = 0;
        int lava = 0;
        while (zone < 100) {
            zone += Game.rollDice();
            lava += lavaDifficulty;
            if ((zone == 4) || (zone == 32) || (zone == 58)) {
                a = 1;
                System.out.println(Game.askQuestion(a));
                answer = scan.nextLine();
                if (answer.equals(Game.getAnswer(a))) {
                    System.out.println("That's correct you get 5 points! " + zone + " + 5:");
                    zone += 5;

                }
                else {
                    System.out.println("That's wrong! No points for you!");
                }
            }
            if ((zone == 8) || (zone == 69) || (zone == 76)) {
                a = 2;
                System.out.println(Game.askQuestion(a));
                answer = scan.nextLine();
                if (answer.equals(Game.getAnswer(a))) {
                    System.out.println("That's correct you get 5 points! " + zone + " + 5:");
                    zone += 5;

                        } else {
                            System.out.println("That's wrong! No points for you!");
                        }
                    }
                    if (zone % 7 == 0) {
                        zone -= 5;
                    }
                    System.out.println(zone);
                }

            }
        }


