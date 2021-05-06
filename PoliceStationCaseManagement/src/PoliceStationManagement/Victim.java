
package PoliceStationManagement;

public class Victim {
    private int VictimId,DistrictId,PresentDistrictId,Age,CaseNo;
    private String VictimName,FathersName,Village,Thana,PresentAddress,PresentThana,MobileNo;
    public Victim(int VictimId,int CaseNo,String VictimName,int Age,String FathersName,String Village,String Thana,int DistrictId,String PresentAddress,String PresentThana,int PresentDistrictId,String MobileNo)
    {
        this.VictimId=VictimId;
        this.CaseNo=CaseNo;
        this.VictimName=VictimName;
        this.Age=Age;
        this.FathersName=FathersName;
        this.Village=Village;
        this.Thana=Thana;
        this.DistrictId=DistrictId;
        this.PresentAddress=PresentAddress;
        this.PresentThana=PresentThana;
        this.PresentDistrictId=PresentDistrictId;
        this.MobileNo=MobileNo;
    }
    
    public int getVictimId()
    {
        return VictimId;
    }
    public int getCaseNo()
    {
        return CaseNo;
    }
    public String getVictimName()
    {
        return VictimName;
    }
    public String getMobileNo()
    {
        return MobileNo;
    }
    public int getAge()
    {
        return Age;
    }
    public String getFathersName()
    {
        return FathersName;
    }
    public String getVillage()
    {
        return Village;
    }
    public String getThana()
    {
        return Thana;
    }
                
    public int getDistrictId()
    {
        return DistrictId;
    }
    public String getPresentAddress()
    {
        return PresentAddress;
    }
    public String getPresentThana()
    {
        return PresentThana;
    }
    public int getPresentDistrictId()
    {
        return PresentDistrictId;
    }
        
          
}
