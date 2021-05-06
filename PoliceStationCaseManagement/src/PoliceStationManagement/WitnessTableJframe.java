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

public class WitnessTableJframe extends javax.swing.JFrame {
    
    WitnessUpdate witnessupdate = new WitnessUpdate();
    String wit_caseno,wit_name,wit_age,wit_fathersname,wit_vil,wit_thana,wit_district,wit_pre_add,wit_pre_thana,wit_pre_district,wit_mob;

    public WitnessTableJframe() {
        initComponents();
        setSize(1250,885);
        setTitle("Witness Table");
        Font font = new Font("Tahoma", Font.PLAIN, 20);
        this.WitnessJTable.setFont(font);
        int gap = 15;
        this.WitnessJTable.setRowHeight(this.WitnessJTable.getRowHeight()+gap);
        try {
            ShowWitness();
            
        } catch (SQLException ex) {
            Logger.getLogger(VictimTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 public ArrayList<Witness> WitnessList() throws SQLException
    {
        ArrayList<Witness> WitnessList = new ArrayList<>();
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
        String Query3="SELECT * FROM Witness";  
        Statement st=cnObj.connection.createStatement();
        ResultSet rs= st.executeQuery(Query3);
        Witness WitnessObj;
        while(rs.next())
        {
            WitnessObj=new Witness(rs.getInt("WitnessId"),rs.getInt("CaseNo"),rs.getString("WitnessName"),rs.getInt("Age"),rs.getString("FathersName"),rs.getString("Village"),rs.getString("Thana"),rs.getInt("DistrictId"),rs.getString("PresentAddress"),rs.getString("PresentThana"),rs.getInt("PresentDistrictId"),rs.getString("MobileNo"));
            WitnessList.add(WitnessObj);
        }
        return WitnessList;
    }

    public void ShowWitness() throws SQLException
    {
        ArrayList<Witness> wList=WitnessList();
        DefaultTableModel Model= (DefaultTableModel)WitnessJTable.getModel();
        Object[] row= new Object[12];
        for(int i=0;i<wList.size();i++)
        {
            row[0]=wList.get(i).getWitnessId();
            row[1]=wList.get(i).getCaseNo();
            row[2]=wList.get(i).getWitnessName();
            row[3]=wList.get(i).getAge();
            row[4]=wList.get(i).getFathersName();  
            row[5]=wList.get(i).getVillage();
            row[6]=wList.get(i).getThana();
            row[7]=wList.get(i).getDistrictId();
            row[8]=wList.get(i).getPresentAddress(); 
            row[9]=wList.get(i).getPresentThana();
            row[10]=wList.get(i).getPresentDistrictId();
            row[11]=wList.get(i).getMobileNo();
            Model.addRow(row);
        }
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        BackButtonWitnessTable = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        WitnessUpdateButton = new javax.swing.JButton();
        SearchTextField = new javax.swing.JTextField();
        SearchComboBox = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JButton();
        WITNESSLabel = new javax.swing.JLabel();
        WitnessTable = new javax.swing.JScrollPane();
        WitnessJTable = new javax.swing.JTable();
        Sort = new javax.swing.JLabel();
        WitnessComboBox = new javax.swing.JComboBox<>();
        Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(null);

        BackButtonWitnessTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackButtonWitnessTable.setText("BACK");
        BackButtonWitnessTable.setToolTipText("");
        BackButtonWitnessTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonWitnessTableActionPerformed(evt);
            }
        });
        panel1.add(BackButtonWitnessTable);
        BackButtonWitnessTable.setBounds(60, 630, 180, 50);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/logo.png"))); // NOI18N
        panel1.add(logo);
        logo.setBounds(1030, 10, 210, 220);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText(" Search By : ");
        panel1.add(jLabel1);
        jLabel1.setBounds(60, 60, 120, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Search : ");
        panel1.add(jLabel2);
        jLabel2.setBounds(440, 60, 90, 20);

        WitnessUpdateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WitnessUpdateButton.setText("UPDATE");
        WitnessUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WitnessUpdateButtonActionPerformed(evt);
            }
        });
        panel1.add(WitnessUpdateButton);
        WitnessUpdateButton.setBounds(820, 630, 180, 50);

        SearchTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextFieldKeyReleased(evt);
            }
        });
        panel1.add(SearchTextField);
        SearchTextField.setBounds(540, 50, 380, 40);

        SearchComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SearchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--","Witness Id", "Case No", "Witness Name", "Age", "Father's Name", "Village", "Thana", "District", "Present Adress", "Present Thana", "Present District", "Mobile No." }));
        panel1.add(SearchComboBox);
        SearchComboBox.setBounds(200, 50, 200, 40);

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        panel1.add(deleteButton);
        deleteButton.setBounds(1030, 630, 170, 50);

        WITNESSLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        WITNESSLabel.setForeground(new java.awt.Color(255, 255, 255));
        WITNESSLabel.setText("WITNESS TABLE");
        panel1.add(WITNESSLabel);
        WITNESSLabel.setBounds(480, 160, 420, 50);

        WitnessJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Witness Id", "Case No", "Witness Name", "Age", "Father's Name", "Village", "Thana", "District", "Present Adress", "Present Thana", "Present District", "Mobile No."
            }
        ));
        WitnessJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WitnessJTableMouseClicked(evt);
            }
        });
        WitnessTable.setViewportView(WitnessJTable);

        panel1.add(WitnessTable);
        WitnessTable.setBounds(0, 240, 1250, 340);

        Sort.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Sort.setForeground(new java.awt.Color(255, 255, 255));
        Sort.setText("SORT:");
        panel1.add(Sort);
        Sort.setBounds(70, 120, 70, 30);

        WitnessComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WitnessComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WitnessId", "CaseNo", "WitnessNo", "Age", "Father'sName", "Village", "Thana", "DistrictId", "PresentAddress", "PresentThana", "PresentDistrictId", "MobileNo" }));
        WitnessComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WitnessComboBoxActionPerformed(evt);
            }
        });
        panel1.add(WitnessComboBox);
        WitnessComboBox.setBounds(200, 120, 200, 30);

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/policeStation.jpg"))); // NOI18N
        panel1.add(Image);
        Image.setBounds(0, -160, 1410, 1210);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1440, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonWitnessTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonWitnessTableActionPerformed

          MainPage mObj = new MainPage();
        mObj.show();
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonWitnessTableActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
         try{
            ConnectMSSQL cnObj = new ConnectMSSQL();
            cnObj.connectDB();
            int row = WitnessJTable.getSelectedRow();
            String value = (WitnessJTable.getModel().getValueAt(row, 0).toString());
            String query = "DELETE FROM Witness WHERE WitnessId = "+value;
            PreparedStatement pst = (PreparedStatement) cnObj.connection.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) WitnessJTable.getModel();
            model.setRowCount(0);
            ShowWitness();
            JOptionPane.showMessageDialog(null,"Deleted Successfully!!");
            
        }
        catch(Exception e){
            Logger.getLogger(VictimPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void SearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextFieldKeyReleased
        // TODO add your handling code here:
        String columnToSearch = SearchComboBox.getSelectedItem().toString();
        String stringToSearch = SearchTextField.getText();
        try{
            ConnectMSSQL cnObj = new ConnectMSSQL();
            cnObj.connectDB();
            DefaultTableModel Model= (DefaultTableModel)WitnessJTable.getModel();
            Model.setRowCount(0);
            Object[] row= new Object[12];
            if("Witness Id".equals(columnToSearch))
            {
                String query = "SELECT * FROM Witness WHERE WitnessId LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("WitnessId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("WitnessName");
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
                String query = "SELECT * FROM Witness WHERE CaseNo LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("WitnessId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("WitnessName");
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
            else if("Witness Name".equals(columnToSearch))
            {
                String query = "SELECT * FROM Witness WHERE WitnessName LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("WitnessId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("WitnessName");
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
                String query = "SELECT * FROM Witness WHERE Age LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("WitnessId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("WitnessName");
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
                String query = "SELECT * FROM Witness WHERE FathersName LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("WitnessId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("WitnessName");
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
                String query = "SELECT * FROM Witness WHERE Village LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("WitnessId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("WitnessName");
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
                String query = "SELECT * FROM Witness WHERE Thana LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("WitnessId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("WitnessName");
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
                String query = "SELECT * FROM Witness WHERE DistrictId LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("VictimId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("WitnessName");
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
                String query = "SELECT * FROM Witness WHERE PresentAddress LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("WitnessId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("WitnessName");
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
                String query = "SELECT * FROM Witness WHERE PresentThana LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("WitnessId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("WitnessName");
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
                String query = "SELECT * FROM Witness WHERE PresentDistrictId LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("WitnessId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("WitnessName");
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
            else if("Mobile No.".equals(columnToSearch))
            {
                String query = "SELECT * FROM Witness WHERE MobileNo LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    row[0] = rs.getInt("WitnessId");
                    row[1] = rs.getInt("CaseNo");
                    row[2] = rs.getString("WitnessName");
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
                ShowWitness();
            }
        }catch(Exception e){
            Logger.getLogger(VictimPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_SearchTextFieldKeyReleased

    private void WitnessUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WitnessUpdateButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        witnessupdate.setVisible(true);
        
        witnessupdate.WitnessCaseIdTextField.setText(wit_caseno);
        witnessupdate.WitnessNameTextField.setText(wit_name);
        witnessupdate.WitnessAgeTextField.setText(wit_age);
        witnessupdate.WitnessFathersNameTextField.setText(wit_fathersname);
        witnessupdate.WitnessVillageTextField.setText(wit_vil);
        witnessupdate.WitnessThanaTextField.setText(wit_thana);
        witnessupdate.WitnessDistrictComboBox.addItem(wit_district);
        witnessupdate.WitnessPresentAddressTextField.setText(wit_pre_add);
        witnessupdate.WitnessPresentThanaTextField.setText(wit_pre_thana);
        witnessupdate.WitnessPresentDistrictComboBox.addItem(wit_pre_district);
        witnessupdate.MobileNoTextField.setText(wit_mob);
        
    }//GEN-LAST:event_WitnessUpdateButtonActionPerformed

    private void WitnessJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WitnessJTableMouseClicked
        // TODO add your handling code here:
         int selectedRow = WitnessJTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) WitnessJTable.getModel();
        
         
         wit_caseno = model.getValueAt(selectedRow, 1).toString();
         wit_name = model.getValueAt(selectedRow, 2).toString();
         wit_age = model.getValueAt(selectedRow, 3).toString();
         wit_fathersname = model.getValueAt(selectedRow, 4).toString();
         wit_vil = model.getValueAt(selectedRow, 5).toString();
         wit_thana = model.getValueAt(selectedRow, 6).toString();
         wit_district = model.getValueAt(selectedRow, 7).toString();
         wit_pre_add = model.getValueAt(selectedRow, 8).toString();
         wit_pre_thana = model.getValueAt(selectedRow, 9).toString();
         wit_pre_district = model.getValueAt(selectedRow, 10).toString();
         wit_mob=model.getValueAt(selectedRow, 11).toString();
    }//GEN-LAST:event_WitnessJTableMouseClicked
public ArrayList<Witness> WitnessListTable(String Query) throws SQLException
    {
        ArrayList<Witness> WitnessListTable = new ArrayList<>();
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
      
        Statement st=cnObj.connection.createStatement();
        ResultSet rs= st.executeQuery(Query);
        Witness WitnessObj;
        while(rs.next())
        {
            WitnessObj=new Witness(rs.getInt("WitnessId"),rs.getInt("CaseNo"),rs.getString("WitnessName"),rs.getInt("Age"),rs.getString("FathersName"),rs.getString("Village"),rs.getString("Thana"),rs.getInt("DistrictId"),rs.getString("PresentAddress"),rs.getString("PresentThana"),rs.getInt("PresentDistrictId"),rs.getString("MobileNo"));
            WitnessListTable.add(WitnessObj);
        }
        return WitnessListTable;
    }

    public void ShowWitnessTable(String Query) throws SQLException
    {
        ArrayList<Witness> wList=WitnessListTable(Query);
        DefaultTableModel Model= new DefaultTableModel();
        Model.setColumnIdentifiers(new Object[]{"WitnessId","CaseNo","WitnessName","Age","FathersName","Village","Thana","DistrictId","PresentAddress","PresentThana","PresentDistrictId","MobileNo"});
        
        Object[] row= new Object[12];
        for(int i=0;i<wList.size();i++)
        {
            row[0]=wList.get(i).getWitnessId();
            row[1]=wList.get(i).getCaseNo();
            row[2]=wList.get(i).getWitnessName();
            row[3]=wList.get(i).getAge();
            row[4]=wList.get(i).getFathersName();  
            row[5]=wList.get(i).getVillage();
            row[6]=wList.get(i).getThana();
            row[7]=wList.get(i).getDistrictId();
            row[8]=wList.get(i).getPresentAddress(); 
            row[9]=wList.get(i).getPresentThana();
            row[10]=wList.get(i).getPresentDistrictId();
            row[11]=wList.get(i).getMobileNo();
            Model.addRow(row);
        }
        WitnessJTable.setModel(Model);  
    }
    private void WitnessComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WitnessComboBoxActionPerformed
       try {
            if(WitnessComboBox.getSelectedItem().toString().equals("WitnessId"))
            {

                String sql1 = "SELECT * FROM Witness ORDER BY WitnessId ASC";
                ShowWitnessTable(sql1);

            }
            if(WitnessComboBox.getSelectedItem().toString().equals("CaseNo"))
            {

                String sql1 = "SELECT * FROM Witness ORDER BY CaseNo ASC";
                ShowWitnessTable(sql1);

            }
            if(WitnessComboBox.getSelectedItem().toString().equals("WitnessName"))
            {

                String sql1 = "SELECT * FROM Witness ORDER BY WitnessName ASC";
                ShowWitnessTable(sql1);

            }
            if(WitnessComboBox.getSelectedItem().toString().equals("Age"))
            {

                String sql1 = "SELECT * FROM Witness ORDER BY Age ASC";
                ShowWitnessTable(sql1);

            } if(WitnessComboBox.getSelectedItem().toString().equals("Father'sName"))
            {

                String sql1 = "SELECT * FROM Witness ORDER BY FathersName ASC";
                ShowWitnessTable(sql1);

            }
            if(WitnessComboBox.getSelectedItem().toString().equals("Village"))
            {

                String sql1 = "SELECT * FROM Witness ORDER BY Village ASC";
                ShowWitnessTable(sql1);

            } if(WitnessComboBox.getSelectedItem().toString().equals("Thana"))
            {

                String sql1 = "SELECT * FROM Witness ORDER BY Thana ASC";
                ShowWitnessTable(sql1);

            }
            if(WitnessComboBox.getSelectedItem().toString().equals("DistrictId"))
            {

                String sql1 = "SELECT * FROM Witness ORDER BY DistrictId ASC";
                ShowWitnessTable(sql1);

            }
            if(WitnessComboBox.getSelectedItem().toString().equals("PresentAddress"))
            {

                String sql1 = "SELECT * FROM Witness ORDER BY PresentAddress ASC";
                ShowWitnessTable(sql1);

            }

            if(WitnessComboBox.getSelectedItem().toString().equals("PresentThana"))
            {

                String sql1 = "SELECT * FROM Witness ORDER BY PresentThana ASC";
                ShowWitnessTable(sql1);

            }

            if(WitnessComboBox.getSelectedItem().toString().equals("PresentDistrictId"))
            {

                String sql1 = "SELECT * FROM WitnessORDER BY PresentDistrictId ASC";
                ShowWitnessTable(sql1);

            }
            if(WitnessComboBox.getSelectedItem().toString().equals("MobileNo"))
            {

                String sql1 = "SELECT * FROM Witness ORDER BY MobileNo ASC";
                ShowWitnessTable(sql1);

            }

        }
        catch (SQLException ex) {
            Logger.getLogger(WitnessTableJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_WitnessComboBoxActionPerformed

    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WitnessTableJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButtonWitnessTable;
    private javax.swing.JLabel Image;
    private javax.swing.JComboBox<String> SearchComboBox;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JLabel Sort;
    private javax.swing.JLabel WITNESSLabel;
    private javax.swing.JComboBox<String> WitnessComboBox;
    private javax.swing.JTable WitnessJTable;
    private javax.swing.JScrollPane WitnessTable;
    private javax.swing.JButton WitnessUpdateButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
