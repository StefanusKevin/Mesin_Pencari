/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_document;

import Model.InvertedIndex;
import Model.SearchingResult;
import Model.TableModelDokumen;
import View.Input;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
//import Model.*;

/**
 *
 * @author admin
 */
public class Search extends javax.swing.JFrame {

    TableModelDokumen Model;
    InvertedIndex Index;

    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
        positionFrame();
        Index = new InvertedIndex();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchLabel = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        ClearButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Input_MenuItem = new javax.swing.JMenuItem();
        Add_MenuItem = new javax.swing.JMenuItem();
        Close_MenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchLabel.setText("Masukan Kata");

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Doc","Content","similarity"
            }
        ));
        jScrollPane1.setViewportView(Table);

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("MESIN PENCARI UNDANG - UNDANG MENGENAI PERUSAHAAN");

        jMenu1.setText("File");

        Input_MenuItem.setText("Input_Document");
        Input_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(Input_MenuItem);

        Add_MenuItem.setText("Add_Document");
        Add_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(Add_MenuItem);

        Close_MenuItem.setText("Close");
        Close_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(Close_MenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SearchLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchLabel)
                    .addComponent(SearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClearButton)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed

        searching(Index);

//        index.makeDictionaryWithTermNumber();
//        ArrayList<SearchingResult> cari = index.searchCosineSimilarity(SearchField.getText());
//        SearchField.setText("");
//        DefaultTableModel model = (DefaultTableModel) Table.getModel();
//        int baris = model.getRowCount();
//        for (int i = 0; i < baris; i++) {
//            model.removeRow(0);
//        }
//
//        for (int i = 0; i < cari.size(); i++) {
//
//            Object[] item = {cari.get(i).getDocument().getId(), cari.get(i).getDocument().getContent(), cari.get(i).getSimilarity()};
//            model.addRow(item);
//
//        }

    }//GEN-LAST:event_SearchButtonActionPerformed

     private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
         this.dispose(); // exit frame/dialog
    }//GEN-LAST:event_closeButtonActionPerformed

    private void Input_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_MenuItemActionPerformed
        new Input(this, rootPaneCheckingEnabled, Index).show();
//        Input dialog = new Input(this, true, index);
//        dialog.setVisible(true);
    }//GEN-LAST:event_Input_MenuItemActionPerformed

    private void Add_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_MenuItemActionPerformed
        addDocument();

    }//GEN-LAST:event_Add_MenuItemActionPerformed

    private void Close_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_MenuItemActionPerformed
        this.dispose();
    }//GEN-LAST:event_Close_MenuItemActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed

        DefaultTableModel model = new DefaultTableModel();
        Table.setModel(model);
        
    }//GEN-LAST:event_ClearButtonActionPerformed
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        new Input(this, rootPaneCheckingEnabled, Index).show();
    }

    public void addDocument() {
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File dir = fc.getSelectedFile();
            Index.readDirectory(dir);
        }
//
//        ArrayList<Document> listDoc = index.getListOfDocument();
//        for (int i = 0; i < listDoc.size(); i++) {
//            Document doc = listDoc.get(i);
//            System.out.println("Content : " + doc.getId());
//            System.out.println(doc.getContent());
//        }
//        index.makeDictionaryWithTermNumber();
    }

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Add_MenuItem;
    private javax.swing.JToggleButton ClearButton;
    private javax.swing.JMenuItem Close_MenuItem;
    private javax.swing.JMenuItem Input_MenuItem;
    private javax.swing.JToggleButton SearchButton;
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
public void positionFrame() {
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);
    }

    public void loadData() {
        File dir = new File("D:\\Mesin_Pencari\\Mesin\\Dokumen");
        Index.readDirectory(dir);
    }

    public void searching(InvertedIndex idx) {
        Index = idx;
        String query = SearchField.getText();
        ArrayList<SearchingResult> hasilCari = Index.searchCosineSimilarity(query);
        System.out.println(hasilCari.size());
        Model = new TableModelDokumen(hasilCari);
        Table.setModel(Model);
    }

}
