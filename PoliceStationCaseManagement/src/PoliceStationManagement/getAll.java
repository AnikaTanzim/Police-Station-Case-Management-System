
package PoliceStationManagement;

public class getAll {
    private int caseId;
    private String victimName, accusedName, witnessName, evidenceName;
    
    public getAll(int CaseId, String victimName, String accusedName, String witnessName, String evidenceName){
        this.caseId=CaseId;
        this.victimName=victimName;
        this.accusedName=accusedName; 
        this.witnessName=witnessName;
        this.evidenceName=evidenceName;
        
    }
    
    public int getcaseId()
    {
        return caseId;
    }
    public String getvictimName()
    {
        return victimName;
    }
    public String getAccusedName()
    {
        return accusedName;
    }
    public String getwitnessName()
    {
        return witnessName;
    }
    public String getevidenceName()
    {
        return evidenceName;
    }
}
