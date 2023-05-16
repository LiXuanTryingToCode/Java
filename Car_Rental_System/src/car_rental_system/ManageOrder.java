
package car_rental_system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class ManageOrder extends javax.swing.JFrame {
    String[] bookcol = {"BookingID","Duration","Booking Date","Start Time","Status","CustomerID","Car"};
    String[] paycol = {"Payment ID","Amount","Payment method","Date","Customer ID"};
    public ManageOrder() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sortA = new javax.swing.JButton();
        sortP = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        showBooking = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        searchbox = new javax.swing.JTextField();
        HomeButton = new javax.swing.JButton();
        approve = new javax.swing.JButton();
        reject = new javax.swing.JButton();
        showPayment = new javax.swing.JButton();
        filterbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        sortA.setText("Show Approved");
        sortA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortAActionPerformed(evt);
            }
        });

        sortP.setText("Show Pending");
        sortP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortPActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Booking Management");

        showBooking.setText("Show bookings");
        showBooking.setToolTipText("");
        showBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBookingActionPerformed(evt);
            }
        });

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(dataTable);

        searchbox.setText("Search...");
        searchbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchboxFocusGained(evt);
            }
        });
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });

        HomeButton.setText("Return Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        approve.setText("Approve");
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });

        reject.setText("Reject");
        reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectActionPerformed(evt);
            }
        });

        showPayment.setText("Show payments");
        showPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPaymentActionPerformed(evt);
            }
        });

        filterbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Rejected", "Completed", "Pending" }));
        filterbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterboxItemStateChanged(evt);
            }
        });

        jLabel1.setText("Filter by:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(HomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(290, 290, 290))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(showBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(reject, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(HomeButton))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(showPayment)
                        .addGap(62, 62, 62)
                        .addComponent(showBooking)
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(filterbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approve)
                    .addComponent(reject)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    public void search(String str){
        DefaultTableModel tb = (DefaultTableModel)dataTable.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tb);
        dataTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    private void showBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBookingActionPerformed
        String filePath = "booking.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            FileReader fr = new FileReader("booking.txt");
            DefaultTableModel model = (DefaultTableModel)dataTable.getModel();
            model.setRowCount(0);
            model.setColumnIdentifiers(bookcol);

            // get lines from txt file
            Object[] tableLines = br.lines().toArray();

            // extratct data from lines
            // set data to jtable model
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }
            
            approve.setEnabled(true);
            reject.setEnabled(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Invalid Input.");
        }
        
        String[] filb = {"Approved", "Rejected", "Pending", "Completed"};
        final DefaultComboBoxModel model = new DefaultComboBoxModel(filb); 
        filterbox.setModel(model);
    }//GEN-LAST:event_showBookingActionPerformed

    private void searchboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchboxFocusGained
        searchbox.setText("");
    }//GEN-LAST:event_searchboxFocusGained

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        String searchString = searchbox.getText();
        search(searchString);
    }//GEN-LAST:event_searchboxKeyReleased

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        DefaultTableModel tb = (DefaultTableModel)dataTable.getModel();
        int selectRowIndex = dataTable.getSelectedRow();     
        String no = tb.getValueAt(selectRowIndex, 0).toString(); 
       
        try{
            DataIO.approveBooking(no);
            DataIO.writeToTextBookingFile();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Approve error!");
        }
    }//GEN-LAST:event_approveActionPerformed

    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
   
    }//GEN-LAST:event_dataTableMouseClicked

    private void rejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectActionPerformed
        DefaultTableModel tb = (DefaultTableModel)dataTable.getModel();
        int selectRowIndex = dataTable.getSelectedRow();     
        String no = tb.getValueAt(selectRowIndex, 0).toString(); 
        
        try{
            DataIO.rejectBooking(no);
            DataIO.writeToTextBookingFile();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cancel error!");
        }
    }//GEN-LAST:event_rejectActionPerformed

    private void sortAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAActionPerformed

    }//GEN-LAST:event_sortAActionPerformed

    private void sortPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortPActionPerformed

    }//GEN-LAST:event_sortPActionPerformed

    private void showPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPaymentActionPerformed
        String filePath = "payment.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            FileReader fr = new FileReader("payment.txt");
            DefaultTableModel model = (DefaultTableModel)dataTable.getModel();
            model.setRowCount(0);
            model.setColumnIdentifiers(paycol);

            // get lines from txt file
            Object[] tableLines = br.lines().toArray();

            // extratct data from lines
            // set data to jtable model
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }
           
            approve.setEnabled(false);
            reject.setEnabled(false);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Invalid Input.");
        }
        
        String[] filp = {"Grab Pay", "DebitCredit Card", "Pending", "Completed"};
        final DefaultComboBoxModel model = new DefaultComboBoxModel(filp); 
        filterbox.setModel(model);
    }//GEN-LAST:event_showPaymentActionPerformed

    private void filterboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterboxItemStateChanged
        String x = filterbox.getSelectedItem().toString();
        String filePath = "booking.txt";
        File file = new File(filePath);
        String filePath2 = "payment.txt";
        File file2 = new File(filePath2);
        DefaultTableModel model = (DefaultTableModel)dataTable.getModel();
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file2));
            BufferedReader br2 = new BufferedReader(new FileReader(file));
            // get lines from txt file
            Object[] tableLines = br.lines().toArray();
            Object[] tableLines2 = br2.lines().toArray();
            model.setRowCount(0);
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                
                if(line.contains(x)){
                    model.setColumnIdentifiers(paycol);
                    model.addRow(dataRow);
                }
            }
             for(int i = 0; i < tableLines2.length; i++)
            {
                String line2  = tableLines2[i].toString().trim();
                String[] dataRow2 = line2.split("/");
                
                if(line2.contains(x)){
                    model.setColumnIdentifiers(bookcol);
                    model.addRow(dataRow2);
                }
            }

            br2.close();
            br.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Filter error!");
        }
    }//GEN-LAST:event_filterboxItemStateChanged

    
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
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton approve;
    private javax.swing.JTable dataTable;
    private javax.swing.JComboBox<String> filterbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton reject;
    private javax.swing.JTextField searchbox;
    private javax.swing.JButton showBooking;
    private javax.swing.JButton showPayment;
    private javax.swing.JButton sortA;
    private javax.swing.JButton sortP;
    // End of variables declaration//GEN-END:variables
}
