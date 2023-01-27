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
@since   2022/11/21 13:39:21
*/
@Entity (name="ru.maritimebank_chekov.data.PXximtbSparkRisk")
@Table (name="MTB.Q_FX_SPARK_RISK")
public class PXximtbSparkRisk  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_39_21l;

    private Long ID_MTB_SPARK_RISK;
    private LocalDate DDATEINS;
    private String CINN;
    private Clob CRESPONSE;
    private String CUSER;
    private String XCOID;
    private String SPARKID;
    private String COGRN;
    private String CFIO;
    private String DBIRTHDAY;
    private String REQTYPE;

    public PXximtbSparkRisk(){}

    @Id 
    @Column(name="ID_MTB_SPARK_RISK",nullable = false,length = 0)
    public Long getID_MTB_SPARK_RISK() {
        return ID_MTB_SPARK_RISK;
    }
    public void setID_MTB_SPARK_RISK(Long val) {
        ID_MTB_SPARK_RISK = val; 
    }
    @Column(name="DDATEINS",nullable = false)
    public LocalDate getDDATEINS() {
        return DDATEINS;
    }
    public void setDDATEINS(LocalDate val) {
        DDATEINS = val; 
    }
    @Column(name="CINN",length = 20)
    public String getCINN() {
        return CINN;
    }
    public void setCINN(String val) {
        CINN = val; 
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
    @Column(name="XCOID",length = 32)
    public String getXCOID() {
        return XCOID;
    }
    public void setXCOID(String val) {
        XCOID = val; 
    }
    @Column(name="SPARKID",length = 32)
    public String getSPARKID() {
        return SPARKID;
    }
    public void setSPARKID(String val) {
        SPARKID = val; 
    }
    @Column(name="COGRN",length = 32)
    public String getCOGRN() {
        return COGRN;
    }
    public void setCOGRN(String val) {
        COGRN = val; 
    }
    @Column(name="CFIO",length = 150)
    public String getCFIO() {
        return CFIO;
    }
    public void setCFIO(String val) {
        CFIO = val; 
    }
    @Column(name="DBIRTHDAY",length = 10)
    public String getDBIRTHDAY() {
        return DBIRTHDAY;
    }
    public void setDBIRTHDAY(String val) {
        DBIRTHDAY = val; 
    }
    @Column(name="REQTYPE",nullable = false,length = 50)
    public String getREQTYPE() {
        return REQTYPE;
    }
    public void setREQTYPE(String val) {
        REQTYPE = val; 
    }
}