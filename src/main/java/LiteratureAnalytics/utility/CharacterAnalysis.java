package LiteratureAnalytics.utility;

import LiteratureAnalytics.vocab.Vocabulary;

import java.util.HashMap;
import java.util.Map;

public class CharacterAnalysis {

    private Vocabulary vocab;

    private int lettersCount = 0;
    private int digitsCount = 0;
    private int spaceCount = 0;
    private int othersCount = 0;
    int count = 0;

    private float lettersPercentage;
    private float digitsPercentage;
    private float spacePercentage;
    private float othersPercentage;

    public CharacterAnalysis(Vocabulary vocab) {
        this.vocab = vocab;
    }

    @Override
    public String toString() {
        return "Ο συνολικός αριθμός Χαρακτήρων του κειμένου είναι: \n" + count + "\n"
                + "\n Αριθμός Γραμμάτων: " + lettersCount + " ~ (" + lettersPercentage + " %)" + "\n"
                + "\n Αριθμός Ψηφίων: " + digitsCount + " ~ (" + digitsPercentage + " %)" + "\n"
                + "\n Αριθμός Κενών Χαρακτήρων: " + spaceCount + " ~ (" + spacePercentage + " %)" + "\n"
                + "\n Αριθμός Υπόλοιπων Χαρακτήρων: " + othersCount + " ~ (" + othersPercentage + " %)";
    }

    public void analysis() {
        float sum = 0;
        HashMap<Character, Integer> map = vocab.getCharacterCount();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            count += entry.getValue();
            sum += entry.getValue();
        }

        for (char c = 'A'; c < 'Z'; c++) {
            lettersCount += map.getOrDefault(c, 0);
        }
        for (char c = 'a'; c < 'z'; c++) {
            lettersCount += map.getOrDefault(c, 0);
        }
        lettersCount += map.getOrDefault('Ά', 0);
        for (char c = 'Έ'; c < 'ώ'; c++) {
            lettersCount += map.getOrDefault(c, 0);
        }

        for (char c = '0'; c < '9'; c++) {
            digitsCount += map.getOrDefault(c, 0);
        }

        spaceCount = map.getOrDefault(' ', 0);

        othersCount = (int) (sum - lettersCount - digitsCount - spaceCount);

        lettersPercentage = (lettersCount / sum) * 100;
        digitsPercentage = (digitsCount / sum) * 100;
        spacePercentage = (spaceCount / sum) * 100;
        othersPercentage = (othersCount / sum) * 100;
    }
}
