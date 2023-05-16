package car_rental_system;
import static car_rental_system.DataIO.allCars;
import static car_rental_system.DataIO.allPayments;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
import java.util.Collections;

public class Payment_Page extends javax.swing.JFrame {

    /**
     * Creates new form Payment_Page
     */
    public Payment_Page() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        payable_balance = new javax.swing.JTextField();
        input_object = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Fix_plate = new javax.swing.JTextField();
        fix_amount = new javax.swing.JTextField();
        fix_brand = new javax.swing.JTextField();
        checkout = new javax.swing.JButton();
        input_amount = new javax.swing.JTextField();
        payment_method = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));
        jPanel2.setForeground(new java.awt.Color(153, 0, 51));

        jTextField1.setBackground(new java.awt.Color(153, 0, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Car Booking");
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));

        jTextField2.setBackground(new java.awt.Color(153, 0, 51));
        jTextField2.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Rental Payment ");
        jTextField2.setBorder(null);

        jTextField9.setBackground(new java.awt.Color(153, 0, 51));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setText("Payable Amount:");
        jTextField9.setBorder(null);

        payable_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payable_balanceActionPerformed(evt);
            }
        });

        input_object.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        input_object.setText("Confirm Car");
        input_object.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_objectActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.setText("Car Plate Number: ");
        jTextField4.setBorder(null);

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField5.setText("Car Brand:");
        jTextField5.setBorder(null);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setText("Amount");
        jTextField3.setBorder(null);

        Fix_plate.setText("------------------");
        Fix_plate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fix_plateActionPerformed(evt);
            }
        });

        fix_amount.setText("---------------------");
        fix_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fix_amountActionPerformed(evt);
            }
        });

        fix_brand.setText("-------------------");
        fix_brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fix_brandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(Fix_plate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fix_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(fix_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fix_plate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fix_brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fix_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        checkout.setText("CheckOut");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        input_amount.setText("Input Renting Amount Here...");
        input_amount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        input_amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_amountFocusGained(evt);
            }
        });
        input_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_amountActionPerformed(evt);
            }
        });

        payment_method.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DebitCredit Card", "Online Banking", "TnG E-Wallet", "Grab Pay", "Cash on Delivery" }));
        payment_method.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_methodActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(153, 0, 51));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("Payment Method:");
        jTextField6.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(input_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(input_object, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(payment_method, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(payable_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(input_object)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payable_balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payment_method, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(input_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Fix_plateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fix_plateActionPerformed

    }//GEN-LAST:event_Fix_plateActionPerformed

    private void fix_brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fix_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fix_brandActionPerformed

    private void fix_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fix_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fix_amountActionPerformed

    private void payable_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payable_balanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payable_balanceActionPerformed

    private void input_objectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_objectActionPerformed
        String plate_number = JOptionPane.showInputDialog("Enter the Car Plate Number:");
        Car found = Check.checkCarPlate(plate_number);
        if (found != null){
            Fix_plate.setText(found.getPlate_number());
            fix_brand.setText(found.getCar_brand());
            fix_amount.setText(Double.toString(found.getCost()));
            payable_balance.setText(Double.toString(found.getCost()));
            
            Fix_plate.setEditable(false);
            fix_brand.setEditable(false);
            fix_amount.setEditable(false);
        }else{
            JOptionPane.showMessageDialog(null,"Invalid Car Plate Number\nPlease refer to car available list.");
        }
    }//GEN-LAST:event_input_objectActionPerformed

    private void input_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_amountActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        double input_value = Double.parseDouble(input_amount.getText());
        double payable = Double.parseDouble(payable_balance.getText());
        try{
            if(input_value == payable){
                String new_status = "Booked";
                int new_id = DataIO.createNewBookingID();
                String str_new_id = Integer.toString(new_id);    
                int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter your Renting Duration:"));
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
                LocalDateTime now = LocalDateTime.now();  
                String booking_date = (dtf.format(now));  
                
                String start_date = JOptionPane.showInputDialog("Enter your Start Renting Date (yyyy-mm-dd):");
                while (DataIO.validateJavaDate(start_date) == false){                                                   //validation of date
                    String start_date1 = JOptionPane.showInputDialog("Invalid Date Format\nEnter again your Start Renting Date (yyyy-mm-dd):");
                    start_date = start_date1;                   
                }

                String status = "Pending";                  
                Car found = Check.checkCarPlate(Fix_plate.getText());
//                Scanner s2 = new Scanner(new File("car.txt"));
                String a = found.getCar_ID();
                String pn = found.getPlate_number();
                String c = found.getCar_brand();                                                                //to modify the status of car
                String d = found.getCar_type();
                double e = found.getCost();
                Car o = new Car(a,pn,c,d,new_status,e);
                allCars.add(o);             
                allCars.remove(found);            
                DataIO.writeToTextCarFile();          
                
                Customer customer = Car_Rental_System.loginUser;                                                //add new pending booking to the txt
                Booking b = new Booking(str_new_id,duration,booking_date,start_date,status,customer,o);
                DataIO.allBookings.add(b);                                                                      
                DataIO.writeToTextBookingFile();              
                int new_p_id = DataIO.createNewPaymentID();
                String method = payment_method.getSelectedItem().toString();
                
                double amount = Double.parseDouble(fix_amount.getText());
                
                String str_new_p_id = Integer.toString(new_p_id);  
                
                Payment t = new Payment(str_new_p_id,amount,method,booking_date,customer);      //add new payment to the txt
 
                allPayments.add(t);
                DataIO.writeToTextPaymentFile();
                
                JOptionPane.showMessageDialog(null,"Rental Payment Done! Thank you for renting from us!\nYour request was sent to admin for approval.");
                DataIO.sortCarFile();
                dispose();
                

        }else if(input_value < payable){
            double difference = payable - input_value;
            payable_balance.setText(Double.toString(difference));
        }else if(input_value > payable){
            JOptionPane.showMessageDialog(null,"Invalid Input.");
        }
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input.");
        }        
    }//GEN-LAST:event_checkoutActionPerformed

    private void payment_methodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_methodActionPerformed

    }//GEN-LAST:event_payment_methodActionPerformed

    private void input_amountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_amountFocusGained
        input_amount.setText("");
    }//GEN-LAST:event_input_amountFocusGained


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fix_plate;
    private javax.swing.JButton checkout;
    private javax.swing.JTextField fix_amount;
    private javax.swing.JTextField fix_brand;
    private javax.swing.JTextField input_amount;
    private javax.swing.JButton input_object;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField payable_balance;
    private javax.swing.JComboBox<String> payment_method;
    // End of variables declaration//GEN-END:variables
}
