
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

public class VictimTable extends javax.swing.JFrame {

    /**
     * Creates new form VictimTable
     */
    VictimUpdate victimupdate = new VictimUpdate();
    String Vic_caseid,vic_name,vic_age,vic_fathersname,vic_vil,vic_thana,vic_dis,vic_pre_add,vic_pre_thana,vic_pre_dis,vic_phn;
    public VictimTable() {
        initComponents();
        Font font = new Font("Tahoma", Font.PLAIN, 20);
        this.VictimTable.setFont(font);
        int gap = 15;
        this.VictimTable.setRowHeight(this.VictimTable.getRowHeight()+gap);
        
        try {
            ShowVictim();
            
        } catch (SQLException ex) {
            Logger.getLogger(VictimTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Victim> VictimList() throws SQLException
    {
        ArrayList<Victim> VictimList = new ArrayList<>();
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
        String Query1="SELECT * FROM Victim";  
        Statement st=cnObj.connection.createStatement();
        ResultSet rs= st.executeQuery(Query1);
        Victim VictimObj;
        while(rs.next())
        {
            VictimObj=new Victim(rs.getInt("VictimId"),rs.getInt("CaseNo"),rs.getString("VictimName"),rs.getInt("Age"),rs.getString("FathersName"),rs.getString("Village"),rs.getString("Thana"),rs.getInt("DistrictId"),rs.getString("PresentAddress"),rs.getString("PresentThana"),rs.getInt("PresentDistrictId"),rs.getString("MobileNo"));
            VictimList.add(VictimObj);
        }
        return VictimList;
    }

    public void ShowVictim() throws SQLException
    {
        ArrayList<Victim> vList=VictimList();
        DefaultTableModel Model= (DefaultTableModel)VictimTable.getModel();
        Object[] row= new Object[12];
        for(int i=0;i<vList.size();i++)
        {
            row[0]=vList.get(i).getVictimId();
            row[1]=vList.get(i).getCaseNo();
            row[2]=vList.get(i).getVictimName();
            row[3]=vList.get(i).getAge();
            row[4]=vList.get(i).getFathersName();  
            row[5]=vList.get(i).getVillage();
            row[6]=vList.get(i).getThana();
            row[7]=vList.get(i).getDistrictId();
            row[8]=vList.get(i).getPresentAddress(); 
            row[9]=vList.get(i).getPresentThana();
            row[10]=vList.get(i).getPresentDistrictId();
            row[11]=vList.get(i).getMobileNo();
            Model.addRow(row);
        }
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VictimTableLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VictimTable = new javax.swing.JTable();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VictimUpdateButton = new javax.swing.JButton();
        SearchComboBox = new javax.swing.JComboBox<>();
        SearchTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        VictimComboBox = new javax.swing.JComboBox<>();
        Sort = new javax.swing.JLabel();
        bg_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 885));
        getContentPane().setLayout(null);

        VictimTableLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        VictimTableLabel.setForeground(new java.awt.Color(240, 240, 240));
        VictimTableLabel.setText("VICTIM TABLE");
        getContentPane().add(VictimTableLabel);
        VictimTableLabel.setBounds(480, 130, 370, 80);

        VictimTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VictimId", "CaseNo", "VictimName", "Age", "Father's Name", "Village", "Thana", "District", "Present Address", "Present Thana", "Present District", "Mobile No"
            }
        ));
        VictimTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VictimTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(VictimTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 210, 1250, 510);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/logo.png"))); // NOI18N
        logo.setText("jLabel1");
        getContentPane().add(logo);
        logo.setBounds(1020, 10, 230, 210);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Search By : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 50, 100, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Search : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 50, 80, 20);

        VictimUpdateButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        VictimUpdateButton.setText("UPDATE");
        VictimUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VictimUpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VictimUpdateButton);
        VictimUpdateButton.setBounds(800, 750, 180, 60);

        SearchComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SearchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" ,"VictimId", "CaseNo", "VictimName", "Age", "Father's Name", "Village", "Thana", "District", "Present Address", "Present Thana", "Present District", "Mobile No" }));
        getContentPane().add(SearchComboBox);
        SearchComboBox.setBounds(170, 40, 220, 40);

        SearchTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextFieldKeyReleased(evt);
            }
        });
        getContentPane().add(SearchTextField);
        SearchTextField.setBounds(520, 40, 400, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 750, 200, 60);

        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton);
        DeleteButton.setBounds(1010, 750, 200, 60);

        VictimComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VictimComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VictimId", "CaseNo", "VictimName", "Age", "Father'sName", "Village", "Thana", "DistrictId", "PresentAddress", "PresentThana", "PresentDistrictId", "MobileNo" }));
        VictimComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VictimComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(VictimComboBox);
        VictimComboBox.setBounds(170, 110, 220, 40);

        Sort.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Sort.setForeground(new java.awt.Color(255, 255, 255));
        Sort.setText("SORT:");
        getContentPane().add(Sort);
        Sort.setBounds(60, 110, 70, 22);

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/bg_pic.jpg"))); // NOI18N
        bg_label.setText("jLabel1");
        getContentPane().add(bg_label);
        bg_label.setBounds(0, 0, 1250, 880);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainPage mObj = new MainPage();
        mObj.show();
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
         try{
            ConnectMSSQL cnObj = new ConnectMSSQL();
            cnObj.connectDB();
            int row = VictimTable.getSelectedRow();
            String value = (VictimTable.getModel().getValueAt(row, 0).toString());
            String query = "DELETE FROM Victim WHERE VictimId = "+value;
            PreparedStatement pst = (PreparedStatement) cnObj.connection.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) VictimTable.getModel();
            model.setRowCount(0);
            ShowVictim();
            JOptionPane.showMessageDialog(null,"Deleted Successfully!!");
            
        }
        catch(Exception e){
            Logger.getLogger(VictimPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void SearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextFieldKeyReleased
        // TODO add your handling code here:
        String columnToSearch = SearchComboBox.getSelectedItem().toString();
        String stringToSearch = SearchTextField.getText();
        try{
            ConnectMSSQL cnObj = new ConnectMSSQL();
            cnObj.connectDB();
            DefaultTableModel Model= (DefaultTableModel)VictimTable.getModel();
            Model.setRowCount(0);
            Object[] row= new Object[12];
            if("VictimId".equals(columnToSearch))
            {
                String query = "SELECT * FROM Victim WHERE VictimId LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("VictimName");
                    row[3] = rs.getInt("Age");
                    row[4] = rs.getString("FathersName");
                    row[5] = rs.getString("Village");
                    row[6] = rs.getString("Thana");
                    row[7] = rs.getInt("DistrictId");
                    row[8] = rs.getString("PresentAddress");
                    row[9] = rs.getString("PresentThana");
                    row[10] = rs.getInt("PresentDistrictId");
                    row[11] = rs.getString("MobileNo");
                    Model.addRow(row);
                }
            
            }
            else if("CaseNo".equals(columnToSearch))
            {
                String query = "SELECT * FROM Victim WHERE CaseNo LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("VictimName");
                    row[3] = rs.getInt("Age");
                    row[4] = rs.getString("FathersName");
                    row[5] = rs.getString("Village");
                    row[6] = rs.getString("Thana");
                    row[7] = rs.getInt("DistrictId");
                    row[8] = rs.getString("PresentAddress");
                    row[9] = rs.getString("PresentThana");
                    row[10] = rs.getInt("PresentDistrictId");
                    row[11] = rs.getString("MobileNo");
                    Model.addRow(row);
                }
            
            }
            else if("VictimName".equals(columnToSearch))
            {
                String query = "SELECT * FROM Victim WHERE VictimName LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("VictimName");
                    row[3] = rs.getInt("Age");
                    row[4] = rs.getString("FathersName");
                    row[5] = rs.getString("Village");
                    row[6] = rs.getString("Thana");
                    row[7] = rs.getInt("DistrictId");
                    row[8] = rs.getString("PresentAddress");
                    row[9] = rs.getString("PresentThana");
                    row[10] = rs.getInt("PresentDistrictId");
                    row[11] = rs.getString("MobileNo");
                    Model.addRow(row);
                }
            
            }
            else if("Age".equals(columnToSearch))
            {
                String query = "SELECT * FROM Victim WHERE Age LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("VictimName");
                    row[3] = rs.getInt("Age");
                    row[4] = rs.getString("FathersName");
                    row[5] = rs.getString("Village");
                    row[6] = rs.getString("Thana");
                    row[7] = rs.getInt("DistrictId");
                    row[8] = rs.getString("PresentAddress");
                    row[9] = rs.getString("PresentThana");
                    row[10] = rs.getInt("PresentDistrictId");
                    row[11] = rs.getString("MobileNo");
                    Model.addRow(row);
                }
            
            }
            else if("Father's Name".equals(columnToSearch))
            {
                String query = "SELECT * FROM Victim WHERE FathersName LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("VictimName");
                    row[3] = rs.getInt("Age");
                    row[4] = rs.getString("FathersName");
                    row[5] = rs.getString("Village");
                    row[6] = rs.getString("Thana");
                    row[7] = rs.getInt("DistrictId");
                    row[8] = rs.getString("PresentAddress");
                    row[9] = rs.getString("PresentThana");
                    row[10] = rs.getInt("PresentDistrictId");
                    row[11] = rs.getString("MobileNo");
                    Model.addRow(row);
                }
            
            }
            else if("Village".equals(columnToSearch))
            {
                String query = "SELECT * FROM Victim WHERE Village LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("VictimName");
                    row[3] = rs.getInt("Age");
                    row[4] = rs.getString("FathersName");
                    row[5] = rs.getString("Village");
                    row[6] = rs.getString("Thana");
                    row[7] = rs.getInt("DistrictId");
                    row[8] = rs.getString("PresentAddress");
                    row[9] = rs.getString("PresentThana");
                    row[10] = rs.getInt("PresentDistrictId");
                    row[11] = rs.getString("MobileNo");
                    Model.addRow(row);
                }
            
            }
            else if("Thana".equals(columnToSearch))
            {
                String query = "SELECT * FROM Victim WHERE Thana LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("VictimName");
                    row[3] = rs.getInt("Age");
                    row[4] = rs.getString("FathersName");
                    row[5] = rs.getString("Village");
                    row[6] = rs.getString("Thana");
                    row[7] = rs.getInt("DistrictId");
                    row[8] = rs.getString("PresentAddress");
                    row[9] = rs.getString("PresentThana");
                    row[10] = rs.getInt("PresentDistrictId");
                    row[11] = rs.getString("MobileNo");
                    Model.addRow(row);
                }
            
            }
            else if("District".equals(columnToSearch))
            {
                String query = "SELECT * FROM Victim WHERE DistrictId LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("VictimName");
                    row[3] = rs.getInt("Age");
                    row[4] = rs.getString("FathersName");
                    row[5] = rs.getString("Village");
                    row[6] = rs.getString("Thana");
                    row[7] = rs.getInt("DistrictId");
                    row[8] = rs.getString("PresentAddress");
                    row[9] = rs.getString("PresentThana");
                    row[10] = rs.getInt("PresentDistrictId");
                    row[11] = rs.getString("MobileNo");
                    Model.addRow(row);
                }
            
            }
            else if("Present Address".equals(columnToSearch))
            {
                String query = "SELECT * FROM Victim WHERE PresentAddress LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("VictimName");
                    row[3] = rs.getInt("Age");
                    row[4] = rs.getString("FathersName");
                    row[5] = rs.getString("Village");
                    row[6] = rs.getString("Thana");
                    row[7] = rs.getInt("DistrictId");
                    row[8] = rs.getString("PresentAddress");
                    row[9] = rs.getString("PresentThana");
                    row[10] = rs.getInt("PresentDistrictId");
                    row[11] = rs.getString("MobileNo");
                    Model.addRow(row);
                }
            
            }
            else if("Present Thana".equals(columnToSearch))
            {
                String query = "SELECT * FROM Victim WHERE PresentThana LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("VictimName");
                    row[3] = rs.getInt("Age");
                    row[4] = rs.getString("FathersName");
                    row[5] = rs.getString("Village");
                    row[6] = rs.getString("Thana");
                    row[7] = rs.getInt("DistrictId");
                    row[8] = rs.getString("PresentAddress");
                    row[9] = rs.getString("PresentThana");
                    row[10] = rs.getInt("PresentDistrictId");
                    row[11] = rs.getString("MobileNo");
                    Model.addRow(row);
                }
            
            }
            else if("Present District".equals(columnToSearch))
            {
                String query = "SELECT * FROM Victim WHERE PresentDistrictId LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("VictimName");
                    row[3] = rs.getInt("Age");
                    row[4] = rs.getString("FathersName");
                    row[5] = rs.getString("Village");
                    row[6] = rs.getString("Thana");
                    row[7] = rs.getInt("DistrictId");
                    row[8] = rs.getString("PresentAddress");
                    row[9] = rs.getString("PresentThana");
                    row[10] = rs.getInt("PresentDistrictId");
                    row[11] = rs.getString("MobileNo");
                    Model.addRow(row);
                }
            
            }
             else if("Mobile No".equals(columnToSearch))
            {
                String query = "SELECT * FROM Victim WHERE MobileNo LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("VictimName");
                    row[3] = rs.getInt("Age");
                    row[4] = rs.getString("FathersName");
                    row[5] = rs.getString("Village");
                    row[6] = rs.getString("Thana");
                    row[7] = rs.getInt("DistrictId");
                    row[8] = rs.getString("PresentAddress");
                    row[9] = rs.getString("PresentThana");
                    row[10] = rs.getInt("PresentDistrictId");
                    row[11] = rs.getString("MobileNo");
                    Model.addRow(row);
                }
            
            }
            else if("".equals(columnToSearch))
            {
                ShowVictim();
            }
        }catch(Exception e){
            Logger.getLogger(VictimPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_SearchTextFieldKeyReleased

    private void VictimUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VictimUpdateButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        victimupdate.setVisible(true);

        
        victimupdate.VictimCaseIdTextField.setText(Vic_caseid);
        victimupdate.VictimNameTextField.setText(vic_name);
        victimupdate.VictimAgeTextField.setText(vic_age);
        victimupdate.VictimFatherTextField.setText(vic_fathersname);
        victimupdate.VictimVillageTextField.setText(vic_vil);
        victimupdate.VictimThanaTextField.setText(vic_thana);
        victimupdate.VictimDistrictComboBox.addItem(vic_dis);
        victimupdate.VictimPresentAddressTextField.setText(vic_pre_add);
        victimupdate.VictimPresentThanaTextField.setText(vic_pre_thana);
        victimupdate.VictimPresentDistrictComboBox.addItem(vic_pre_dis);
        victimupdate.VictimMobileNoTextField.setText(vic_phn);
    }//GEN-LAST:event_VictimUpdateButtonActionPerformed

    private void VictimTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VictimTableMouseClicked
        // TODO add your handling code here:
         int selectedRow = VictimTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) VictimTable.getModel();
        
        Vic_caseid = model.getValueAt(selectedRow, 1).toString();
        vic_name = model.getValueAt(selectedRow, 2).toString();
        vic_age = model.getValueAt(selectedRow, 3).toString();
        vic_fathersname = model.getValueAt(selectedRow, 4).toString();
        vic_vil = model.getValueAt(selectedRow, 5).toString();
        vic_thana = model.getValueAt(selectedRow, 6).toString();
        vic_dis = model.getValueAt(selectedRow, 7).toString();
        vic_pre_add = model.getValueAt(selectedRow, 8).toString();
        vic_pre_thana = model.getValueAt(selectedRow, 9).toString();
        vic_pre_dis = model.getValueAt(selectedRow, 10).toString();
        vic_phn = model.getValueAt(selectedRow, 11).toString();
    }//GEN-LAST:event_VictimTableMouseClicked
