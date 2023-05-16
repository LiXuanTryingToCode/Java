
package car_rental_system;

import static car_rental_system.DataIO.allCars;
import com.sun.jdi.connect.spi.Connection;
import java.awt.event.KeyEvent;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ManageCar extends javax.swing.JFrame {
    
    public ManageCar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cost1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        searchbox1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        showCar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        updateidbox = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        addplatenumbox = new javax.swing.JTextField();
        addbrandbox = new javax.swing.JTextField();
        addcostbox = new javax.swing.JTextField();
        addtype = new javax.swing.JComboBox<>();
        searchbox = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        addidbox = new javax.swing.JTextField();
        updateplatenumbox = new javax.swing.JTextField();
        updatebrandbox = new javax.swing.JTextField();
        updatetypebox = new javax.swing.JComboBox<>();
        updatepricebox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        addStatusBox = new javax.swing.JComboBox<>();
        updatestatusbox = new javax.swing.JComboBox<>();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Car Management");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add new car");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Car Management");

        showCar.setText("Show all cars");
        showCar.setToolTipText("");
        showCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCarActionPerformed(evt);
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

        updateidbox.setText("CarID..");
        updateidbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                updateidboxFocusGained(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        addplatenumbox.setText("Plate Number..");
        addplatenumbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addplatenumboxFocusGained(evt);
            }
        });
        addplatenumbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addplatenumboxKeyReleased(evt);
            }
        });

        addbrandbox.setText("Brand..");
        addbrandbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addbrandboxFocusGained(evt);
            }
        });

        addcostbox.setText("Price..");
        addcostbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addcostboxFocusGained(evt);
            }
        });
        addcostbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcostboxActionPerformed(evt);
            }
        });
        addcostbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addcostboxKeyPressed(evt);
            }
        });

        addtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Hatchback", "SUV" }));
        addtype.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addtypeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addtypeFocusLost(evt);
            }
        });

        searchbox.setText("Search...");
        searchbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchboxFocusGained(evt);
            }
        });
        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });

        addidbox.setText("Car ID..");
        addidbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addidboxFocusGained(evt);
            }
        });

        updateplatenumbox.setText("Plate Number");
        updateplatenumbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                updateplatenumboxFocusGained(evt);
            }
        });
        updateplatenumbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                updateplatenumboxKeyReleased(evt);
            }
        });

        updatebrandbox.setText("Brand..");
        updatebrandbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                updatebrandboxFocusGained(evt);
            }
        });

        updatetypebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Hatchback", "SUV" }));

        updatepricebox.setText("Price..");
        updatepricebox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                updatepriceboxFocusGained(evt);
            }
        });
        updatepricebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                updatepriceboxKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Update Car");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Add new car");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        HomeButton.setText("Return Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        addStatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable", "Maintenance" }));

        updatestatusbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable", "Maintenace" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addtype, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeButton))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addStatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addplatenumbox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addbrandbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addcostbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatetypebox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(updateidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(updatestatusbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(updateplatenumbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(updatepricebox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(updatebrandbox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGap(114, 114, 114))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(showCar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addComponent(jLabel6)
                    .addContainerGap(604, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(HomeButton)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete)
                            .addComponent(showCar))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addplatenumbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addbrandbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addcostbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addStatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(add)
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateplatenumbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebrandbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updatetypebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatestatusbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatepricebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(update)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(439, Short.MAX_VALUE)))
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
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCarActionPerformed
        String[] carcol = {"Car ID","Plate Number","Brand","Type","Status","Price"};
        String filePath = "car.txt";
        File file = new File(filePath);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            FileReader fr = new FileReader("car.txt");
            DefaultTableModel model = (DefaultTableModel)dataTable.getModel();
            model.setRowCount(0);
            model.setColumnIdentifiers(carcol);
            
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
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Invalid Input.");
        }
    }//GEN-LAST:event_showCarActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel tb = (DefaultTableModel)dataTable.getModel();
        int selectRowIndex = dataTable.getSelectedRow();
        String no = tb.getValueAt(selectRowIndex, 0).toString();
        
        
        if(dataTable.getSelectedRowCount()== 1){
            tb.removeRow(dataTable.getSelectedRow());
            try{
                DataIO.deleteCar(no);
                DataIO.writeToTextCarFile();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Delete Error");
            }
        }
        if(dataTable.getSelectedRowCount()>1 ){
            JOptionPane.showMessageDialog(null,"Please select single row for delete");
        }
        
        updateidbox.setText("");
        updateplatenumbox.setText("");
        updatebrandbox.setText("");
        updatepricebox.setText("");
        
    }//GEN-LAST:event_deleteActionPerformed

    private void addidboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addidboxFocusGained
        addidbox.setText("");
    }//GEN-LAST:event_addidboxFocusGained

    private void addplatenumboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addplatenumboxFocusGained
        addplatenumbox.setText("");
    }//GEN-LAST:event_addplatenumboxFocusGained

    private void addbrandboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addbrandboxFocusGained
        addbrandbox.setText("");
    }//GEN-LAST:event_addbrandboxFocusGained

    private void addtypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addtypeFocusGained

    }//GEN-LAST:event_addtypeFocusGained

    private void addtypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addtypeFocusLost

    }//GEN-LAST:event_addtypeFocusLost

    private void addcostboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addcostboxFocusGained
        addcostbox.setText("");
    }//GEN-LAST:event_addcostboxFocusGained

    private void updateidboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_updateidboxFocusGained
        updateidbox.setText("");
    }//GEN-LAST:event_updateidboxFocusGained

    private void updateplatenumboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_updateplatenumboxFocusGained
        updateplatenumbox.setText("");
    }//GEN-LAST:event_updateplatenumboxFocusGained

    private void updatebrandboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_updatebrandboxFocusGained
        updatebrandbox.setText("");
    }//GEN-LAST:event_updatebrandboxFocusGained

    private void updatepriceboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_updatepriceboxFocusGained
        updatepricebox.setText("");
    }//GEN-LAST:event_updatepriceboxFocusGained

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
    }//GEN-LAST:event_searchboxActionPerformed
        
    public void search(String str){
        DefaultTableModel tb = (DefaultTableModel)dataTable.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tb);
        dataTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    } 
        
    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        String searchString = searchbox.getText();
        search(searchString);
    }//GEN-LAST:event_searchboxKeyReleased

    private void searchboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchboxFocusGained
        searchbox.setText("");
    }//GEN-LAST:event_searchboxFocusGained

    private void addcostboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcostboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addcostboxActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String no = updateidbox.getText();
        String pn = updateplatenumbox.getText();
        String br = updatebrandbox.getText();
        String ty = updatetypebox.getSelectedItem().toString();
        String st = updatestatusbox.getSelectedItem().toString();
        String c = updatepricebox.getText();

        try{
             if((no.isEmpty())== true){
                JOptionPane.showMessageDialog(null, "Car ID is empty!");
            }else if((pn.isEmpty())== true){
                JOptionPane.showMessageDialog(null, "Car plate number is empty!");
            }else if((br.isEmpty())== true){
                JOptionPane.showMessageDialog(null, "Car brand is empty!");
            }else if(c.length()<1){
                JOptionPane.showMessageDialog(null, "Price is empty!");
            }
            else{
                Car carToUpdate = new Car(no,pn,br,ty,st,Double.parseDouble(c));
                DataIO.updateCar(no,carToUpdate);
                DataIO.writeToTextCarFile();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Update Error!");
        }

        updateidbox.setText("");
        updateplatenumbox.setText("");
        updatebrandbox.setText("");
        updatepricebox.setText("");
    }//GEN-LAST:event_updateActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String no = addidbox.getText();
        String pn = addplatenumbox.getText();
        String br = addbrandbox.getText();
        String ty = addtype.getSelectedItem().toString();
        String st = addStatusBox.getSelectedItem().toString();
        String c = addcostbox.getText();
        
        try{
            Car found = Check.checkCarPlate(pn);
            Car idfound = DataIO.checkCarID(no);
            if(found != null){
                JOptionPane.showMessageDialog(null, "Plate number duplicated!");
            }else if(idfound != null){
                JOptionPane.showMessageDialog(null, "Car ID duplicated!");
            }else if((no.isEmpty())== true){
                JOptionPane.showMessageDialog(null, "Car ID is empty!");
            }else if((pn.isEmpty())== true){
                JOptionPane.showMessageDialog(null, "Car plate number is empty!");
            }else if((br.isEmpty())== true){
                JOptionPane.showMessageDialog(null, "Car brand is empty!");
            }else if(c.length()<1){
                JOptionPane.showMessageDialog(null, "Price is empty!");
            }
            else{
                Car car = new Car(no,pn,br,ty,st,Double.parseDouble(c));
                allCars.add(car);
                DataIO.writeToTextCarFile();
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Car unable to add.");
        }
        addidbox.setText("");
        addplatenumbox.setText("");
        addbrandbox.setText("");
        addcostbox.setText("");

    }//GEN-LAST:event_addActionPerformed

    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        DefaultTableModel tb = (DefaultTableModel)dataTable.getModel();
        int selectRowIndex = dataTable.getSelectedRow();
        
        String no = tb.getValueAt(selectRowIndex, 0).toString();
        String pn = tb.getValueAt(selectRowIndex, 1).toString();
        String br = tb.getValueAt(selectRowIndex, 2).toString();
        String ty = tb.getValueAt(selectRowIndex, 3).toString();
        String st = tb.getValueAt(selectRowIndex, 4).toString();
        String c = tb.getValueAt(selectRowIndex, 5).toString();
        //Put all selected row value into textfield
        updateidbox.setEditable(false);
        updateidbox.setText(no);
        updateplatenumbox.setText(pn);
        updatebrandbox.setText(br);
        updatetypebox.setSelectedItem(ty);
        updatestatusbox.setSelectedItem(st);
        updatepricebox.setText(c);
        
    }//GEN-LAST:event_dataTableMouseClicked

    private void addplatenumboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addplatenumboxKeyReleased
        addplatenumbox.setText(addplatenumbox.getText().toUpperCase());
    }//GEN-LAST:event_addplatenumboxKeyReleased

    private void updateplatenumboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateplatenumboxKeyReleased
        updateplatenumbox.setText(updateplatenumbox.getText().toUpperCase());
    }//GEN-LAST:event_updateplatenumboxKeyReleased

    private void addcostboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addcostboxKeyPressed
        String p = addcostbox.getText();
        int length = p.length();
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){//length not more than 9 digit
            if(length<10){
                addcostbox.setEditable(true);
                add.setEnabled(true);
            }
            else{
                addcostbox.setEditable(false);
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){//allow backspace & delete for editing
                addcostbox.setEditable(true);
            }
            else{
                addcostbox.setEditable(false);
            }
        } 
    }//GEN-LAST:event_addcostboxKeyPressed

    private void updatepriceboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updatepriceboxKeyPressed
        String p = updatepricebox.getText();
        int length = p.length();
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){ //length not more than 9 digit
            if(length<10){
                updatepricebox.setEditable(true);
            }
            else{
                updatepricebox.setEditable(false);
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){ //allow backspace & delete for editing
                updatepricebox.setEditable(true);
            }
            else{
                updatepricebox.setEditable(false);
            }
        }
    }//GEN-LAST:event_updatepriceboxKeyPressed

    
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
            java.util.logging.Logger.getLogger(ManageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton add;
    private javax.swing.JComboBox<String> addStatusBox;
    private javax.swing.JTextField addbrandbox;
    private javax.swing.JTextField addcostbox;
    private javax.swing.JTextField addidbox;
    private javax.swing.JTextField addplatenumbox;
    private javax.swing.JComboBox<String> addtype;
    private javax.swing.JTextField cost1;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTextField searchbox1;
    private javax.swing.JButton showCar;
    private javax.swing.JButton update;
    private javax.swing.JTextField updatebrandbox;
    private javax.swing.JTextField updateidbox;
    private javax.swing.JTextField updateplatenumbox;
    private javax.swing.JTextField updatepricebox;
    private javax.swing.JComboBox<String> updatestatusbox;
    private javax.swing.JComboBox<String> updatetypebox;
    // End of variables declaration//GEN-END:variables
}
