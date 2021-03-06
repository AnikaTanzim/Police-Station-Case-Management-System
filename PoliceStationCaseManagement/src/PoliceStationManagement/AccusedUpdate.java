package PoliceStationManagement;
import SQLPackage.*;
import PoliceStationManagement.MainPage;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AccusedUpdate extends javax.swing.JFrame {

    
    public AccusedUpdate() {
        initComponents();
        setTitle("Accused Form");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_accused = new javax.swing.JPanel();
        jTextField_caseId = new javax.swing.JTextField();
        jLabel_PresentDistrict1 = new javax.swing.JLabel();
        jButton_acc_update = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
        jTextField_presentThana = new javax.swing.JTextField();
        jTextField_presentAddress = new javax.swing.JTextField();
        jTextField4_thana = new javax.swing.JTextField();
        jTextField_village = new javax.swing.JTextField();
        jTextField_fathersName = new javax.swing.JTextField();
        jTextField_age = new javax.swing.JTextField();
        jTextField_name = new javax.swing.JTextField();
        jLabel_PresentDistrict = new javax.swing.JLabel();
        jLabel_PresentThana = new javax.swing.JLabel();
        jLabel_PresentAdress = new javax.swing.JLabel();
        jLabel_District = new javax.swing.JLabel();
        jLabel_Thana = new javax.swing.JLabel();
        jLabel_Village = new javax.swing.JLabel();
        jLabel_fathersName = new javax.swing.JLabel();
        jLabel_age = new javax.swing.JLabel();
        jLabel_AccusedName = new javax.swing.JLabel();
        jLabel_accused = new javax.swing.JLabel();
        jComboBox_district = new javax.swing.JComboBox<>();
        jComboBox_presentDistrict = new javax.swing.JComboBox<>();
        jLabel_logo = new javax.swing.JLabel();
        jLabel_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_accused.setLayout(null);

        jTextField_caseId.setEditable(false);
        jTextField_caseId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel_accused.add(jTextField_caseId);
        jTextField_caseId.setBounds(290, 160, 550, 40);

        jLabel_PresentDistrict1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_PresentDistrict1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PresentDistrict1.setText("Case No * :");
        jPanel_accused.add(jLabel_PresentDistrict1);
        jLabel_PresentDistrict1.setBounds(70, 160, 150, 22);

        jButton_acc_update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_acc_update.setText("UPDATE");
        jButton_acc_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_acc_updateActionPerformed(evt);
            }
        });
        jPanel_accused.add(jButton_acc_update);
        jButton_acc_update.setBounds(980, 770, 190, 60);

        jButton_back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_back.setText("BACK");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });
        jPanel_accused.add(jButton_back);
        jButton_back.setBounds(60, 780, 200, 60);

        jTextField_presentThana.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel_accused.add(jTextField_presentThana);
        jTextField_presentThana.setBounds(290, 640, 550, 40);

        jTextField_presentAddress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel_accused.add(jTextField_presentAddress);
        jTextField_presentAddress.setBounds(290, 580, 550, 40);

        jTextField4_thana.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel_accused.add(jTextField4_thana);
        jTextField4_thana.setBounds(290, 460, 550, 40);

        jTextField_village.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel_accused.add(jTextField_village);
        jTextField_village.setBounds(290, 400, 550, 40);

        jTextField_fathersName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel_accused.add(jTextField_fathersName);
        jTextField_fathersName.setBounds(290, 340, 550, 40);

        jTextField_age.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ageActionPerformed(evt);
            }
        });
        jPanel_accused.add(jTextField_age);
        jTextField_age.setBounds(290, 280, 550, 40);

        jTextField_name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel_accused.add(jTextField_name);
        jTextField_name.setBounds(290, 220, 550, 40);

        jLabel_PresentDistrict.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_PresentDistrict.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PresentDistrict.setText("Present District:");
        jPanel_accused.add(jLabel_PresentDistrict);
        jLabel_PresentDistrict.setBounds(70, 710, 150, 22);

        jLabel_PresentThana.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_PresentThana.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PresentThana.setText("Present Thana:");
        jPanel_accused.add(jLabel_PresentThana);
        jLabel_PresentThana.setBounds(70, 650, 140, 22);

        jLabel_PresentAdress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_PresentAdress.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PresentAdress.setText("Present Adress:");
        jPanel_accused.add(jLabel_PresentAdress);
        jLabel_PresentAdress.setBounds(70, 590, 142, 22);

        jLabel_District.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_District.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_District.setText("District:");
        jPanel_accused.add(jLabel_District);
        jLabel_District.setBounds(70, 530, 160, 22);

        jLabel_Thana.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Thana.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Thana.setText("Thana:");
        jPanel_accused.add(jLabel_Thana);
        jLabel_Thana.setBounds(70, 470, 150, 22);

        jLabel_Village.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Village.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Village.setText("Village:");
        jPanel_accused.add(jLabel_Village);
        jLabel_Village.setBounds(70, 410, 160, 30);

        jLabel_fathersName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_fathersName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_fathersName.setText("Father's Name:");
        jPanel_accused.add(jLabel_fathersName);
        jLabel_fathersName.setBounds(70, 350, 160, 30);

        jLabel_age.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_age.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_age.setText("Age:");
        jPanel_accused.add(jLabel_age);
        jLabel_age.setBounds(70, 290, 140, 22);

        jLabel_AccusedName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_AccusedName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AccusedName.setText("Name:");
        jPanel_accused.add(jLabel_AccusedName);
        jLabel_AccusedName.setBounds(70, 230, 160, 22);

        jLabel_accused.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_accused.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_accused.setText("ACCUSED UPDATE FORM:");
        jPanel_accused.add(jLabel_accused);
        jLabel_accused.setBounds(60, 50, 470, 40);

        jComboBox_district.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox_district.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Choose--","Barguna", "Barisal","Bhola","Jhalokathi","Potuakhali", "Pirojpur","Bandarban","Brahmanbaria","Chandpur","Chittagong","Comilla", "Coxs Bazar",
            "Feni", "Khagrachhari","Lakshmipur","Noakhali","Rangamati", "Dhaka","Faridpur", "Gazipur","Gopalganj","Kishorganj","Madaripur", "Manikganj",
            "Munshiganj", "Narayanganj","Narsingdi","Rajbari","Shariatpur", "Tangail","Bagerhat", "Chuadanga","Jessore","Jhenaidaha","Khulna", "Kushtia",
            "Magura", "Meherpur","Narail","Satkhira","Jamalpur", "Mymensingh","Netrokona", "Sherpur","Bogura","Joypurhat","Naogan", "Natore",
            "Chapai Nawab Ganj", "Pabna","Rajshahi","Sirajganj","Dinajpur", "Gaibandha","Kurigram","Nilphamari","Lalmonirhaat","Panchagarh","Rangpur","Thakurgaon",
            "Habiganj","Moulovibajar", "Sunamganj","Sylhet" }));
