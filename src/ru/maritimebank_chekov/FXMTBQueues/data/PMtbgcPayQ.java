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
@since   2022/11/21 13:41:48
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbgcPayQ")
@Table (name="MTB.Q_FX_PAY_Q")
public class PMtbgcPayQ  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_41_48l;

    private Long IGCPID;
    private Timestamp TGCPSTAMP;
    private Timestamp TGCPMOD;
    private String CGCPSTATUS;
    private String CGCPFUNC;
    private Clob ZGCPREQ;
    private Clob ZGCPRES;
    private String CGCPGUID;

    public PMtbgcPayQ(){}

    @Id 
    @Column(name="IGCPID",nullable = false,length = 0)
    public Long getIGCPID() {
        return IGCPID;
    }
    public void setIGCPID(Long val) {
        IGCPID = val; 
    }
    @Column(name="TGCPSTAMP")
    public Timestamp getTGCPSTAMP() {
        return TGCPSTAMP;
    }
    public void setTGCPSTAMP(Timestamp val) {
        TGCPSTAMP = val; 
    }
    @Column(name="TGCPMOD")
    public Timestamp getTGCPMOD() {
        return TGCPMOD;
    }
    public void setTGCPMOD(Timestamp val) {
        TGCPMOD = val; 
    }
    @Column(name="CGCPSTATUS",length = 1)
    public String getCGCPSTATUS() {
        return CGCPSTATUS;
    }
    public void setCGCPSTATUS(String val) {
        CGCPSTATUS = val; 
    }
    @Column(name="CGCPFUNC",length = 64)
    public String getCGCPFUNC() {
        return CGCPFUNC;
    }
    public void setCGCPFUNC(String val) {
        CGCPFUNC = val; 
    }
    @Column(name="ZGCPREQ")
    public Clob getZGCPREQ() {
        return ZGCPREQ;
    }
    public void setZGCPREQ(Clob val) {
        ZGCPREQ = val; 
    }
    @Column(name="ZGCPRES")
    public Clob getZGCPRES() {
        return ZGCPRES;
    }
    public void setZGCPRES(Clob val) {
        ZGCPRES = val; 
    }
    @Column(name="CGCPGUID",length = 36)
    public String getCGCPGUID() {
        return CGCPGUID;
    }
    public void setCGCPGUID(String val) {
        CGCPGUID = val; 
    }
}