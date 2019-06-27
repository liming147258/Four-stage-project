package com.qp.pojo;

import java.io.Serializable;

/**
 * code
 * @author 
 */
public class Code implements Serializable {
    /**
     * 主键
     */
    private Integer codeid;

    /**
     * 代码数字
     */
    private String codenumber;

    /**
     * 代码名
     */
    private String codename;

    /**
     * 外键:代码类型ID
     */
    private Integer codetypeid;

    private static final long serialVersionUID = 1L;

    public Integer getCodeid() {
        return codeid;
    }

    public void setCodeid(Integer codeid) {
        this.codeid = codeid;
    }

    public String getCodenumber() {
        return codenumber;
    }

    public void setCodenumber(String codenumber) {
        this.codenumber = codenumber;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public Integer getCodetypeid() {
        return codetypeid;
    }

    public void setCodetypeid(Integer codetypeid) {
        this.codetypeid = codetypeid;
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
        Code other = (Code) that;
        return (this.getCodeid() == null ? other.getCodeid() == null : this.getCodeid().equals(other.getCodeid()))
            && (this.getCodenumber() == null ? other.getCodenumber() == null : this.getCodenumber().equals(other.getCodenumber()))
            && (this.getCodename() == null ? other.getCodename() == null : this.getCodename().equals(other.getCodename()))
            && (this.getCodetypeid() == null ? other.getCodetypeid() == null : this.getCodetypeid().equals(other.getCodetypeid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCodeid() == null) ? 0 : getCodeid().hashCode());
        result = prime * result + ((getCodenumber() == null) ? 0 : getCodenumber().hashCode());
        result = prime * result + ((getCodename() == null) ? 0 : getCodename().hashCode());
        result = prime * result + ((getCodetypeid() == null) ? 0 : getCodetypeid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", codeid=").append(codeid);
        sb.append(", codenumber=").append(codenumber);
        sb.append(", codename=").append(codename);
        sb.append(", codetypeid=").append(codetypeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}