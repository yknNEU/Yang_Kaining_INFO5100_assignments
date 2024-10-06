package ui.panel;

import model.Person;

public class ViewProfile extends javax.swing.JPanel {

    private javax.swing.JPanel container;
    private Person person;

    public ViewProfile(javax.swing.JPanel container, Person person) {
        initComponents();
        this.container = container;
        this.person = person;
        setViewMode();
        populateProfile();
    }

    @SuppressWarnings("unchecked")
                        
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblNumber = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblHome = new javax.swing.JLabel();
        lblWork = new javax.swing.JLabel();
        lblHome1 = new javax.swing.JLabel();
        lblHome2 = new javax.swing.JLabel();
        lblHome3 = new javax.swing.JLabel();
        lblWork1 = new javax.swing.JLabel();
        lblWork2 = new javax.swing.JLabel();
        lblWork3 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnWork = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblTitle.setText("View Profile");

        lblFirstName.setText("First Name");

        lblLastName.setText("Last Name");

        lblNumber.setText("Social Security Number");

        lblAge.setText("Age");

        lblHome.setText("Home Address");

        lblWork.setText("Work Address");

        lblHome1.setText("-");

        lblHome2.setText("-");

        lblHome3.setText("-");

        lblWork1.setText("-");

        lblWork2.setText("-");

        lblWork3.setText("-");

        btnHome.setText("Edit");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnWork.setText("Edit");
        btnWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

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
                        .addGap(149, 149, 149)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSave)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBack)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFirstName)
                                    .addComponent(txtFirstName)
                                    .addComponent(lblNumber)
                                    .addComponent(txtNumber)
                                    .addComponent(lblHome1)
                                    .addComponent(lblHome2)
                                    .addComponent(lblHome3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, Short.MAX_VALUE)))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblWork)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnWork, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addComponent(txtLastName)
                                .addComponent(lblLastName)
                                .addComponent(lblAge)
                                .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(lblWork1)
                                .addComponent(lblWork2)
                                .addComponent(lblWork3)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(lblLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber)
                    .addComponent(lblAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHome)
                    .addComponent(lblWork)
                    .addComponent(btnHome)
                    .addComponent(btnWork))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHome2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHome3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWork1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWork2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWork3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }                   

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {                                  
        container.remove(this);

        java.awt.Component[] panelStack = container.getComponents();
        if (panelStack.length >= 1) {
            javax.swing.JPanel lastPanel = (javax.swing.JPanel) panelStack[panelStack.length - 1];
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

        java.awt.CardLayout layout = (java.awt.CardLayout) container.getLayout();
        layout.previous(container);
    }                                       

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        EditAddress editAddress = new EditAddress(container, person.getHomeAddress());
        container.add("EditAddress" + editAddress.toString(), editAddress);
        java.awt.CardLayout layout = (java.awt.CardLayout) container.getLayout();
        layout.next(container);
    }                                       

    private void btnWorkActionPerformed(java.awt.event.ActionEvent evt) {                                        
        EditAddress editAddress = new EditAddress(container, person.getWorkAddress());
        container.add("EditAddress" + editAddress.toString(), editAddress);
        java.awt.CardLayout layout = (java.awt.CardLayout) container.getLayout();
        layout.next(container);
    }                                       

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String socialSecurityNumber = txtNumber.getText();
        String ageString = txtAge.getText();

        if (firstName.isBlank() || lastName.isBlank() || socialSecurityNumber.isBlank() || ageString.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "All fields are mandatory.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!socialSecurityNumber.matches("\\d+")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Social Security Number must be numbers.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int age = 0;
        try {
            age = Integer.parseInt(ageString);
            if (age < 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Age must be a positive number.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Age must be a positive number.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!person.getHomeAddress().isFinished() || !person.getWorkAddress().isFinished()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please complete the address information.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setSocialSecurityNumber(socialSecurityNumber);
        person.setAge(age);
        javax.swing.JOptionPane.showMessageDialog(this, "Profile updated successfully.", "Information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        refreshAddress();
        setViewMode();
    }                                       

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        setEditMode();
    }

    private void setViewMode() {
        txtFirstName.setEditable(false);
        txtLastName.setEditable(false);
        txtNumber.setEditable(false);
        txtAge.setEditable(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnHome.setEnabled(false);
        btnWork.setEnabled(false);
    }

    private void setEditMode() {
        txtFirstName.setEditable(true);
        txtLastName.setEditable(true);
        txtNumber.setEditable(true);
        txtAge.setEditable(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnHome.setEnabled(true);
        btnWork.setEnabled(true);
    }
    
    public void refreshAddress() {
        String[] homeAddress = person.getHomeAddress().toString().split("\n");
        String[] workAddress = person.getWorkAddress().toString().split("\n");
        if (!person.getHomeAddress().isFinished()) {
            homeAddress = new String[]{"", "", ""};
        }
        if (!person.getWorkAddress().isFinished()) {
            workAddress = new String[]{"", "", ""};
        }

        lblHome1.setText("- " + homeAddress[0]);
        lblHome2.setText("- " + homeAddress[1]);
        lblHome3.setText("- " + homeAddress[2]);
        lblWork1.setText("- " + workAddress[0]);
        lblWork2.setText("- " + workAddress[1]);
        lblWork3.setText("- " + workAddress[2]);
    }

    public void populateProfile() {
        txtFirstName.setText(person.getFirstName());
        txtLastName.setText(person.getLastName());
        txtNumber.setText(person.getSocialSecurityNumber());
        txtAge.setText(String.valueOf(person.getAge()));
        refreshAddress();
    }
                 
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnWork;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHome1;
    private javax.swing.JLabel lblHome2;
    private javax.swing.JLabel lblHome3;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWork;
    private javax.swing.JLabel lblWork1;
    private javax.swing.JLabel lblWork2;
    private javax.swing.JLabel lblWork3;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNumber;             
}
