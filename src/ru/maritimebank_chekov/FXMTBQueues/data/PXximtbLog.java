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
@since   2022/11/21 13:38:23
*/
@Entity (name="ru.maritimebank_chekov.data.PXximtbLog")
@Table (name="MTB.Q_FX_LOG")
public class PXximtbLog implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_38_23l;

    private Long ID_MTB_LOG;
    private LocalDate DDATE;
    private String CUSER;
    private String CEXTTYPE;
    private Long ICUSNUM;
    private String CACCACC;
    private String CPLCNUM;
    private Long IDDOC;
    private Long AMOUNT;
    private Long NSTATUS;
    private Clob CERRMSG;
    private Long ITRNNUM;
    private Long ITRNANUM;

    public PXximtbLog(){}

    @Id 
    @Column(name="ID_MTB_LOG",nullable = false,length = 0)
    public Long getID_MTB_LOG() {
        return ID_MTB_LOG;
    }
    public void setID_MTB_LOG(Long val) {
        ID_MTB_LOG = val; 
    }
    @Column(name="DDATE",nullable = false)
    public LocalDate getDDATE() {
        return DDATE;
    }
    public void setDDATE(LocalDate val) {
        DDATE = val; 
    }
    @Column(name="CUSER",nullable = false,length = 4000)
    public String getCUSER() {
        return CUSER;
    }
    public void setCUSER(String val) {
        CUSER = val; 
    }
    @Column(name="CEXTTYPE",nullable = false,length = 100)
    public String getCEXTTYPE() {
        return CEXTTYPE;
    }
    public void setCEXTTYPE(String val) {
        CEXTTYPE = val; 
    }
    @Column(name="ICUSNUM",length = 12)
    public Long getICUSNUM() {
        return ICUSNUM;
    }
    public void setICUSNUM(Long val) {
        ICUSNUM = val; 
    }
    @Column(name="CACCACC",length = 25)
    public String getCACCACC() {
        return CACCACC;
    }
    public void setCACCACC(String val) {
        CACCACC = val; 
    }
    @Column(name="CPLCNUM",length = 20)
    public String getCPLCNUM() {
        return CPLCNUM;
    }
    public void setCPLCNUM(String val) {
        CPLCNUM = val; 
    }
    @Column(name="IDDOC",length = 38)
    public Long getIDDOC() {
        return IDDOC;
    }
    public void setIDDOC(Long val) {
        IDDOC = val; 
    }
    @Column(name="AMOUNT",length = 0)
    public Long getAMOUNT() {
        return AMOUNT;
    }
    public void setAMOUNT(Long val) {
        AMOUNT = val; 
    }
    @Column(name="NSTATUS",nullable = false,length = 0)
    public Long getNSTATUS() {
        return NSTATUS;
    }
    public void setNSTATUS(Long val) {
        NSTATUS = val; 
    }
    @Column(name="CERRMSG")
    public Clob getCERRMSG() {
        return CERRMSG;
    }
    public void setCERRMSG(Clob val) {
        CERRMSG = val; 
    }
    @Column(name="ITRNNUM",length = 12)
    public Long getITRNNUM() {
        return ITRNNUM;
    }
    public void setITRNNUM(Long val) {
        ITRNNUM = val; 
    }
    @Column(name="ITRNANUM",length = 12)
    public Long getITRNANUM() {
        return ITRNANUM;
    }
    public void setITRNANUM(Long val) {
        ITRNANUM = val; 
    }
}