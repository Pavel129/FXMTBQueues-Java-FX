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
@since   2022/11/21 13:53:28
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbdboMicexTrnAff")
@Table (name="MTB.Q_FX_DBO_MICEX_TRN_AFF")
public class PMtbdboMicexTrnAff  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_53_28l;

    private Long INUM;
    private Long IANUM;
    private Timestamp TSTAMP;
    private String ISTATE;
    private String CMSG;

    public PMtbdboMicexTrnAff(){}

    @Id 
    @Column(name="INUM",length = 0)
    public Long getINUM() {
        return INUM;
    }
    public void setINUM(Long val) {
        INUM = val; 
    }
    @Column(name="IANUM",length = 0)
    public Long getIANUM() {
        return IANUM;
    }
    public void setIANUM(Long val) {
        IANUM = val; 
    }
    @Column(name="TSTAMP")
    public Timestamp getTSTAMP() {
        return TSTAMP;
    }
    public void setTSTAMP(Timestamp val) {
        TSTAMP = val; 
    }
    @Column(name="ISTATE",length = 1)
    public String getISTATE() {
        return ISTATE;
    }
    public void setISTATE(String val) {
        ISTATE = val; 
    }
    @Column(name="CMSG",length = 2000)
    public String getCMSG() {
        return CMSG;
    }
    public void setCMSG(String val) {
        CMSG = val; 
    }
}