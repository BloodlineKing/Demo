package cn.bdqn.demo.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class Cashier {
    private String barCode;
    private String cashierName;
    private int count;
    private String unit;
    private BigDecimal univalent;
    private BigDecimal retailPrice;
    @JSONField(format = "yyyy-MM-dd")
    private Date creatTime;

    @Id
    @Column(name = "barCode")
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Basic
    @Column(name = "cashierName")
    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    @Basic
    @Column(name = "count")
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "univalent")
    public BigDecimal getUnivalent() {
        return univalent;
    }

    public void setUnivalent(BigDecimal univalent) {
        this.univalent = univalent;
    }

    @Basic
    @Column(name = "retailPrice")
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Basic
    @Column(name = "creatTime")
    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cashier cashier = (Cashier) o;

        if (count != cashier.count) return false;
        if (barCode != null ? !barCode.equals(cashier.barCode) : cashier.barCode != null) return false;
        if (cashierName != null ? !cashierName.equals(cashier.cashierName) : cashier.cashierName != null) return false;
        if (unit != null ? !unit.equals(cashier.unit) : cashier.unit != null) return false;
        if (univalent != null ? !univalent.equals(cashier.univalent) : cashier.univalent != null) return false;
        if (retailPrice != null ? !retailPrice.equals(cashier.retailPrice) : cashier.retailPrice != null) return false;
        if (creatTime != null ? !creatTime.equals(cashier.creatTime) : cashier.creatTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = barCode != null ? barCode.hashCode() : 0;
        result = 31 * result + (cashierName != null ? cashierName.hashCode() : 0);
        result = 31 * result + count;
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (univalent != null ? univalent.hashCode() : 0);
        result = 31 * result + (retailPrice != null ? retailPrice.hashCode() : 0);
        result = 31 * result + (creatTime != null ? creatTime.hashCode() : 0);
        return result;
    }
}