public ArrayList<Victim> VictimListTable(String QueryVictim) throws SQLException
    {
        ArrayList<Victim> VictimList = new ArrayList<>();
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
        Statement st=cnObj.connection.createStatement();
        ResultSet rs= st.executeQuery(QueryVictim);
        Victim VictimObj;
        while(rs.next())
        {
            VictimObj=new Victim(rs.getInt("VictimId"),rs.getInt("CaseNo"),rs.getString("VictimName"),rs.getInt("Age"),rs.getString("FathersName"),rs.getString("Village"),rs.getString("Thana"),rs.getInt("DistrictId"),rs.getString("PresentAddress"),rs.getString("PresentThana"),rs.getInt("PresentDistrictId"),rs.getString("MobileNo"));
            VictimList.add(VictimObj);
        }
        return VictimList;
    }
public void ShowVictimTable(String queryV) throws SQLException
    {
        ArrayList<Victim> vtList = VictimListTable(queryV);
        DefaultTableModel Model= new DefaultTableModel();
   
        Model.setColumnIdentifiers(new Object[]{"VictimId","CaseNo","VictimName","Age","FathersName","Village","Thana","DistrictId","PresentAddress","PresentThana","PresentDistrictId","MobileNo"});
        Object[] row=new Object[12];
        for(int i=0;i<vtList.size();i++)
        {
            row[0]=vtList.get(i).getVictimId();
            row[1]=vtList.get(i).getCaseNo();
            row[2]=vtList.get(i).getVictimName();
            row[3]=vtList.get(i).getAge();
            row[4]=vtList.get(i).getFathersName();  
            row[5]=vtList.get(i).getVillage();
            row[6]=vtList.get(i).getThana();
            row[7]=vtList.get(i).getDistrictId();
            row[8]=vtList.get(i).getPresentAddress(); 
            row[9]=vtList.get(i).getPresentThana();
            row[10]=vtList.get(i).getPresentDistrictId();
            row[11]=vtList.get(i).getMobileNo();
            Model.addRow(row);
        }
         VictimTable.setModel(Model);
    }
    private void VictimComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VictimComboBoxActionPerformed
        try {
            if(VictimComboBox.getSelectedItem().toString().equals("VictimId"))
            {

                String sql1 = "SELECT * FROM Victim ORDER BY VictimId ASC";
                ShowVictimTable(sql1);

            }
            if(VictimComboBox.getSelectedItem().toString().equals("CaseNo"))
            {

                String sql1 = "SELECT * FROM Victim ORDER BY CaseNo ASC";
                ShowVictimTable(sql1);

            }
            if(VictimComboBox.getSelectedItem().toString().equals("VictimName"))
            {

                String sql1 = "SELECT * FROM Victim ORDER BY VictimName ASC";
                ShowVictimTable(sql1);

            }
            if(VictimComboBox.getSelectedItem().toString().equals("Age"))
            {

                String sql1 = "SELECT * FROM Victim ORDER BY Age ASC";
                ShowVictimTable(sql1);

            } if(VictimComboBox.getSelectedItem().toString().equals("Father'sName"))
            {

                String sql1 = "SELECT * FROM Victim ORDER BY FathersName ASC";
                ShowVictimTable(sql1);

            }
            if(VictimComboBox.getSelectedItem().toString().equals("Village"))
            {

                String sql1 = "SELECT * FROM Victim ORDER BY Village ASC";
                ShowVictimTable(sql1);

            } if(VictimComboBox.getSelectedItem().toString().equals("Thana"))
            {

                String sql1 = "SELECT * FROM Victim ORDER BY Thana ASC";
                ShowVictimTable(sql1);

            }
            if(VictimComboBox.getSelectedItem().toString().equals("DistrictId"))
            {

                String sql1 = "SELECT * FROM Victim ORDER BY DistrictId ASC";
                ShowVictimTable(sql1);

            }
            if(VictimComboBox.getSelectedItem().toString().equals("PresentAddress"))
            {

                String sql1 = "SELECT * FROM Victim ORDER BY PresentAddress ASC";
                ShowVictimTable(sql1);

            }

            if(VictimComboBox.getSelectedItem().toString().equals("PresentThana"))
            {

                String sql1 = "SELECT * FROM Victim ORDER BY PresentThana ASC";
                ShowVictimTable(sql1);

            }

            if(VictimComboBox.getSelectedItem().toString().equals("PresentDistrictId"))
            {

                String sql1 = "SELECT * FROM Victim ORDER BY PresentDistrictId ASC";
                ShowVictimTable(sql1);

            }
            if(VictimComboBox.getSelectedItem().toString().equals("MobileNo"))
            {

                String sql1 = "SELECT * FROM Victim ORDER BY MobileNo ASC";
                ShowVictimTable(sql1);

            }

        }
        catch (SQLException ex) {
            Logger.getLogger(VictimTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_VictimComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(VictimTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VictimTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VictimTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VictimTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VictimTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox<String> SearchComboBox;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JLabel Sort;
    private javax.swing.JComboBox<String> VictimComboBox;
    private javax.swing.JTable VictimTable;
    private javax.swing.JLabel VictimTableLabel;
    private javax.swing.JButton VictimUpdateButton;
    private javax.swing.JLabel bg_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
