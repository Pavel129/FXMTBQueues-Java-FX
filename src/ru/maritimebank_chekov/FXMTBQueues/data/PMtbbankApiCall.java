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
@since   2022/11/21 13:53:05
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbbankApiCall")
@Table (name="MTB.Q_FX_BANK_API_CALL")
public class PMtbbankApiCall  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_53_05l;

    private Long IBACID;
    private String CBACCLIENT;
    private Timestamp TBACSTAMP;
    private String CBACNAME;
    private String RBACGUID;
    private Long IBACSTATUS;
    private Clob CBACREQUEST;
    private Clob CBACRESPONSE;

    public PMtbbankApiCall(){}

    @Id 
    @Column(name="IBACID",nullable = false,length = 0)
    public Long getIBACID() {
        return IBACID;
    }
    public void setIBACID(Long val) {
        IBACID = val; 
    }
    @Column(name="CBACCLIENT",length = 16)
    public String getCBACCLIENT() {
        return CBACCLIENT;
    }
    public void setCBACCLIENT(String val) {
        CBACCLIENT = val; 
    }
    @Column(name="TBACSTAMP")
    public Timestamp getTBACSTAMP() {
        return TBACSTAMP;
    }
    public void setTBACSTAMP(Timestamp val) {
        TBACSTAMP = val; 
    }
    @Column(name="CBACNAME",length = 30)
    public String getCBACNAME() {
        return CBACNAME;
    }
    public void setCBACNAME(String val) {
        CBACNAME = val; 
    }
    @Column(name="RBACGUID")
    public String getRBACGUID() {
        return RBACGUID;
    }
    public void setRBACGUID(String val) {
        RBACGUID = val; 
    }
    @Column(name="IBACSTATUS",length = 0)
    public Long getIBACSTATUS() {
        return IBACSTATUS;
    }
    public void setIBACSTATUS(Long val) {
        IBACSTATUS = val; 
    }
    @Column(name="CBACREQUEST")
    public Clob getCBACREQUEST() {
        return CBACREQUEST;
    }
    public void setCBACREQUEST(Clob val) {
        CBACREQUEST = val; 
    }
    @Column(name="CBACRESPONSE")
    public Clob getCBACRESPONSE() {
        return CBACRESPONSE;
    }
    public void setCBACRESPONSE(Clob val) {
        CBACRESPONSE = val; 
    }
}