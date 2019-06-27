package com.qp.pojo;

import java.io.Serializable;

/**
 * codetype
 * @author 
 */
public class Codetype implements Serializable {
    /**
     * 主键
     */
    private Integer codetypeid;

    /**
     * 代码类型名
     */
    private String codetypename;

    private static final long serialVersionUID = 1L;

    public Integer getCodetypeid() {
        return codetypeid;
    }

    public void setCodetypeid(Integer codetypeid) {
        this.codetypeid = codetypeid;
    }

    public String getCodetypename() {
        return codetypename;
    }

    public void setCodetypename(String codetypename) {
        this.codetypename = codetypename;
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
        Codetype other = (Codetype) that;
        return (this.getCodetypeid() == null ? other.getCodetypeid() == null : this.getCodetypeid().equals(other.getCodetypeid()))
            && (this.getCodetypename() == null ? other.getCodetypename() == null : this.getCodetypename().equals(other.getCodetypename()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCodetypeid() == null) ? 0 : getCodetypeid().hashCode());
        result = prime * result + ((getCodetypename() == null) ? 0 : getCodetypename().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", codetypeid=").append(codetypeid);
        sb.append(", codetypename=").append(codetypename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}