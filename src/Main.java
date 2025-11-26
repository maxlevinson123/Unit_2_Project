import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the Awesome Game!");


        String answer = "";
        int a = 0;
        int score = 0;
        while (score < 100) {
            score += 4; // Game.rollDice();
            if ((score == 4) || (score == 32) || (score == 58)) {
                a = 1;
                System.out.println(Game.askQuestion(a));
                answer = scan.nextLine();
                if (answer.equals(Game.getAnswer(a))) {
                    System.out.println("That's correct you get 5 points! " + score + " + 5:");
                    score += 5;

                } else {
                    System.out.println("That's wrong! No points for you!");
                }
                if ((score == 4) || (score == 32) || (score == 58)) {
                    a = 1;
                    Game.askQuestion(a);
                    answer = scan.nextLine();
                    if (answer.equals("24")) {
                        System.out.println("That's correct you get 5 points! " + score + " + 5:");
                        score += 5;
                        System.out.println("Score: " + score + 5);
                    } else {
                        System.out.println("That's wrong! No points for you!");
                    }
                    if ((score == 8) || (score == 69) || (score == 76)) {
                        System.out.println("The three primary colors are blue, yellow, and ______: (put answer in lowercase");
                        answer = scan.nextLine();
                        if (answer.equals("red")) {
                            System.out.println("That's correct you get 5 points! " + score + " + 5:");
                            score += 5;

                        } else {
                            System.out.println("That's wrong! No points for you!");
                        }
                    }
                    if (score % 7 == 0) {
                        score -= 5;
                    }
                    System.out.println(score);


                }

            }
        }
    }
    }

