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
@since   2022/11/21 13:45:19
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbftcStmQ")
@Table (name="MTB.Q_FX_STM_Q")
public class PMtbftcStmQ  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_45_19l;

    private Long IFSQID;
    private String CACC;
    private String CCUR;
    private String IDSMR;
    private Long IFSQTYPE;
    private Long ISTATUS;
    private Timestamp DSTAMP;
    private Timestamp DCREATE;
    private LocalDate DBEG;
    private LocalDate DEND;
    private String CF;

    public PMtbftcStmQ(){}

    @Id 
    @Column(name="IFSQID",nullable = false,length = 0)
    public Long getIFSQID() {
        return IFSQID;
    }
    public void setIFSQID(Long val) {
        IFSQID = val; 
    }
    @Column(name="CACC",length = 35)
    public String getCACC() {
        return CACC;
    }
    public void setCACC(String val) {
        CACC = val; 
    }
    @Column(name="CCUR",length = 3)
    public String getCCUR() {
        return CCUR;
    }
    public void setCCUR(String val) {
        CCUR = val; 
    }
    @Column(name="IDSMR",length = 3)
    public String getIDSMR() {
        return IDSMR;
    }
    public void setIDSMR(String val) {
        IDSMR = val; 
    }
    @Column(name="IFSQTYPE",length = 1)
    public Long getIFSQTYPE() {
        return IFSQTYPE;
    }
    public void setIFSQTYPE(Long val) {
        IFSQTYPE = val; 
    }
    @Column(name="ISTATUS",length = 1)
    public Long getISTATUS() {
        return ISTATUS;
    }
    public void setISTATUS(Long val) {
        ISTATUS = val; 
    }
    @Column(name="DSTAMP")
    public Timestamp getDSTAMP() {
        return DSTAMP;
    }
    public void setDSTAMP(Timestamp val) {
        DSTAMP = val; 
    }
    @Column(name="DCREATE")
    public Timestamp getDCREATE() {
        return DCREATE;
    }
    public void setDCREATE(Timestamp val) {
        DCREATE = val; 
    }
    @Column(name="DBEG")
    public LocalDate getDBEG() {
        return DBEG;
    }
    public void setDBEG(LocalDate val) {
        DBEG = val; 
    }
    @Column(name="DEND")
    public LocalDate getDEND() {
        return DEND;
    }
    public void setDEND(LocalDate val) {
        DEND = val; 
    }
    @Column(name="CF",length = 1)
    public String getCF() {
        return CF;
    }
    public void setCF(String val) {
        CF = val; 
    }
}