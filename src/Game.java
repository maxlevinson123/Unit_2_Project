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
        if (a == 3) {
            return "What is the capital of France?";
        }
        if (a == 4) {
            return "How many continents are there?";
        }
        if (a == 5) {
            return "What is the largest planet in our solar system?";
        }
        if (a == 6) {
            return "What is 9 squared?";
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
            return "paris";
        }
        if (a == 4) {
            return "7";
        }
        if (a == 5) {
            return "jupiter";
        }
        if (a == 6) {
            return "81";
        }
        return "";
    }
}

