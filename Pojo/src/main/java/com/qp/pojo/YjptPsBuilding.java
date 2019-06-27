package com.qp.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * yjpt_ps_building
 * @author 
 */
public class YjptPsBuilding implements Serializable {
    /**
     * 主键
     */
    private Integer buildingid;

    /**
     * 栋名称
     */
    private String buildingname;

    /**
     * 外键:楼盘ID
     */
    private Integer propertiesid;

    /**
     * 户型类型ID
     */
    private Integer housingid;

    /**
     * 栋总层数
     */
    private Integer level;

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

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public Integer getPropertiesid() {
        return propertiesid;
    }

    public void setPropertiesid(Integer propertiesid) {
        this.propertiesid = propertiesid;
    }

    public Integer getHousingid() {
        return housingid;
    }

    public void setHousingid(Integer housingid) {
        this.housingid = housingid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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
        YjptPsBuilding other = (YjptPsBuilding) that;
        return (this.getBuildingid() == null ? other.getBuildingid() == null : this.getBuildingid().equals(other.getBuildingid()))
            && (this.getBuildingname() == null ? other.getBuildingname() == null : this.getBuildingname().equals(other.getBuildingname()))
            && (this.getPropertiesid() == null ? other.getPropertiesid() == null : this.getPropertiesid().equals(other.getPropertiesid()))
            && (this.getHousingid() == null ? other.getHousingid() == null : this.getHousingid().equals(other.getHousingid()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
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
        result = prime * result + ((getBuildingid() == null) ? 0 : getBuildingid().hashCode());
        result = prime * result + ((getBuildingname() == null) ? 0 : getBuildingname().hashCode());
        result = prime * result + ((getPropertiesid() == null) ? 0 : getPropertiesid().hashCode());
        result = prime * result + ((getHousingid() == null) ? 0 : getHousingid().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
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
        sb.append(", buildingid=").append(buildingid);
        sb.append(", buildingname=").append(buildingname);
        sb.append(", propertiesid=").append(propertiesid);
        sb.append(", housingid=").append(housingid);
        sb.append(", level=").append(level);
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