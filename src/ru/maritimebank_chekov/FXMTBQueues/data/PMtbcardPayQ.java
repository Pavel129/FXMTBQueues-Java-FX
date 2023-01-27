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
@since   2022/11/21 13:43:51
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbcardPayQ")
@Table (name="MTB.Q_FX_CARD_PAY_Q")
public class PMtbcardPayQ implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_43_51l;

    private Long ICPID;
    private String RCPGUID;
    private Timestamp TCPSTAMP;
    private String CCPSTATUS;
    private String CCPVENDOR;
    private String CCPURL;
    private String CCPACTION;
    private String CCPAUTHKEY;
    private String CCPAUTHVALUE;
    private String CCPREQUEST;
    private String CCPRESPONSE;
    private String CCPRESPONSEID;
    private String CCPMSG;
    private String CCPMETHOD;

    public PMtbcardPayQ(){}

    @Id 
    @Column(name="ICPID",nullable = false,length = 0)
    public Long getICPID() {
        return ICPID;
    }
    public void setICPID(Long val) {
        ICPID = val; 
    }
    @Column(name="RCPGUID")
    public String getRCPGUID() {
        return RCPGUID;
    }
    public void setRCPGUID(String val) {
        RCPGUID = val; 
    }
    @Column(name="TCPSTAMP")
    public Timestamp getTCPSTAMP() {
        return TCPSTAMP;
    }
    public void setTCPSTAMP(Timestamp val) {
        TCPSTAMP = val; 
    }
    @Column(name="CCPSTATUS",length = 1)
    public String getCCPSTATUS() {
        return CCPSTATUS;
    }
    public void setCCPSTATUS(String val) {
        CCPSTATUS = val; 
    }
    @Column(name="CCPVENDOR",length = 30)
    public String getCCPVENDOR() {
        return CCPVENDOR;
    }
    public void setCCPVENDOR(String val) {
        CCPVENDOR = val; 
    }
    @Column(name="CCPURL",length = 255)
    public String getCCPURL() {
        return CCPURL;
    }
    public void setCCPURL(String val) {
        CCPURL = val; 
    }
    @Column(name="CCPACTION",length = 30)
    public String getCCPACTION() {
        return CCPACTION;
    }
    public void setCCPACTION(String val) {
        CCPACTION = val; 
    }
    @Column(name="CCPAUTHKEY",length = 30)
    public String getCCPAUTHKEY() {
        return CCPAUTHKEY;
    }
    public void setCCPAUTHKEY(String val) {
        CCPAUTHKEY = val; 
    }
    @Column(name="CCPAUTHVALUE",length = 255)
    public String getCCPAUTHVALUE() {
        return CCPAUTHVALUE;
    }
    public void setCCPAUTHVALUE(String val) {
        CCPAUTHVALUE = val; 
    }
    @Column(name="CCPREQUEST",length = 4000)
    public String getCCPREQUEST() {
        return CCPREQUEST;
    }
    public void setCCPREQUEST(String val) {
        CCPREQUEST = val; 
    }
    @Column(name="CCPRESPONSE",length = 4000)
    public String getCCPRESPONSE() {
        return CCPRESPONSE;
    }
    public void setCCPRESPONSE(String val) {
        CCPRESPONSE = val; 
    }
    @Column(name="CCPRESPONSEID",length = 36)
    public String getCCPRESPONSEID() {
        return CCPRESPONSEID;
    }
    public void setCCPRESPONSEID(String val) {
        CCPRESPONSEID = val; 
    }
    @Column(name="CCPMSG",length = 4000)
    public String getCCPMSG() {
        return CCPMSG;
    }
    public void setCCPMSG(String val) {
        CCPMSG = val; 
    }
    @Column(name="CCPMETHOD",length = 8)
    public String getCCPMETHOD() {
        return CCPMETHOD;
    }
    public void setCCPMETHOD(String val) {
        CCPMETHOD = val; 
    }
}