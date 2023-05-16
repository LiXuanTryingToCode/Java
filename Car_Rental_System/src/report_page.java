package car_rental_system;
import static car_rental_system.DataIO.allCars;
import static car_rental_system.DataIO.allCustomers;
import static car_rental_system.DataIO.allPayments;

public class report_page extends javax.swing.JFrame {

    public report_page() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        receipt_area = new javax.swing.JTextArea();
        montly_sales = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        vehicle = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        jTextField1.setBackground(new java.awt.Color(153, 0, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Reports");
        jTextField1.setBorder(null);

        receipt_area.setColumns(20);
        receipt_area.setRows(5);
        jScrollPane2.setViewportView(receipt_area);

        montly_sales.setText("Montly Sales Report");
        montly_sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montly_salesActionPerformed(evt);
            }
        });

        customer.setText("Marketing Report");
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });

        vehicle.setText("Vehicle Report");
        vehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jButton2.setText("Return home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(306, 306, 306))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(montly_sales)
                        .addGap(37, 37, 37)
                        .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montly_sales)
                    .addComponent(customer)
                    .addComponent(vehicle))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void montly_salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montly_salesActionPerformed
        allPayments.clear();
        receipt_area.setText("0");
        receipt_area.setEditable(false);
        int count = 0;
        double sales = 0;
        int count_tng = 0;
        int count_card = 0;
        int count_online = 0;
        int count_grab = 0;
        int count_cash = 0;
        DataIO.readFromPaymentTextFile();
        for(Payment t : allPayments){           
            count = count + 1;
            sales = sales + t.getAmount();
            switch (t.getMethod()) {
                case "TnG E-Wallet":
                    count_tng = count_tng+1;
                    break;
                case "Debit/Credit Card":
                    count_card = count_card+1;
                    break;
                case "Online Banking":
                    count_online = count_online+1;
                    break;
                case "Grab Pay":
                    count_grab = count_grab + 1;
                    break;
                case "Cash on Delivery":
                    count_cash = count_cash + 1;
                    break;
                default:
                    break;
            }
        }
        
        receipt_area.setText("\n*****************************************Monthly Sales Report****************************************\n\n"
                    + "                                          Approved Bookings:   " +count+"\n\n"
                    + "                                          Total Sales Amount:   RM"+ sales+"\n\n"
                    + "                                          Total Customer using TnG E-Wallet make payment:   " + count_tng+ "\n\n"
                    + "                                          Total Customer using Debit/Credit Card make payment:   " + count_card+ "\n\n"
                    + "                                          Total Customer using Online Banking make payment:   " + count_online+ "\n\n"
                    + "                                          Total Customer using Grab Pay make payment:   " + count_grab + "\n\n"
                    + "                                          Total Customer using Cash on Delivery make payment:   " + count_cash+ "\n\n"        
                   
                    + "********************************************************************************************************" + "\n"
                    + "                                         Thank you for choosing us. Hope to see you again. ");
        customer.setEnabled(false);
        vehicle.setEnabled(false);
        montly_sales.setEnabled(false);
        allPayments.clear();
    }//GEN-LAST:event_montly_salesActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        allCustomers.clear();
        receipt_area.setText(" ");
        receipt_area.setEditable(false);
        DataIO.readFromTextFile();
        int count_M = 0 ;
        int count_FM = 0 ;
        int count_agebelow = 0 ;
        int count_ageabove = 0 ;
        int total_member = 0;
        for(Customer t : allCustomers){
            total_member = total_member + 1; 
            if(t.getGender().equals("M")){
                count_M = count_M + 1; 
            }else if (t.getGender().equals("FM")){
                count_FM = count_FM + 1;
            }else if (t.getAge() < 30){
                count_agebelow = count_agebelow + 1;
            }else if (t.getAge() > 30){
                count_ageabove = count_ageabove + 1;
            }     
        }
//        int count = 0;
//        for(Booking o : allBookings){
//            count = allBookings.stream().filter(x->x.equals(o.getRentee().getUsername())).count();
//            
//            
//        }
//        System.out.println(count);
        receipt_area.setText("\n*****************************************Marketing Report******************************************\n\n"
                    + "                                          Current Total Members:   " + total_member +"\n\n"
                    + "                                          Number of Male Member:   "+ count_M +"\n\n"
                    + "                                          Number of Female Member:   " + count_FM + "\n\n"
                    + "                                          Number of Member that below age 30:   " + count_agebelow + "\n\n"
                    + "                                          Number of Member that above age 30:   " + count_ageabove + "\n\n"  
                   
                    + "********************************************************************************************************" + "\n"
                    + "                                         Thank you for choosing us. Hope to see you again. ");
        
        customer.setEnabled(false);
        vehicle.setEnabled(false);
        montly_sales.setEnabled(false);
        allCustomers.clear();
    }//GEN-LAST:event_customerActionPerformed

    private void vehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleActionPerformed
        allCars.clear();
        receipt_area.setEditable(false);
        int car_num = 0;
        int current_using = 0;
        int current_avai = 0;
        int below5000 = 0;
        int above5000 = 0 ;
        DataIO.readFromCarTextFile();
        for(Car i : allCars){
            
            car_num = car_num + 1; 
            if(i.getStatus().equals("Booked")){
                 current_using =  current_using + 1; 
            }else if (i.getStatus().equals("Available")){
                current_avai = current_avai + 1;
            }else if (i.getCost() < 5000){
                below5000 = below5000 + 1;
            }else if (i.getCost() > 5000){
                above5000 = above5000 + 1;
            }     
        }
        receipt_area.setText("\n*****************************************Vehicles Report******************************************\n\n"
                    + "                                          Total Number of Vehicles:   " + car_num +"\n\n"
                    + "                                          Current Booked Vehicles:   "+ current_using+"\n\n"
                    + "                                          Current Available Vehicles:   " + current_avai + "\n\n"
                    + "                                          Vehicles that Rent Amount Below RM5000:   " + below5000 + "\n\n"
                    + "                                          Vehicles that Rent Amount Above RM5000:   " + above5000 + "\n\n"  
                   
                    + "********************************************************************************************************" + "\n"
                    + "                                         Thank you for choosing us. Hope to see you again. ");
        customer.setEnabled(false);
        vehicle.setEnabled(false);
        montly_sales.setEnabled(false);
        allCars.clear();
    }//GEN-LAST:event_vehicleActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        customer.setEnabled(true);
        vehicle.setEnabled(true);
        montly_sales.setEnabled(true);
        receipt_area.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton customer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton montly_sales;
    private javax.swing.JTextArea receipt_area;
    private javax.swing.JButton vehicle;
    // End of variables declaration//GEN-END:variables
}
