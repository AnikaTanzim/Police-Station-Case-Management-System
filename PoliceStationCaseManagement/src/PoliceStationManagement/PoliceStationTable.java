
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

public class PoliceStationTable extends javax.swing.JFrame {

    public PoliceStationTable() {
        initComponents();
        setSize(1250,885);
        setTitle("Police Station");
        Font font = new Font("Tahoma", Font.PLAIN, 20);
        this.PoliceStation.setFont(font);
        int gap = 15;
        this.PoliceStation.setRowHeight(this.PoliceStation.getRowHeight()+gap);
            try {
            ShowPoliceStation();
            
        } catch (SQLException ex) {
            Logger.getLogger(VictimTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PoliceStation = new javax.swing.JTable();
        PoliceStationTable = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        SearchComboBox = new javax.swing.JComboBox<>();
        SearchTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        PoliceStationComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 885));

        panel1.setLayout(null);

        PoliceStation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Police Station Id", "Police Station Name", "CodeNo", "Area", "Officer In Charge"
            }
        ));
        jScrollPane1.setViewportView(PoliceStation);

        panel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 240, 1250, 410);

        PoliceStationTable.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        PoliceStationTable.setForeground(new java.awt.Color(255, 255, 255));
        PoliceStationTable.setText("POLICE STATION TABLE");
        panel1.add(PoliceStationTable);
        PoliceStationTable.setBounds(420, 160, 440, 50);

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        panel1.add(deleteButton);
        deleteButton.setBounds(1030, 750, 170, 40);

        SearchComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SearchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--","Police Station Id", "Police Station Name", "CodeNo", "Area", "Officer In Charge" }));
        panel1.add(SearchComboBox);
        SearchComboBox.setBounds(200, 46, 180, 40);

        SearchTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextFieldKeyReleased(evt);
            }
        });
        panel1.add(SearchTextField);
        SearchTextField.setBounds(510, 46, 370, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Search :");
        panel1.add(jLabel2);
        jLabel2.setBounds(420, 60, 80, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Search by :");
        panel1.add(jLabel1);
        jLabel1.setBounds(90, 60, 100, 20);

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        panel1.add(BackButton);
        BackButton.setBounds(80, 730, 160, 40);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/logo.png"))); // NOI18N
        panel1.add(logo);
        logo.setBounds(1010, 10, 210, 220);

        PoliceStationComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PoliceStationComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PoliceStationId", "PoliceStationName", "CodeNo", "Area", "OfficerInCharge" }));
        PoliceStationComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliceStationComboBox1ActionPerformed(evt);
            }
        });
        panel1.add(PoliceStationComboBox1);
        PoliceStationComboBox1.setBounds(200, 120, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SORT:");
        panel1.add(jLabel3);
        jLabel3.setBounds(90, 120, 80, 22);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PoliceStationManagement/policeStation.jpg"))); // NOI18N
        panel1.add(image);
        image.setBounds(0, -50, 2470, 990);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1342, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public ArrayList<PoliceStation> PoliceStationList() throws SQLException
    {
        ArrayList<PoliceStation> PoliceStationList = new ArrayList<>();
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
        String Query1="SELECT * FROM PoliceStation";  
        Statement st=cnObj.connection.createStatement();
        ResultSet rs= st.executeQuery(Query1);
        PoliceStation PoliceStationObj;
        while(rs.next())
        {
            PoliceStationObj=new PoliceStation(rs.getInt("PoliceStationId"),rs.getString("PoliceStationName"),rs.getInt("CodeNo"),rs.getString("Area"),rs.getString("OfficerInCharge"));
            PoliceStationList.add(PoliceStationObj);
        }
        return PoliceStationList;
    }

    public void ShowPoliceStation() throws SQLException
    {
        ArrayList<PoliceStation> pList=PoliceStationList();
        DefaultTableModel Model= (DefaultTableModel)PoliceStation.getModel();
        Object[] row= new Object[5];
        for(int i=0;i<pList.size();i++)
        {
            row[0]=pList.get(i).getPoliceStationId();
            row[1]=pList.get(i).getPoliceStationName();
            row[2]=pList.get(i).getCodeNo();
            row[3]=pList.get(i).getArea(); 
            row[4]=pList.get(i).getOfficerInCharge();
            
         
            Model.addRow(row);
        }
         
    }
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        MainPage mObj = new MainPage();
        mObj.show();
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextFieldKeyReleased
        // TODO add your handling code here:
        String columnToSearch = SearchComboBox.getSelectedItem().toString();
        String stringToSearch = SearchTextField.getText();
        try{
            ConnectMSSQL cnObj = new ConnectMSSQL();
            cnObj.connectDB();
            DefaultTableModel Model= (DefaultTableModel)PoliceStation.getModel();
            Model.setRowCount(0);
            Object[] row= new Object[5];
            if("Police Station Id".equals(columnToSearch))
            {
                String query = "SELECT * FROM PoliceStation WHERE PoliceStationId LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    
                    row[0] = rs.getInt("PoliceStationId");
                    row[1] = rs.getString("PoliceStationName");
                    row[2] = rs.getInt("CodeNo");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("OfficerInCharge");
         
                    Model.addRow(row);
                }
            
            }
            else if("Police Station Name".equals(columnToSearch))
            {
                String query = "SELECT * FROM PoliceStation WHERE PoliceStationName LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    
                    row[0] = rs.getInt("PoliceStationId");
                    row[1] = rs.getString("PoliceStationName");
                    row[2] = rs.getInt("CodeNo");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("OfficerInCharge");
         
                    Model.addRow(row);
                }
            
            }
            else if("CodeNo".equals(columnToSearch))
            {
                String query = "SELECT * FROM PoliceStation WHERE CodeNo LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    
                    row[0] = rs.getInt("PoliceStationId");
                    row[1] = rs.getString("PoliceStationName");
                    row[2] = rs.getInt("CodeNo");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("OfficerInCharge");
         
                    Model.addRow(row);
                }
            
            }
            else if("Area".equals(columnToSearch))
            {
                String query = "SELECT * FROM PoliceStation WHERE Area LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    
                    row[0] = rs.getInt("PoliceStationId");
                    row[1] = rs.getString("PoliceStationName");
                    row[2] = rs.getInt("CodeNo");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("OfficerInCharge");
         
                    Model.addRow(row);
                }
            
            }
            else if("Officer In Charge".equals(columnToSearch))
            {
                String query = "SELECT * FROM PoliceStation WHERE OfficerInCharge LIKE'%"+stringToSearch+"%'";
                Statement st=cnObj.connection.createStatement();
                ResultSet rs= st.executeQuery(query);
                while(rs.next()){
                    
                    row[0] = rs.getInt("PoliceStationId");
                    row[1] = rs.getString("PoliceStationName");
                    row[2] = rs.getInt("CodeNo");
                    row[3] = rs.getString("Area");
                    row[4] = rs.getString("OfficerInCharge");
         
                    Model.addRow(row);
                }
            
            }
            else if("".equals(columnToSearch))
            {
                ShowPoliceStation();
            }
        }catch(Exception e){
            Logger.getLogger(VictimPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_SearchTextFieldKeyReleased

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
         try{
            ConnectMSSQL cnObj = new ConnectMSSQL();
            cnObj.connectDB();
            int row = PoliceStation.getSelectedRow();
            String value = (PoliceStation.getModel().getValueAt(row, 0).toString());
            String query = "DELETE FROM PoliceStation WHERE PoliceStationId = "+value;
            PreparedStatement pst = (PreparedStatement) cnObj.connection.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) PoliceStation.getModel();
            model.setRowCount(0);
            ShowPoliceStation();
            JOptionPane.showMessageDialog(null,"Deleted Successfully!!");
            
        }
        catch(Exception e){
            Logger.getLogger(VictimPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed
 public ArrayList<PoliceStation> PoliceStationListTableSort(String Query1) throws SQLException
    {
        ArrayList<PoliceStation> PoliceStationListTableSort = new ArrayList<>();
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
  
        Statement st=cnObj.connection.createStatement();
        ResultSet rs= st.executeQuery(Query1);
        PoliceStation PoliceStationObj;
        while(rs.next())
        {
            PoliceStationObj=new PoliceStation(rs.getInt("PoliceStationId"),rs.getString("PoliceStationName"),rs.getInt("CodeNo"),rs.getString("Area"),rs.getString("OfficerInCharge"));
            PoliceStationListTableSort.add(PoliceStationObj);
        }
        return PoliceStationListTableSort;
    }

    public void ShowPoliceStationTableSort(String Query1) throws SQLException
    {
        ArrayList<PoliceStation> pList=PoliceStationListTableSort(Query1);
   
        DefaultTableModel Model= new DefaultTableModel();
   
        Model.setColumnIdentifiers(new Object[]{"PoliceStationId","PoliceStationName","CodeNo","Area","OfficerInCharge"});
    
        Object[] row= new Object[5];
        for(int i=0;i<pList.size();i++)
        {
            row[0]=pList.get(i).getPoliceStationId();
            row[1]=pList.get(i).getPoliceStationName();
            row[2]=pList.get(i).getCodeNo();
            row[3]=pList.get(i).getArea(); 
            row[4]=pList.get(i).getOfficerInCharge();
            
         
            Model.addRow(row);
        }
       PoliceStation.setModel(Model);
         
    }
    private void PoliceStationComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliceStationComboBox1ActionPerformed
        try {
            if(PoliceStationComboBox1.getSelectedItem().toString().equals("PoliceStationId"))
            {

                String sql1 = "SELECT * FROM PoliceStation ORDER BY PoliceStationId ASC";
                ShowPoliceStationTableSort(sql1);

            }

            if(PoliceStationComboBox1.getSelectedItem().toString().equals("PoliceStationName"))
            {

                String sql1 = "SELECT * FROM PoliceStation ORDER BY PoliceStationName ASC";
                ShowPoliceStationTableSort(sql1);

            }
            if(PoliceStationComboBox1.getSelectedItem().toString().equals("Area"))
            {

                String sql1 = "SELECT * FROM PoliceStation ORDER BY Area ASC";
                ShowPoliceStationTableSort(sql1);

            } if(PoliceStationComboBox1.getSelectedItem().toString().equals("OfficerInCharge"))
            {

                String sql1 = "SELECT * FROM PoliceStation ORDER BY OfficerInCharge ASC";
                ShowPoliceStationTableSort(sql1);

            }
            if(PoliceStationComboBox1.getSelectedItem().toString().equals("CodeNo"))
            {

                String sql1 = "SELECT * FROM PoliceStation ORDER BY CodeNo ASC";
                ShowPoliceStationTableSort(sql1);

            }
        }
        catch (SQLException ex) {
            Logger.getLogger(PoliceStationTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PoliceStationComboBox1ActionPerformed

  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PoliceStationTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTable PoliceStation;
    private javax.swing.JComboBox<String> PoliceStationComboBox1;
    private javax.swing.JLabel PoliceStationTable;
    private javax.swing.JComboBox<String> SearchComboBox;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
