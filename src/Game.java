public class Game {
    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public static String askQuestion(int a) {
        if (a == 1){
            return "What is 4 x 6?: ";
        }
        return "";
    }

    public static String getAnswer(int a) {
        return "";
    }
}

