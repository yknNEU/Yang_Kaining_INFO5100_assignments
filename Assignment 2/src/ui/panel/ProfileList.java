package ui.panel;

import model.Person;
import model.PersonDirectory;

public class ProfileList extends javax.swing.JPanel {

    private javax.swing.JPanel container;
    private PersonDirectory personDirectory;

    public ProfileList(javax.swing.JPanel container, PersonDirectory personDirectory) {
        this.container = container;
        this.personDirectory = personDirectory;
        initComponents();
        populateTable();
    }

    @SuppressWarnings("unchecked")
                     
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfile = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        tblProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Home City", "Home Phone", "Work City", "Work Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProfile);

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblTitle.setText("Profile List");

        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Profile");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Search for Person");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setToolTipText("Type name or street address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(lblTitle)
                        .addGap(0, 157, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }                  

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int selectedRow = tblProfile.getSelectedRow();

        if (selectedRow >= 0) {
            Person person = (Person) tblProfile.getValueAt(selectedRow, 0);
            ViewProfile viewProfile = new ViewProfile(container, person);
            container.add("ViewProfile" + viewProfile.toString(), viewProfile);
            java.awt.CardLayout layout = (java.awt.CardLayout) container.getLayout();
            layout.next(container);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a person from the list.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }                                       

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int selectedRow = tblProfile.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = javax.swing.JOptionPane.YES_NO_OPTION;
            int dialogResult = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the selected person?", "Warning", dialogButton);
            if (dialogResult == javax.swing.JOptionPane.YES_OPTION) {
                Person person = (Person) tblProfile.getValueAt(selectedRow, 0);
                personDirectory.removePerson(person);
                populateTable();
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a person from the list.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }                                         

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (txtSearch.getText().isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please type the name or the street address to view.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String info = txtSearch.getText();
        Person person = personDirectory.searchPerson(info);
        if (person == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Person not found. Please check the information and try again.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
        } else {
            ViewProfile viewProfile = new ViewProfile(container, person);
            container.add("ViewProfile" + viewProfile.toString(), viewProfile);
            java.awt.CardLayout layout = (java.awt.CardLayout) container.getLayout();
            layout.next(container);
        }
    }
    
    public void populateTable() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblProfile.getModel();
        model.setRowCount(0);

        for (Person person : personDirectory.getPersonList()) {
            Object[] row = new Object[6];
            row[0] = person;
            row[1] = person.getLastName();
            row[2] = person.getHomeAddress().getCity();
            row[3] = person.getHomeAddress().getPhone();
            row[4] = person.getWorkAddress().getCity();
            row[5] = person.getWorkAddress().getPhone();
            model.addRow(row);
        }
    }
              
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblProfile;
    private javax.swing.JTextField txtSearch;              
}
