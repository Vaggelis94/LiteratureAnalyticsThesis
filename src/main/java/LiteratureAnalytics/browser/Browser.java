package LiteratureAnalytics.browser;

import javax.swing.*;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

public class Browser extends JEditorPane {

    public static void main(String[] args) {
        new Browser();
    }

    public Browser() {

        setSize(200, 200);

        // create jEditorPane
        JEditorPane editorPane = new JEditorPane();

        // make it read-only
        editorPane.setEditable(true);

        //setViewportView(editorPane);

        // add an html editor kit
        HTMLEditorKit kit = new HTMLEditorKit();
        editorPane.setEditorKit(kit);

        // add some styles to the html
        StyleSheet styleSheet = kit.getStyleSheet();
        styleSheet.addRule("body {color:#000; font-family:times; margin: 4px; }");
        styleSheet.addRule("h1 {color: blue;}");
        styleSheet.addRule("h2 {color: #ff0000;}");
        styleSheet.addRule("pre {font : 10px monaco; color : black; background-color : #fafafa; }");

        // create some simple html as a string
        String htmlString = "<html>\n"
                + "<body>\n"
                + "<h1>Welcome!</h1>\n"
                + "<h2>This is an H2 header</h2>\n"
                + "<p>This is some sample text</p>\n"
                + "<p><a href=\"http://devdaily.com/blog/\">devdaily blog</a></p>\n"
                + "</body>\n";

        // create a document, set it on the jeditorpane, then add the html
        Document doc = kit.createDefaultDocument();
        editorPane.setDocument(doc);
        editorPane.setText(htmlString);
        editorPane.setVisible(true);
        //setVisible(true);

    }
    
}