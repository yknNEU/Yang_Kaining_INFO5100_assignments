package ui;

import model.*;

public class UpdateJPanel extends javax.swing.JPanel {

    MainJFrame mainJFrame;
    Profile profile;

    public UpdateJPanel(MainJFrame mainJFrame, Profile profile) {
        this.mainJFrame = mainJFrame;
        this.profile = profile;
        initComponents();
    }

    @SuppressWarnings("unchecked")
                       
    private void initComponents() {

        txtLastName = new javax.swing.JTextField();
        txtDoB = new javax.swing.JTextField();
        lblDoB = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblTitle = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        lblDriveNumber = new javax.swing.JLabel();
        txtDriveState = new javax.swing.JTextField();
        lblDriveState = new javax.swing.JLabel();
        txtDriveNumber = new javax.swing.JTextField();
        txtSocialNumber = new javax.swing.JTextField();
        lblSocialNumber = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        txtHome = new javax.swing.JLabel();
        lblWork = new javax.swing.JLabel();
        btnWork = new javax.swing.JButton();
        txtWork = new javax.swing.JLabel();
        lblDescribe = new javax.swing.JLabel();
        txtDescribe = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        txtLastName.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtLastName.setText(profile.getLastName());

        txtDoB.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtDoB.setText(profile.getDateOfBirth());

        lblDoB.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblDoB.setText("Date of Birth");

        txtEmail.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtEmail.setText(profile.getEmail());

        lblEmail.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblEmail.setText("Email");

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
        lblTitle.setText("Personal Profile");

        txtPhone.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtPhone.setText(profile.getPhone());

        lblFirstName.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblFirstName.setText("First Name");

        lblPhone.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblPhone.setText("Phone");

        txtFirstName.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtFirstName.setText(profile.getFirstName());

        lblLastName.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblLastName.setText("Last Name");

        lblDriveNumber.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblDriveNumber.setText("Driver Licence Number");

        txtDriveState.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); 
        txtDriveState.setText(profile.getDriverLicenseState());

        lblDriveState.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblDriveState.setText("Driver Licence State");

        txtDriveNumber.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtDriveNumber.setText(profile.getDriverLicenseNumber());

        txtSocialNumber.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtSocialNumber.setText(profile.getSocialSecurityNumber());

        lblSocialNumber.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblSocialNumber.setText("Social Security Number");

        lblHome.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblHome.setText("Home Address");

        btnHome.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        btnHome.setText("Edit");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        txtHome.setText("Not Available");

        lblWork.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblWork.setText("Work Address");

        btnWork.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        btnWork.setText("Edit");
        btnWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkActionPerformed(evt);
            }
        });

        txtWork.setText("Not Available");

        lblDescribe.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblDescribe.setText("Description");

        txtDescribe.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtDescribe.setText(profile.getSelfDescription());

        btnSave.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        updateAddress();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSocialNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtSocialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDriveNumber)
                                    .addComponent(lblDriveState))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDriveState, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDriveNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDoB)
                                    .addComponent(lblLastName)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblEmail)
                                    .addComponent(lblPhone))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHome)
                            .addComponent(txtWork)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblWork)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnWork))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblHome)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnHome)))
                            .addComponent(lblDescribe)
                            .addComponent(txtDescribe, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHome)
                            .addComponent(btnHome))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLastName)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtHome)))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoB)
                            .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWork)
                            .addComponent(btnWork))
                        .addGap(10, 10, 10)
                        .addComponent(txtWork)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDriveNumber)
                            .addComponent(txtDriveNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescribe))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDriveState)
                            .addComponent(txtDriveState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSocialNumber)
                            .addComponent(txtSocialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(txtDescribe, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }                      

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        boolean isSuccessful = true;
        String failedMessage = "Invalid input for the following fields:\n";
        if (!profile.setFirstName(txtFirstName.getText())) {
            isSuccessful = false;
            failedMessage += "First Name, ";
        }
        if (!profile.setLastName(txtLastName.getText())) {
            isSuccessful = false;
            failedMessage += "Last Name, ";
        }
        if (!profile.setDateOfBirth(txtDoB.getText())) {
            isSuccessful = false;
            failedMessage += "Date of Birth (MM/DD/YYYY), ";
        }
        if (!profile.setEmail(txtEmail.getText())) {
            isSuccessful = false;
            failedMessage += "Email, ";
        }
        if (!profile.setPhone(txtPhone.getText())) {
            isSuccessful = false;
            failedMessage += "Phone, ";
        }
        if (!profile.setDriverLicenseNumber(txtDriveNumber.getText())) {
            isSuccessful = false;
            failedMessage += "Driver Licence Number, ";
        }
        if (!profile.setDriverLicenseState(txtDriveState.getText())) {
            isSuccessful = false;
            failedMessage += "Driver Licence State, ";
        }
        if (!profile.setSocialSecurityNumber(txtSocialNumber.getText())) {
            isSuccessful = false;
            failedMessage += "Social Security Number, ";
        }
        if (!profile.setSelfDescription(txtDescribe.getText())) {
            isSuccessful = false;
            failedMessage += "Description, ";
        }
        if (isSuccessful) {
            mainJFrame.setPanel(new MenuJPanel(mainJFrame, profile));
            javax.swing.JOptionPane.showMessageDialog(this, "Personal Profile Saved!", "Success", javax.swing.JOptionPane.PLAIN_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, failedMessage.substring(0, failedMessage.length() - 2), "Failed", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }                                       

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        mainJFrame.setPanel(new AddressJPanel(mainJFrame, this, profile.getHomeAddress()));
    }                                       

    private void btnWorkActionPerformed(java.awt.event.ActionEvent evt) {                                        
        mainJFrame.setPanel(new AddressJPanel(mainJFrame, this, profile.getWorkAddress()));
    }                                       
          
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnWork;
    private javax.swing.JLabel lblDescribe;
    private javax.swing.JLabel lblDoB;
    private javax.swing.JLabel lblDriveNumber;
    private javax.swing.JLabel lblDriveState;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSocialNumber;
    private javax.swing.JTextField lblTitle;
    private javax.swing.JLabel lblWork;
    private javax.swing.JTextField txtDescribe;
    private javax.swing.JTextField txtDoB;
    private javax.swing.JTextField txtDriveNumber;
    private javax.swing.JTextField txtDriveState;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JLabel txtHome;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSocialNumber;
    private javax.swing.JLabel txtWork;
    
    public void updateAddress() {
        String homeAddress = profile.getHomeAddress().toString();
        String workAddress = profile.getWorkAddress().toString();
        txtHome.setText("<html>" + homeAddress.replace("\n", "<br>") + "</html>");
        txtWork.setText("<html>" + workAddress.replace("\n", "<br>") + "</html>");
        if (!profile.getHomeAddress().isFinished()) {
            txtHome.setText("Not Available");
        }
        if (!profile.getWorkAddress().isFinished()) {
            txtWork.setText("Not Available");
        }
    }
}
