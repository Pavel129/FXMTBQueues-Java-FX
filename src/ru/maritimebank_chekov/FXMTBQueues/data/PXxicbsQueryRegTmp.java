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
@since   2022/11/21 13:46:09
*/
@Entity (name="ru.maritimebank_chekov.data.PXxicbsQueryRegTmp")
@Table (name="MTB.Q_FX_QUERY_REG_TMP")
public class PXxicbsQueryRegTmp  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_46_09l;

    private Long ICUSNUM;
    private LocalDateTime TSYSDATE;
    private String MESSAGE;
    private String CRETCODE;
    private String CERRMSG;
    private String TRANS_MARK;
    private String CLOGIN;
    private Long INUMREC;
    private LocalDateTime TSYSDATE_TRANS;
    private String CSYSTEM;
    private String QUERYTYPE;

    public PXxicbsQueryRegTmp(){}

    @Id 
    @Column(name="ICUSNUM",length = 0)
    public Long getICUSNUM() {
        return ICUSNUM;
    }
    public void setICUSNUM(Long val) {
        ICUSNUM = val; 
    }
    @Column(name="TSYSDATE",nullable = false)
    public LocalDateTime getTSYSDATE() {
        return TSYSDATE;
    }
    public void setTSYSDATE(LocalDateTime val) {
        TSYSDATE = val; 
    }
    @Column(name="MESSAGE",length = 2048)
    public String getMESSAGE() {
        return MESSAGE;
    }
    public void setMESSAGE(String val) {
        MESSAGE = val; 
    }
    @Column(name="CRETCODE",length = 200)
    public String getCRETCODE() {
        return CRETCODE;
    }
    public void setCRETCODE(String val) {
        CRETCODE = val; 
    }
    @Column(name="CERRMSG",length = 2048)
    public String getCERRMSG() {
        return CERRMSG;
    }
    public void setCERRMSG(String val) {
        CERRMSG = val; 
    }
    @Column(name="TRANS_MARK",length = 1)
    public String getTRANS_MARK() {
        return TRANS_MARK;
    }
    public void setTRANS_MARK(String val) {
        TRANS_MARK = val; 
    }
    @Column(name="CLOGIN",length = 200)
    public String getCLOGIN() {
        return CLOGIN;
    }
    public void setCLOGIN(String val) {
        CLOGIN = val; 
    }
    @Column(name="INUMREC",nullable = false,length = 18)
    public Long getINUMREC() {
        return INUMREC;
    }
    public void setINUMREC(Long val) {
        INUMREC = val; 
    }
    @Column(name="TSYSDATE_TRANS")
    public LocalDateTime getTSYSDATE_TRANS() {
        return TSYSDATE_TRANS;
    }
    public void setTSYSDATE_TRANS(LocalDateTime val) {
        TSYSDATE_TRANS = val; 
    }
    @Column(name="CSYSTEM",length = 1)
    public String getCSYSTEM() {
        return CSYSTEM;
    }
    public void setCSYSTEM(String val) {
        CSYSTEM = val; 
    }
    @Column(name="QUERYTYPE",length = 5)
    public String getQUERYTYPE() {
        return QUERYTYPE;
    }
    public void setQUERYTYPE(String val) {
        QUERYTYPE = val; 
    }
}