import java.util.ArrayList;

public class WordLibrary {
    ArrayList<String> wordArray = new ArrayList<>();

    public void addWords(String[] words) {
        for (int i = 0; i < words.length ; i++) {
            wordArray.add(words[i]);
        }
    }
    public String getRandomWord(){
        int randomNumber = (int) (Math.random()* wordArray.size());
        return wordArray.get(randomNumber);
    }
}