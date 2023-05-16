package car_rental_system;
import static car_rental_system.DataIO.allBookings;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class cancel_booking extends javax.swing.JFrame {


    public cancel_booking() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booking_table = new javax.swing.JTable();
        cancel_booking = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        booking_id = new javax.swing.JTextField();
        car_plate_number = new javax.swing.JTextField();
        rent_duration = new javax.swing.JTextField();
        show = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));
        jPanel2.setForeground(new java.awt.Color(153, 0, 51));

        booking_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Rent Duration", "Date", "Rent Start Date", "Status", "Username", "Car Plate Number"
            }
        ));
        booking_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booking_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booking_table);

        cancel_booking.setText("Cancel Booking");
        cancel_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_bookingActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(153, 0, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Cancel Booking");
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));

        jTextField2.setBackground(new java.awt.Color(153, 0, 51));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Booking ID:");
        jTextField2.setBorder(null);

        jTextField3.setBackground(new java.awt.Color(153, 0, 51));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Rent Duration:");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(153, 0, 51));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Plate Number:");
        jTextField4.setBorder(null);

        booking_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_idActionPerformed(evt);
            }
        });

        car_plate_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car_plate_numberActionPerformed(evt);
            }
        });

        rent_duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rent_durationActionPerformed(evt);
            }
        });

        show.setText("Show your bookings");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(booking_id)
                            .addComponent(rent_duration)
                            .addComponent(car_plate_number, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cancel_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booking_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rent_duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car_plate_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
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

    private void booking_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booking_tableMouseClicked
       DefaultTableModel model =(DefaultTableModel)booking_table.getModel();
       int selectedRowIndex = booking_table.getSelectedRow();
       booking_id.setText(model.getValueAt(selectedRowIndex, 0).toString());
       rent_duration.setText(model.getValueAt(selectedRowIndex, 1).toString());
       car_plate_number.setText(model.getValueAt(selectedRowIndex, 6).toString());
       
    }//GEN-LAST:event_booking_tableMouseClicked

    private void cancel_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_bookingActionPerformed
        try{
            String booking_id1 = booking_id.getText();
            String new_status = "Canceled";
            if (booking_id.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Invalid Input.\nChoose your booking from the booking list above");
            }
            for(Booking t : allBookings){
                if (booking_id1.equals(t.getBooking_id())){
                    Car found1 = Check.checkCarPlate(t.getCar().getPlate_number());
                    Customer found = Check.checkUsername(t.getRentee().getUsername());
                    Booking c = new Booking(t.getBooking_id(),t.getDuration(),t.getBooking_date(),t.getStart_time(),new_status,found,found1);
                    DataIO.allBookings.add(c);
                    DataIO.allBookings.remove(t);
                    DataIO.writeToTextBookingFile();
                    DataIO.sortFile();
                    JOptionPane.showMessageDialog(null,"Your booking of " + t.getCar().getPlate_number() + " has been canceled.\n"
                            + "Your refund will be received soon."); 
                    break;
                }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input.\nChoose your booking from the table above");
        }
        
        
        
    }//GEN-LAST:event_cancel_bookingActionPerformed

    private void booking_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booking_idActionPerformed

    private void car_plate_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_car_plate_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_car_plate_numberActionPerformed

    private void rent_durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rent_durationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rent_durationActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        String filePath = "C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\Car_Rental_System\\booking.txt";
        booking_id.setEditable(false);
        rent_duration.setEditable(false);
        car_plate_number.setEditable(false);
        jTextField1.setEditable(false);
        File file = new File(filePath);      
        try {
            Customer customer = Car_Rental_System.loginUser;
            BufferedReader br = new BufferedReader(new FileReader(file));
            FileReader fr = new FileReader("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\Car_Rental_System\\booking.txt");
            DefaultTableModel model = (DefaultTableModel)booking_table.getModel();
            model.setRowCount(0);
            
            Object[] tableLines = br.lines().toArray();
         
            for(int i = 0; i < tableLines.length; i++)
            {              
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                if (line.contains(customer.getUsername()) && (line.contains("Approved") || line.contains("Pending")))
                {
                    model.addRow(dataRow);

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Invalid Input.");        
        }                                                                                   
    }//GEN-LAST:event_showActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
       dispose();
    }//GEN-LAST:event_CancelActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cancel_booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField booking_id;
    private javax.swing.JTable booking_table;
    private javax.swing.JButton cancel_booking;
    private javax.swing.JTextField car_plate_number;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField rent_duration;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}
