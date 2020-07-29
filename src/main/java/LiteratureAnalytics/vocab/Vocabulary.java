package LiteratureAnalytics.vocab;

import java.util.HashMap;

public class Vocabulary {

    private String text;
    private HashMap<Character, Integer> characterCount = new HashMap<>();
    private HashMap<String, Integer> wordCount = new HashMap<>();
    private HashMap<String, Integer> sentenceCount = new HashMap<>();

    public HashMap<Character, Integer> getCharacterCount() {
        return this.characterCount;
    }

    public HashMap<String, Integer> getWordCount() {
        return this.wordCount;
    }

    public HashMap<String, Integer> getSentenceCount() {
        return this.sentenceCount;
    }

    public Vocabulary(String text) {
        this.text = text;
        makeVocabulary();
    }

    private void makeVocabulary() {
        makeCharacters();
        makeWords();
        makeSentences();
    }

    private void makeCharacters() {
        characterCount.clear();
        for (char c : text.toCharArray()) {
            characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
        }
    }

    private void makeWords() {
        wordCount.clear();
        String wordText = text.replace("[^A-Za-zΆ-ώ0-9 ]", "");
        // Replacing Greek "Ano Teleia"
        wordText = wordText.replace("\u0387", "");
        String[] words = wordText.split(" ");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }

    private void makeSentences() {
        sentenceCount.clear();
        String[] sentences = text.trim().split("[.·!:?;]");
        for (String sentence : sentences) {
            sentenceCount.put(sentence, sentenceCount.getOrDefault(sentence, 0) + 1);
        }
    }

}
