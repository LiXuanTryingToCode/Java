

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package car_rental_system;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Option_Page extends javax.swing.JFrame {

    public Option_Page() {
        initComponents();
    }
    
    public static Booking_Page page3;
    public static Digital_Receipt page4;
    public static Checking_Page page5;
    public static Feedback_Submit page6;
    public static cancel_booking page7;
    public static Return_Car page8;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        check_booking = new javax.swing.JButton();
        check_receipt = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        feedback = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        renting = new javax.swing.JButton();
        cancel_booking = new javax.swing.JButton();
        Return = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        update.setText("Update Information");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        check_booking.setText("Check Booking");
        check_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_bookingActionPerformed(evt);
            }
        });

        check_receipt.setText("Check Receipt");
        check_receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_receiptActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(153, 0, 51));
        jTextField1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("CAR RENTAL SYSTEM");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        feedback.setText("Submit Feedback");
        feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        renting.setText("Rent a Car");
        renting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentingActionPerformed(evt);
            }
        });

        cancel_booking.setText("Cancel Booking");
        cancel_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_bookingActionPerformed(evt);
            }
        });

        Return.setText("Return Car");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check_receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(renting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(check_booking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancel_booking, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(cancel)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(renting, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(check_receipt, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(cancel_booking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancel)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void check_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_bookingActionPerformed
        page5 = new Checking_Page();
        page5.setVisible(true);
    }//GEN-LAST:event_check_bookingActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{
            String input =JOptionPane.showInputDialog("Enter your current username");
                       
                Customer found = Check.checkUsername(input);
                if(found != null){ //got that username
                    int password = Integer.parseInt(JOptionPane.showInputDialog("Enter your current password:"));
                    if(password == found.getPassword()){
                        Car_Rental_System.loginUser = found;
                        String h = found.getUsername();
                        int a = found.getPassword();
                        String b = found.getIc();
                        String i = found.getPhone_num();
                        int d = found.getAge();
                        String e = found.getGender();
                        String f = found.getEmail();
                        String g = found.getAddress();
                        int option = Integer.parseInt(JOptionPane.showInputDialog("Please enter Information that you want to modify:\n(1) Username\n(2) Password\n(3) IC Number\n(4) Phone Number\n(5) Age\n(6) Gender\n (7)Email\n(8) Address"));
                        switch (option) {
                            case 1:
                                {
                                    String new_input = JOptionPane.showInputDialog("Enter your new username: ");
                                    Customer c = new Customer(new_input,a,b,i,d,e,f,g,null);
                                    DataIO.allCustomers.add(c);
                                    DataIO.allCustomers.remove(found);
                                    DataIO.writeToTextFile();
                                    JOptionPane.showMessageDialog(null,"Username Updated Successfully.");
                                    break;
                                }
                            case 2:
                                {
                                    int new_password = Integer.parseInt(JOptionPane.showInputDialog("Enter your new password: "));
                                    while (new_password < 6){                                                   //validation of date
                                        int password1 = Integer.parseInt(JOptionPane.showInputDialog("Password length must be 6 or above\nEnter your IC Number:"));
                                        new_password = password1;
                                    }       Customer c = new Customer(h,new_password,b,i,d,e,f,g,null);
                                    DataIO.allCustomers.add(c);
                                    DataIO.allCustomers.remove(found);
                                    DataIO.writeToTextFile();
                                    JOptionPane.showMessageDialog(null,"Password Updated Successfully.");
                                    break;
                                }
                            case 3:
                                {
                                    String new_IC = JOptionPane.showInputDialog("Enter your new IC number: ");
                                    while (new_IC.length() != 12){                                                   //validation of date
                                        String ic1 = (JOptionPane.showInputDialog("IC format must be 12-digits.\nEnter your IC Number:"));
                                        new_IC = ic1;
                                    }       Customer c = new Customer(h,a,new_IC,i,d,e,f,g,null);
                                    DataIO.allCustomers.add(c);
                                    DataIO.allCustomers.remove(found);
                                    DataIO.writeToTextFile();
                                    JOptionPane.showMessageDialog(null,"IC Number Updated Successfully.");
                                    break;
                                }
                            case 4:
                                {
                                    String new_pnumber = JOptionPane.showInputDialog("Enter your new phone number: ");
                                    while (new_pnumber.length() != 10){                                                   //validation of date
                                        String phone_num1 = (JOptionPane.showInputDialog("Phone Number format must be 10-digits.\nEnter your Phone Number:"));
                                        new_pnumber = phone_num1;
                                    }       Customer c = new Customer(h,a,b,new_pnumber,d,e,f,g,null);
                                    DataIO.allCustomers.add(c);
                                    DataIO.allCustomers.remove(found);
                                    DataIO.writeToTextFile();
                                    JOptionPane.showMessageDialog(null,"Phone Number Updated Successfully.");
                                    break;
                                }
                            case 5:
                                {
                                    int new_age = Integer.parseInt(JOptionPane.showInputDialog("Enter your correct Age: "));
                                    while (new_age < 18){                                                   //validation of date
                                        int age1 = Integer.parseInt(JOptionPane.showInputDialog("Age under 18 can't perform car rental.\nEnter your age:"));
                                        new_age = age1;
                                    }       Customer c = new Customer(h,a,b,i, new_age,e,f,g,null);
                                    DataIO.allCustomers.add(c);
                                    DataIO.allCustomers.remove(found);
                                    DataIO.writeToTextFile();
                                    JOptionPane.showMessageDialog(null,"Age Updated Successfully.");
                                    break;
                                }
                            case 6:
                                {
                                    String new_gender = JOptionPane.showInputDialog("Enter your gender(M/FM): ");
                                    while (("FM".equals(new_gender) == false) && ("M".equals(new_gender) == false)){                                                   //validation of date
                                        String gender1 = (JOptionPane.showInputDialog("Enter M or FM.\nEnter your Gender(M/FM):"));
                                        new_gender = gender1;
                                    }       Customer c = new Customer(h,a,b,i, d,new_gender,f,g,null);
                                    DataIO.allCustomers.add(c);
                                    DataIO.allCustomers.remove(found);
                                    DataIO.writeToTextFile();
                                    JOptionPane.showMessageDialog(null,"Gender Updated Successfully.");
                                    break;
                                }
                            case 7:
                                {
                                    String new_email= JOptionPane.showInputDialog("Enter your new email (xxx@gmail.com): ");
                                    while (!new_email.contains("@gmail.com")){                                                   //validation of date
                                        String email1 = (JOptionPane.showInputDialog("Email format must contains @gmail.com\nEnter your Email (xxx@gmail.com):"));
                                        new_email = email1;
                                    }       Customer c = new Customer(h,a,b,i, d,e,new_email,g,null);
                                    DataIO.allCustomers.add(c);
                                    DataIO.allCustomers.remove(found);
                                    DataIO.writeToTextFile();
                                    JOptionPane.showMessageDialog(null,"Email Address Updated Successfully.");
                                    break;
                                }
                            case 8:
                                {
                                    String new_address= JOptionPane.showInputDialog("Enter your new address: ");
                                    while (new_address == null){                                                   //validation of date
                                        String address1 = (JOptionPane.showInputDialog("Invalid Input.\nEnter your Home Address:"));
                                        new_address = address1;                   
                                    }
                                    Customer c = new Customer(h,a,b,i, d,e,f,new_address,null);
                                    DataIO.allCustomers.add(c);
                                    DataIO.allCustomers.remove(found);
                                    DataIO.writeToTextFile();
                                    JOptionPane.showMessageDialog(null,"Address Updated Successfully.");
                                    break;
                                }
                            default:
                                break;
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Incorrect Password. Try Again.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Username doesn't exist. Try Again.");
                }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input.");
            } 
    }//GEN-LAST:event_updateActionPerformed

    private void check_receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_receiptActionPerformed
        page4 = new Digital_Receipt();
        page4.setVisible(true);

               
    }//GEN-LAST:event_check_receiptActionPerformed

    private void feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackActionPerformed
        page6 = new Feedback_Submit();
        page6.setVisible(true);
    }//GEN-LAST:event_feedbackActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void rentingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentingActionPerformed
        page3 = new Booking_Page();
        page3.setVisible(true);
    }//GEN-LAST:event_rentingActionPerformed

    private void cancel_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_bookingActionPerformed
        page7 = new cancel_booking();
        page7.setVisible(true);
    }//GEN-LAST:event_cancel_bookingActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        page8 = new Return_Car();
        page8.setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Return;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cancel_booking;
    private javax.swing.JButton check_booking;
    private javax.swing.JButton check_receipt;
    private javax.swing.JButton feedback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton renting;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
