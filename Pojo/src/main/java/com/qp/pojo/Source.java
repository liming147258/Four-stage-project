package com.qp.pojo;

import java.io.Serializable;

/**
 * source
 * @author 
 */
public class Source implements Serializable {
    /**
     * 主键
     */
    private Integer sourceid;

    /**
     * laiyuan名称
     */
    private String sourcename;

    private static final long serialVersionUID = 1L;

    public Integer getSourceid() {
        return sourceid;
    }

    public void setSourceid(Integer sourceid) {
        this.sourceid = sourceid;
    }

    public String getSourcename() {
        return sourcename;
    }

    public void setSourcename(String sourcename) {
        this.sourcename = sourcename;
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
        Source other = (Source) that;
        return (this.getSourceid() == null ? other.getSourceid() == null : this.getSourceid().equals(other.getSourceid()))
            && (this.getSourcename() == null ? other.getSourcename() == null : this.getSourcename().equals(other.getSourcename()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSourceid() == null) ? 0 : getSourceid().hashCode());
        result = prime * result + ((getSourcename() == null) ? 0 : getSourcename().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sourceid=").append(sourceid);
        sb.append(", sourcename=").append(sourcename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}