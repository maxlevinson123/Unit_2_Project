public class Game {
    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public static String askQuestion(int a) {
        if (a == 1){
            return "What is 4 x 6?: ";
        }
        if (a == 2){
            return "The three primary colors are blue, yellow, and ______: (put answer in lowercase";
        }
        return "";
    }

    public static String getAnswer(int a) {
        if (a == 1) {
            return "24";
        }
        if (a == 2) {
            return "red";
        }
        if (a == 3) {

        }
        return "";
    }
}

