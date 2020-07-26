package LiteratureAnalytics.utility;

import java.util.ArrayList;
import java.util.Scanner;

public class WordAnalysis {

    private String text;
    //Create the ArrayLists
    ArrayList<String> words = new ArrayList<String>();
    ArrayList<Integer> count = new ArrayList<Integer>();

    public WordAnalysis(String text) {
        this.text = text;
    }

    public String[] splitWords() {
        String word[];

        //Replace all non-word characters
        text = text.replaceAll("[.]", "");
        text = text.replaceAll(",", "");
        text = text.replaceAll("\n", "");
        text = text.replaceAll("[?]", "");
        text = text.replaceAll(";", "");
        text = text.replaceAll("!", "");
        text = text.replaceAll(":", "");
        text = text.replaceAll("·", "");
        text = text.replaceAll("[(]", "");
        text = text.replaceAll("[)]", "");
        text = text.replaceAll("&", "");
        text = text.replaceAll("[*]", "");
        text = text.replaceAll("%", "");
        text = text.replaceAll("-", "");
        text = text.replaceAll("—", "");
        text = text.replaceAll("_", "");
        text = text.replaceAll("<", "");
        text = text.replaceAll(">", "");
        text = text.replaceAll("-", "");
        text = text.replaceAll("[\"]", "");
        text = text.replaceAll("'", "");
        text = text.replaceAll("«", "");
        text = text.replaceAll("»", "");

        //Split the text into words
        word = text.split(" ");

        return word;

    }

    public void WordRateAnalysis() {

        //Replace all non-word characters
        text = text.replaceAll("[.]", "");
        text = text.replaceAll(",", "");
        text = text.replaceAll("\n", "");
        text = text.replaceAll("[?]", "");
        text = text.replaceAll(";", "");
        text = text.replaceAll("!", "");
        text = text.replaceAll(":", "");
        text = text.replaceAll("·", "");
        text = text.replaceAll("[(]", "");
        text = text.replaceAll("[)]", "");
        text = text.replaceAll("&", "");
        text = text.replaceAll("[*]", "");
        text = text.replaceAll("%", "");
        text = text.replaceAll("-", "");
        text = text.replaceAll("—", "");
        text = text.replaceAll("_", "");
        text = text.replaceAll("<", "");
        text = text.replaceAll(">", "");
        text = text.replaceAll("-", "");
        text = text.replaceAll("[\"]", "");
        text = text.replaceAll("'", "");
        text = text.replaceAll("«", "");
        text = text.replaceAll("»", "");

        Scanner input = new Scanner(text);
        //Read through the text and find the words
        while (input.hasNext()) {
            //Get the next word
            String nextWord = input.next();
            //Determine if the word is in the ArrayList
            if (words.contains(nextWord)) {
                int index = words.indexOf(nextWord);
                count.set(index, count.get(index) + 1);
            } else {
                words.add(nextWord);
                count.add(1);
            }
        }
        input.close();

        //Display results
        for (int i = 0; i < words.size(); i++) {
            if (count.get(i) == 1) {
                System.out.println(words.get(i) + " εμφανίστηκε " + count.get(i) + " φορά \n");
            } else {
                System.out.println(words.get(i) + " εμφανίστηκε " + count.get(i) + " φορές \n");
            }
        }
    }

}
