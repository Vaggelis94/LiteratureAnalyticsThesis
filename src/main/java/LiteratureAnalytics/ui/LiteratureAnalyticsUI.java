package LiteratureAnalytics.ui;

import LiteratureAnalytics.utility.CharacterAnalysis;
import LiteratureAnalytics.utility.WordAnalysis;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class LiteratureAnalyticsUI extends javax.swing.JFrame {

    /**
     * Creates new form LiteratureAnalyticsUI
     */
    public LiteratureAnalyticsUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        InputTextButton = new javax.swing.JButton();
        LeftPanel = new javax.swing.JPanel();
        CharacterAnalysisButton = new javax.swing.JButton();
        WordAnalysisButton = new javax.swing.JButton();
        SentenceAnalysisButton = new javax.swing.JButton();
        RightPanel = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        TextPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TopPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ανάλυση Λογοτεχνικών Κειμένων", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        InputTextButton.setBackground(new java.awt.Color(255, 0, 51));
        InputTextButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        InputTextButton.setText("Εισαγωγή Κειμένου");
        InputTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputTextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InputTextButton)
                .addContainerGap(428, Short.MAX_VALUE))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addComponent(InputTextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        LeftPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Επιλογή Ανάλυσης", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        CharacterAnalysisButton.setBackground(new java.awt.Color(255, 255, 0));
        CharacterAnalysisButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CharacterAnalysisButton.setText("Ανάλυση Χαρακτήρων");
        CharacterAnalysisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CharacterAnalysisButtonActionPerformed(evt);
            }
        });

        WordAnalysisButton.setBackground(new java.awt.Color(102, 255, 51));
        WordAnalysisButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        WordAnalysisButton.setText("Ανάλυση Λέξεων");
        WordAnalysisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WordAnalysisButtonActionPerformed(evt);
            }
        });

        SentenceAnalysisButton.setBackground(new java.awt.Color(51, 153, 255));
        SentenceAnalysisButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SentenceAnalysisButton.setText("Ανάλυση Προτάσεων");
        SentenceAnalysisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SentenceAnalysisButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CharacterAnalysisButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(WordAnalysisButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SentenceAnalysisButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(CharacterAnalysisButton)
                .addGap(43, 43, 43)
                .addComponent(WordAnalysisButton)
                .addGap(43, 43, 43)
                .addComponent(SentenceAnalysisButton)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        TextPane.setEditable(false);
        ScrollPane.setViewportView(TextPane);

        javax.swing.GroupLayout RightPanelLayout = new javax.swing.GroupLayout(RightPanel);
        RightPanel.setLayout(RightPanelLayout);
        RightPanelLayout.setHorizontalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane)
        );
        RightPanelLayout.setVerticalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputTextButtonActionPerformed

        // File loading
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File myFile = chooser.getSelectedFile();

        try {
            // TODO: Replace with regular parsing, there is no apparent need for JSoup
            Document doc = Jsoup.parse(myFile, "UTF-8", " ");
            TextPane.setText(
                    parseDocument(doc.html())
            );
        } catch (IOException e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }

    private String parseDocument(String text) {
        String processedText = text;

        //Remove the <head> tag
        processedText = processedText.replaceAll("<head([\\s\\S]+?)</head>", "");
        //Remove the <title> tag
        processedText = processedText.replaceAll("<title([\\s\\S]+?)</title>", "");
        //Remove the <pre> tags
        processedText = processedText.replaceAll("<pre([\\s\\S]+?)</pre>", "");
        //Remove CSS style
        processedText = processedText.replaceAll("<style([\\s\\S]+?)</style>", "");
        //New line after each header
        processedText = processedText.replaceAll("<[/]h.>", "\n");
        //New line after each paragraph
        processedText = processedText.replaceAll("</p>", "\n");
        //Remove the rest of the html tags
        processedText = processedText.replaceAll("<[^>]*>", "");
        //Remove the &nbsp; characters
        processedText = processedText.replaceAll("&nbsp;", "");
        //Remove the &amp; characters
        processedText = processedText.replaceAll("&amp;", "");
        //Remove blank lines
        processedText = processedText.trim();

        return processedText;
    }

    private void CharacterAnalysisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CharacterAnalysisButtonActionPerformed
        String messageTitle = "Ανάλυση Χαρακτήρων";
        String text = TextPane.getText();

        if (TextPane.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Το κείμενο είναι άδειο!", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
        } else {
            // Create a new CharacterAnalysis Object
            CharacterAnalysis charAnalysis = new CharacterAnalysis(text);
            // Do the analysis
            charAnalysis.Analysis();

            //Show results
            JOptionPane.showMessageDialog(null, "Ο συνολικός αριθμός Χαρακτήρων του κειμένου είναι: \n"
                    + text.length(), messageTitle, JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "Κατηγορίες Χαρακτήρων: \n \n"
                    + Arrays.toString(charAnalysis.displayAnalysis()), messageTitle, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void WordAnalysisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WordAnalysisButtonActionPerformed
        String messageTitle = "Ανάλυση Λέξεων";
        String text = TextPane.getText();

        if (TextPane.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Το κείμενο είναι άδειο!", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
        } else {
            //Create a new WordAnalysis Object
            WordAnalysis wordAnalysis = new WordAnalysis(text);
            // Do the analysis
            wordAnalysis.splitWords();
            wordAnalysis.WordRateAnalysis();

            //Show results
            JOptionPane.showMessageDialog(null, "Οι συνολικός αριθμός Λέξεων του κειμένου είναι: \n"
                    + wordAnalysis.splitWords().length, messageTitle, JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "Οι Λέξεις του κειμένου είναι: \n"
                    + Arrays.toString(wordAnalysis.splitWords()), messageTitle, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void SentenceAnalysisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SentenceAnalysisButtonActionPerformed
        String messageTitle = "Ανάλυση Προτάσεων";
        String text = TextPane.getText();

        if (TextPane.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Το κείμενο είναι άδειο!", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }

    public static void main(String args[]) throws IOException {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LiteratureAnalyticsUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LiteratureAnalyticsUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LiteratureAnalyticsUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LiteratureAnalyticsUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LiteratureAnalyticsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CharacterAnalysisButton;
    private javax.swing.JButton InputTextButton;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton SentenceAnalysisButton;
    private javax.swing.JTextPane TextPane;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton WordAnalysisButton;
    // End of variables declaration//GEN-END:variables
}
