
package PoliceStationManagement;
import SQLPackage.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EvidenceUpdate extends javax.swing.JFrame {


    public EvidenceUpdate() {
        initComponents();
        setSize(1250,885);
        setTitle("Evidence Form");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        CaseNo = new javax.swing.JLabel();
        EvidenceCaseIdTextField = new javax.swing.JTextField();
        EvidenceFormLabel = new javax.swing.JLabel();
        EvidenceNameLabel = new javax.swing.JLabel();
        EvidenceNameTextField = new javax.swing.JTextField();
        EvidenceAreaLabel = new javax.swing.JLabel();
        EvidenceAreaTextField = new javax.swing.JTextField();
        EvidenceTimeLabel = new javax.swing.JLabel();
        EvidenceTimeTextField = new javax.swing.JTextField();
        EvidenceCollectedFromLabel = new javax.swing.JLabel();
        EvidenceCollectedFromTextField = new javax.swing.JTextField();
        EvidenceStatusLabel = new javax.swing.JLabel();
        EvidenceStatusTextField = new javax.swing.JTextField();
        TypeOfEvidenceLabel = new javax.swing.JLabel();
        TypeOfEvidenceTextField = new javax.swing.JTextField();
        BackButtonEvidenceForm = new javax.swing.JButton();
        UpdateButtonEvidenceForm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(null);

        CaseNo.setFont(new java.awt.Font("Adobe Hebrew", 1, 36)); // NOI18N
        CaseNo.setForeground(new java.awt.Color(255, 255, 255));
        CaseNo.setText("Case No*");
        panel1.add(CaseNo);
        CaseNo.setBounds(70, 216, 160, 30);

        EvidenceCaseIdTextField.setEditable(false);
        EvidenceCaseIdTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EvidenceCaseIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvidenceCaseIdTextFieldActionPerformed(evt);
            }
        });
        panel1.add(EvidenceCaseIdTextField);
        EvidenceCaseIdTextField.setBounds(400, 210, 390, 40);

        EvidenceFormLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        EvidenceFormLabel.setForeground(new java.awt.Color(255, 255, 255));
        EvidenceFormLabel.setText("Evidence Form");
        panel1.add(EvidenceFormLabel);
        EvidenceFormLabel.setBounds(480, 90, 340, 60);

        EvidenceNameLabel.setFont(new java.awt.Font("Adobe Hebrew", 1, 36)); // NOI18N
        EvidenceNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        EvidenceNameLabel.setText("Evidence Name*");
        panel1.add(EvidenceNameLabel);
        EvidenceNameLabel.setBounds(60, 280, 260, 37);

        EvidenceNameTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EvidenceNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvidenceNameTextFieldActionPerformed(evt);
            }
        });
        panel1.add(EvidenceNameTextField);
        EvidenceNameTextField.setBounds(400, 280, 390, 40);

        EvidenceAreaLabel.setFont(new java.awt.Font("Adobe Hebrew", 1, 36)); // NOI18N
        EvidenceAreaLabel.setForeground(new java.awt.Color(255, 255, 255));
        EvidenceAreaLabel.setText("Area");
        panel1.add(EvidenceAreaLabel);
        EvidenceAreaLabel.setBounds(60, 340, 240, 37);

        EvidenceAreaTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        panel1.add(EvidenceAreaTextField);
        EvidenceAreaTextField.setBounds(400, 340, 390, 40);

        EvidenceTimeLabel.setFont(new java.awt.Font("Adobe Hebrew", 1, 36)); // NOI18N
        EvidenceTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        EvidenceTimeLabel.setText("Time");
        panel1.add(EvidenceTimeLabel);
        EvidenceTimeLabel.setBounds(60, 400, 240, 37);

        EvidenceTimeTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        panel1.add(EvidenceTimeTextField);
        EvidenceTimeTextField.setBounds(400, 400, 390, 40);

        EvidenceCollectedFromLabel.setFont(new java.awt.Font("Adobe Hebrew", 1, 36)); // NOI18N
        EvidenceCollectedFromLabel.setForeground(new java.awt.Color(255, 255, 255));
        EvidenceCollectedFromLabel.setText("Collected From");
        panel1.add(EvidenceCollectedFromLabel);
        EvidenceCollectedFromLabel.setBounds(60, 460, 260, 37);

        EvidenceCollectedFromTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        panel1.add(EvidenceCollectedFromTextField);
        EvidenceCollectedFromTextField.setBounds(400, 460, 390, 40);

        EvidenceStatusLabel.setFont(new java.awt.Font("Adobe Hebrew", 1, 36)); // NOI18N
        EvidenceStatusLabel.setForeground(new java.awt.Color(255, 255, 255));
        EvidenceStatusLabel.setText("Status");
        panel1.add(EvidenceStatusLabel);
        EvidenceStatusLabel.setBounds(60, 520, 220, 40);

        EvidenceStatusTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        panel1.add(EvidenceStatusTextField);
        EvidenceStatusTextField.setBounds(400, 520, 390, 40);

        TypeOfEvidenceLabel.setFont(new java.awt.Font("Adobe Hebrew", 1, 36)); // NOI18N
        TypeOfEvidenceLabel.setForeground(new java.awt.Color(255, 255, 255));
        TypeOfEvidenceLabel.setText("Type Of Evidence*");
        panel1.add(TypeOfEvidenceLabel);
        TypeOfEvidenceLabel.setBounds(60, 580, 290, 30);

        TypeOfEvidenceTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        panel1.add(TypeOfEvidenceTextField);
        TypeOfEvidenceTextField.setBounds(400, 580, 390, 40);

        BackButtonEvidenceForm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BackButtonEvidenceForm.setText("BACK");
        BackButtonEvidenceForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonEvidenceFormActionPerformed(evt);
            }
        });
        panel1.add(BackButtonEvidenceForm);
        BackButtonEvidenceForm.setBounds(70, 640, 150, 50);

        UpdateButtonEvidenceForm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UpdateButtonEvidenceForm.setText("UPDATE");
        UpdateButtonEvidenceForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonEvidenceFormActionPerformed(evt);
            }
        });
        panel1.add(UpdateButtonEvidenceForm);
        UpdateButtonEvidenceForm.setBounds(1000, 637, 170, 50);

        jLabel1.setFont(new java.awt.Font("Adobe Hebrew", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please enter the following details:");
        panel1.add(jLabel1);
        jLabel1.setBounds(60, 169, 380, 30);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/logo.png"))); // NOI18N
        panel1.add(logo);
        logo.setBounds(1010, 10, 210, 220);

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/policeStation.jpg"))); // NOI18N
        panel1.add(Image);
        Image.setBounds(0, -110, 1390, 1110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonEvidenceFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonEvidenceFormActionPerformed
     
          MainPage mObj = new MainPage();
        mObj.show();
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonEvidenceFormActionPerformed

    private void UpdateButtonEvidenceFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonEvidenceFormActionPerformed
          ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
       
       
            
            int evi_caseId= Integer.parseInt(EvidenceCaseIdTextField.getText());
            String evi_name=EvidenceNameTextField.getText();
            String evi_area=EvidenceAreaTextField.getText();
            String evi_time=EvidenceTimeTextField.getText() ;
            String evi_collected=EvidenceCollectedFromTextField.getText() ;
            String evi_status=EvidenceStatusTextField.getText();
            String evi_type=TypeOfEvidenceTextField.getText();
            
            String updatequery= "UPDATE Evidence SET CaseNo='"+evi_caseId+"',EvidenceName='"+evi_name+"',Area='"+evi_area+"',Time='"+evi_time+"',CollectedFrom='"+evi_collected+"',EvidenceStatus='"+evi_status+"',TypeOfEvidence='"+evi_type+"' WHERE CaseNo='"+evi_caseId+"'";    
            try {
            
            Statement st = (Statement) cnObj.connection.createStatement();
            st.executeUpdate(updatequery);
            JOptionPane.showMessageDialog(null,"Updated SUCCESSFULLY");
        } catch (SQLException ex) {
            Logger.getLogger(AccusedUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
   
            
            
            
        
        
                          
    }//GEN-LAST:event_UpdateButtonEvidenceFormActionPerformed

    private void EvidenceNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvidenceNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EvidenceNameTextFieldActionPerformed

    private void EvidenceCaseIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvidenceCaseIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EvidenceCaseIdTextFieldActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvidenceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButtonEvidenceForm;
    private javax.swing.JLabel CaseNo;
    private javax.swing.JLabel EvidenceAreaLabel;
    public javax.swing.JTextField EvidenceAreaTextField;
    public javax.swing.JTextField EvidenceCaseIdTextField;
    private javax.swing.JLabel EvidenceCollectedFromLabel;
    public javax.swing.JTextField EvidenceCollectedFromTextField;
    private javax.swing.JLabel EvidenceFormLabel;
    private javax.swing.JLabel EvidenceNameLabel;
    public javax.swing.JTextField EvidenceNameTextField;
    private javax.swing.JLabel EvidenceStatusLabel;
    public javax.swing.JTextField EvidenceStatusTextField;
    private javax.swing.JLabel EvidenceTimeLabel;
    public javax.swing.JTextField EvidenceTimeTextField;
    private javax.swing.JLabel Image;
    private javax.swing.JLabel TypeOfEvidenceLabel;
    public javax.swing.JTextField TypeOfEvidenceTextField;
    private javax.swing.JButton UpdateButtonEvidenceForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
