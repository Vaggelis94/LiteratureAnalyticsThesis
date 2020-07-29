package LiteratureAnalytics.utility;

import LiteratureAnalytics.vocab.Vocabulary;

import java.util.HashMap;
import java.util.Map;

public class WordAnalysis {

    private Vocabulary vocab;
    private float count = 0;

    public WordAnalysis(Vocabulary vocab) {
        this.vocab = vocab;
    }

    @Override
    public String toString() {
        return "Ο συνολικός αριθμός Λέξεων του κειμένου είναι: \n" + (int) count
                + "\n Λέξεις: \n" + vocab.getWordCount();
    }

    public void analysis() {

        HashMap<String, Integer> map = vocab.getWordCount();

        for (Map.Entry<String, Integer> entry : map.entrySet())
            count += entry.getValue();
    }
}
