package ui;

import model.*;

public class AddressJPanel extends javax.swing.JPanel {

    MainJFrame mainJFrame;
    UpdateJPanel updateJPanel;
    Address address;

    public AddressJPanel(MainJFrame mainJFrame, UpdateJPanel updateJPanel, Address address) {
        this.mainJFrame = mainJFrame;
        this.updateJPanel = updateJPanel;
        this.address = address;
        initComponents();
    }

    @SuppressWarnings("unchecked")
                      
    private void initComponents() {

        lblTitle = new javax.swing.JTextField();
        lblLine1 = new javax.swing.JLabel();
        txtLine1 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblLine2 = new javax.swing.JLabel();
        txtLine2 = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        lblTele = new javax.swing.JLabel();
        txtTele = new javax.swing.JTextField();
        lblFax = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); 
        lblTitle.setText("Edit Address");

        lblLine1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblLine1.setText("Line 1");

        txtLine1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtLine1.setText(address.getLine1());

        btnSave.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); 
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblLine2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblLine2.setText("Line 2");

        txtLine2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtLine2.setText(address.getLine2()); 

        lblCity.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); 
        lblCity.setText("City");

        txtCity.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); 
        txtCity.setText(address.getCity());

        lblState.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); 
        lblState.setText("State");

        txtState.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); 
        txtState.setText(address.getState());

        lblZip.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        lblZip.setText("Zip Code");

        txtZip.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtZip.setText(address.getZipCode());

        lblTele.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); 
        lblTele.setText("Telephone Number");

        txtTele.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtTele.setText(address.getTelephoneNumber());

        lblFax.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); 
        lblFax.setText("Fax Number");

        txtFax.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
        txtFax.setText(address.getFaxNumber());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLine1)
                                .addGap(18, 18, 18)
                                .addComponent(txtLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCity)
                                    .addComponent(lblLine2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblState)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblZip)
                                .addGap(18, 18, 18)
                                .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(284, 284, 284))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTele)
                                .addGap(18, 18, 18)
                                .addComponent(txtTele, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFax)
                                .addGap(18, 18, 18)
                                .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(btnSave)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLine1)
                    .addComponent(txtLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLine2)
                    .addComponent(txtLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTele)
                    .addComponent(txtTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFax)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnSave)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }                       

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        boolean isSuccessful = true;
        String failedMessage = "Invalid input for the following fields:\n";
        if (!address.setLine1(txtLine1.getText())) {
            isSuccessful = false;
            failedMessage += "Line 1, ";
        }
        if (!address.setLine2(txtLine2.getText())) {
            isSuccessful = false;
            failedMessage += "Line 2, ";
        }
        if (!address.setCity(txtCity.getText())) {
            isSuccessful = false;
            failedMessage += "City, ";
        }
        if (!address.setState(txtState.getText())) {
            isSuccessful = false;
            failedMessage += "State, ";
        }
        if (!address.setZipCode(txtZip.getText())) {
            isSuccessful = false;
            failedMessage += "Zip Code, ";
        }
        if (!address.setTelephoneNumber(txtTele.getText())) {
            isSuccessful = false;
            failedMessage += "Telephone Number, ";
        }
        if (!address.setFaxNumber(txtFax.getText())) {
            isSuccessful = false;
            failedMessage += "Fax Number, ";
        }
        if (isSuccessful) {
            mainJFrame.setPanel(updateJPanel);
            javax.swing.JOptionPane.showMessageDialog(this, "Address Saved!", "Success", javax.swing.JOptionPane.PLAIN_MESSAGE);
            updateJPanel.updateAddress();
        } else {
            failedMessage = failedMessage.substring(0, failedMessage.length() - 2);
            javax.swing.JOptionPane.showMessageDialog(this, failedMessage, "Failed", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }                                       
                  
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblLine1;
    private javax.swing.JLabel lblLine2;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTele;
    private javax.swing.JTextField lblTitle;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtLine1;
    private javax.swing.JTextField txtLine2;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTele;
    private javax.swing.JTextField txtZip; 
}
