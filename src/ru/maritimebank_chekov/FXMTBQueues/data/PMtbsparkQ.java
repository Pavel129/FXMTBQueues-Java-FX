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
@since   2022/11/21 13:40:15
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbsparkQ")
@Table (name="MTB.Q_FX_SPARK_Q")
public class PMtbsparkQ implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_40_15l;

    private Long ISQID;
    private String CSQSTATE;
    private Timestamp TSQMOD;
    private String CSQMETHOD;
    private String XCID;
    private String SPARKID;
    private String CINN;
    private String COGRN;
    private String CNAME;
    private LocalDate DBIRTHDAY;
    private Clob CSQRESPONSE;
    private String CSQRESULT;

    public PMtbsparkQ(){}

    @Id 
    @Column(name="ISQID",nullable = false,length = 0)
    public Long getISQID() {
        return ISQID;
    }
    public void setISQID(Long val) {
        ISQID = val; 
    }
    @Column(name="CSQSTATE",length = 1)
    public String getCSQSTATE() {
        return CSQSTATE;
    }
    public void setCSQSTATE(String val) {
        CSQSTATE = val; 
    }
    @Column(name="TSQMOD")
    public Timestamp getTSQMOD() {
        return TSQMOD;
    }
    public void setTSQMOD(Timestamp val) {
        TSQMOD = val; 
    }
    @Column(name="CSQMETHOD",length = 64)
    public String getCSQMETHOD() {
        return CSQMETHOD;
    }
    public void setCSQMETHOD(String val) {
        CSQMETHOD = val; 
    }
    @Column(name="XCID",length = 32)
    public String getXCID() {
        return XCID;
    }
    public void setXCID(String val) {
        XCID = val; 
    }
    @Column(name="SPARKID",length = 32)
    public String getSPARKID() {
        return SPARKID;
    }
    public void setSPARKID(String val) {
        SPARKID = val; 
    }
    @Column(name="CINN",length = 12)
    public String getCINN() {
        return CINN;
    }
    public void setCINN(String val) {
        CINN = val; 
    }
    @Column(name="COGRN",length = 15)
    public String getCOGRN() {
        return COGRN;
    }
    public void setCOGRN(String val) {
        COGRN = val; 
    }
    @Column(name="CNAME",length = 512)
    public String getCNAME() {
        return CNAME;
    }
    public void setCNAME(String val) {
        CNAME = val; 
    }
    @Column(name="DBIRTHDAY")
    public LocalDate getDBIRTHDAY() {
        return DBIRTHDAY;
    }
    public void setDBIRTHDAY(LocalDate val) {
        DBIRTHDAY = val; 
    }
    @Column(name="CSQRESPONSE")
    public Clob getCSQRESPONSE() {
        return CSQRESPONSE;
    }
    public void setCSQRESPONSE(Clob val) {
        CSQRESPONSE = val; 
    }
    @Column(name="CSQRESULT",length = 255)
    public String getCSQRESULT() {
        return CSQRESULT;
    }
    public void setCSQRESULT(String val) {
        CSQRESULT = val; 
    }
}