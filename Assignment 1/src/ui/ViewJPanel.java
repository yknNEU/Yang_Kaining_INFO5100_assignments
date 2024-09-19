package ui;

import model.*;

public class ViewJPanel extends javax.swing.JPanel {

    private MainJFrame mainJFrame;
    private Profile profile;

    public ViewJPanel(MainJFrame mainJFrame, Profile profile) {
        this.mainJFrame = mainJFrame;
        this.profile = profile;
        initComponents();
    }

    @SuppressWarnings("unchecked")
                          
    private void initComponents() {

        lblDoB = new javax.swing.JLabel();
        txtWork = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDescribe = new javax.swing.JLabel();
        lblTitle = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        lblFirstName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblSocialNumber = new javax.swing.JLabel();
        lblDriveNumber = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblDriveState = new javax.swing.JLabel();
        txtHome = new javax.swing.JLabel();
        lblWork = new javax.swing.JLabel();
        txtLastName = new javax.swing.JLabel();
        txtDoB = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtPhone = new javax.swing.JLabel();
        txtDriveNumber = new javax.swing.JLabel();
        txtDriveState = new javax.swing.JLabel();
        txtSocialNumber = new javax.swing.JLabel();
        txtDescription = new javax.swing.JLabel();

        lblDoB.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); 
        lblDoB.setText("Date of Birth:");

        txtWork.setText("Not Available");

        lblEmail.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblEmail.setText("Email:");

        lblDescribe.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblDescribe.setText("Description:");

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); 
        lblTitle.setText("Personal Profile");

        btnExit.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); 
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblFirstName.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblFirstName.setText("First Name:");

        lblPhone.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblPhone.setText("Phone:");

        lblLastName.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblLastName.setText("Last Name:");

        lblSocialNumber.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); 
        lblSocialNumber.setText("Social Security Number:");

        lblDriveNumber.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblDriveNumber.setText("Driver Licence Number:");

        lblHome.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); 
        lblHome.setText("Home Address:");

        lblDriveState.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblDriveState.setText("Driver Licence State:");

        txtHome.setText("Not Available");

        lblWork.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); 
        lblWork.setText("Work Address:");

        txtLastName.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtLastName.setText("Not Available");
        txtLastName.setToolTipText("");

        txtDoB.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtDoB.setText("Not Available");
        txtDoB.setToolTipText("");

        txtFirstName.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtFirstName.setText("Not Available");
        txtFirstName.setToolTipText("");

        txtEmail.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtEmail.setText("Not Available");
        txtEmail.setToolTipText("");

        txtPhone.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtPhone.setText("Not Available");
        txtPhone.setToolTipText("");

        txtDriveNumber.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtDriveNumber.setText("Not Available");
        txtDriveNumber.setToolTipText("");

        txtDriveState.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtDriveState.setText("Not Available");
        txtDriveState.setToolTipText("");

        txtSocialNumber.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtSocialNumber.setText("Not Available");
        txtSocialNumber.setToolTipText("");

        updateInformation();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSocialNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtSocialNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDriveNumber)
                                    .addComponent(lblDriveState))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDriveNumber)
                                    .addComponent(txtDriveState)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDoB)
                                    .addComponent(lblLastName)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblEmail)
                                    .addComponent(lblPhone))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDoB)
                                    .addComponent(txtLastName)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtEmail)
                                    .addComponent(txtPhone))))
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWork)
                            .addComponent(lblHome)
                            .addComponent(txtHome)
                            .addComponent(txtWork)
                            .addComponent(lblDescribe)
                            .addComponent(txtDescription)))
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(btnExit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(lblHome)
                            .addComponent(txtFirstName))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLastName)
                                    .addComponent(txtLastName)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtHome)))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoB)
                            .addComponent(txtDoB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWork)
                        .addGap(13, 13, 13)
                        .addComponent(txtWork)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDriveNumber)
                    .addComponent(lblDescribe)
                    .addComponent(txtDriveNumber))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDriveState)
                            .addComponent(txtDriveState)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtDescription)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSocialNumber)
                    .addComponent(txtSocialNumber))
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }                      

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        mainJFrame.setPanel(new MenuJPanel(mainJFrame, profile));
    }                                       
                  
    private javax.swing.JButton btnExit;
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
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtDoB;
    private javax.swing.JLabel txtDriveNumber;
    private javax.swing.JLabel txtDriveState;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtFirstName;
    private javax.swing.JLabel txtHome;
    private javax.swing.JLabel txtLastName;
    private javax.swing.JLabel txtPhone;
    private javax.swing.JLabel txtSocialNumber;
    private javax.swing.JLabel txtWork;
    
    private void updateInformation() {
        txtFirstName.setText(profile.getFirstName());
        if (profile.getFirstName().equals("")) {
            txtFirstName.setText("Not Available");
        }
        txtLastName.setText(profile.getLastName());
        if (profile.getLastName().equals("")) {
            txtLastName.setText("Not Available");
        }
        txtDoB.setText(profile.getDateOfBirth());
        if (profile.getDateOfBirth().equals("")) {
            txtDoB.setText("Not Available");
        }
        txtEmail.setText(profile.getEmail());
        if (profile.getEmail().equals("")) {
            txtEmail.setText("Not Available");
        }
        txtPhone.setText(profile.getPhone());
        if (profile.getPhone().equals("")) {
            txtPhone.setText("Not Available");
        }
        txtDriveNumber.setText(profile.getDriverLicenseNumber());
        if (profile.getDriverLicenseNumber().equals("")) {
            txtDriveNumber.setText("Not Available");
        }
        txtDriveState.setText(profile.getDriverLicenseState());
        if (profile.getDriverLicenseState().equals("")) {
            txtDriveState.setText("Not Available");
        }
        txtSocialNumber.setText(profile.getSocialSecurityNumber());
        if (profile.getSocialSecurityNumber().equals("")) {
            txtSocialNumber.setText("Not Available");
        }
        txtDescription.setText(profile.getSelfDescription());
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
