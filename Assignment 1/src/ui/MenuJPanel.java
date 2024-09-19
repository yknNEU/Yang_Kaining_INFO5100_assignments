package ui;

import model.*;

public class MenuJPanel extends javax.swing.JPanel {

    private MainJFrame mainJFrame;
    private Profile profile;

    public MenuJPanel(MainJFrame mainJFrame, Profile profile) {
        this.mainJFrame = mainJFrame;
        this.profile = profile;
        initComponents();
    }

    @SuppressWarnings("unchecked")
                       
    private void initComponents() {
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        btnUpdate.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
        btnUpdate.setText("Update Profile");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
        btnView.setText("View Profile");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
        lblTitle.setText("Your Personal Profile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(lblTitle)))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(89, 89, 89)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
    }                  

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        UpdateJPanel updateJPanel = new UpdateJPanel(mainJFrame, profile);
        mainJFrame.setPanel(updateJPanel);
    }                                         

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {                                        
        ViewJPanel viewJPanel = new ViewJPanel(mainJFrame, profile);
        mainJFrame.setPanel(viewJPanel);
    }                                       
                 
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel lblTitle;                
}