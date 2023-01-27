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
@since   2022/11/21 13:46:57
*/
@Entity (name="ru.maritimebank_chekov.data.PXximtbQueuesIdbank")
@Table (name="MTB.Q_FX_QUEUES_IDBANK")
public class PXximtbQueuesIdbank  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_46_57l;

    private Long ID;
    private Long STATUS;
    private Clob BODYREQ;
    private Clob BODYRES;
    private LocalDate DATECREATE;
    private LocalDate DATEUPDATE;
    private String TYPE;
    private Long IDBCUSNUM;
    private String IDUSER;
    private Long JOB;

    public PXximtbQueuesIdbank(){}

    @Id 
    @Column(name="ID",nullable = false,length = 0)
    public Long getID() {
        return ID;
    }
    public void setID(Long val) {
        ID = val; 
    }
    @Column(name="STATUS",length = 0)
    public Long getSTATUS() {
        return STATUS;
    }
    public void setSTATUS(Long val) {
        STATUS = val; 
    }
    @Column(name="BODYREQ")
    public Clob getBODYREQ() {
        return BODYREQ;
    }
    public void setBODYREQ(Clob val) {
        BODYREQ = val; 
    }
    @Column(name="BODYRES")
    public Clob getBODYRES() {
        return BODYRES;
    }
    public void setBODYRES(Clob val) {
        BODYRES = val; 
    }
    @Column(name="DATECREATE")
    public LocalDate getDATECREATE() {
        return DATECREATE;
    }
    public void setDATECREATE(LocalDate val) {
        DATECREATE = val; 
    }
    @Column(name="DATEUPDATE")
    public LocalDate getDATEUPDATE() {
        return DATEUPDATE;
    }
    public void setDATEUPDATE(LocalDate val) {
        DATEUPDATE = val; 
    }
    @Column(name="TYPE",length = 200)
    public String getTYPE() {
        return TYPE;
    }
    public void setTYPE(String val) {
        TYPE = val; 
    }
    @Column(name="IDBCUSNUM",length = 12)
    public Long getIDBCUSNUM() {
        return IDBCUSNUM;
    }
    public void setIDBCUSNUM(Long val) {
        IDBCUSNUM = val; 
    }
    @Column(name="IDUSER",length = 30)
    public String getIDUSER() {
        return IDUSER;
    }
    public void setIDUSER(String val) {
        IDUSER = val; 
    }
    @Column(name="JOB",length = 0)
    public Long getJOB() {
        return JOB;
    }
    public void setJOB(Long val) {
        JOB = val; 
    }
}