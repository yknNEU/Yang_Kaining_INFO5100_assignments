package ui.panel;

import model.Address;

public class EditAddress extends javax.swing.JPanel {

    private javax.swing.JPanel container;
    private Address address;

    public EditAddress(javax.swing.JPanel container, Address address) {
        initComponents();
        this.container = container;
        this.address = address;
        populateAddress();
    }

    @SuppressWarnings("unchecked")
                      
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        lblNumber = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        lblAddress1 = new javax.swing.JLabel();
        lblAddress2 = new javax.swing.JLabel();
        lblAddress3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
        lblTitle.setText("Edit Address");

        lblStreet.setText("Street Address");

        lblNumber.setText("Unit Number");

        lblCity.setText("City");

        lblState.setText("State");

        lblZip.setText("Zip Code");

        lblPhone.setText("Phone Number");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblAddress.setText("Address");

        lblAddress1.setText("-");

        lblAddress2.setText("-");

        lblAddress3.setText("-");

        btnBack.setText("<<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(36, 36, 36)
                                .addComponent(lblTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtZip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(txtStreet, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblStreet, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCity, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lblZip)
                                    .addComponent(lblPhone)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress1)
                                    .addComponent(lblAddress2)
                                    .addComponent(lblAddress3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblNumber)
                                        .addComponent(txtNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(lblState)
                                        .addComponent(txtState)
                                        .addComponent(lblAddress)))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreet)
                    .addComponent(lblNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(lblState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddress1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddress2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddress3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }                        

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {                                        
        container.remove(this);
        java.awt.CardLayout layout = (java.awt.CardLayout) container.getLayout();
        layout.previous(container);
    }                                       

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String street = txtStreet.getText();
        String unit = txtNumber.getText();
        String city = txtCity.getText();
        String state = txtState.getText();
        String zip = txtZip.getText();
        String phone = txtPhone.getText();

        if (street.isBlank() || city.isBlank() || state.isBlank() || zip.isBlank() || phone.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "All fields are mandatory.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!zip.matches("\\d{5}")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Zip code must be a 5-digit number.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!phone.matches("\\d+")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Phone number must be numbers.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        address.setStreet(street);
        address.setUnit(unit);
        address.setCity(city);
        address.setState(state);
        address.setZip(zip);
        address.setPhone(phone);
        javax.swing.JOptionPane.showMessageDialog(this, "Address saved successfully.", "Information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        refreshAddress();
    }
    
    private void refreshAddress() {
        String[] a = address.toString().split("\n");
        if (!address.isFinished()) {
            a = new String[]{"", "", ""};
        }

        lblAddress1.setText("- " + a[0]);
        lblAddress2.setText("- " + a[1]);
        lblAddress3.setText("- " + a[2]);

        java.awt.Component[] panelStack = container.getComponents();
        if (panelStack.length < 2) {
            return;
        }
        javax.swing.JPanel lastPanel = (javax.swing.JPanel) panelStack[panelStack.length - 2];

        if (lastPanel instanceof CreateProfile) {
            CreateProfile profilePanel = (CreateProfile) lastPanel;
            profilePanel.refreshAddress();
        }
        if (lastPanel instanceof ViewProfile) {
            ViewProfile profilePanel = (ViewProfile) lastPanel;
            profilePanel.refreshAddress();
        }
        if (lastPanel instanceof ProfileList) {
            ProfileList profileList = (ProfileList) lastPanel;
            profileList.populateTable();
        }
    }

    private void populateAddress() {
        txtStreet.setText(address.getStreet());
        txtNumber.setText(address.getUnit());
        txtCity.setText(address.getCity());
        txtState.setText(address.getState());
        txtZip.setText(address.getZip());
        txtPhone.setText(address.getPhone());
        refreshAddress();
    }

                 
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblAddress2;
    private javax.swing.JLabel lblAddress3;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZip;              
}
