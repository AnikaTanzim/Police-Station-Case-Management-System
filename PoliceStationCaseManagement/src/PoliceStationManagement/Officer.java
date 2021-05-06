
package PoliceStationManagement;

public class Officer {
    private int PoliceOfficerId, CaseHandledNo, PhoneNo, DutyHour,YearsOfexperience;
    private String PoliceOfficerName,Designation, Area,Address; 
    public Officer(int PoliceOfficerId,String PoliceOfficerName,String Designation,String Area,int CaseHandledNo,int PhoneNo, String Address,int DutyHour, int YearsOfexperience )
    {
        this.PoliceOfficerId = PoliceOfficerId;
        this.PoliceOfficerName = PoliceOfficerName;
        this.Designation = Designation;
        this.Area = Area;
        this.CaseHandledNo = CaseHandledNo;
        this.PhoneNo = PhoneNo;
        this.Address = Address;
        this.DutyHour = DutyHour;
        this.YearsOfexperience = YearsOfexperience;
        
    }
    
    public int getPoliceOfficerId()
    {
        return PoliceOfficerId;
    }
    public String getPoliceOfficerName()
    {
        return PoliceOfficerName;
    }
    public String getDesignation()
    {
        return Designation;
    }
    public String getArea()
    {
        return Area;
    }
    public int getCaseHandledNo()
    {
        return CaseHandledNo;
    }
    public int getPhoneNo()
    {
        return PhoneNo;
    }
                
    public String getAddress()
    {
        return Address;
    }
    public int getDutyHour()
    {
        return DutyHour;
    }
    public int getYearsOfexperience()
    {
        return YearsOfexperience;
    }
}
