package SQLPackage;
import PoliceStationManagement.*;  
 import java.sql.Connection;  
 import java.sql.DriverManager;  
 import java.sql.ResultSet;  
 import java.sql.Statement;  

public class ConnectMSSQL {  
    public Connection connection;
     public void connectDB(){  
         try {  
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             connection = DriverManager  
                     .getConnection(  
                             "jdbc:sqlserver://localhost:1433;databaseName=PoliceStationCaseManagement;selectMethod=cursor",   "sa", "123456");  
   
           /*  System.out.println("DATABASE NAME IS:"  
                     + connection.getMetaData().getDatabaseProductName());  
             Statement statement = connection.createStatement();  
             ResultSet resultSet = statement  
                     .executeQuery("SELECT DistrictName FROM DistrictCodes");  
             while (resultSet.next()) {  
                 System.out.println("District NAME:"  
                         + resultSet.getString("DistrictName"));  
             }*/  
         } catch (Exception e) {  
             e.printStackTrace();  
         }  
     } 

 }  