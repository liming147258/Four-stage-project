package com.qp.pojo;

import java.io.Serializable;

/**
 * style
 * @author 
 */
public class Style implements Serializable {
    private Integer styleid;

    /**
     * 属性名
     */
    private String stylename;

    /**
     * 属性类型
     */
    private String styletype;

    /**
     * 属性状态
     */
    private String state;

    private static final long serialVersionUID = 1L;

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public String getStylename() {
        return stylename;
    }

    public void setStylename(String stylename) {
        this.stylename = stylename;
    }

    public String getStyletype() {
        return styletype;
    }

    public void setStyletype(String styletype) {
        this.styletype = styletype;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        Style other = (Style) that;
        return (this.getStyleid() == null ? other.getStyleid() == null : this.getStyleid().equals(other.getStyleid()))
            && (this.getStylename() == null ? other.getStylename() == null : this.getStylename().equals(other.getStylename()))
            && (this.getStyletype() == null ? other.getStyletype() == null : this.getStyletype().equals(other.getStyletype()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStyleid() == null) ? 0 : getStyleid().hashCode());
        result = prime * result + ((getStylename() == null) ? 0 : getStylename().hashCode());
        result = prime * result + ((getStyletype() == null) ? 0 : getStyletype().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", styleid=").append(styleid);
        sb.append(", stylename=").append(stylename);
        sb.append(", styletype=").append(styletype);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}