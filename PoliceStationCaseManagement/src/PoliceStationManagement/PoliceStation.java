
package PoliceStationManagement;


public class PoliceStation {
    private int PoliceStationId,CodeNo;
    private String PoliceStationName,Area,OfficerInCharge;
    public PoliceStation(int PoliceStationId,String PoliceStationName,int CodeNo,String Area,String OfficerInCharge)
    {
        this.PoliceStationId=PoliceStationId;
        this.PoliceStationName=PoliceStationName;
        this.CodeNo=CodeNo;
        this.Area=Area;
        this.OfficerInCharge=OfficerInCharge;
    } 
     public int getPoliceStationId()
    {
        return PoliceStationId;
    }
    public String getPoliceStationName()
    {
        return PoliceStationName;
    }
    public int getCodeNo()
    {
        return CodeNo;
    }
    public String getArea()
    {
        return Area;
    }
    
    public String getOfficerInCharge()
    {
        return OfficerInCharge;
    }

}
