package car_rental_system;

import static car_rental_system.DataIO.allBookings;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;



public class Login1 extends javax.swing.JFrame {

    public Login1() {
        setVisible(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Registration = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Forgot = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        adminName = new javax.swing.JTextField();
        adminPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        signInButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setBackground(new java.awt.Color(102, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Car Rental System ");

        jLabel2.setBackground(new java.awt.Color(102, 0, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("(Visitors)");

        Registration.setText("Registration");
        Registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationActionPerformed(evt);
            }
        });

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Cancel.setText("Shut Down");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Forgot.setText("Forgot Password");
        Forgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Registration)
                        .addGap(75, 75, 75)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(Forgot, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Registration, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Forgot)
                .addGap(45, 45, 45))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));

        adminName.setBackground(new java.awt.Color(255, 102, 51));
        adminName.setForeground(new java.awt.Color(255, 255, 255));
        adminName.setText("Username");
        adminName.setBorder(null);
        adminName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adminNameFocusGained(evt);
            }
        });
        adminName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminNameActionPerformed(evt);
            }
        });

        adminPassword.setBackground(new java.awt.Color(255, 102, 51));
        adminPassword.setForeground(new java.awt.Color(255, 255, 255));
        adminPassword.setText("jPasswordField1");
        adminPassword.setBorder(null);
        adminPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adminPasswordFocusGained(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        signInButton.setBackground(new java.awt.Color(255, 102, 51));
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setText("Sign in");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 0, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Car Rental System ");

        jLabel4.setBackground(new java.awt.Color(102, 0, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(Admin)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(31, 31, 31))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(signInButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addComponent(adminName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(signInButton)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static Option_Page page2;
    public static Forgot_Password page10;
    public int clicked_count = 0;
    
    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        String password = adminPassword.getText();
        String username = adminName.getText();
        
        if (password.contains("123") && (username.contains("admin"))){
            adminName.setText(null);
            adminPassword.setText(null);
            systemExit();
            
            AdminHome_1 Info = new AdminHome_1();
            Info.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid login","Login error",JOptionPane.ERROR_MESSAGE);
            adminPassword.setText(null);
            adminName.setText(null);
        }
    }//GEN-LAST:event_signInButtonActionPerformed
    
    private void adminNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminNameActionPerformed
        
    }//GEN-LAST:event_adminNameActionPerformed

    private void adminNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminNameFocusGained
        adminName.setText("");
    }//GEN-LAST:event_adminNameFocusGained

    private void adminPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminPasswordFocusGained
        adminPassword.setText("");
    }//GEN-LAST:event_adminPasswordFocusGained

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        try{
            String input =JOptionPane.showInputDialog("Enter your username");      
                Customer found = Check.checkUsername(input);
                if(found != null){ //got that username
                    String password = (JOptionPane.showInputDialog("Enter your password:"));
//                    int password1 = (password);
                    if(password.equals(found.getTemp_pwd())){
                        Car_Rental_System.loginUser = found;
                        DataIO.sortFile();
                        page2 = new Option_Page();
                        page2.setVisible(true);
                        JOptionPane.showMessageDialog(null,"Your Password is: "+ found.getPassword()+ "\nPlease Keep In Mind");
                        for(Booking t : allBookings){
                            if(found.getUsername().equals(t.getRentee().getUsername())){
                                if(t.getStatus().equals("Approved")){
                                    JOptionPane.showMessageDialog(null,"Your Car Booking request: "+ t.getCar().getPlate_number() + "\nhas been approved\n"
                                            + "Please go to check your booking information.");
                                }else if(t.getStatus().equals("Pending")){
                                    JOptionPane.showMessageDialog(null,"Your Car Booking request: " + t.getCar().getPlate_number() + "\nis not yet approved by the Admin\n"
                                    + "Please be patience.");
                                }
                            }
                        }
                    }else if (Integer.parseInt(password) == found.getPassword() ){
                        Car_Rental_System.loginUser = found;
                        DataIO.sortFile();
                        page2 = new Option_Page();
                        page2.setVisible(true);                  
                        for(Booking t : allBookings){
                            if(found.getUsername().equals(t.getRentee().getUsername())){
                                if(t.getStatus().equals("Approved")){
                                    JOptionPane.showMessageDialog(null,"Your Car Booking request: "+ t.getCar().getPlate_number() + "\nhas been approved\n"
                                            + "Please go to check your booking information.");
                                }else if(t.getStatus().equals("Pending")){
                                    JOptionPane.showMessageDialog(null,"Your Car Booking request: " + t.getCar().getPlate_number() + "\nis not yet approved by the Admin\n"
                                    + "Please be patience.");
       
                                    /// cancel booking set status to canceled 
                                }
                            }
                        }
                    }    
                    else{        
                        clicked_count++;   
                        Customer found1 = Check.checkUsername(input);
                        JOptionPane.showMessageDialog(null,"Incorrect Password. Try Again.\nLogin Attempt: "+clicked_count+
                                " times (Only 5 times allow!)");
                        if (clicked_count > 5){
                            JOptionPane.showMessageDialog(null,"The login attempt exceed 5 times.");
                            blacklist.showblacklisted();
                            blacklist b = new blacklist(found1.getUsername(),found1.getPassword(),found1.getIc(),found1.getPhone_num(),found1.getAge(),found1.getGender(),found1.getEmail(),found1.getAddress(),found1.getTemp_pwd(),true);
                            DataIO.allCustomers.remove(found1);
                            DataIO.writeToTextFile();
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Username doesn't exist. Try Again.");
                }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input.");
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void RegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationActionPerformed
         try{
            String input = JOptionPane.showInputDialog("Enter username:");
                Customer found = Check.checkUsername(input);
                if(found == null){
                    int password = Integer.parseInt(JOptionPane.showInputDialog("Enter Password:"));
                    while (password <= 1000000){                                                 
                        int password1 = Integer.parseInt(JOptionPane.showInputDialog("Password length must be above 6\nEnter Password: "));
                        password = password1;                   
                    }
                    
                    String ic = (JOptionPane.showInputDialog("Enter your IC Number:"));
                    while (ic.length() != 12){                                                   //validation of date
                        String ic1 = (JOptionPane.showInputDialog("IC format must be 12-digits.\nEnter your IC Number:"));
                        ic = ic1;                   
                    }
   
                    String phone_num = (JOptionPane.showInputDialog("Enter your Phone Number:"));
                    while (phone_num.length() != 10){                                                   //validation of date
                        String phone_num1 = (JOptionPane.showInputDialog("Phone Number format must be 10-digits.\nEnter your Phone Number:"));
                        phone_num = phone_num1;                   
                    }
                    
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age:"));
                    while (age < 18){                                                   //validation of date
                        int age1 = Integer.parseInt(JOptionPane.showInputDialog("Age under 18 can't perform car rental.\nEnter your age:"));
                        age = age1;                   
                    }
                    
                    String gender = (JOptionPane.showInputDialog("Enter your Gender(M/FM): ")); 
                    while (("FM".equals(gender) == false) && ("M".equals(gender) == false)){
                        String gender1 = (JOptionPane.showInputDialog("Enter M or FM.\nEnter your Gender(M/FM):"));
                        gender = gender1;                   
                    }            
                    
                    String email = (JOptionPane.showInputDialog("Enter your Email (xxx@gmail.com):"));
                    while (!email.contains("@gmail.com")){                                                   //validation of date
                        String email1 = (JOptionPane.showInputDialog("Email format must contains @gmail.com\nEnter your Email (xxx@gmail.com):"));
                        email = email1;                   
                    }
                    
                    String address = (JOptionPane.showInputDialog("Enter your Home Address:"));
                    while ("".equals(address)){                                                   //validation of date
                        String address1 = (JOptionPane.showInputDialog("Invalid Input.\nEnter your Home Address:"));
                        address = address1;                   
                    }
                    
                    Customer c = new Customer(input, password, ic, phone_num, age, gender, email, address,null);
                    DataIO.allCustomers.add(c);
                    DataIO.writeToTextFile();
                    JOptionPane.showMessageDialog(rootPane, "Account Registered Successfully.");
                    }else{
                        JOptionPane.showMessageDialog(null,"The username has been used. Try Another.");
                    }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input.");
        }
        
    }//GEN-LAST:event_RegistrationActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
       String input = JOptionPane.showInputDialog("Enter admin password");
                if (input.equals("123")){
                    System.exit(0);
                }
    }//GEN-LAST:event_CancelActionPerformed

    private void ForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotActionPerformed
        page10 = new Forgot_Password();
        page10.setVisible(true);
    }//GEN-LAST:event_ForgotActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Forgot;
    private javax.swing.JButton Login;
    private javax.swing.JButton Registration;
    private javax.swing.JTextField adminName;
    private javax.swing.JPasswordField adminPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton signInButton;
    // End of variables declaration//GEN-END:variables
    
    private void systemExit(){
        WindowEvent winCloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
}