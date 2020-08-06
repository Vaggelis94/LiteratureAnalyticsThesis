package LiteratureAnalytics.browser;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

public class Browser extends JPanel{

    public static void main(String[] args) {
        new Browser();
    }

    public Browser() {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // create jeditorpane
                JEditorPane EditorPane = new JEditorPane();

                // make it read-only
                //jEditorPane.setEditable(false);

                // create a scrollpane; modify its attributes as desired
                JScrollPane scrollPane = new JScrollPane(EditorPane);

                // add an html editor kit
                HTMLEditorKit kit = new HTMLEditorKit();
                EditorPane.setEditorKit(kit);

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
                EditorPane.setDocument(doc);
                EditorPane.setText(htmlString);
                EditorPane.setVisible(true);
                scrollPane.setVisible(true);

                // now add it all to a frame
                //JFrame j = new JFrame("HtmlEditorKit Test");
                //j.getContentPane().add(scrollPane, BorderLayout.CENTER);

                // make it easy to close the application
                //j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // display the frame
                //j.setSize(new Dimension(300, 200));

                // pack it, if you prefer
                //j.pack();
                // center the jframe, then make it visible
                //j.setLocationRelativeTo(null);
                //j.setVisible(true);
            }
        });

    }

}
