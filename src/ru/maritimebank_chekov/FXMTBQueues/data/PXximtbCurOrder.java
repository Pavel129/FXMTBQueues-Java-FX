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
@since   2022/11/21 13:51:10
*/
@Entity (name="ru.maritimebank_chekov.data.PXximtbCurOrder")
@Table (name="MTB.Q_FX_CUR_ORDER")
public class PXximtbCurOrder  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_51_10l;

    private Long ID_MTB_CUR_ORDER;
    private Long ICUSNUM;
    private LocalDate DDOCDATE;
    private String CORDER_NUM;
    private Long ITRNNUM;
    private Long ITRNANUM;
    private String CBUYSELL;
    private Long NSUM_DT;
    private String CCUR_DT;
    private Long NSUM_KT;
    private String CCUR_KT;
    private Long NVALUE;
    private Long NQUANTITY;
    private Long NCOURSE_CUS;
    private Long NCOURSE_WM;
    private Long NCOURSE_WT;
    private Long NMARGIN_MIN;
    private Long NMARGIN_PLAN;
    private Long NMARGIN_ACTUAL;
    private LocalDate DSTATUS;
    private String CUSER;
    private Long NSTATUS;
    private String CERRMSG;
    private String CSECCODE;

    public PXximtbCurOrder(){}

    @Id 
    @Column(name="ID_MTB_CUR_ORDER",nullable = false,length = 0)
    public Long getID_MTB_CUR_ORDER() {
        return ID_MTB_CUR_ORDER;
    }
    public void setID_MTB_CUR_ORDER(Long val) {
        ID_MTB_CUR_ORDER = val; 
    }
    @Column(name="ICUSNUM",nullable = false,length = 0)
    public Long getICUSNUM() {
        return ICUSNUM;
    }
    public void setICUSNUM(Long val) {
        ICUSNUM = val; 
    }
    @Column(name="DDOCDATE",nullable = false)
    public LocalDate getDDOCDATE() {
        return DDOCDATE;
    }
    public void setDDOCDATE(LocalDate val) {
        DDOCDATE = val; 
    }
    @Column(name="CORDER_NUM",nullable = false,length = 100)
    public String getCORDER_NUM() {
        return CORDER_NUM;
    }
    public void setCORDER_NUM(String val) {
        CORDER_NUM = val; 
    }
    @Column(name="ITRNNUM",nullable = false,length = 0)
    public Long getITRNNUM() {
        return ITRNNUM;
    }
    public void setITRNNUM(Long val) {
        ITRNNUM = val; 
    }
    @Column(name="ITRNANUM",nullable = false,length = 0)
    public Long getITRNANUM() {
        return ITRNANUM;
    }
    public void setITRNANUM(Long val) {
        ITRNANUM = val; 
    }
    @Column(name="CBUYSELL",nullable = false,length = 1)
    public String getCBUYSELL() {
        return CBUYSELL;
    }
    public void setCBUYSELL(String val) {
        CBUYSELL = val; 
    }
    @Column(name="NSUM_DT",nullable = false,length = 0)
    public Long getNSUM_DT() {
        return NSUM_DT;
    }
    public void setNSUM_DT(Long val) {
        NSUM_DT = val; 
    }
    @Column(name="CCUR_DT",nullable = false,length = 3)
    public String getCCUR_DT() {
        return CCUR_DT;
    }
    public void setCCUR_DT(String val) {
        CCUR_DT = val; 
    }
    @Column(name="NSUM_KT",nullable = false,length = 0)
    public Long getNSUM_KT() {
        return NSUM_KT;
    }
    public void setNSUM_KT(Long val) {
        NSUM_KT = val; 
    }
    @Column(name="CCUR_KT",nullable = false,length = 3)
    public String getCCUR_KT() {
        return CCUR_KT;
    }
    public void setCCUR_KT(String val) {
        CCUR_KT = val; 
    }
    @Column(name="NVALUE",nullable = false,length = 0)
    public Long getNVALUE() {
        return NVALUE;
    }
    public void setNVALUE(Long val) {
        NVALUE = val; 
    }
    @Column(name="NQUANTITY",nullable = false,length = 0)
    public Long getNQUANTITY() {
        return NQUANTITY;
    }
    public void setNQUANTITY(Long val) {
        NQUANTITY = val; 
    }
    @Column(name="NCOURSE_CUS",nullable = false,length = 0)
    public Long getNCOURSE_CUS() {
        return NCOURSE_CUS;
    }
    public void setNCOURSE_CUS(Long val) {
        NCOURSE_CUS = val; 
    }
    @Column(name="NCOURSE_WM",length = 0)
    public Long getNCOURSE_WM() {
        return NCOURSE_WM;
    }
    public void setNCOURSE_WM(Long val) {
        NCOURSE_WM = val; 
    }
    @Column(name="NCOURSE_WT",length = 0)
    public Long getNCOURSE_WT() {
        return NCOURSE_WT;
    }
    public void setNCOURSE_WT(Long val) {
        NCOURSE_WT = val; 
    }
    @Column(name="NMARGIN_MIN",nullable = false,length = 0)
    public Long getNMARGIN_MIN() {
        return NMARGIN_MIN;
    }
    public void setNMARGIN_MIN(Long val) {
        NMARGIN_MIN = val; 
    }
    @Column(name="NMARGIN_PLAN",length = 0)
    public Long getNMARGIN_PLAN() {
        return NMARGIN_PLAN;
    }
    public void setNMARGIN_PLAN(Long val) {
        NMARGIN_PLAN = val; 
    }
    @Column(name="NMARGIN_ACTUAL",length = 0)
    public Long getNMARGIN_ACTUAL() {
        return NMARGIN_ACTUAL;
    }
    public void setNMARGIN_ACTUAL(Long val) {
        NMARGIN_ACTUAL = val; 
    }
    @Column(name="DSTATUS",nullable = false)
    public LocalDate getDSTATUS() {
        return DSTATUS;
    }
    public void setDSTATUS(LocalDate val) {
        DSTATUS = val; 
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
    @Column(name="CSECCODE",length = 30)
    public String getCSECCODE() {
        return CSECCODE;
    }
    public void setCSECCODE(String val) {
        CSECCODE = val; 
    }
}