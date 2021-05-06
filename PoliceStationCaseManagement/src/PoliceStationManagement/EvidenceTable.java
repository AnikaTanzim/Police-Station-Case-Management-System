
package PoliceStationManagement;
import SQLPackage.*;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EvidenceTable extends javax.swing.JFrame {
    
    EvidenceUpdate evidenceupdate = new EvidenceUpdate();
    String evi_id,evi_name,evi_caseNo,evi_area,evi_time,evi_collectedfrom,evi_status,evi_type;

    public EvidenceTable() {
        initComponents();
        setSize(1250,885);
        setTitle("EvidenceTable");
        Font font = new Font("Tahoma", Font.PLAIN, 20);
        this.EvidenceTable.setFont(font);
        int gap = 15;
        this.EvidenceTable.setRowHeight(this.EvidenceTable.getRowHeight()+gap);
           try {
            ShowEvidence();
            
        } catch (SQLException ex) {
            Logger.getLogger(VictimTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        BackButtonEvidenceTable = new javax.swing.JButton();
        SearchTextField = new javax.swing.JTextField();
        EvidenceUpdateButton = new javax.swing.JButton();
        SearchLabel = new javax.swing.JLabel();
        searchByLabel = new javax.swing.JLabel();
        SearchComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        EvidenceTable = new javax.swing.JTable();
        EvidenceSortComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Evidence Table");
        panel1.add(jLabel2);
        jLabel2.setBounds(470, 150, 350, 80);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/logo.png"))); // NOI18N
        panel1.add(logo);
        logo.setBounds(1010, 0, 210, 220);

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        panel1.add(deleteButton);
        deleteButton.setBounds(1050, 630, 170, 50);

        BackButtonEvidenceTable.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BackButtonEvidenceTable.setText("BACK");
        BackButtonEvidenceTable.setToolTipText("");
        BackButtonEvidenceTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonEvidenceTableActionPerformed(evt);
            }
        });
        panel1.add(BackButtonEvidenceTable);
        BackButtonEvidenceTable.setBounds(50, 640, 190, 50);

        SearchTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextFieldKeyReleased(evt);
            }
        });
        panel1.add(SearchTextField);
        SearchTextField.setBounds(480, 50, 460, 40);

        EvidenceUpdateButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EvidenceUpdateButton.setText("UPDATE");
        EvidenceUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvidenceUpdateButtonActionPerformed(evt);
            }
        });
        panel1.add(EvidenceUpdateButton);
        EvidenceUpdateButton.setBounds(840, 630, 180, 50);

        SearchLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SearchLabel.setForeground(new java.awt.Color(240, 240, 240));
        SearchLabel.setText("Search : ");
        panel1.add(SearchLabel);
        SearchLabel.setBounds(390, 50, 80, 30);

        searchByLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        searchByLabel.setForeground(new java.awt.Color(240, 240, 240));
        searchByLabel.setText("Search By : ");
        panel1.add(searchByLabel);
        searchByLabel.setBounds(70, 50, 100, 30);

        SearchComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SearchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--","Evidence Id", "CaseNo", "Name", "Area", "Time", "CollectedFrom", "Evidence Status", "Type Of Evidence" }));
        SearchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchComboBoxActionPerformed(evt);
            }
        });
        panel1.add(SearchComboBox);
        SearchComboBox.setBounds(180, 40, 180, 40);

        EvidenceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Evidence Id", "CaseNo", "Name", "Area", "Time", "CollectedFrom", "Evidence Status", "Type Of Evidence"
            }
        ));
        EvidenceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EvidenceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EvidenceTable);

        panel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 220, 1250, 340);

        EvidenceSortComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EvidenceSortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "EvidenceId  ", "CaseNo", "EvidenceName", "Area", "Time", "CollectedFrom", "EvidenceStatus", "Type Of Evidence" }));
        EvidenceSortComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvidenceSortComboBoxActionPerformed(evt);
            }
        });
        panel1.add(EvidenceSortComboBox);
        EvidenceSortComboBox.setBounds(180, 110, 180, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SORT:");
        jLabel3.setToolTipText("");
        panel1.add(jLabel3);
        jLabel3.setBounds(80, 120, 70, 30);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/bg_pic.jpg"))); // NOI18N
        panel1.add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 1250, 890);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public ArrayList<Evidence> EvidenceList() throws SQLException
    {
        ArrayList<Evidence> EvidenceList = new ArrayList<>();
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
        String Query1="SELECT * FROM Evidence";  
        Statement st=cnObj.connection.createStatement();
        ResultSet rs= st.executeQuery(Query1);
        Evidence EvidenceObj;
        while(rs.next())
        {
            EvidenceObj=new Evidence(rs.getInt("EvidenceId"),rs.getInt("CaseNo"),rs.getString("EvidenceName"),rs.getString("Area"),rs.getString("Time"),rs.getString("CollectedFrom"),rs.getString("EvidenceStatus"),rs.getString("TypeOfEvidence"));
            EvidenceList.add(EvidenceObj);
        }
        return EvidenceList;
    }

    public void ShowEvidence() throws SQLException
    {
        ArrayList<Evidence> eList=EvidenceList();
        DefaultTableModel Model= (DefaultTableModel)EvidenceTable.getModel();
        Object[] row= new Object[8];
        for(int i=0;i<eList.size();i++)
        {
            row[0]=eList.get(i).getEvidenceId();
            row[1]=eList.get(i).getCaseNo();
            row[2]=eList.get(i).getEvidenceName();
            row[3]=eList.get(i).getArea();
            row[4]=eList.get(i).getTime();  
            row[5]=eList.get(i).getCollectedFrom();
            row[6]=eList.get(i).getEvidenceStatus();
            row[7]=eList.get(i).getTypeOfEvidence();
         
            Model.addRow(row);
        }
         
    }
    private void BackButtonEvidenceTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonEvidenceTableActionPerformed
        // TODO add your handling code here:
          MainPage mObj = new MainPage();
        mObj.show();
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonEvidenceTableActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
         try{
            ConnectMSSQL cnObj = new ConnectMSSQL();
            cnObj.connectDB();
            int row = EvidenceTable.getSelectedRow();
            String value = (EvidenceTable.getModel().getValueAt(row, 0).toString());
            String query = "DELETE FROM Evidence WHERE EvidenceId = "+value;
            PreparedStatement pst = (PreparedStatement) cnObj.connection.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) EvidenceTable.getModel();
            model.setRowCount(0);
            ShowEvidence();
            JOptionPane.showMessageDialog(null,"Deleted Successfully!!");
            
        }
        catch(Exception e){
            Logger.getLogger(VictimPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void SearchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchComboBoxActionPerformed

    private void SearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextFieldKeyReleased
        // TODO add your handling code here:
        String columnToSearch = SearchComboBox.getSelectedItem().toString();
        String stringToSearch = SearchTextField.getText();
        try{
            ConnectMSSQL cnObj = new ConnectMSSQL();
            cnObj.connectDB();
            DefaultTableModel Model= (DefaultTableModel)EvidenceTable.getModel();
            Model.setRowCount(0);
            Object[] row= new Object[8];
            if("Evidence Id".equals(columnToSearch))
            {
                String query = "SELECT * FROM Evidence WHERE EvidenceId LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("EvidenceId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("EvidenceName");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("Time");
                    row[5] = rs.getString("CollectedFrom");
                    row[6] = rs.getString("EvidenceStatus");
                    row[7] = rs.getString("TypeOfEvidence");
                    Model.addRow(row);
                }
            
            }
            else if("CaseNo".equals(columnToSearch))
            {
                String query = "SELECT * FROM Evidence WHERE CaseNo LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("EvidenceId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("EvidenceName");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("Time");
                    row[5] = rs.getString("CollectedFrom");
                    row[6] = rs.getString("EvidenceStatus");
                    row[7] = rs.getString("TypeOfEvidence");
                    Model.addRow(row);
                }
            
            }
            else if("Name".equals(columnToSearch))
            {
                String query = "SELECT * FROM Evidence WHERE EvidenceName LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("EvidenceId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("EvidenceName");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("Time");
                    row[5] = rs.getString("CollectedFrom");
                    row[6] = rs.getString("EvidenceStatus");
                    row[7] = rs.getString("TypeOfEvidence");
                    Model.addRow(row);
                }
            
            }
            else if("Area".equals(columnToSearch))
            {
                String query = "SELECT * FROM Evidence WHERE Area LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("EvidenceId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("EvidenceName");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("Time");
                    row[5] = rs.getString("CollectedFrom");
                    row[6] = rs.getString("EvidenceStatus");
                    row[7] = rs.getString("TypeOfEvidence");
                    Model.addRow(row);
                }
            
            }
            else if("Time".equals(columnToSearch))
            {
                String query = "SELECT * FROM Evidence WHERE Time LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("EvidenceId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("EvidenceName");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("Time");
                    row[5] = rs.getString("CollectedFrom");
                    row[6] = rs.getString("EvidenceStatus");
                    row[7] = rs.getString("TypeOfEvidence");
                    Model.addRow(row);
                }
            
            }
            else if("CollectedFrom".equals(columnToSearch))
            {
                String query = "SELECT * FROM Evidence WHERE CollectedFrom LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("EvidenceId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("EvidenceName");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("Time");
                    row[5] = rs.getString("CollectedFrom");
                    row[6] = rs.getString("EvidenceStatus");
                    row[7] = rs.getString("TypeOfEvidence");
                    Model.addRow(row);
                }
            
            }
            else if("Evidence Status".equals(columnToSearch))
            {
                String query = "SELECT * FROM Evidence WHERE EvidenceStatus LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("EvidenceId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("EvidenceName");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("Time");
                    row[5] = rs.getString("CollectedFrom");
                    row[6] = rs.getString("EvidenceStatus");
                    row[7] = rs.getString("TypeOfEvidence");
                    Model.addRow(row);
                }
            
            }
            else if("Type Of Evidence".equals(columnToSearch))
            {
                String query = "SELECT * FROM Evidence WHERE TypeOfEvidence LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("EvidenceId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("EvidenceName");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("Time");
                    row[5] = rs.getString("CollectedFrom");
                    row[6] = rs.getString("EvidenceStatus");
                    row[7] = rs.getString("TypeOfEvidence");
                    Model.addRow(row);
                }
            
            }
            
            else if("".equals(columnToSearch))
            {
                ShowEvidence();
            }
        }catch(Exception e){
            Logger.getLogger(VictimPage.class.getName()).log(Level.SEVERE, null, e);
        }
        
       
    }//GEN-LAST:event_SearchTextFieldKeyReleased

    private void EvidenceUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvidenceUpdateButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        evidenceupdate.setVisible(true);
        
        evidenceupdate.EvidenceCaseIdTextField.setText(evi_caseNo);
        evidenceupdate.EvidenceNameTextField.setText(evi_name);
        evidenceupdate.EvidenceAreaTextField.setText(evi_area);
        evidenceupdate.EvidenceTimeTextField.setText(evi_time);
        evidenceupdate.EvidenceCollectedFromTextField.setText(evi_collectedfrom);
        evidenceupdate.EvidenceStatusTextField.setText(evi_status);
        evidenceupdate.TypeOfEvidenceTextField.setText(evi_type);
    }//GEN-LAST:event_EvidenceUpdateButtonActionPerformed

    private void EvidenceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EvidenceTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = EvidenceTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) EvidenceTable.getModel();
        evi_caseNo=model.getValueAt(selectedRow,1).toString();
        evi_name=model.getValueAt(selectedRow, 2).toString();        
        evi_area=model.getValueAt(selectedRow, 3).toString();
        evi_time=model.getValueAt(selectedRow, 4).toString();
        evi_collectedfrom=model.getValueAt(selectedRow, 5).toString();
        evi_status=model.getValueAt(selectedRow, 6).toString();
        evi_type=model.getValueAt(selectedRow, 7).toString();
    }//GEN-LAST:event_EvidenceTableMouseClicked

    private void EvidenceSortComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvidenceSortComboBoxActionPerformed
        // TODO add your handling code here:
        
        try {
            if(EvidenceSortComboBox.getSelectedItem().toString().equals("EvidenceId"))
            {

                String sql1 = "SELECT * FROM Evidence ORDER BY EvidenceId ASC";
                ShowEvidenceSort(sql1);

            }
            if(EvidenceSortComboBox.getSelectedItem().toString().equals("CaseNo"))
            {

                String sql1 = "SELECT * FROM Evidence ORDER BY CaseNo ASC";
                ShowEvidenceSort(sql1);

            }
            if(EvidenceSortComboBox.getSelectedItem().toString().equals("EvidenceName"))
            {

                String sql1 = "SELECT * FROM Evidence ORDER BY EvidenceName ASC";
                ShowEvidenceSort(sql1);

            }
            if(EvidenceSortComboBox.getSelectedItem().toString().equals("Area"))
            {

                String sql1 = "SELECT * FROM Evidence ORDER BY Area ASC";
                ShowEvidenceSort(sql1);

            } if(EvidenceSortComboBox.getSelectedItem().toString().equals("Time"))
            {

                String sql1 = "SELECT * FROM Evidence ORDER BY Time ASC";
                ShowEvidenceSort(sql1);

            }
            if(EvidenceSortComboBox.getSelectedItem().toString().equals("CollectedFrom"))
            {

                String sql1 = "SELECT * FROM Evidence ORDER BY CollectedFrom ASC";
                ShowEvidenceSort(sql1);

            } if(EvidenceSortComboBox.getSelectedItem().toString().equals("EvidenceStatus"))
            {

                String sql1 = "SELECT * FROM Evidence ORDER BY EvidenceStatus ASC";
                ShowEvidenceSort(sql1);

            }
            if(EvidenceSortComboBox.getSelectedItem().toString().equals("Type Of Evidence"))
            {

                String sql1 = "SELECT * FROM Evidence ORDER BY TypeOfEvidence ASC";
                ShowEvidenceSort(sql1);

            }

        }
        catch (SQLException ex) {
            Logger.getLogger(EvidenceTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EvidenceSortComboBoxActionPerformed
public ArrayList<Evidence> EvidenceListtableSort(String query) throws SQLException
    {
        ArrayList<Evidence> EvidenceListtableSort = new ArrayList<>();
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
        
        Statement st=cnObj.connection.createStatement();
        ResultSet rs= st.executeQuery(query);
        Evidence EvidenceObj;
        while(rs.next())
        {
            EvidenceObj=new Evidence(rs.getInt("EvidenceId"),rs.getInt("CaseNo"),rs.getString("EvidenceName"),rs.getString("Area"),rs.getString("Time"),rs.getString("CollectedFrom"),rs.getString("EvidenceStatus"),rs.getString("TypeOfEvidence"));
            EvidenceListtableSort.add(EvidenceObj);
        }
        return EvidenceListtableSort;
    }

    public void ShowEvidenceSort(String query) throws SQLException
    {
        ArrayList<Evidence> etList=  EvidenceListtableSort(query) ;
        DefaultTableModel Model= new DefaultTableModel();
   
        Model.setColumnIdentifiers(new Object[]{"EvidenceId","CaseNo","EvidenceName","Area","Time","CollectedFrom","EvidenceStatus","TypeOfEvidence"});
    
        Object[] row= new Object[8];
        for(int i=0;i<etList.size();i++)
        {
            row[0]=etList.get(i).getEvidenceId();
            row[1]=etList.get(i).getCaseNo();
            row[2]=etList.get(i).getEvidenceName();
            row[3]=etList.get(i).getArea();
            row[4]=etList.get(i).getTime();  
            row[5]=etList.get(i).getCollectedFrom();
            row[6]=etList.get(i).getEvidenceStatus();
            row[7]=etList.get(i).getTypeOfEvidence();
         
            Model.addRow(row);
        }
        
         EvidenceTable.setModel(Model);
         
    }

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
            java.util.logging.Logger.getLogger(EvidenceTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EvidenceTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EvidenceTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EvidenceTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvidenceTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButtonEvidenceTable;
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JComboBox<String> EvidenceSortComboBox;
    private javax.swing.JTable EvidenceTable;
    private javax.swing.JButton EvidenceUpdateButton;
    private javax.swing.JComboBox<String> SearchComboBox;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private java.awt.Panel panel1;
    private javax.swing.JLabel searchByLabel;
    // End of variables declaration//GEN-END:variables
}
