
package PoliceStationManagement;

import java.sql.Date;

class Cases {
    
    private int CaseNo,SectionNo,MagistrateSection ,ComplainLetterNo,PoliceStationId,PoliceOfficerId ;
    private String StolenGoods,RevivedGoods,CriminalStatus,InvestigatingOfficerName,CaseFilerName,
            AreaOfCrime,TypeOfCase,ClosingDate,ReceivingDate,CaseAcceptance,FinalReport;
    public Cases(int CaseNo,int SectionNo,int PoliceStationId,int PoliceOfficerId,int MagistrateSection ,String StolenGoods,String RevivedGoods,
            String CaseAcceptance, int ComplainLetterNo,String FinalReport,String CriminalStatus,
            String InvestigatingOfficerName,String CaseFilerName,String AreaOfCrime,String ClosingDate,
            String ReceivingDate,String TypeOfCase){
        
        this.CaseNo=CaseNo;
        this.SectionNo=SectionNo;
        this.PoliceStationId=PoliceStationId;
        this.PoliceOfficerId=PoliceOfficerId;
        this.MagistrateSection=MagistrateSection;
        this.StolenGoods=StolenGoods;
        this.RevivedGoods=RevivedGoods;
        this.CaseAcceptance=CaseAcceptance;
        this.ComplainLetterNo=ComplainLetterNo;
        this.FinalReport=FinalReport;
        this.CriminalStatus=CriminalStatus;
        this.InvestigatingOfficerName=InvestigatingOfficerName;
        this.CaseFilerName=CaseFilerName;
        this.AreaOfCrime=AreaOfCrime;
        this.ClosingDate=ClosingDate;
        this.ReceivingDate=ReceivingDate;
        this.TypeOfCase=TypeOfCase;
        
    }  
    
    public int getCaseNo(){
        return CaseNo;
    }
    public int getSectionNo(){
        return SectionNo;
    }
    public int getPoliceStationId(){
        return PoliceStationId;
    }
    public int getPoliceOfficerId(){
        return PoliceOfficerId;
    }
    public int getMagistrateSection(){
        return MagistrateSection;
    }
    public int getComplainLetterNo(){
        return ComplainLetterNo;
    }
    public String getStolenGoods(){
        return StolenGoods;
    }
    public String getRevivedGoods(){
        return RevivedGoods;
    }
    public String getCriminalStatus(){
        return CriminalStatus;
    }
    public String getInvestigatingOfficerName(){
        return InvestigatingOfficerName;
    }
    public String getCaseFilerName(){
        return CaseFilerName;
    }
    public String getAreaOfCrime(){
        return AreaOfCrime;
    }
    public String getTypeOfCase(){
        return TypeOfCase;
    }
    public String getClosingDate(){
        return ClosingDate;
    }
    public String getReceivingDate(){
        return ReceivingDate;
    }
    public String getCaseAcceptance(){
        return CaseAcceptance;
    }
    public String getFinalReport(){
        return FinalReport;
    }

}

