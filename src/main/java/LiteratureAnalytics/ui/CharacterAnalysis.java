package LiteratureAnalytics.ui;

import java.util.Scanner;

public class CharacterAnalysis {

    private String text;
    private int LettersCount = 0;
    private int DigitsCount = 0;
    private int SpaceCount = 0;
    private int OthersCount = 0;
    private float LettersPercentage;
    private float DigitsPercentage;
    private float SpacePercentage;
    private float OthersPercentage;

    //Getter
    public String getText() {
        return text;
    }

    //Setter
    public void setText(String text) {
        this.text = text;
    }

    public int getLettersCount() {
        return LettersCount;
    }

    public int getDigitsCount() {
        return DigitsCount;
    }

    public int getSpaceCount() {
        return SpaceCount;
    }

    public int getOthersCount() {
        return OthersCount;
    }

    @Override
    public String toString() {
        return LettersCount + " \t" + DigitsCount + " \t" + SpaceCount + " \t" + OthersCount;
    }

    public void readText(String text) {
        Scanner input = new Scanner(System.in);
        text = input.nextLine();
    }

    public void Analysis() {
        char c;
        float sum = 0;

        //Analyze character by character
        for (int i = 0; i < text.length(); i++) {
            //Get the next character
            c = text.charAt(i);

            //Verify english letter
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                LettersCount++;
                sum++;
            } //Verify greek letter
            else if ((c >= 'Α' && c <= 'Ω') || (c >= 'α' && c <= 'ω')) {
                LettersCount++;
                sum++;
            } //Verify number
            else if (c >= '0' && c <= '9') {
                DigitsCount++;
                sum++;
            } //Verify space character
            else if (c == '\t' || c == ' ' || c == '\n') {
                SpaceCount++;
                sum++;
            } else {
                OthersCount++;
                sum++;
            }
        }
        LettersPercentage = (LettersCount / sum) * 100;
        DigitsPercentage = (DigitsCount / sum) * 100;
        SpacePercentage = (SpaceCount / sum) * 100;
        OthersPercentage = (OthersCount / sum) * 100;

    }

    public String[] displayAnalysis() {

        //Insert results inside array
        String[] myCharacters = new String[4];
        myCharacters[0] = ("Αριθμός Γραμμάτων: " + LettersCount + " ~ (" + LettersPercentage + " %)");
        myCharacters[1] = ("\n Αριθμός Ψηφίων: " + DigitsCount + " ~ (" + DigitsPercentage + " %)");
        myCharacters[2] = ("\n Αριθμός Κενών Χαρακτήρων: " + SpaceCount + " ~ (" + SpacePercentage + " %)");
        myCharacters[3] = ("\n Αριθμός Υπόλοιπων Χαρακτήρων: " + OthersCount + " ~ (" + OthersPercentage + " %)");
        return myCharacters;

    }

}
