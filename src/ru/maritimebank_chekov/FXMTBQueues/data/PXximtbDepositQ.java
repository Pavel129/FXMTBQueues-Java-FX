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
@since   2022/11/21 13:46:32
*/
@Entity (name="ru.maritimebank_chekov.data.PXximtbDepositQ")
@Table (name="MTB.Q_FX_DEPOSIT_Q")
public class PXximtbDepositQ  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_46_32l;

    private Long ID_MTB_DEPOSIT_Q;
    private Long ID_MTB_CAM_WS_Q;
    private Long ICUSNUM;
    private Long IDFAKTURA;
    private Long IQDGIDENT;
    private String CACCD;
    private Long NAMOUNT;
    private LocalDate DDATEINS;
    private LocalDate DDATEUPD;
    private Long NTYPE;
    private String CUSER;
    private Long NSTATUS;
    private String CERRMSG;

    public PXximtbDepositQ(){}

    @Id 
    @Column(name="ID_MTB_DEPOSIT_Q",nullable = false,length = 0)
    public Long getID_MTB_DEPOSIT_Q() {
        return ID_MTB_DEPOSIT_Q;
    }
    public void setID_MTB_DEPOSIT_Q(Long val) {
        ID_MTB_DEPOSIT_Q = val; 
    }
    @Column(name="ID_MTB_CAM_WS_Q",length = 0)
    public Long getID_MTB_CAM_WS_Q() {
        return ID_MTB_CAM_WS_Q;
    }
    public void setID_MTB_CAM_WS_Q(Long val) {
        ID_MTB_CAM_WS_Q = val; 
    }
    @Column(name="ICUSNUM",nullable = false,length = 0)
    public Long getICUSNUM() {
        return ICUSNUM;
    }
    public void setICUSNUM(Long val) {
        ICUSNUM = val; 
    }
    @Column(name="IDFAKTURA",nullable = false,length = 0)
    public Long getIDFAKTURA() {
        return IDFAKTURA;
    }
    public void setIDFAKTURA(Long val) {
        IDFAKTURA = val; 
    }
    @Column(name="IQDGIDENT",length = 0)
    public Long getIQDGIDENT() {
        return IQDGIDENT;
    }
    public void setIQDGIDENT(Long val) {
        IQDGIDENT = val; 
    }
    @Column(name="CACCD",length = 25)
    public String getCACCD() {
        return CACCD;
    }
    public void setCACCD(String val) {
        CACCD = val; 
    }
    @Column(name="NAMOUNT",nullable = false,length = 0)
    public Long getNAMOUNT() {
        return NAMOUNT;
    }
    public void setNAMOUNT(Long val) {
        NAMOUNT = val; 
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
    @Column(name="NTYPE",nullable = false,length = 0)
    public Long getNTYPE() {
        return NTYPE;
    }
    public void setNTYPE(Long val) {
        NTYPE = val; 
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