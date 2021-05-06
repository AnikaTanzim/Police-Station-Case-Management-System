
package PoliceStationManagement;
import SQLPackage.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class WitnessForm extends javax.swing.JFrame {


    public WitnessForm() {
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
        SaveButtonWitnessForm = new javax.swing.JButton();
        BackButtonWitnessForm = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        WintessNameLabel1.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        WintessNameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        WintessNameLabel1.setText("Case No*");
        getContentPane().add(WintessNameLabel1);
        WintessNameLabel1.setBounds(60, 150, 220, 40);

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

    SaveButtonWitnessForm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    SaveButtonWitnessForm.setText("SAVE");
    SaveButtonWitnessForm.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            SaveButtonWitnessFormActionPerformed(evt);
        }
    });
    getContentPane().add(SaveButtonWitnessForm);
    SaveButtonWitnessForm.setBounds(970, 730, 170, 50);

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

    private void SaveButtonWitnessFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonWitnessFormActionPerformed
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
        
        String query2 = "INSERT INTO Witness(CaseNo,WitnessName,Age,FathersName,Village,Thana,DistrictId,PresentAddress,PresentThana,PresentDistrictId,MobileNo) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst;
        try {
            pst = (PreparedStatement) cnObj.connection.prepareStatement(query2);
            pst.setString(1,WitnessCaseIdTextField.getText());
            pst.setString(2,WitnessNameTextField.getText());      
            pst.setString(3,WitnessAgeTextField.getText());
            pst.setString(4,WitnessFathersNameTextField.getText() );
            pst.setString(5,WitnessVillageTextField.getText() );
            pst.setString(6,WitnessThanaTextField.getText());
            
            String District = WitnessDistrictComboBox.getSelectedItem().toString();
            if(District.equals("Barguna") )
            {
                pst.setString(7,"8001");
            }
            else if(District.equals("Barisal") )
            {
                pst.setString(7,"8002");
            }
            else if(District.equals("Bhola") )
            {
                pst.setString(7,"8003");
            }
            else if(District.equals("Jhalokathi") )
            {
                pst.setString(7,"8004");
            }
            else if(District.equals("Potuakhali") )
            {
                pst.setString(7,"8005");
            }
            else if(District.equals("Pirojpur") )
            {
                pst.setString(7,"8006");
            }
            else if(District.equals("Bandarban") )
            {
                pst.setString(7,"8007");
            }
            else if(District.equals("Brahmanbaria") )
            {
                pst.setString(7,"8008");
            }
            else if(District.equals("Chandpur") )
            {
                pst.setString(7,"8009");
            }
            else if(District.equals("Chittagong") )
            {
                pst.setString(7,"8010");
            }
            else if(District.equals("Comilla") )
            {
                pst.setString(7,"8011");
            }
            else if(District.equals("Coxs Bazar") )
            {
                pst.setString(7,"8012");
            }
            else if(District.equals("Feni") )
            {
                pst.setString(7,"8013");
            }
            else if(District.equals("Khagrachhari") )
            {
                pst.setString(7,"8014");
            }
            else if(District.equals("Lakshmipur") )
            {
                pst.setString(7,"8015");
            }
            else if(District.equals("Noakhali") )
            {
                pst.setString(7,"8016");
            }
            else if(District.equals("Rangamati") )
            {
                pst.setString(7,"8017");
            }
                else if(District.equals("Dhaka") )
            {
                pst.setString(7,"8018");
            }
            else if(District.equals("Faridpur") )
            {
                pst.setString(7,"8019");
            }
            else if(District.equals("Gazipur") )
            {
                pst.setString(7,"8020");
            }
            else if(District.equals("Gopalganj") )
            {
                pst.setString(7,"8021");
            }
                else if(District.equals("Kishorganj") )
            {
                pst.setString(7,"8022");
            }
            else if(District.equals("Madaripur") )
            {
                pst.setString(7,"8023");
            }
            else if(District.equals("Manikganj") )
            {
                pst.setString(7,"8024");
            }
            else if(District.equals("Munshiganj") )
            {
                pst.setString(7,"8025");
            }
            else if(District.equals("Narayanganj") )
            {
                pst.setString(7,"8026");
            }
            else if(District.equals("Narsingdi") )
            {
                pst.setString(7,"8027");
            }
            else if(District.equals("Rajbari") )
            {
                pst.setString(7,"8028");
            }
            else if(District.equals("Shariatpur") )
            {
                pst.setString(7,"8029");
            }
            else if(District.equals("Tangail") )
            {
                pst.setString(7,"8030");
            }
            else if(District.equals("Bagerhat") )
            {
                pst.setString(7,"8031");
            }
            else if(District.equals("Chuadanga") )
            {
                pst.setString(7,"8032");
            }
            else if(District.equals("Jessore") )
            {
                pst.setString(7,"8033");
            }
             else if(District.equals("Jhenaidaha") )
            {
                pst.setString(7,"8034");
            }
            else if(District.equals("Khulna") )
            {
                pst.setString(7,"8035");
            }
            else if(District.equals("Kushtia") )
            {
                pst.setString(7,"8036");
            }
            else if(District.equals("Magura") )
            {
                pst.setString(7,"8037");
            }
            else if(District.equals("Meherpur") )
            {
                pst.setString(7,"8038");
            }
            else if(District.equals("Narail") )
            {
                pst.setString(7,"8039");
            }
            else if(District.equals("Satkhira") )
            {
                pst.setString(7,"8040");
            }
            else if(District.equals("Jamalpur") )
            {
                pst.setString(7,"8041");
            }
            else if(District.equals("Mymensingh") )
            {
                pst.setString(7,"8042");
            }
            else if(District.equals("Netrokona") )
            {
                pst.setString(7,"8043");
            }
            else if(District.equals("Sherpur") )
            {
                pst.setString(7,"8044");
            }
            else if(District.equals("Bogura") )
            {
                pst.setString(7,"8045");
            }
            else if(District.equals("Joypurhat") )
            {
                pst.setString(7,"8046");
            }
            else if(District.equals("Naogan") )
            {
                pst.setString(7,"8047");
            }
            else if(District.equals("Natore") )
            {
                pst.setString(7,"8048");
            }
            else if(District.equals("Chapai Nawab Ganj") )
            {
                pst.setString(7,"8049");
            }
            else if(District.equals("Pabna") )
            {
                pst.setString(7,"8050");
            }
            else if(District.equals("Rajshahi") )
            {
                pst.setString(7,"8051");
            }
            else if(District.equals("Sirajganj") )
            {
                pst.setString(7,"8052");
            }
            else if(District.equals("Dinajpur") )
            {
                pst.setString(7,"8053");
            }
            else if(District.equals("Gaibandha") )
            {
                pst.setString(7,"8054");
            }
            else if(District.equals("Kurigram") )
            {
                pst.setString(7,"8055");
            }
            else if(District.equals("Nilphamari") )
            {
                pst.setString(7,"8056");
            }
            else if(District.equals("Lalmonirhaat") )
            {
                pst.setString(7,"8057");
            }
            else if(District.equals("Panchagarh") )
            {
                pst.setString(7,"8058");
            }
            else if(District.equals("Rangpur") )
            {
                pst.setString(7,"8059");
            }
            else if(District.equals("Thakurgaon") )
            {
                pst.setString(7,"8060");
            }
            else if(District.equals("Habiganj") )
            {
                pst.setString(7,"8061");
            }
            else if(District.equals("Moulovibajar") )
            {
                pst.setString(7,"8062");
            }
            else if(District.equals("Sunamganj") )
            {
                pst.setString(7,"8063");
            }
            else if(District.equals("Sylhet") )
            {
                pst.setString(7,"8064");
            }
            
            pst.setString(8,WitnessPresentAddressTextField.getText());
            pst.setString(9,WitnessPresentThanaTextField.getText());
            
            String pDistrict = WitnessPresentDistrictComboBox.getSelectedItem().toString();
            if(pDistrict.equals("Barguna") )
            {
                pst.setString(10,"8001");
            }
            else if(pDistrict.equals("Barisal") )
            {
                pst.setString(10,"8002");
            }
            else if(pDistrict.equals("Bhola") )
            {
                pst.setString(10,"8003");
            }
            else if(pDistrict.equals("Jhalokathi") )
            {
                pst.setString(10,"8004");
            }
            else if(pDistrict.equals("Potuakhali") )
            {
                pst.setString(10,"8005");
            }
            else if(pDistrict.equals("Pirojpur") )
            {
                pst.setString(10,"8006");
            }
            else if(pDistrict.equals("Bandarban") )
            {
                pst.setString(10,"8007");
            }
            else if(pDistrict.equals("Brahmanbaria") )
            {
                pst.setString(10,"8008");
            }
            else if(pDistrict.equals("Chandpur") )
            {
                pst.setString(10,"8009");
            }
            else if(pDistrict.equals("Chittagong") )
            {
                pst.setString(10,"8010");
            }
            else if(pDistrict.equals("Comilla") )
            {
                pst.setString(10,"8011");
            }
            else if(pDistrict.equals("Coxs Bazar") )
            {
                pst.setString(10,"8012");
            }
            else if(pDistrict.equals("Feni") )
            {
                pst.setString(10,"8013");
            }
            else if(pDistrict.equals("Khagrachhari") )
            {
                pst.setString(10,"8014");
            }
            else if(pDistrict.equals("Lakshmipur") )
            {
                pst.setString(10,"8015");
            }
            else if(pDistrict.equals("Noakhali") )
            {
                pst.setString(10,"8016");
            }
            else if(pDistrict.equals("Rangamati") )
            {
                pst.setString(10,"8017");
            }
            else if(pDistrict.equals("Dhaka") )
            {
                pst.setString(10,"8018");
            }
            else if(pDistrict.equals("Faridpur") )
            {
                pst.setString(10,"8019");
            }
            else if(pDistrict.equals("Gazipur") )
            {
                pst.setString(10,"8020");
            }
            else if(pDistrict.equals("Gopalganj") )
            {
                pst.setString(10,"8021");
            }
            else if(pDistrict.equals("Kishorganj") )
            {
                pst.setString(10,"8022");
            }
            else if(pDistrict.equals("Madaripur") )
            {
                pst.setString(10,"8023");
            }
            else if(pDistrict.equals("Manikganj") )
            {
                pst.setString(10,"8024");
            }
            else if(pDistrict.equals("Munshiganj") )
            {
                pst.setString(10,"8025");
            }
            else if(pDistrict.equals("Narayanganj") )
            {
                pst.setString(10,"8026");
            }
            else if(pDistrict.equals("Narsingdi") )
            {
                pst.setString(10,"8027");
            }
            else if(pDistrict.equals("Rajbari") )
            {
                pst.setString(10,"8028");
            }
            else if(pDistrict.equals("Shariatpur") )
            {
                pst.setString(10,"8029");
            }
            else if(pDistrict.equals("Tangail") )
            {
                pst.setString(10,"8030");
            }
            else if(pDistrict.equals("Bagerhat") )
            {
                pst.setString(10,"8031");
            }
            else if(pDistrict.equals("Chuadanga") )
            {
                pst.setString(10,"8032");
            }
            else if(pDistrict.equals("Jessore") )
            {
                pst.setString(10,"8033");
            }
            else if(pDistrict.equals("Jhenaidaha") )
            {
                pst.setString(10,"8034");
            }
            else if(pDistrict.equals("Khulna") )
            {
                pst.setString(10,"8035");
            }
            else if(pDistrict.equals("Kushtia") )
            {
                pst.setString(10,"8036");
            }
            else if(pDistrict.equals("Magura") )
            {
                pst.setString(10,"8037");
            }
            else if(pDistrict.equals("Meherpur") )
            {
                pst.setString(10,"8038");
            }
            else if(pDistrict.equals("Narail") )
            {
                pst.setString(10,"8039");
            }
            else if(pDistrict.equals("Satkhira") )
            {
                pst.setString(10,"8040");
            }
            else if(pDistrict.equals("Jamalpur") )
            {
                pst.setString(10,"8041");
            }
            else if(pDistrict.equals("Mymensingh") )
            {
                pst.setString(10,"8042");
            }
            else if(pDistrict.equals("Netrokona") )
            {
                pst.setString(10,"8043");
            }
            else if(pDistrict.equals("Sherpur") )
            {
                pst.setString(10,"8044");
            }
            else if(pDistrict.equals("Bogura") )
            {
                pst.setString(10,"8045");
            }
            else if(pDistrict.equals("Joypurhat") )
            {
                pst.setString(10,"8046");
            }
            else if(pDistrict.equals("Naogan") )
            {
                pst.setString(10,"8047");
            }
            else if(pDistrict.equals("Natore") )
            {
                pst.setString(10,"8048");
            }
            else if(pDistrict.equals("Chapai Nawab Ganj") )
            {
                pst.setString(10,"8049");
            }
            else if(pDistrict.equals("Pabna") )
            {
                pst.setString(10,"8050");
            }
            else if(pDistrict.equals("Rajshahi") )
            {
                pst.setString(10,"8051");
            }
            else if(pDistrict.equals("Sirajganj") )
            {
                pst.setString(10,"8052");
            }
            else if(pDistrict.equals("Dinajpur") )
            {
                pst.setString(10,"8053");
            }
            else if(pDistrict.equals("Gaibandha") )
            {
                pst.setString(10,"8054");
            }
            else if(pDistrict.equals("Kurigram") )
            {
                pst.setString(10,"8055");
            }
            else if(pDistrict.equals("Nilphamari") )
            {
                pst.setString(10,"8056");
            }
            else if(pDistrict.equals("Lalmonirhaat") )
            {
                pst.setString(10,"8057");
            }
            else if(pDistrict.equals("Panchagarh") )
            {
                pst.setString(10,"8058");
            }
            else if(pDistrict.equals("Rangpur") )
            {
                pst.setString(10,"8059");
            }
            else if(pDistrict.equals("Thakurgaon") )
            {
                pst.setString(10,"8060");
            }
            else if(pDistrict.equals("Habiganj") )
            {
                pst.setString(10,"8061");
            }
            else if(pDistrict.equals("Moulovibajar") )
            {
                pst.setString(10,"8062");
            }
            else if(pDistrict.equals("Sunamganj") )
            {
                pst.setString(10,"8063");
            }
            else if(pDistrict.equals("Sylhet") )
            {
                pst.setString(10,"8064");
            }
            
            
            pst.setString(11,MobileNoTextField.getText());
           
            
            if((WitnessCaseIdTextField.getText().equals(""))||(WitnessNameTextField.getText().equals("")) || (WitnessAgeTextField.getText().equals("")) || (WitnessThanaTextField.getText().equals("")) || (District.equals("")) || (WitnessPresentAddressTextField.getText().equals(""))|| (MobileNoTextField.getText().equals("")) ){
                JOptionPane.showMessageDialog(null,"Please fill up the required(*) text fields!!");
            }
            else{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Inserted SUCCESSFULLY");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(VictimPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SaveButtonWitnessFormActionPerformed

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
    private javax.swing.JTextField MobileNoTextField;
    private javax.swing.JButton SaveButtonWitnessForm;
    private javax.swing.JLabel WintessDistrict;
    private javax.swing.JLabel WintessNameLabel;
    private javax.swing.JLabel WintessNameLabel1;
    private javax.swing.JLabel WitnessAge;
    private javax.swing.JTextField WitnessAgeTextField;
    private javax.swing.JTextField WitnessCaseIdTextField;
    private javax.swing.JComboBox<String> WitnessDistrictComboBox;
    private javax.swing.JLabel WitnessFathersNameLabel;
    private javax.swing.JTextField WitnessFathersNameTextField;
    private javax.swing.JLabel WitnessForm;
    private javax.swing.JTextField WitnessNameTextField;
    private javax.swing.JTextField WitnessPresentAddressTextField;
    private javax.swing.JLabel WitnessPresentAdress;
    private javax.swing.JLabel WitnessPresentDistrict;
    private javax.swing.JComboBox<String> WitnessPresentDistrictComboBox;
    private javax.swing.JTextField WitnessPresentThanaTextField;
    private javax.swing.JLabel WitnessThana;
    private javax.swing.JTextField WitnessThanaTextField;
    private javax.swing.JLabel WitnessVillage;
    private javax.swing.JTextField WitnessVillageTextField;
    private javax.swing.JLabel WitnesspresentThana;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
