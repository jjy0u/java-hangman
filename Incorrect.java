public class Incorrect {
    public static int triesLeft = 9;
    public static String incorrectLetters = "";

    public static void Hangman() {
        switch (triesLeft) {
            case 8:
                System.out.println("\n\n\n\n______ ");
                break;
            case 7:
                System.out.println(
                    "   | \n" +
                    "   | \n" +
                    "   | \n" +
                    "   | \n" +
                    "___|___ ");
                break;
            case 6:
                System.out.println(
                    "    ____\n" +
                    "   | \n" +
                    "   | \n" +
                    "   | \n" +
                    "   | \n" +
                    "___|___ ");
                break;
            case 5:
                System.out.println(
                    "    ____\n" +
                    "   |    |\n" +
                    "   |     \n" +
                    "   |     \n" +
                    "   |     \n" +
                    "___|___ ");
                break;
            case 4:
                System.out.println(
                    "    ____  \n" +
                    "   |    | \n" +
                    "   |   (_)\n" +
                    "   |      \n" +
                    "   |      \n" +
                    "___|___ ");
                break;
            case 3:
                System.out.println(
                    "    ____   \n" +
                    "   |    |  \n" +
                    "   |   (_) \n" +
                    "   |    |  \n" +
                    "   |       \n" +
                    "___|___ ");
                break;
            case 2:
                System.out.println(
                    "    ____    \n" +
                    "   |    |   \n" +
                    "   |   (_)  \n" +
                    "   |    |   \n" +
                    "   |   / \\ \n" +
                    "___|___ ");
                break;
            case 1:
                System.out.println(
                    "    ____     \n" +
                    "   |    |    \n" +
                    "   |   (_)   \n" +
                    "   |   /|\\  \n" +
                    "   |   / \\  \n" +
                    "___|___ ");
                break;
            case 0:
                System.out.println(
                    "    ____     \n" +
                    "   |    |    \n" +
                    "   |   (⍥)   \n" +
                    "   |   /|\\  \n" +
                    "   |   / \\  \n" +
                    "___|___ ");
                break;
        }
    }
}
