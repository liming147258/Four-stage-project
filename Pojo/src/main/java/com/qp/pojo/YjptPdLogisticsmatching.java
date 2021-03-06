package com.qp.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * yjpt_pd_logisticsmatching
 * @author 
 */
public class YjptPdLogisticsmatching implements Serializable {
    /**
     * 主键
     */
    private Integer prid;

    /**
     * 外键:产品ID
     */
    private Integer pdid;

    /**
     * 外键:SKUID
     */
    private Integer skuid;

    /**
     * 外键:物流公司id
     */
    private Integer logid;

    /**
     * 是否有效(0=无效 1=有效)
     */
    private String isenable;

    /**
     * 创建人
     */
    private String createtor;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Date modifytime;

    private static final long serialVersionUID = 1L;

    public Integer getPrid() {
        return prid;
    }

    public void setPrid(Integer prid) {
        this.prid = prid;
    }

    public Integer getPdid() {
        return pdid;
    }

    public void setPdid(Integer pdid) {
        this.pdid = pdid;
    }

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getIsenable() {
        return isenable;
    }

    public void setIsenable(String isenable) {
        this.isenable = isenable;
    }

    public String getCreatetor() {
        return createtor;
    }

    public void setCreatetor(String createtor) {
        this.createtor = createtor;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
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
        YjptPdLogisticsmatching other = (YjptPdLogisticsmatching) that;
        return (this.getPrid() == null ? other.getPrid() == null : this.getPrid().equals(other.getPrid()))
            && (this.getPdid() == null ? other.getPdid() == null : this.getPdid().equals(other.getPdid()))
            && (this.getSkuid() == null ? other.getSkuid() == null : this.getSkuid().equals(other.getSkuid()))
            && (this.getLogid() == null ? other.getLogid() == null : this.getLogid().equals(other.getLogid()))
            && (this.getIsenable() == null ? other.getIsenable() == null : this.getIsenable().equals(other.getIsenable()))
            && (this.getCreatetor() == null ? other.getCreatetor() == null : this.getCreatetor().equals(other.getCreatetor()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrid() == null) ? 0 : getPrid().hashCode());
        result = prime * result + ((getPdid() == null) ? 0 : getPdid().hashCode());
        result = prime * result + ((getSkuid() == null) ? 0 : getSkuid().hashCode());
        result = prime * result + ((getLogid() == null) ? 0 : getLogid().hashCode());
        result = prime * result + ((getIsenable() == null) ? 0 : getIsenable().hashCode());
        result = prime * result + ((getCreatetor() == null) ? 0 : getCreatetor().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prid=").append(prid);
        sb.append(", pdid=").append(pdid);
        sb.append(", skuid=").append(skuid);
        sb.append(", logid=").append(logid);
        sb.append(", isenable=").append(isenable);
        sb.append(", createtor=").append(createtor);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}