
package PoliceStationManagement;

public class Evidence {
    private int EvidenceId,CaseNo;
    private String EvidenceName, Area,Time,CollectedFrom,EvidenceStatus,TypeOfEvidence;
    public Evidence(int EvidenceId,int CaseNo,String EvidenceName,String Area,String Time,String CollectedFrom,String EvidenceStatus,String TypeOfEvidence)
    {
        this.EvidenceId=EvidenceId;
        this.CaseNo=CaseNo;
        this.EvidenceName=EvidenceName;
        this.Area=Area;
        this.Time=Time;
        this.CollectedFrom=CollectedFrom;
        this.EvidenceStatus=EvidenceStatus;
        this.TypeOfEvidence=TypeOfEvidence;
    }
    
    public int getEvidenceId()
    {
        return EvidenceId;
    }
    public int getCaseNo()
    {
        return CaseNo;
    }
    public String getEvidenceName()
    {
        return EvidenceName;
    }
    public String getArea()
    {
        return Area;
    }
    public String getTime()
    {
        return Time;
    }
    public String getCollectedFrom()
    {
        return CollectedFrom;
    }
    public String getEvidenceStatus()
    {
        return EvidenceStatus;
    }
                
    public String getTypeOfEvidence()
    {
        return TypeOfEvidence;
    }
} 