jPanel_accused.add(jComboBox_district);
jComboBox_district.setBounds(290, 520, 550, 40);

jComboBox_presentDistrict.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jComboBox_presentDistrict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"--Choose--","Barguna", "Barisal","Bhola","Jhalokathi","Potuakhali", "Pirojpur","Bandarban","Brahmanbaria","Chandpur","Chittagong","Comilla", "Coxs Bazar",
    "Feni", "Khagrachhari","Lakshmipur","Noakhali","Rangamati", "Dhaka","Faridpur", "Gazipur","Gopalganj","Kishorganj","Madaripur", "Manikganj",
    "Munshiganj", "Narayanganj","Narsingdi","Rajbari","Shariatpur", "Tangail","Bagerhat", "Chuadanga","Jessore","Jhenaidaha","Khulna", "Kushtia",
    "Magura", "Meherpur","Narail","Satkhira","Jamalpur", "Mymensingh","Netrokona", "Sherpur","Bogura","Joypurhat","Naogan", "Natore",
    "Chapai Nawab Ganj", "Pabna","Rajshahi","Sirajganj","Dinajpur", "Gaibandha","Kurigram","Nilphamari","Lalmonirhaat","Panchagarh","Rangpur","Thakurgaon",
    "Habiganj","Moulovibajar", "Sunamganj","Sylhet"}));
    jPanel_accused.add(jComboBox_presentDistrict);
    jComboBox_presentDistrict.setBounds(290, 700, 550, 40);

    jLabel_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/logo.png"))); // NOI18N
    jPanel_accused.add(jLabel_logo);
    jLabel_logo.setBounds(990, 20, 210, 210);

    jLabel_background.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/bg_pic.jpg"))); // NOI18N
    jLabel_background.setText("jLabel1");
    jPanel_accused.add(jLabel_background);
    jLabel_background.setBounds(0, 0, 1250, 890);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel_accused, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel_accused, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ageActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        // TODO add your handling code here:
          MainPage mObj = new MainPage();
        mObj.show();
        this.setVisible(false);
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_acc_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_acc_updateActionPerformed
        
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
        
            int acc_caseNo = Integer.parseInt(jTextField_caseId.getText());
            String acc_name= jTextField_name.getText();
            String acc_age =jTextField_age.getText();
            String acc_fathersname = jTextField_fathersName.getText();
            String acc_village = jTextField_village.getText();
            String acc_thana= jTextField4_thana.getText();
            
            String District = jComboBox_district.getSelectedItem().toString();
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
          
            
            String acc_pre_add= jTextField_presentAddress.getText();
           String acc_pre_thana = jTextField_presentThana.getText();
            String pDistrict = jComboBox_presentDistrict.getSelectedItem().toString();
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
            AccusedTable acc_update= new AccusedTable();
            //int acc_Id = Integer.parseInt(acc_update.acc_id);
            String updatequery= "UPDATE Accused SET CaseNo='"+acc_caseNo+"', AccusedName='"+acc_name+"', Age='"+acc_age+"',FathersName ='"+acc_fathersname+"',Village='"+acc_village+"',Thana='"+acc_thana+"',DistrictId ='"+dis+"',PresentAddress ='"+acc_pre_add+"',PresentThana='"+acc_pre_thana+"', PresentDistrictId ='"+pdis+"' WHERE CaseNo='"+acc_caseNo+"' ";
            
        try {
            
            Statement st = (Statement) cnObj.connection.createStatement();
            st.executeUpdate(updatequery);
            JOptionPane.showMessageDialog(null,"Updated SUCCESSFULLY");
        } catch (SQLException ex) {
            Logger.getLogger(AccusedUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
   
        
    }//GEN-LAST:event_jButton_acc_updateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AccusedJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccusedJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccusedJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccusedJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccusedJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_acc_update;
    private javax.swing.JButton jButton_back;
    public javax.swing.JComboBox<String> jComboBox_district;
    public javax.swing.JComboBox<String> jComboBox_presentDistrict;
    private javax.swing.JLabel jLabel_AccusedName;
    private javax.swing.JLabel jLabel_District;
    private javax.swing.JLabel jLabel_PresentAdress;
    private javax.swing.JLabel jLabel_PresentDistrict;
    private javax.swing.JLabel jLabel_PresentDistrict1;
    private javax.swing.JLabel jLabel_PresentThana;
    private javax.swing.JLabel jLabel_Thana;
    private javax.swing.JLabel jLabel_Village;
    private javax.swing.JLabel jLabel_accused;
    private javax.swing.JLabel jLabel_age;
    private javax.swing.JLabel jLabel_background;
    private javax.swing.JLabel jLabel_fathersName;
    private javax.swing.JLabel jLabel_logo;
    private javax.swing.JPanel jPanel_accused;
    public javax.swing.JTextField jTextField4_thana;
    public javax.swing.JTextField jTextField_age;
    public javax.swing.JTextField jTextField_caseId;
    public javax.swing.JTextField jTextField_fathersName;
    public javax.swing.JTextField jTextField_name;
    public javax.swing.JTextField jTextField_presentAddress;
    public javax.swing.JTextField jTextField_presentThana;
    public javax.swing.JTextField jTextField_village;
    // End of variables declaration//GEN-END:variables
}
