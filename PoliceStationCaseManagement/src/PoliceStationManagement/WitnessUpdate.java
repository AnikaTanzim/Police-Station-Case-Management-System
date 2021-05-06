
package PoliceStationManagement;
import SQLPackage.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class WitnessUpdate extends javax.swing.JFrame {


    public WitnessUpdate() {
        initComponents();
        setSize(1250,885);
        setTitle("Witness Form");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WintessNameLabel1 = new javax.swing.JLabel();
        WitnessCaseIdTextField = new javax.swing.JTextField();
        WintessNameLabel = new javax.swing.JLabel();
        WitnessNameTextField = new javax.swing.JTextField();
        WitnessAge = new javax.swing.JLabel();
        WitnessAgeTextField = new javax.swing.JTextField();
        WitnessForm = new javax.swing.JLabel();
        WitnessFathersNameLabel = new javax.swing.JLabel();
        WitnessFathersNameTextField = new javax.swing.JTextField();
        WitnessVillage = new javax.swing.JLabel();
        WitnessVillageTextField = new javax.swing.JTextField();
        WitnessThana = new javax.swing.JLabel();
        WitnessThanaTextField = new javax.swing.JTextField();
        WintessDistrict = new javax.swing.JLabel();
        WitnessPresentAdress = new javax.swing.JLabel();
        WitnessPresentAddressTextField = new javax.swing.JTextField();
        WitnesspresentThana = new javax.swing.JLabel();
        WitnessPresentThanaTextField = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        WitnessPresentDistrict = new javax.swing.JLabel();
        MobileNo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MobileNoTextField = new javax.swing.JTextField();
        WitnessDistrictComboBox = new javax.swing.JComboBox<>();
        WitnessPresentDistrictComboBox = new javax.swing.JComboBox<>();
        UpdateButtonWitnessForm = new javax.swing.JButton();
        BackButtonWitnessForm = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        WintessNameLabel1.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        WintessNameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        WintessNameLabel1.setText("Case No*");
        getContentPane().add(WintessNameLabel1);
        WintessNameLabel1.setBounds(60, 150, 220, 40);

        WitnessCaseIdTextField.setEditable(false);
        WitnessCaseIdTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(WitnessCaseIdTextField);
        WitnessCaseIdTextField.setBounds(330, 160, 520, 40);

        WintessNameLabel.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        WintessNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        WintessNameLabel.setText("Witness Name*");
        getContentPane().add(WintessNameLabel);
        WintessNameLabel.setBounds(60, 200, 220, 40);

        WitnessNameTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(WitnessNameTextField);
        WitnessNameTextField.setBounds(330, 210, 520, 40);

        WitnessAge.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        WitnessAge.setForeground(new java.awt.Color(255, 255, 255));
        WitnessAge.setText("Age*");
        getContentPane().add(WitnessAge);
        WitnessAge.setBounds(60, 260, 120, 30);

        WitnessAgeTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(WitnessAgeTextField);
        WitnessAgeTextField.setBounds(330, 260, 520, 40);

        WitnessForm.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        WitnessForm.setForeground(new java.awt.Color(255, 255, 255));
        WitnessForm.setText("WITNESS FORM");
        getContentPane().add(WitnessForm);
        WitnessForm.setBounds(380, 30, 420, 44);

        WitnessFathersNameLabel.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        WitnessFathersNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        WitnessFathersNameLabel.setText("Father's Name");
        getContentPane().add(WitnessFathersNameLabel);
        WitnessFathersNameLabel.setBounds(60, 310, 150, 30);

        WitnessFathersNameTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(WitnessFathersNameTextField);
        WitnessFathersNameTextField.setBounds(330, 310, 520, 40);

        WitnessVillage.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        WitnessVillage.setForeground(new java.awt.Color(255, 255, 255));
        WitnessVillage.setText("Village Name");
        getContentPane().add(WitnessVillage);
        WitnessVillage.setBounds(60, 360, 140, 30);

        WitnessVillageTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(WitnessVillageTextField);
        WitnessVillageTextField.setBounds(330, 360, 520, 40);

        WitnessThana.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        WitnessThana.setForeground(new java.awt.Color(255, 255, 255));
        WitnessThana.setText("Thana*");
        getContentPane().add(WitnessThana);
        WitnessThana.setBounds(60, 410, 120, 30);

        WitnessThanaTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(WitnessThanaTextField);
        WitnessThanaTextField.setBounds(330, 410, 520, 40);

        WintessDistrict.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        WintessDistrict.setForeground(new java.awt.Color(255, 255, 255));
        WintessDistrict.setText("District*");
        getContentPane().add(WintessDistrict);
        WintessDistrict.setBounds(60, 460, 120, 25);

        WitnessPresentAdress.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        WitnessPresentAdress.setForeground(new java.awt.Color(255, 255, 255));
        WitnessPresentAdress.setText("Present Address*");
        getContentPane().add(WitnessPresentAdress);
        WitnessPresentAdress.setBounds(60, 510, 180, 25);

        WitnessPresentAddressTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(WitnessPresentAddressTextField);
        WitnessPresentAddressTextField.setBounds(330, 510, 520, 40);

        WitnesspresentThana.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        WitnesspresentThana.setForeground(new java.awt.Color(255, 255, 255));
        WitnesspresentThana.setText("Present Thana");
        getContentPane().add(WitnesspresentThana);
        WitnesspresentThana.setBounds(60, 570, 150, 20);

        WitnessPresentThanaTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(WitnessPresentThanaTextField);
        WitnessPresentThanaTextField.setBounds(330, 560, 520, 40);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/logo.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(940, 10, 210, 220);

        WitnessPresentDistrict.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        WitnessPresentDistrict.setForeground(new java.awt.Color(255, 255, 255));
        WitnessPresentDistrict.setText("Present District");
        getContentPane().add(WitnessPresentDistrict);
        WitnessPresentDistrict.setBounds(60, 620, 170, 25);

        MobileNo.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        MobileNo.setForeground(new java.awt.Color(255, 255, 255));
        MobileNo.setText("Mobile No.*");
        getContentPane().add(MobileNo);
        MobileNo.setBounds(60, 670, 130, 25);

        jLabel1.setFont(new java.awt.Font("Adobe Hebrew", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please enter the following details:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 100, 340, 22);

        MobileNoTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(MobileNoTextField);
        MobileNoTextField.setBounds(330, 660, 520, 40);

        WitnessDistrictComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WitnessDistrictComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Choose--","Barguna", "Barisal","Bhola","Jhalokathi","Potuakhali", "Pirojpur","Bandarban","Brahmanbaria","Chandpur","Chittagong","Comilla", "Coxs Bazar",
            "Feni", "Khagrachhari","Lakshmipur","Noakhali","Rangamati", "Dhaka","Faridpur", "Gazipur","Gopalganj","Kishorganj","Madaripur", "Manikganj",
            "Munshiganj", "Narayanganj","Narsingdi","Rajbari","Shariatpur", "Tangail","Bagerhat", "Chuadanga","Jessore","Jhenaidaha","Khulna", "Kushtia",
            "Magura", "Meherpur","Narail","Satkhira","Jamalpur", "Mymensingh","Netrokona", "Sherpur","Bogura","Joypurhat","Naogan", "Natore",
            "Chapai Nawab Ganj", "Pabna","Rajshahi","Sirajganj","Dinajpur", "Gaibandha","Kurigram","Nilphamari","Lalmonirhaat","Panchagarh","Rangpur","Thakurgaon",
            "Habiganj","Moulovibajar", "Sunamganj","Sylhet" }));
