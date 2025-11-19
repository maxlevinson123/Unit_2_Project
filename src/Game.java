public class Game {
    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public static String askQuestion() {
        int a = Game.rollDice();
        if (a == 1) {
            return "What is 4 x 6?: ";
        }
        return "";
    }
}