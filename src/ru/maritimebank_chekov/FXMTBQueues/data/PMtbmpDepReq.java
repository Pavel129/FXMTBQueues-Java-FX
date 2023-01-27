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
@since   2022/11/21 13:48:13
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbmpDepReq")
@Table (name="MTB.Q_FX_MP_DEP_REQ")
public class PMtbmpDepReq  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_48_13l;

    private Long IMDRID;
    private Timestamp TMDRSTAMP;
    private Long IMDRSTATUS;
    private Clob ZMDRCLIPAR;
    private String CMDRAGRID;
    private Long IMDRCUSNUM;
    private Long IMDRPASSP;
    private Long IMDRRESTRICT;
    private String CMDRERR;
    private String CMDRAGRNUM;
    private String CMDRCURRENTACC;
    private String CMDRCUSID;

    public PMtbmpDepReq(){}

    @Id 
    @Column(name="IMDRID",nullable = false,length = 0)
    public Long getIMDRID() {
        return IMDRID;
    }
    public void setIMDRID(Long val) {
        IMDRID = val; 
    }
    @Column(name="TMDRSTAMP")
    public Timestamp getTMDRSTAMP() {
        return TMDRSTAMP;
    }
    public void setTMDRSTAMP(Timestamp val) {
        TMDRSTAMP = val; 
    }
    @Column(name="IMDRSTATUS",length = 0)
    public Long getIMDRSTATUS() {
        return IMDRSTATUS;
    }
    public void setIMDRSTATUS(Long val) {
        IMDRSTATUS = val; 
    }
    @Column(name="ZMDRCLIPAR")
    public Clob getZMDRCLIPAR() {
        return ZMDRCLIPAR;
    }
    public void setZMDRCLIPAR(Clob val) {
        ZMDRCLIPAR = val; 
    }
    @Column(name="CMDRAGRID",length = 64)
    public String getCMDRAGRID() {
        return CMDRAGRID;
    }
    public void setCMDRAGRID(String val) {
        CMDRAGRID = val; 
    }
    @Column(name="IMDRCUSNUM",length = 0)
    public Long getIMDRCUSNUM() {
        return IMDRCUSNUM;
    }
    public void setIMDRCUSNUM(Long val) {
        IMDRCUSNUM = val; 
    }
    @Column(name="IMDRPASSP",length = 0)
    public Long getIMDRPASSP() {
        return IMDRPASSP;
    }
    public void setIMDRPASSP(Long val) {
        IMDRPASSP = val; 
    }
    @Column(name="IMDRRESTRICT",length = 0)
    public Long getIMDRRESTRICT() {
        return IMDRRESTRICT;
    }
    public void setIMDRRESTRICT(Long val) {
        IMDRRESTRICT = val; 
    }
    @Column(name="CMDRERR",length = 2000)
    public String getCMDRERR() {
        return CMDRERR;
    }
    public void setCMDRERR(String val) {
        CMDRERR = val; 
    }
    @Column(name="CMDRAGRNUM",length = 50)
    public String getCMDRAGRNUM() {
        return CMDRAGRNUM;
    }
    public void setCMDRAGRNUM(String val) {
        CMDRAGRNUM = val; 
    }
    @Column(name="CMDRCURRENTACC",length = 35)
    public String getCMDRCURRENTACC() {
        return CMDRCURRENTACC;
    }
    public void setCMDRCURRENTACC(String val) {
        CMDRCURRENTACC = val; 
    }
    @Column(name="CMDRCUSID",length = 36)
    public String getCMDRCUSID() {
        return CMDRCUSID;
    }
    public void setCMDRCUSID(String val) {
        CMDRCUSID = val; 
    }
}