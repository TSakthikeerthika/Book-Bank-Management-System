
package book_bank_mangt;

import java.sql.*;
import javax.swing.JOptionPane;

public class Search_book extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    
    public Search_book() {
        initComponents();
        con = DBconn.ConDB();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_search_book = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_book_name = new javax.swing.JTextField();
        txt_author = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_edition = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_book_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_search_book.setText("Search");
        btn_search_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_bookActionPerformed(evt);
            }
        });

        jLabel1.setText("Book Name");

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel2.setText("Author");

        jLabel3.setText("Book ID");

        jLabel4.setText("Edition");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Search Book");

        txt_book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_book_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addGap(56, 56, 56)
                .addComponent(btn_clear)
                .addGap(50, 50, 50)
                .addComponent(btn_search_book)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_edition, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_book_name)
                            .addComponent(txt_author)
                            .addComponent(txt_book_id, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_book_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_edition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_search_book)
                    .addComponent(btn_clear)
                    .addComponent(btn_back))
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_activity().setVisible(true);
            }
        });
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_book_id.setText("");
        txt_author.setText("");
        txt_edition.setText("");
        txt_book_name.setText("");
        
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_book_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_book_idActionPerformed

    private void btn_search_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_bookActionPerformed
        
        try{
            String sql = "SELECT * from book_table WHERE book_ID LIKE ? AND Book_name LIKE ? AND Author LIKE ? AND Edition LIKE ?;";
            
            
            pst = con.prepareStatement(sql);
            pst.setString(1,txt_book_id.getText());
            pst.setString(2, txt_book_name.getText());
            pst.setString(3, txt_author.getText());
            pst.setString(4, txt_edition.getText());
            
            rs = pst.executeQuery();
            if(rs.next()){
                System.out.println("Book search scessfully");
               
                String sql1 = "SELECT COUNT(*) AS Available_count FROM book_table WHERE book_ID LIKE ? AND Book_name LIKE ? AND Author LIKE ? AND Edition LIKE ? AND isAvailable = 1"; // Assuming 'isAvailable' column indicates availability
                PreparedStatement pst1 = con.prepareStatement(sql1);
                pst1.setString(1, txt_book_id.getText().trim());
                pst1.setString(2, txt_book_name.getText().trim());
                pst1.setString(3, txt_author.getText().trim());
                pst1.setString(4, txt_edition.getText().trim());

            // Execute the query to get the count of available books
                ResultSet rs1 = null;
                rs1 = pst1.executeQuery();
                if (rs1.next()) {
                    int availableCount = rs1.getInt("Available_count");
                    System.out.println("No. of available books: " + availableCount);
            }
                
        }
            else{
                JOptionPane.showMessageDialog(null, "Unable to Search! Please check the data entered.");
                txt_book_id.setText("");
                txt_book_name.setText("");
                txt_author.setText("");
                txt_edition.setText("");
            }

        }
        catch(Exception e){
            
        }    
    }//GEN-LAST:event_btn_search_bookActionPerformed

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
            java.util.logging.Logger.getLogger(Search_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_search_book;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_author;
    private javax.swing.JTextField txt_book_id;
    private javax.swing.JTextField txt_book_name;
    private javax.swing.JTextField txt_edition;
    // End of variables declaration//GEN-END:variables
}
