import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the Awesome Game!");
        System.out.print("How many players would you like to play with?: ");
        int players = scan.nextInt();

        int score = 0;
        while (score < 100) {
            score+= 4; // Game.rollDice();
            if ((score == 4) || (score == 32) || (score == 58)) {
                System.out.println("What is 4 x 6?: ");
                String answer = scan.nextLine();
                if (answer.equals("24")) {
                    System.out.println("That's correct you get 5 points! " + score + " + 5:");
                    score += 5;

                }
                else {
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

