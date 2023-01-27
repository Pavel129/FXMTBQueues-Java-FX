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
@since   2022/11/21 13:44:23
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbcardPayMsg")
@Table (name="MTB.Q_FX_CARD_PAY_MSG")
public class PMtbcardPayMsg  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_44_23l;

    private Long ICPMID;
    private Timestamp TCPMSTAMP;
    private String RCPMGUID;
    private String CCPMMSG;
    private String CCPMCHECK;

    public PMtbcardPayMsg(){}

    @Id 
    @Column(name="ICPMID",nullable = false,length = 0)
    public Long getICPMID() {
        return ICPMID;
    }
    public void setICPMID(Long val) {
        ICPMID = val; 
    }
    @Column(name="TCPMSTAMP")
    public Timestamp getTCPMSTAMP() {
        return TCPMSTAMP;
    }
    public void setTCPMSTAMP(Timestamp val) {
        TCPMSTAMP = val; 
    }
    @Column(name="RCPMGUID")
    public String getRCPMGUID() {
        return RCPMGUID;
    }
    public void setRCPMGUID(String val) {
        RCPMGUID = val; 
    }
    @Column(name="CCPMMSG",length = 4000)
    public String getCCPMMSG() {
        return CCPMMSG;
    }
    public void setCCPMMSG(String val) {
        CCPMMSG = val; 
    }
    @Column(name="CCPMCHECK",length = 16)
    public String getCCPMCHECK() {
        return CCPMCHECK;
    }
    public void setCCPMCHECK(String val) {
        CCPMCHECK = val; 
    }
}