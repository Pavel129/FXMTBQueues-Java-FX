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
@since   2022/11/21 13:50:41
*/
@Entity (name="ru.maritimebank_chekov.data.PGateOutgoDocument")
@Table (name="MTB.Q_FX_GO_DOCUMENT")
public class PGateOutgoDocument implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_50_41l;

    private Long IGODOCID;
    private Timestamp DGODOCDATE;
    private String RGODOCREF;
    private String RGODOCGUID;
    private Long IGODOCSTATE;
    private String CGODOCSRC;
    private Clob CGODOCBODY;
    private Long IGODOCABSID;
    private String CGODOCMESSAGE;

    public PGateOutgoDocument(){}

    @Id 
    @Column(name="IGODOCID",nullable = false,length = 0)
    public Long getIGODOCID() {
        return IGODOCID;
    }
    public void setIGODOCID(Long val) {
        IGODOCID = val; 
    }
    @Column(name="DGODOCDATE")
    public Timestamp getDGODOCDATE() {
        return DGODOCDATE;
    }
    public void setDGODOCDATE(Timestamp val) {
        DGODOCDATE = val; 
    }
    @Column(name="RGODOCREF")
    public String getRGODOCREF() {
        return RGODOCREF;
    }
    public void setRGODOCREF(String val) {
        RGODOCREF = val; 
    }
    @Column(name="RGODOCGUID")
    public String getRGODOCGUID() {
        return RGODOCGUID;
    }
    public void setRGODOCGUID(String val) {
        RGODOCGUID = val; 
    }
    @Column(name="IGODOCSTATE",length = 0)
    public Long getIGODOCSTATE() {
        return IGODOCSTATE;
    }
    public void setIGODOCSTATE(Long val) {
        IGODOCSTATE = val; 
    }
    @Column(name="CGODOCSRC",nullable = false,length = 30)
    public String getCGODOCSRC() {
        return CGODOCSRC;
    }
    public void setCGODOCSRC(String val) {
        CGODOCSRC = val; 
    }
    @Column(name="CGODOCBODY",nullable = false)
    public Clob getCGODOCBODY() {
        return CGODOCBODY;
    }
    public void setCGODOCBODY(Clob val) {
        CGODOCBODY = val; 
    }
    @Column(name="IGODOCABSID",length = 0)
    public Long getIGODOCABSID() {
        return IGODOCABSID;
    }
    public void setIGODOCABSID(Long val) {
        IGODOCABSID = val; 
    }
    @Column(name="CGODOCMESSAGE",length = 2000)
    public String getCGODOCMESSAGE() {
        return CGODOCMESSAGE;
    }
    public void setCGODOCMESSAGE(String val) {
        CGODOCMESSAGE = val; 
    }

}