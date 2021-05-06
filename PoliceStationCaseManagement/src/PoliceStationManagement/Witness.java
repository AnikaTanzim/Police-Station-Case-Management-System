
package PoliceStationManagement;

public class Witness{
    private int WitnessId,DistrictId,PresentDistrictId,Age,CaseNo;
    private String WitnessName,FathersName,Village,Thana,PresentAddress,PresentThana,MobileNo;
    public Witness(int WitnessId,int CaseNo,String WitnessName,int Age,String FathersName,String Village,String Thana,int DistrictId,String PresentAddress,String PresentThana,int PresentDistrictId,String MobileNo)
    {
        this.WitnessId=WitnessId;
        this.CaseNo=CaseNo;
        this.WitnessName=WitnessName;
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
    
    public int getWitnessId()
    {
        return WitnessId;
    }
    public int getCaseNo()
    {
        return CaseNo;
    }
    public String getWitnessName()
    {
        return WitnessName;
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
     public String getMobileNo()
    {
        return MobileNo;
    }
        
          
}
