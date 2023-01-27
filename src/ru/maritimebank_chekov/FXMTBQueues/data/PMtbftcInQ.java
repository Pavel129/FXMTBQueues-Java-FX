package ru.maritimebank_chekov.FXMTBQueues.data;

import java.math.BigDecimal;
import java.sql.*;
import java.time.*;
import java.io.Serializable;
import javax.persistence.*;
import ru.inversion.dataset.mark.*;
import ru.inversion.db.entity.ProxyFor;

/**
@author  chekov
@since   2022/11/21 13:44:55
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbftcInQ")
@Table (name="MTB.Q_FX_IN_Q")
public class PMtbftcInQ  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_44_55l;

    private Long IFIQID;
    private Long IFIQFTCID;
    private String CFIQFTCGUID;
    private String CFIQDTYPE;
    private Long IFIQSTATUS;
    private Timestamp DSTAMP;
    private String CFIQMESSAGE;
    private String IFIQPROCCARDID;
    private Long IFIQCAMWSID;
    private Long NFIQCAMWSAMOUNT;
    private Long IFIQIPLCID;

    public PMtbftcInQ(){}

    @Id 
    @Column(name="IFIQID",nullable = false,length = 0)
    public Long getIFIQID() {
        return IFIQID;
    }
    public void setIFIQID(Long val) {
        IFIQID = val; 
    }
    @Column(name="IFIQFTCID",length = 0)
    public Long getIFIQFTCID() {
        return IFIQFTCID;
    }
    public void setIFIQFTCID(Long val) {
        IFIQFTCID = val; 
    }
    @Column(name="CFIQFTCGUID",length = 40)
    public String getCFIQFTCGUID() {
        return CFIQFTCGUID;
    }
    public void setCFIQFTCGUID(String val) {
        CFIQFTCGUID = val; 
    }
    @Column(name="CFIQDTYPE",length = 40)
    public String getCFIQDTYPE() {
        return CFIQDTYPE;
    }
    public void setCFIQDTYPE(String val) {
        CFIQDTYPE = val; 
    }
    @Column(name="IFIQSTATUS",length = 2)
    public Long getIFIQSTATUS() {
        return IFIQSTATUS;
    }
    public void setIFIQSTATUS(Long val) {
        IFIQSTATUS = val; 
    }
    @Column(name="DSTAMP")
    public Timestamp getDSTAMP() {
        return DSTAMP;
    }
    public void setDSTAMP(Timestamp val) {
        DSTAMP = val; 
    }
    @Column(name="CFIQMESSAGE",length = 2000)
    public String getCFIQMESSAGE() {
        return CFIQMESSAGE;
    }
    public void setCFIQMESSAGE(String val) {
        CFIQMESSAGE = val; 
    }
    @Column(name="IFIQPROCCARDID",length = 50)
    public String getIFIQPROCCARDID() {
        return IFIQPROCCARDID;
    }
    public void setIFIQPROCCARDID(String val) {
        IFIQPROCCARDID = val; 
    }
    @Column(name="IFIQCAMWSID",length = 0)
    public Long getIFIQCAMWSID() {
        return IFIQCAMWSID;
    }
    public void setIFIQCAMWSID(Long val) {
        IFIQCAMWSID = val; 
    }
    @Column(name="NFIQCAMWSAMOUNT",length = 0)
    public Long getNFIQCAMWSAMOUNT() {
        return NFIQCAMWSAMOUNT;
    }
    public void setNFIQCAMWSAMOUNT(Long val) {
        NFIQCAMWSAMOUNT = val; 
    }
    @Column(name="IFIQIPLCID",length = 0)
    public Long getIFIQIPLCID() {
        return IFIQIPLCID;
    }
    public void setIFIQIPLCID(Long val) {
        IFIQIPLCID = val; 
    }
}