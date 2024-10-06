package ui.panel;

import model.Person;
import model.PersonDirectory;

public class CreateProfile extends javax.swing.JPanel {

    private javax.swing.JPanel container;
    private PersonDirectory personDirectory;
    private Person person;

    public CreateProfile(javax.swing.JPanel container, PersonDirectory personDirectory) {
        this.container = container;
        this.personDirectory = personDirectory;
        this.person = new Person();
        initComponents();
    }

    @SuppressWarnings("unchecked")
                      
    private void initComponents() {

        lblWork3 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        btnHome = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        btnWork = new javax.swing.JButton();
        txtAge = new javax.swing.JTextField();
        lblHome = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        lblWork = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblHome1 = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblHome2 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblHome3 = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblWork1 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblWork2 = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();

        lblWork3.setText("-");

        btnHome.setText("Edit");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        lblAge.setText("Age");

        btnWork.setText("Edit");
        btnWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkActionPerformed(evt);
            }
        });

        lblHome.setText("Home Address");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblWork.setText("Work Address");

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); 
        lblTitle.setText("Create Profile");

        lblHome1.setText("-");

        lblFirstName.setText("First Name");

        lblHome2.setText("-");

        lblHome3.setText("-");

        lblLastName.setText("Last Name");

        lblWork1.setText("-");

        lblWork2.setText("-");

        lblNumber.setText("Social Security Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(lblTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
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
                                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, Short.MAX_VALUE)))
                        .addGap(36, 36, 36)
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
                            .addComponent(lblWork3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnCreate)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblTitle)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreate)
                .addContainerGap(15, Short.MAX_VALUE))
        );
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

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {                                          
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
        personDirectory.addPerson(person);
        javax.swing.JOptionPane.showMessageDialog(this, "Profile created successfully.", "Information", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        txtFirstName.setText("");
        txtLastName.setText("");
        txtNumber.setText("");
        txtAge.setText("");
        person = new Person();
        refreshAddress();
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

         
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnHome;
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