getContentPane().add(WitnessDistrictComboBox);
WitnessDistrictComboBox.setBounds(330, 460, 520, 40);

WitnessPresentDistrictComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
WitnessPresentDistrictComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Choose--","Barguna", "Barisal","Bhola","Jhalokathi","Potuakhali", "Pirojpur","Bandarban","Brahmanbaria","Chandpur","Chittagong","Comilla", "Coxs Bazar",
    "Feni", "Khagrachhari","Lakshmipur","Noakhali","Rangamati", "Dhaka","Faridpur", "Gazipur","Gopalganj","Kishorganj","Madaripur", "Manikganj",
    "Munshiganj", "Narayanganj","Narsingdi","Rajbari","Shariatpur", "Tangail","Bagerhat", "Chuadanga","Jessore","Jhenaidaha","Khulna", "Kushtia",
    "Magura", "Meherpur","Narail","Satkhira","Jamalpur", "Mymensingh","Netrokona", "Sherpur","Bogura","Joypurhat","Naogan", "Natore",
    "Chapai Nawab Ganj", "Pabna","Rajshahi","Sirajganj","Dinajpur", "Gaibandha","Kurigram","Nilphamari","Lalmonirhaat","Panchagarh","Rangpur","Thakurgaon",
    "Habiganj","Moulovibajar", "Sunamganj","Sylhet" }));
    getContentPane().add(WitnessPresentDistrictComboBox);
    WitnessPresentDistrictComboBox.setBounds(330, 610, 520, 40);

    UpdateButtonWitnessForm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    UpdateButtonWitnessForm.setText("UPDATE");
    UpdateButtonWitnessForm.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            UpdateButtonWitnessFormActionPerformed(evt);
        }
    });
    getContentPane().add(UpdateButtonWitnessForm);
    UpdateButtonWitnessForm.setBounds(970, 730, 170, 50);

    BackButtonWitnessForm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    BackButtonWitnessForm.setText("BACK");
    BackButtonWitnessForm.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            BackButtonWitnessFormActionPerformed(evt);
        }
    });
    getContentPane().add(BackButtonWitnessForm);
    BackButtonWitnessForm.setBounds(50, 730, 180, 50);

    image.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    image.setForeground(new java.awt.Color(255, 255, 255));
    image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/bg_pic.jpg"))); // NOI18N
    image.setText("Present District");
    getContentPane().add(image);
    image.setBounds(0, -70, 1250, 1020);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonWitnessFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonWitnessFormActionPerformed
        // TODO add your handling code here:
          MainPage mObj = new MainPage();
        mObj.show();
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonWitnessFormActionPerformed

    private void UpdateButtonWitnessFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonWitnessFormActionPerformed
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
        
        
            int wit_case = Integer.parseInt(WitnessCaseIdTextField.getText());
            String wit_name =WitnessNameTextField.getText();      
            String wit_age =WitnessAgeTextField.getText();
            String wit_father =WitnessFathersNameTextField.getText() ;
            String wit_vill =WitnessVillageTextField.getText() ;
            String wit_tha =WitnessThanaTextField.getText();
            
            String District = WitnessDistrictComboBox.getSelectedItem().toString();
                int dis = 0;
            if(District.equals("Barguna") )
            {
                dis=8001;
            }
            else if(District.equals("Barisal") )
            {
                dis=8002;
            }
            else if(District.equals("Bhola") )
            {
                dis=8003;
            }
            else if(District.equals("Jhalokathi") )
            {
                dis=8004;
            }
            else if(District.equals("Potuakhali") )
            {
                dis=8005;
            }
            else if(District.equals("Pirojpur") )
            {
                dis=8006;
            }
            else if(District.equals("Bandarban") )
            {
                dis=8007;
            }
            else if(District.equals("Brahmanbaria") )
            {
                dis=8008;
            }
            else if(District.equals("Chandpur") )
            {
                dis=8009;
            }
            else if(District.equals("Chittagong") )
            {
                dis=8010;
            }
            else if(District.equals("Comilla") )
            {
                dis=8011;
            }
            else if(District.equals("Coxs Bazar") )
            {
                dis=8012;
            }
            else if(District.equals("Feni") )
            {
                dis=8013;
            }
            else if(District.equals("Khagrachhari") )
            {
                dis=8014;
            }
            else if(District.equals("Lakshmipur") )
            {
                dis=8015;
            }
            else if(District.equals("Noakhali") )
            {
                dis=8016;
            }
            else if(District.equals("Rangamati") )
            {
                dis=8017;
            }
                else if(District.equals("Dhaka") )
            {
                dis=8018;
            }
            else if(District.equals("Faridpur") )
            {
                dis=8019;
            }
            else if(District.equals("Gazipur") )
            {
                dis=8020;
            }
            else if(District.equals("Gopalganj") )
            {
                dis=8021;
            }
                else if(District.equals("Kishorganj") )
            {
                dis=8022;
            }
            else if(District.equals("Madaripur") )
            {
                dis=8023;
            }
            else if(District.equals("Manikganj") )
            {
                dis=8024;
            }
            else if(District.equals("Munshiganj") )
            {
                dis=8025;
            }
            else if(District.equals("Narayanganj") )
            {
                dis=8026;
            }
            else if(District.equals("Narsingdi") )
            {
                dis=8027;
            }
            else if(District.equals("Rajbari") )
            {
                dis=8028;
            }
            else if(District.equals("Shariatpur") )
            {
                dis=8029;
            }
            else if(District.equals("Tangail") )
            {
                dis=8030;
            }
            else if(District.equals("Bagerhat") )
            {
                dis=8031;
            }
            else if(District.equals("Chuadanga") )
            {
                dis=8032;
            }
            else if(District.equals("Jessore") )
            {
                dis=8033;
            }
             else if(District.equals("Jhenaidaha") )
            {
                dis=8034;
            }
            else if(District.equals("Khulna") )
            {
               dis=8035;
            }
            else if(District.equals("Kushtia") )
            {
                dis=8036;
            }
            else if(District.equals("Magura") )
            {
                dis=8037;
            }
            else if(District.equals("Meherpur") )
            {
                dis=8038;
            }
            else if(District.equals("Narail") )
            {
                dis=8039;
            }
            else if(District.equals("Satkhira") )
            {
                dis=8040;
            }
            else if(District.equals("Jamalpur") )
            {
                dis=8041;
            }
            else if(District.equals("Mymensingh") )
            {
                dis=8042;
            }
            else if(District.equals("Netrokona") )
            {
                dis=8043;
            }
            else if(District.equals("Sherpur") )
            {
                dis=8044;
            }
            else if(District.equals("Bogura") )
            {
                dis=8045;
            }
            else if(District.equals("Joypurhat") )
            {
                dis=8046;
            }
            else if(District.equals("Naogan") )
            {
                dis=8047;
            }
            else if(District.equals("Natore") )
            {
                dis=8048;
            }
            else if(District.equals("Chapai Nawab Ganj") )
            {
                dis=8049;
            }
            else if(District.equals("Pabna") )
            {
                dis=8050;
            }
            else if(District.equals("Rajshahi") )
            {
                dis=8051;
            }
            else if(District.equals("Sirajganj") )
            {
                dis=8052;
            }
            else if(District.equals("Dinajpur") )
            {
               dis=8053;
            }
            else if(District.equals("Gaibandha") )
            {
                dis=8054;
            }
            else if(District.equals("Kurigram") )
            {
                dis=8055;
            }
            else if(District.equals("Nilphamari") )
            {
                dis=8056;
            }
            else if(District.equals("Lalmonirhaat") )
            {
                dis=8057;
            }
            else if(District.equals("Panchagarh") )
            {
                dis=8058;
            }
            else if(District.equals("Rangpur") )
            {
                dis=8059;
            }
            else if(District.equals("Thakurgaon") )
            {
                dis=8060;
            }
            else if(District.equals("Habiganj") )
            {
                dis=8061;
            }
            else if(District.equals("Moulovibajar") )
            {
               dis=8062;
            }
            else if(District.equals("Sunamganj") )
            {
                dis=8063;
            }
            else if(District.equals("Sylhet") )
            {
                dis=8064;
            }
            
            String wit_pre_ad =WitnessPresentAddressTextField.getText();
            String wit_pre_tha =WitnessPresentThanaTextField.getText();
            
            String pDistrict = WitnessPresentDistrictComboBox.getSelectedItem().toString();
            int pdis=0;
            if(pDistrict.equals("Barguna") )
            {
                pdis=8001;
            }
            else if(pDistrict.equals("Barisal") )
            {
                pdis=8002;
            }
            else if(pDistrict.equals("Bhola") )
            {
                pdis=8003;
            }
            else if(pDistrict.equals("Jhalokathi") )
            {
                pdis=8004;
            }
            else if(pDistrict.equals("Potuakhali") )
            {
                pdis=8005;
            }
            else if(pDistrict.equals("Pirojpur") )
            {
                pdis=8006;
            }
            else if(pDistrict.equals("Bandarban") )
            {
                pdis=8007;
            }
            else if(pDistrict.equals("Brahmanbaria") )
            {
                pdis=8008;
            }
            else if(pDistrict.equals("Chandpur") )
            {
                pdis=8009;
            }
            else if(pDistrict.equals("Chittagong") )
            {
                pdis=8010;
            }
            else if(pDistrict.equals("Comilla") )
            {
                pdis=8011;
            }
            else if(pDistrict.equals("Coxs Bazar") )
            {
                pdis=8012;
            }
            else if(pDistrict.equals("Feni") )
            {
                pdis=8013;
            }
            else if(pDistrict.equals("Khagrachhari") )
            {
                pdis=8014;
            }
            else if(pDistrict.equals("Lakshmipur") )
            {
                pdis=8015;
            }
            else if(pDistrict.equals("Noakhali") )
            {
                pdis=8016;
            }
            else if(pDistrict.equals("Rangamati") )
            {
                pdis=8017;
            }
                else if(pDistrict.equals("Dhaka") )
            {
                pdis=8018;
            }
            else if(pDistrict.equals("Faridpur") )
            {
                pdis=8019;
            }
            else if(pDistrict.equals("Gazipur") )
            {
                pdis=8020;
            }
            else if(pDistrict.equals("Gopalganj") )
            {
                pdis=8021;
            }
                else if(pDistrict.equals("Kishorganj") )
            {
                pdis=8022;
            }
            else if(pDistrict.equals("Madaripur") )
            {
                pdis=8023;
            }
            else if(pDistrict.equals("Manikganj") )
            {
                pdis=8024;
            }
            else if(pDistrict.equals("Munshiganj") )
            {
                pdis=8025;
            }
            else if(pDistrict.equals("Narayanganj") )
            {
                pdis=8026;
            }
            else if(pDistrict.equals("Narsingdi") )
            {
                pdis=8027;
            }
            else if(pDistrict.equals("Rajbari") )
            {
                pdis=8028;
            }
            else if(pDistrict.equals("Shariatpur") )
            {
                pdis=8029;
            }
            else if(pDistrict.equals("Tangail") )
            {
                pdis=8030;
            }
            else if(pDistrict.equals("Bagerhat") )
            {
                pdis=8031;
            }
            else if(pDistrict.equals("Chuadanga") )
            {
                pdis=8032;
            }
            else if(pDistrict.equals("Jessore") )
            {
                pdis=8033;
            }
             else if(pDistrict.equals("Jhenaidaha") )
            {
                pdis=8034;
            }
            else if(pDistrict.equals("Khulna") )
            {
               pdis=8035;
            }
            else if(pDistrict.equals("Kushtia") )
            {
                pdis=8036;
            }
            else if(pDistrict.equals("Magura") )
            {
                pdis=8037;
            }
            else if(pDistrict.equals("Meherpur") )
            {
                pdis=8038;
            }
            else if(pDistrict.equals("Narail") )
            {
                pdis=8039;
            }
            else if(pDistrict.equals("Satkhira") )
            {
                pdis=8040;
            }
            else if(pDistrict.equals("Jamalpur") )
            {
                pdis=8041;
            }
            else if(pDistrict.equals("Mymensingh") )
            {
                pdis=8042;
            }
            else if(pDistrict.equals("Netrokona") )
            {
                pdis=8043;
            }
            else if(pDistrict.equals("Sherpur") )
            {
                pdis=8044;
            }
            else if(pDistrict.equals("Bogura") )
            {
                pdis=8045;
            }
            else if(pDistrict.equals("Joypurhat") )
            {
                pdis=8046;
            }
            else if(pDistrict.equals("Naogan") )
            {
                pdis=8047;
            }
            else if(pDistrict.equals("Natore") )
            {
                pdis=8048;
            }
            else if(pDistrict.equals("Chapai Nawab Ganj") )
            {
                pdis=8049;
            }
            else if(pDistrict.equals("Pabna") )
            {
                pdis=8050;
            }
            else if(pDistrict.equals("Rajshahi") )
            {
                pdis=8051;
            }
            else if(pDistrict.equals("Sirajganj") )
            {
                pdis=8052;
            }
            else if(pDistrict.equals("Dinajpur") )
            {
               pdis=8053;
            }
            else if(pDistrict.equals("Gaibandha") )
            {
                pdis=8054;
            }
            else if(pDistrict.equals("Kurigram") )
            {
                pdis=8055;
            }
            else if(pDistrict.equals("Nilphamari") )
            {
                pdis=8056;
            }
            else if(pDistrict.equals("Lalmonirhaat") )
            {
                pdis=8057;
            }
            else if(pDistrict.equals("Panchagarh") )
            {
                pdis=8058;
            }
            else if(pDistrict.equals("Rangpur") )
            {
                pdis=8059;
            }
            else if(pDistrict.equals("Thakurgaon") )
            {
                pdis=8060;
            }
            else if(pDistrict.equals("Habiganj") )
            {
                pdis=8061;
            }
            else if(pDistrict.equals("Moulovibajar") )
            {
               pdis=8062;
            }
            else if(pDistrict.equals("Sunamganj") )
            {
                pdis=8063;
            }
            else if(pDistrict.equals("Sylhet") )
            {
                pdis=8064;
            }
            
            String wit_mob = MobileNoTextField.getText();
                                                                                                                                                         
            String updatequery= "UPDATE Witness SET CaseNo='"+wit_case+"', WitnessName='"+wit_name+"', Age='"+wit_age+"',FathersName ='"+wit_father+"',Village='"+wit_vill+"',Thana='"+wit_tha+"',DistrictId ='"+dis+"',PresentAddress ='"+wit_pre_ad+"',PresentThana='"+wit_pre_tha+"', PresentDistrictId ='"+pdis+"' , MobileNo ='"+wit_mob+"' WHERE CaseNo='"+wit_case+"' ";
            
        try {
            
            Statement st = (Statement) cnObj.connection.createStatement();
            st.executeUpdate(updatequery);
            JOptionPane.showMessageDialog(null,"Updated SUCCESSFULLY");
        } catch (SQLException ex) {
            Logger.getLogger(AccusedUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
           
            
            
        
    }//GEN-LAST:event_UpdateButtonWitnessFormActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WitnessForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButtonWitnessForm;
    private javax.swing.JLabel MobileNo;
    public javax.swing.JTextField MobileNoTextField;
    private javax.swing.JButton UpdateButtonWitnessForm;
    private javax.swing.JLabel WintessDistrict;
    private javax.swing.JLabel WintessNameLabel;
    private javax.swing.JLabel WintessNameLabel1;
    private javax.swing.JLabel WitnessAge;
    public javax.swing.JTextField WitnessAgeTextField;
    public javax.swing.JTextField WitnessCaseIdTextField;
    public javax.swing.JComboBox<String> WitnessDistrictComboBox;
    private javax.swing.JLabel WitnessFathersNameLabel;
    public javax.swing.JTextField WitnessFathersNameTextField;
    private javax.swing.JLabel WitnessForm;
    public javax.swing.JTextField WitnessNameTextField;
    public javax.swing.JTextField WitnessPresentAddressTextField;
    private javax.swing.JLabel WitnessPresentAdress;
    private javax.swing.JLabel WitnessPresentDistrict;
    public javax.swing.JComboBox<String> WitnessPresentDistrictComboBox;
    public javax.swing.JTextField WitnessPresentThanaTextField;
    private javax.swing.JLabel WitnessThana;
    public javax.swing.JTextField WitnessThanaTextField;
    private javax.swing.JLabel WitnessVillage;
    public javax.swing.JTextField WitnessVillageTextField;
    private javax.swing.JLabel WitnesspresentThana;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
