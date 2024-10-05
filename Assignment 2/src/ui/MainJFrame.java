package ui;

import model.Address;
import model.Person;
import model.PersonDirectory;
import ui.panel.*;

public class MainJFrame extends javax.swing.JFrame {

    private PersonDirectory personDirectory;

    public MainJFrame() {
        personDirectory = new PersonDirectory();
        initComponents();
        // ------------------------------------- //
        generateDemoData();
        // ------------------------------------- //
        ProfileList profileList = new ProfileList(rightPanel, personDirectory);
        rightPanel.add("ProfileList", profileList);
        java.awt.CardLayout layout = (java.awt.CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }

    @SuppressWarnings("unchecked")
                  
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        txtView = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setText("Add Person");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnList.setText("List Person");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        txtView.setToolTipText("Enter the first name");

        btnView.setText("View Person");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtView)
                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnList)
                .addGap(62, 62, 62)
                .addComponent(txtView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        splitPanel.setLeftComponent(leftPanel);

        rightPanel.setLayout(new java.awt.CardLayout());
        splitPanel.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }                 

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {                                       
        rightPanel.removeAll();
        CreateProfile createProfile = new CreateProfile(rightPanel, personDirectory);
        rightPanel.add("CreateProfile", createProfile);
        java.awt.CardLayout layout = (java.awt.CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }                                      

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {                                        
        rightPanel.removeAll();
        ProfileList profileList = new ProfileList(rightPanel, personDirectory);
        rightPanel.add("ProfileList", profileList);
        java.awt.CardLayout layout = (java.awt.CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }                                       

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
    }                                       


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    private void generateDemoData() {
        personDirectory.addPerson(new Person("Potter", "Harry", "88888888", 17, new Address("4 Privet Drive", "Cupboard", "Little Whinging", "Surrey", "01234", "1234567890"), new Address("Hogwarts", "Gryffindors", "London", "UK", "99999", "9876543210")));
        personDirectory.addPerson(new Person("Northeastern", "Husky", "95405751", 120, new Address("360 Huntington Ave", "202", "Boston", "Massachusetts", "02115", "6173732310"), new Address("360 Huntington Ave", "0", "Boston", "Massachusetts", "02115", "6173732000")));
        personDirectory.addPerson(new Person("Trump", "Donald", "42863723", 74, new Address("725 5th Ave", "Trump Tower", "New York", "NY", "10022", "2128322000"), new Address("1600 Pennsylvania Ave NW", "Oval Office", "Washington", "DC", "20500", "2024561111")));
        personDirectory.addPerson(new Person("Murasame", "Arichi", "12345678", 500, new Address("0721 Anime St", "Hoori", "Tokyo", "Japan", "23333", "1145140721"), new Address("2 Jigen Ave", "", "Tokyo", "Japan", "66666", "5141919810")));
        personDirectory.addPerson(new Person("Sample", "Person", "00000000", 18, new Address("1 Home St", "Apt 2", "City", "State", "33333", "4444444444"), new Address("5 Work Ave", "Room 6", "City", "State", "77777", "8888888888")));
    }
                
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JTextField txtView;            
}
