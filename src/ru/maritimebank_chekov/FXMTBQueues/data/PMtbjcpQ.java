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
@since   2022/11/21 13:52:36
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbjcpQ")
@Table (name="MTB.Q_FX_JCP_Q")
public class PMtbjcpQ  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_52_36l;

    private Long IJCPID;
    private Timestamp TJCPSTAMP;
    private String CJCPSTATUS;
    private String CJCPMETHOD;
    private String CJCPKEYID;
    private Blob ZJCPTEXT;
    private Blob ZJCPCTEXT;
    private Long IJCPEXT;
    private String CJCPMSG;

    public PMtbjcpQ(){}

    @Id 
    @Column(name="IJCPID",nullable = false,length = 0)
    public Long getIJCPID() {
        return IJCPID;
    }
    public void setIJCPID(Long val) {
        IJCPID = val; 
    }
    @Column(name="TJCPSTAMP")
    public Timestamp getTJCPSTAMP() {
        return TJCPSTAMP;
    }
    public void setTJCPSTAMP(Timestamp val) {
        TJCPSTAMP = val; 
    }
    @Column(name="CJCPSTATUS",length = 1)
    public String getCJCPSTATUS() {
        return CJCPSTATUS;
    }
    public void setCJCPSTATUS(String val) {
        CJCPSTATUS = val; 
    }
    @Column(name="CJCPMETHOD",length = 255)
    public String getCJCPMETHOD() {
        return CJCPMETHOD;
    }
    public void setCJCPMETHOD(String val) {
        CJCPMETHOD = val; 
    }
    @Column(name="CJCPKEYID",length = 255)
    public String getCJCPKEYID() {
        return CJCPKEYID;
    }
    public void setCJCPKEYID(String val) {
        CJCPKEYID = val; 
    }
    @Column(name="ZJCPTEXT")
    public Blob getZJCPTEXT() {
        return ZJCPTEXT;
    }
    public void setZJCPTEXT(Blob val) {
        ZJCPTEXT = val; 
    }
    @Column(name="ZJCPCTEXT")
    public Blob getZJCPCTEXT() {
        return ZJCPCTEXT;
    }
    public void setZJCPCTEXT(Blob val) {
        ZJCPCTEXT = val; 
    }
    @Column(name="IJCPEXT",length = 0)
    public Long getIJCPEXT() {
        return IJCPEXT;
    }
    public void setIJCPEXT(Long val) {
        IJCPEXT = val; 
    }
    @Column(name="CJCPMSG",length = 2000)
    public String getCJCPMSG() {
        return CJCPMSG;
    }
    public void setCJCPMSG(String val) {
        CJCPMSG = val; 
    }
}