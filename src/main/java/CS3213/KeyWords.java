package CS3213;

import java.util.HashSet;

public class KeyWords {
    private HashSet<String> keyWords;
    private static KeyWords instance;
    private KeyWords() {
        this.keyWords = new HashSet<String>();
    }

    public static KeyWords getKeyWords() {
        if (instance == null) {
        	instance = new KeyWords();
        }

        return instance;
    }

    public void addKeyWord(String word) {
        assert(word != null);
        this.keyWords.add(word);
    }

    public void removeKeyWord(String word) {
        assert(word != null);
        this.keyWords.remove(word);
    }

    public boolean isKeyWord(String word) {
        assert(word != null);
        return this.keyWords.contains(word);
    }
}
