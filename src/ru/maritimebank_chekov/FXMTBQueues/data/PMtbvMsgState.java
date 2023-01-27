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
@since   2022/11/21 13:47:45
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbvMsgState")
@Table (name="MTB.Q_FX_V_MSG_STATE")
public class PMtbvMsgState  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_47_45l;

    private Timestamp DMSGCREATE;
    private String CTYPE;
    private String SENDER;
    private String RECEIVER;
    private String SUBJECT;
    private String MSG_BODY;
    private Timestamp DMSGSSTAMP;
    private Long STATE_CODE;
    private String STATE_COMMENT;
    private Long IMSGID;
    private Long IMSGTYPE;
    private Long IMSGAID;
    private String ATTACH_NAMES;

    public PMtbvMsgState(){}

    @Id 
    @Column(name="DMSGCREATE",nullable = false)
    public Timestamp getDMSGCREATE() {
        return DMSGCREATE;
    }
    public void setDMSGCREATE(Timestamp val) {
        DMSGCREATE = val; 
    }
    @Column(name="CTYPE",length = 5)
    public String getCTYPE() {
        return CTYPE;
    }
    public void setCTYPE(String val) {
        CTYPE = val; 
    }
    @Column(name="SENDER",length = 2000)
    public String getSENDER() {
        return SENDER;
    }
    public void setSENDER(String val) {
        SENDER = val; 
    }
    @Column(name="RECEIVER",length = 2000)
    public String getRECEIVER() {
        return RECEIVER;
    }
    public void setRECEIVER(String val) {
        RECEIVER = val; 
    }
    @Column(name="SUBJECT",length = 2000)
    public String getSUBJECT() {
        return SUBJECT;
    }
    public void setSUBJECT(String val) {
        SUBJECT = val; 
    }
    @Column(name="MSG_BODY",length = 255)
    public String getMSG_BODY() {
        return MSG_BODY;
    }
    public void setMSG_BODY(String val) {
        MSG_BODY = val; 
    }
    @Column(name="DMSGSSTAMP")
    public Timestamp getDMSGSSTAMP() {
        return DMSGSSTAMP;
    }
    public void setDMSGSSTAMP(Timestamp val) {
        DMSGSSTAMP = val; 
    }
    @Column(name="STATE_CODE",length = 0)
    public Long getSTATE_CODE() {
        return STATE_CODE;
    }
    public void setSTATE_CODE(Long val) {
        STATE_CODE = val; 
    }
    @Column(name="STATE_COMMENT",length = 2000)
    public String getSTATE_COMMENT() {
        return STATE_COMMENT;
    }
    public void setSTATE_COMMENT(String val) {
        STATE_COMMENT = val; 
    }
    @Column(name="IMSGID",nullable = false,length = 0)
    public Long getIMSGID() {
        return IMSGID;
    }
    public void setIMSGID(Long val) {
        IMSGID = val; 
    }
    @Column(name="IMSGTYPE",nullable = false,length = 3)
    public Long getIMSGTYPE() {
        return IMSGTYPE;
    }
    public void setIMSGTYPE(Long val) {
        IMSGTYPE = val; 
    }
    @Column(name="IMSGAID",length = 0)
    public Long getIMSGAID() {
        return IMSGAID;
    }
    public void setIMSGAID(Long val) {
        IMSGAID = val; 
    }
    @Column(name="ATTACH_NAMES",length = 4000)
    public String getATTACH_NAMES() {
        return ATTACH_NAMES;
    }
    public void setATTACH_NAMES(String val) {
        ATTACH_NAMES = val; 
    }
}