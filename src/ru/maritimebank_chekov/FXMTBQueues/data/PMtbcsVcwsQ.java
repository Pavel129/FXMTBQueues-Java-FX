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
@since   2022/11/21 13:41:16
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbcsVcwsQ")
@Table (name="MTB.Q_FX_VCWS_Q")
public class PMtbcsVcwsQ implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_41_16l;

    private Long IVCWSID;
    private Timestamp TVCWSSTAMP;
    private Timestamp TVCWSMOD;
    private String CVCWSSTATE;
    private String CVCWSMETHOD;
    private String CVCWSCALLINGSYSTEM;
    private String CVCWSEXTREQID;
    private String CVCWSTERMINALID;
    private String CVCWSCARDCONTRACTID;
    private Long IVCWSCODE;
    private String CVCWSDESCRIPTION;
    private Long IVCWSREQID;
    private Long NVCWSAMOUNT;
    private String CVCWSCURCODE;
    private String CVCWSPHONE;
    private String CVSWSSENDOTP;
    private String CVCWSORDERID;
    private String CVCWSMASKPAN;
    private String CVCWSEXPDATE;
    private String CVCWSAPPROVALCODE;
    private String CVCWSAUTHLIMITID;
    private String CVCWSOTP;

    public PMtbcsVcwsQ(){}

    @Id 
    @Column(name="IVCWSID",nullable = false,length = 0)
    public Long getIVCWSID() {
        return IVCWSID;
    }
    public void setIVCWSID(Long val) {
        IVCWSID = val; 
    }
    @Column(name="TVCWSSTAMP")
    public Timestamp getTVCWSSTAMP() {
        return TVCWSSTAMP;
    }
    public void setTVCWSSTAMP(Timestamp val) {
        TVCWSSTAMP = val; 
    }
    @Column(name="TVCWSMOD")
    public Timestamp getTVCWSMOD() {
        return TVCWSMOD;
    }
    public void setTVCWSMOD(Timestamp val) {
        TVCWSMOD = val; 
    }
    @Column(name="CVCWSSTATE",length = 1)
    public String getCVCWSSTATE() {
        return CVCWSSTATE;
    }
    public void setCVCWSSTATE(String val) {
        CVCWSSTATE = val; 
    }
    @Column(name="CVCWSMETHOD",length = 16)
    public String getCVCWSMETHOD() {
        return CVCWSMETHOD;
    }
    public void setCVCWSMETHOD(String val) {
        CVCWSMETHOD = val; 
    }
    @Column(name="CVCWSCALLINGSYSTEM",length = 10)
    public String getCVCWSCALLINGSYSTEM() {
        return CVCWSCALLINGSYSTEM;
    }
    public void setCVCWSCALLINGSYSTEM(String val) {
        CVCWSCALLINGSYSTEM = val; 
    }
    @Column(name="CVCWSEXTREQID",length = 50)
    public String getCVCWSEXTREQID() {
        return CVCWSEXTREQID;
    }
    public void setCVCWSEXTREQID(String val) {
        CVCWSEXTREQID = val; 
    }
    @Column(name="CVCWSTERMINALID",length = 8)
    public String getCVCWSTERMINALID() {
        return CVCWSTERMINALID;
    }
    public void setCVCWSTERMINALID(String val) {
        CVCWSTERMINALID = val; 
    }
    @Column(name="CVCWSCARDCONTRACTID",length = 20)
    public String getCVCWSCARDCONTRACTID() {
        return CVCWSCARDCONTRACTID;
    }
    public void setCVCWSCARDCONTRACTID(String val) {
        CVCWSCARDCONTRACTID = val; 
    }
    @Column(name="IVCWSCODE",length = 3)
    public Long getIVCWSCODE() {
        return IVCWSCODE;
    }
    public void setIVCWSCODE(Long val) {
        IVCWSCODE = val; 
    }
    @Column(name="CVCWSDESCRIPTION",length = 256)
    public String getCVCWSDESCRIPTION() {
        return CVCWSDESCRIPTION;
    }
    public void setCVCWSDESCRIPTION(String val) {
        CVCWSDESCRIPTION = val; 
    }
    @Column(name="IVCWSREQID",length = 0)
    public Long getIVCWSREQID() {
        return IVCWSREQID;
    }
    public void setIVCWSREQID(Long val) {
        IVCWSREQID = val; 
    }
    @Column(name="NVCWSAMOUNT",length = 20)
    public Long getNVCWSAMOUNT() {
        return NVCWSAMOUNT;
    }
    public void setNVCWSAMOUNT(Long val) {
        NVCWSAMOUNT = val; 
    }
    @Column(name="CVCWSCURCODE",length = 3)
    public String getCVCWSCURCODE() {
        return CVCWSCURCODE;
    }
    public void setCVCWSCURCODE(String val) {
        CVCWSCURCODE = val; 
    }
    @Column(name="CVCWSPHONE",length = 16)
    public String getCVCWSPHONE() {
        return CVCWSPHONE;
    }
    public void setCVCWSPHONE(String val) {
        CVCWSPHONE = val; 
    }
    @Column(name="CVSWSSENDOTP",length = 1)
    public String getCVSWSSENDOTP() {
        return CVSWSSENDOTP;
    }
    public void setCVSWSSENDOTP(String val) {
        CVSWSSENDOTP = val; 
    }
    @Column(name="CVCWSORDERID",length = 40)
    public String getCVCWSORDERID() {
        return CVCWSORDERID;
    }
    public void setCVCWSORDERID(String val) {
        CVCWSORDERID = val; 
    }
    @Column(name="CVCWSMASKPAN",length = 19)
    public String getCVCWSMASKPAN() {
        return CVCWSMASKPAN;
    }
    public void setCVCWSMASKPAN(String val) {
        CVCWSMASKPAN = val; 
    }
    @Column(name="CVCWSEXPDATE",length = 4)
    public String getCVCWSEXPDATE() {
        return CVCWSEXPDATE;
    }
    public void setCVCWSEXPDATE(String val) {
        CVCWSEXPDATE = val; 
    }
    @Column(name="CVCWSAPPROVALCODE",length = 6)
    public String getCVCWSAPPROVALCODE() {
        return CVCWSAPPROVALCODE;
    }
    public void setCVCWSAPPROVALCODE(String val) {
        CVCWSAPPROVALCODE = val; 
    }
    @Column(name="CVCWSAUTHLIMITID",length = 32)
    public String getCVCWSAUTHLIMITID() {
        return CVCWSAUTHLIMITID;
    }
    public void setCVCWSAUTHLIMITID(String val) {
        CVCWSAUTHLIMITID = val; 
    }
    @Column(name="CVCWSOTP",length = 10)
    public String getCVCWSOTP() {
        return CVCWSOTP;
    }
    public void setCVCWSOTP(String val) {
        CVCWSOTP = val; 
    }
}