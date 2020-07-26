package LiteratureAnalytics.utility;

public class CharacterAnalysis {

    private String text;
    private int LettersCount = 0;
    private int digitsCount = 0;
    private int spaceCount = 0;
    private int othersCount = 0;
    private float lettersPercentage;
    private float digitsPercentage;
    private float spacePercentage;
    private float othersPercentage;

    public CharacterAnalysis(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return LettersCount + " \t" + digitsCount + " \t" + spaceCount + " \t" + othersCount;
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
                digitsCount++;
                sum++;
            } //Verify space character
            else if (c == '\t' || c == ' ' || c == '\n') {
                spaceCount++;
                sum++;
            } else {
                othersCount++;
                sum++;
            }
        }
        lettersPercentage = (LettersCount / sum) * 100;
        digitsPercentage = (digitsCount / sum) * 100;
        spacePercentage = (spaceCount / sum) * 100;
        othersPercentage = (othersCount / sum) * 100;

    }

    public String[] displayAnalysis() {

        //Insert results inside array
        String[] myCharacters = new String[4];
        myCharacters[0] = ("Αριθμός Γραμμάτων: " + LettersCount + " ~ (" + lettersPercentage + " %)");
        myCharacters[1] = ("\n Αριθμός Ψηφίων: " + digitsCount + " ~ (" + digitsPercentage + " %)");
        myCharacters[2] = ("\n Αριθμός Κενών Χαρακτήρων: " + spaceCount + " ~ (" + spacePercentage + " %)");
        myCharacters[3] = ("\n Αριθμός Υπόλοιπων Χαρακτήρων: " + othersCount + " ~ (" + othersPercentage + " %)");
        return myCharacters;

    }

}
