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
@since   2022/11/21 13:47:19
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbcheckFl")
@Table (name="MTB.CHECK_FL")
public class PMtbcheckFl  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_13_47_19l;

    private Long ID;
    private Long IDCUS;
    private String CUSFIO;
    private Long ID_IDBANK;
    private String CHECK_EXTREM;
    private String CHECK_PASP;

    public PMtbcheckFl(){}

    @Id 
    @Column(name="ID",nullable = false,length = 0)
    public Long getID() {
        return ID;
    }
    public void setID(Long val) {
        ID = val; 
    }
    @Column(name="IDCUS",length = 0)
    public Long getIDCUS() {
        return IDCUS;
    }
    public void setIDCUS(Long val) {
        IDCUS = val; 
    }
    @Column(name="CUSFIO",length = 255)
    public String getCUSFIO() {
        return CUSFIO;
    }
    public void setCUSFIO(String val) {
        CUSFIO = val; 
    }
    @Column(name="ID_IDBANK",length = 0)
    public Long getID_IDBANK() {
        return ID_IDBANK;
    }
    public void setID_IDBANK(Long val) {
        ID_IDBANK = val; 
    }
    @Column(name="CHECK_EXTREM",length = 100)
    public String getCHECK_EXTREM() {
        return CHECK_EXTREM;
    }
    public void setCHECK_EXTREM(String val) {
        CHECK_EXTREM = val; 
    }
    @Column(name="CHECK_PASP",length = 100)
    public String getCHECK_PASP() {
        return CHECK_PASP;
    }
    public void setCHECK_PASP(String val) {
        CHECK_PASP = val; 
    }
}