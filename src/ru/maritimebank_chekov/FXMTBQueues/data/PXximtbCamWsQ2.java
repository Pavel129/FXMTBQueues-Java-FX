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
@since   2022/11/21 13:40:46
*/
@Entity (name="ru.maritimebank_chekov.data.PXximtbCamWsQ2")
@Table (name="MTB.Q_FX_CAM_WS")
public class PXximtbCamWsQ2  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_40_46l;

    private Long ID_MTB_CAM_WS_Q2;
    private Long ID_MTB_EXT;
    private String ID_MTB_EXT_TYPE;
    private String CEXTREQID;
    private String CACC_PAN_TAIL4;
    private LocalDate DDATEINS;
    private LocalDate DDATEUPD;
    private String CURN;
    private Clob CREQUEST;
    private Clob CRESPONSE;
    private String CUSER;
    private Long NSTATUS;
    private String CERRMSG;

    public PXximtbCamWsQ2(){}

    @Id 
    @Column(name="ID_MTB_CAM_WS_Q2",nullable = false,length = 0)
    public Long getID_MTB_CAM_WS_Q2() {
        return ID_MTB_CAM_WS_Q2;
    }
    public void setID_MTB_CAM_WS_Q2(Long val) {
        ID_MTB_CAM_WS_Q2 = val; 
    }
    @Column(name="ID_MTB_EXT",nullable = false,length = 0)
    public Long getID_MTB_EXT() {
        return ID_MTB_EXT;
    }
    public void setID_MTB_EXT(Long val) {
        ID_MTB_EXT = val; 
    }
    @Column(name="ID_MTB_EXT_TYPE",nullable = false,length = 3)
    public String getID_MTB_EXT_TYPE() {
        return ID_MTB_EXT_TYPE;
    }
    public void setID_MTB_EXT_TYPE(String val) {
        ID_MTB_EXT_TYPE = val; 
    }
    @Column(name="CEXTREQID",length = 50)
    public String getCEXTREQID() {
        return CEXTREQID;
    }
    public void setCEXTREQID(String val) {
        CEXTREQID = val; 
    }
    @Column(name="CACC_PAN_TAIL4",length = 100)
    public String getCACC_PAN_TAIL4() {
        return CACC_PAN_TAIL4;
    }
    public void setCACC_PAN_TAIL4(String val) {
        CACC_PAN_TAIL4 = val; 
    }
    @Column(name="DDATEINS",nullable = false)
    public LocalDate getDDATEINS() {
        return DDATEINS;
    }
    public void setDDATEINS(LocalDate val) {
        DDATEINS = val; 
    }
    @Column(name="DDATEUPD",nullable = false)
    public LocalDate getDDATEUPD() {
        return DDATEUPD;
    }
    public void setDDATEUPD(LocalDate val) {
        DDATEUPD = val; 
    }
    @Column(name="CURN",nullable = false,length = 50)
    public String getCURN() {
        return CURN;
    }
    public void setCURN(String val) {
        CURN = val; 
    }
    @Column(name="CREQUEST",nullable = false)
    public Clob getCREQUEST() {
        return CREQUEST;
    }
    public void setCREQUEST(Clob val) {
        CREQUEST = val; 
    }
    @Column(name="CRESPONSE")
    public Clob getCRESPONSE() {
        return CRESPONSE;
    }
    public void setCRESPONSE(Clob val) {
        CRESPONSE = val; 
    }
    @Column(name="CUSER",nullable = false,length = 4000)
    public String getCUSER() {
        return CUSER;
    }
    public void setCUSER(String val) {
        CUSER = val; 
    }
    @Column(name="NSTATUS",nullable = false,length = 0)
    public Long getNSTATUS() {
        return NSTATUS;
    }
    public void setNSTATUS(Long val) {
        NSTATUS = val; 
    }
    @Column(name="CERRMSG",length = 4000)
    public String getCERRMSG() {
        return CERRMSG;
    }
    public void setCERRMSG(String val) {
        CERRMSG = val; 
    }
}