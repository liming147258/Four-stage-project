package com.qp.pojo;

import java.io.Serializable;

/**
 * courier
 * @author 
 */
public class Courier implements Serializable {
    private Integer courierid;

    /**
     * 物流公司名
     */
    private String couriername;

    private static final long serialVersionUID = 1L;

    public Integer getCourierid() {
        return courierid;
    }

    public void setCourierid(Integer courierid) {
        this.courierid = courierid;
    }

    public String getCouriername() {
        return couriername;
    }

    public void setCouriername(String couriername) {
        this.couriername = couriername;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Courier other = (Courier) that;
        return (this.getCourierid() == null ? other.getCourierid() == null : this.getCourierid().equals(other.getCourierid()))
            && (this.getCouriername() == null ? other.getCouriername() == null : this.getCouriername().equals(other.getCouriername()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCourierid() == null) ? 0 : getCourierid().hashCode());
        result = prime * result + ((getCouriername() == null) ? 0 : getCouriername().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courierid=").append(courierid);
        sb.append(", couriername=").append(couriername);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}