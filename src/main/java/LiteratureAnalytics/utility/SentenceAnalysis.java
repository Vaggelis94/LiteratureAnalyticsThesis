package LiteratureAnalytics.utility;

import LiteratureAnalytics.vocab.Vocabulary;

import java.util.HashMap;
import java.util.Map;

public class SentenceAnalysis {

    private Vocabulary vocab;
    private float count = 0;

    public SentenceAnalysis(Vocabulary vocab) {
        this.vocab = vocab;
    }

    @Override
    public String toString() {
        return "Ο συνολικός αριθμός Προτάσεων του κειμένου είναι: \n" + (int) count
                + "\n Προτάσεις: \n" + vocab.getSentenceCount();
    }

    public void analysis() {

        HashMap<String, Integer> map = vocab.getSentenceCount();

        for (Map.Entry<String, Integer> entry : map.entrySet())
            count += entry.getValue();
    }
}
