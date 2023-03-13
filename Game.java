import java.util.Scanner;

public class Game {
    public static void gameplay() {
        WordLibrary wordLibrary = new WordLibrary();
        String[] words = {"Cat", "Hat", "Rat", "Sack", };
        wordLibrary.addWords(words);

        Word randomWord = new Word(wordLibrary.getRandomWord());
        randomWord.wordsToLettersArray();
        System.out.println(randomWord.lettersArr);
        randomWord.createBlankSpaces();
        System.out.println(randomWord);
        System.out.println(randomWord.blankSpaces);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman, what is your name?");
        String name = scanner.nextLine();
        System.out.println("\n" + randomWord.blankSpaces);
        System.out.println("\nChoose a letter, " + name);

        while (randomWord.blankSpaces.contains("__")) {
            String letter = scanner.nextLine();
            if (randomWord.lettersArr.contains(letter)) {
                int index = randomWord.lettersArr.indexOf(letter);
                System.out.println("\nNice!\n");
                randomWord.blankSpaces.set(index, letter);
                System.out.println(randomWord.blankSpaces + "\n");
            } else {
                if (Incorrect.triesLeft > 1) {
                    Incorrect.triesLeft = Incorrect.triesLeft - 1;
                    System.out.println("\nToo bad! You have " + Incorrect.triesLeft + " turn(s) left.\n");
                    System.out.println(randomWord.blankSpaces + "\n");
                    Incorrect.incorrectLetters = letter.toUpperCase() + " " + Incorrect.incorrectLetters;
                } else {
                    Incorrect.triesLeft = Incorrect.triesLeft - 1;
                    System.out.println("\n------------------------------------\n              GAME OVER\n------------------------------------");
                    System.out.println("\n" + randomWord.blankSpaces + "\n");
                    System.out.println("Incorrect guesses: " + Incorrect.incorrectLetters + "\n");
                    Incorrect.Hangman();
                    System.out.println("\nDo you want to play again? \n 1: Yes \n 2: No\n");
                    String isPlayAgain = scanner.nextLine();
                }
            }
            if (!(Incorrect.incorrectLetters == "")) {
                System.out.println("Incorrect guesses: " + Incorrect.incorrectLetters + "\n");
                Incorrect.Hangman();
            }
            if (Incorrect.triesLeft > 0) {
                System.out.println("\nchoose a letter");
            }
        }
    }
}
