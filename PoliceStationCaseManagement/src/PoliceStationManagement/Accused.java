
package PoliceStationManagement;

public class Accused {
    private int AccusedId,DistrictId,PresentDistrictId,Age,CaseNo;
    private String AccusedName,FathersName,Village,Thana,PresentAddress,PresentThana;
    public Accused(int AccusedId,int CaseNo,String AccusedName,int Age,String FathersName,String Village,String Thana,int DistrictId,String PresentAddress,String PresentThana,int PresentDistrictId)
    {
        this.AccusedId = AccusedId;
        this.CaseNo=CaseNo;
        this.AccusedName = AccusedName;
        this.Age = Age;
        this.FathersName = FathersName;
        this.Village = Village;
        this.Thana = Thana;
        this.DistrictId = DistrictId;
        this.PresentAddress = PresentAddress;
        this.PresentThana = PresentThana;
        this.PresentDistrictId = PresentDistrictId;
    }
    
    public int getAccusedId()
    {
        return AccusedId;
    }
    public int getCaseNo()
    {
        return CaseNo;
    }
    public String getAccusedName()
    {
        return AccusedName;
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
