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
@since   2022/11/21 13:48:46
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbmpDepEvent")
@Table (name="MTB.Q_FX_MP_DEP_EVENT")
public class PMtbmpDepEvent  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_48_46l;

    private Long IMDEID;
    private Long IMDRID;
    private String CMDEID;
    private String CMDETYPE;
    private String CMDENAME;
    private String CMDEBODY;
    private String IMDESTATUS;
    private Timestamp TMDESTAMP;
    private Timestamp TMDEMOD;
    private String CMDECOMMENT;
    private String CMDEUSER;
    private Long IMDEQEV;

    public PMtbmpDepEvent(){}

    @Id 
    @Column(name="IMDEID",nullable = false,length = 0)
    public Long getIMDEID() {
        return IMDEID;
    }
    public void setIMDEID(Long val) {
        IMDEID = val; 
    }
    @Column(name="IMDRID",nullable = false,length = 0)
    public Long getIMDRID() {
        return IMDRID;
    }
    public void setIMDRID(Long val) {
        IMDRID = val; 
    }
    @Column(name="CMDEID",nullable = false,length = 36)
    public String getCMDEID() {
        return CMDEID;
    }
    public void setCMDEID(String val) {
        CMDEID = val; 
    }
    @Column(name="CMDETYPE",nullable = false,length = 50)
    public String getCMDETYPE() {
        return CMDETYPE;
    }
    public void setCMDETYPE(String val) {
        CMDETYPE = val; 
    }
    @Column(name="CMDENAME",nullable = false,length = 255)
    public String getCMDENAME() {
        return CMDENAME;
    }
    public void setCMDENAME(String val) {
        CMDENAME = val; 
    }
    @Column(name="CMDEBODY",nullable = false,length = 4000)
    public String getCMDEBODY() {
        return CMDEBODY;
    }
    public void setCMDEBODY(String val) {
        CMDEBODY = val; 
    }
    @Column(name="IMDESTATUS",nullable = false,length = 1)
    public String getIMDESTATUS() {
        return IMDESTATUS;
    }
    public void setIMDESTATUS(String val) {
        IMDESTATUS = val; 
    }
    @Column(name="TMDESTAMP")
    public Timestamp getTMDESTAMP() {
        return TMDESTAMP;
    }
    public void setTMDESTAMP(Timestamp val) {
        TMDESTAMP = val; 
    }
    @Column(name="TMDEMOD")
    public Timestamp getTMDEMOD() {
        return TMDEMOD;
    }
    public void setTMDEMOD(Timestamp val) {
        TMDEMOD = val; 
    }
    @Column(name="CMDECOMMENT",length = 4000)
    public String getCMDECOMMENT() {
        return CMDECOMMENT;
    }
    public void setCMDECOMMENT(String val) {
        CMDECOMMENT = val; 
    }
    @Column(name="CMDEUSER",length = 30)
    public String getCMDEUSER() {
        return CMDEUSER;
    }
    public void setCMDEUSER(String val) {
        CMDEUSER = val; 
    }
    @Column(name="IMDEQEV",length = 0)
    public Long getIMDEQEV() {
        return IMDEQEV;
    }
    public void setIMDEQEV(Long val) {
        IMDEQEV = val; 
    }
}