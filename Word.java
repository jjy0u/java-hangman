import java.util.ArrayList;
import java.util.Arrays;

public class Word {
    public String word;
    public ArrayList<String> lettersArr = new ArrayList<>();
    public ArrayList<String> blankSpaces = new ArrayList<>();

    public Word(String word) {
        this.word = word;
    }

    public void wordsToLettersArray() {
        String[] letters = word.split("");
        lettersArr.addAll(Arrays.asList(letters));
    }

    public void createBlankSpaces () {
        for (int i = 0; i < lettersArr.size() ; i++) {
            blankSpaces.add("__");
        }
    }
}

