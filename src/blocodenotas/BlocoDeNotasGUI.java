package blocodenotas;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import jdk.jfr.events.FileWriteEvent;

public class BlocoDeNotasGUI extends javax.swing.JFrame {

    String filename;
    Clipboard clipboard = getToolkit().getSystemClipboard();

    public BlocoDeNotasGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        BotaoPesquisar = new javax.swing.JButton();
        CampoDePesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NovoArquivo = new javax.swing.JMenuItem();
        AbrirArquivo = new javax.swing.JMenuItem();
        SalvarArquivo = new javax.swing.JMenuItem();
        SairArquivo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        CortarTexto = new javax.swing.JMenuItem();
        CopiarTexto = new javax.swing.JMenuItem();
        ColarTexto = new javax.swing.JMenuItem();
        PesquisarTexto = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoPesquisar.setText("Procurar");
        BotaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisarActionPerformed(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane2.setViewportView(TextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(CampoDePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoPesquisar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoPesquisar)
                    .addComponent(CampoDePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        NovoArquivo.setText("Novo");
        NovoArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoArquivoActionPerformed(evt);
            }
        });
        jMenu1.add(NovoArquivo);

        AbrirArquivo.setText("Abrir");
        AbrirArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirArquivoActionPerformed(evt);
            }
        });
        jMenu1.add(AbrirArquivo);

        SalvarArquivo.setText("Salvar");
        SalvarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarArquivoActionPerformed(evt);
            }
        });
        jMenu1.add(SalvarArquivo);

        SairArquivo.setText("Sair");
        SairArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairArquivoActionPerformed(evt);
            }
        });
        jMenu1.add(SairArquivo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        CortarTexto.setText("CortarTexto");
        CortarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CortarTextoActionPerformed(evt);
            }
        });
        jMenu2.add(CortarTexto);

        CopiarTexto.setText("CopiarTexto");
        CopiarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarTextoActionPerformed(evt);
            }
        });
        jMenu2.add(CopiarTexto);

        ColarTexto.setText("Colar");
        ColarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColarTextoActionPerformed(evt);
            }
        });
        jMenu2.add(ColarTexto);

        PesquisarTexto.setText("Pesquisar");
        PesquisarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarTextoActionPerformed(evt);
            }
        });
        jMenu2.add(PesquisarTexto);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisarActionPerformed
        searchTextArea(TextArea, CampoDePesquisa.getText());
    }//GEN-LAST:event_BotaoPesquisarActionPerformed

    class myHighligher extends DefaultHighlighter.DefaultHighlightPainter {

        public myHighligher(Color color) {
            super(color);
        }

    }

    DefaultHighlighter.HighlightPainter highligther = new myHighligher(Color.yellow);

    public void removeHighLight(JTextComponent textComp) {
        Highlighter removeHighlighter = textComp.getHighlighter();
        Highlighter.Highlight[] remove = removeHighlighter.getHighlights();

        for (int i = 0; i < remove.length; i++) {
            if (remove[i].getPainter() instanceof myHighligher) {
                removeHighlighter.removeHighlight(remove[i]);
            }
        }
    }

    public void searchTextArea(JTextComponent textComp, String textString) {
        
        removeHighLight(textComp);

        try {
            Highlighter highligth = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0, doc.getLength());

            int pos = 0;

            while ((pos = text.toUpperCase().indexOf(textString.toUpperCase(), pos)) >= 0) {
                highligth.addHighlight(pos, pos + textString.length(), highligther);
                pos += textString.length();
            }
        } catch (Exception e) {
            System.out.println("Search Fail.");
        }

    }
    private void NovoArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoArquivoActionPerformed
        TextArea.setText("");
        setTitle(filename);  //"filename" é a variável que vai receber o nome do arquivo para mostrar onde é necessário. Instanciado no início.
    }//GEN-LAST:event_NovoArquivoActionPerformed


    private void AbrirArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirArquivoActionPerformed
        FileDialog fileDialog = new FileDialog(BlocoDeNotasGUI.this, "Open file", FileDialog.LOAD);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile(); //aqui só vai setar o nome do arquivo na barra de cima.
            setTitle(filename);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));  //faz um buff para "criar uma cópia" do arquivo, assim não altera o arquivo original se não salvar.

            StringBuilder sb = new StringBuilder();

            String line = null;

            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
                TextArea.setText(sb.toString());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File Not Found");
            e.printStackTrace();

        }
    }//GEN-LAST:event_AbrirArquivoActionPerformed

    private void SalvarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarArquivoActionPerformed
        FileDialog fileDialog = new FileDialog(BlocoDeNotasGUI.this, "Save File", FileDialog.SAVE);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(TextArea.getText());
            setTitle(filename);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("File Not Found");
        }


    }//GEN-LAST:event_SalvarArquivoActionPerformed

    private void SairArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairArquivoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairArquivoActionPerformed

    private void CortarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CortarTextoActionPerformed
        String cutString = TextArea.getSelectedText();
        StringSelection cutSelection = new StringSelection(cutString);
        clipboard.setContents(cutSelection, cutSelection);
        TextArea.replaceRange("", TextArea.getSelectionStart(), TextArea.getSelectionEnd());

    }//GEN-LAST:event_CortarTextoActionPerformed

    private void CopiarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarTextoActionPerformed

        String CopyText = TextArea.getSelectedText();
        StringSelection copySelection = new StringSelection(CopyText);
        clipboard.setContents(copySelection, copySelection);

    }//GEN-LAST:event_CopiarTextoActionPerformed

    private void ColarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColarTextoActionPerformed
        try {
            Transferable ColarTexto = clipboard.getContents(BlocoDeNotasGUI.this);
            String sel = (String) ColarTexto.getTransferData(DataFlavor.stringFlavor);
            TextArea.replaceRange(sel, TextArea.getSelectionStart(), TextArea.getSelectionEnd());
        } catch (Exception e) {
            System.out.println("Didn't work.");
        }

    }//GEN-LAST:event_ColarTextoActionPerformed

    private void PesquisarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarTextoActionPerformed

//FAZER ELE ABRIR UMA JANELA PARA PESQUISA

    }//GEN-LAST:event_PesquisarTextoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(BlocoDeNotasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlocoDeNotasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlocoDeNotasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlocoDeNotasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlocoDeNotasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AbrirArquivo;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JTextField CampoDePesquisa;
    private javax.swing.JMenuItem ColarTexto;
    private javax.swing.JMenuItem CopiarTexto;
    private javax.swing.JMenuItem CortarTexto;
    private javax.swing.JMenuItem NovoArquivo;
    private javax.swing.JMenuItem PesquisarTexto;
    private javax.swing.JMenuItem SairArquivo;
    private javax.swing.JMenuItem SalvarArquivo;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
