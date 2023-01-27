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
@since   2022/11/21 14:19:02
*/
@Entity (name="ru.maritimebank_chekov.data.PMtbqFxProblem")
@Table (name="MTB.Q_FX_PROBLEM")
public class PMtbqFxProblem  implements Serializable
{
    private static final long serialVersionUID = 21_11_2022_14_19_02l;

    private Long P_ID;
    private Timestamp P_DATE;
    private String P_SOURCE;

    public PMtbqFxProblem(){}

    @Id 
    @Column(name="P_ID",length = 0)
    public Long getP_ID() {
        return P_ID;
    }
    public void setP_ID(Long val) {
        P_ID = val; 
    }
    @Column(name="P_DATE")
    public Timestamp getP_DATE() {
        return P_DATE;
    }
    public void setP_DATE(Timestamp val) {
        P_DATE = val; 
    }
    @Column(name="P_SOURCE",length = 13)
    public String getP_SOURCE() {
        return P_SOURCE;
    }
    public void setP_SOURCE(String val) {
        P_SOURCE = val; 
    }
}