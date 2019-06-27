package com.qp.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * yjpt_ps_rooms
 * @author 
 */
public class YjptPsRooms implements Serializable {
    /**
     * 主键
     */
    private Integer roomsid;

    /**
     * 房间名称
     */
    private String roomsname;

    /**
     * 外键:楼盘ID
     */
    private Integer propertiesid;

    /**
     * 外键:栋ID
     */
    private Integer buildingid;

    /**
     * 户型类型ID 
     */
    private String housingid;

    /**
     * 所在层数
     */
    private Integer level;

    /**
     * 建筑面积
     */
    private Long constructionarea;

    /**
     * 实用面积
     */
    private Long practicalarea;

    /**
     * 朝向
     */
    private String orientation;

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

    public Integer getRoomsid() {
        return roomsid;
    }

    public void setRoomsid(Integer roomsid) {
        this.roomsid = roomsid;
    }

    public String getRoomsname() {
        return roomsname;
    }

    public void setRoomsname(String roomsname) {
        this.roomsname = roomsname;
    }

    public Integer getPropertiesid() {
        return propertiesid;
    }

    public void setPropertiesid(Integer propertiesid) {
        this.propertiesid = propertiesid;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public String getHousingid() {
        return housingid;
    }

    public void setHousingid(String housingid) {
        this.housingid = housingid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getConstructionarea() {
        return constructionarea;
    }

    public void setConstructionarea(Long constructionarea) {
        this.constructionarea = constructionarea;
    }

    public Long getPracticalarea() {
        return practicalarea;
    }

    public void setPracticalarea(Long practicalarea) {
        this.practicalarea = practicalarea;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
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
        YjptPsRooms other = (YjptPsRooms) that;
        return (this.getRoomsid() == null ? other.getRoomsid() == null : this.getRoomsid().equals(other.getRoomsid()))
            && (this.getRoomsname() == null ? other.getRoomsname() == null : this.getRoomsname().equals(other.getRoomsname()))
            && (this.getPropertiesid() == null ? other.getPropertiesid() == null : this.getPropertiesid().equals(other.getPropertiesid()))
            && (this.getBuildingid() == null ? other.getBuildingid() == null : this.getBuildingid().equals(other.getBuildingid()))
            && (this.getHousingid() == null ? other.getHousingid() == null : this.getHousingid().equals(other.getHousingid()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getConstructionarea() == null ? other.getConstructionarea() == null : this.getConstructionarea().equals(other.getConstructionarea()))
            && (this.getPracticalarea() == null ? other.getPracticalarea() == null : this.getPracticalarea().equals(other.getPracticalarea()))
            && (this.getOrientation() == null ? other.getOrientation() == null : this.getOrientation().equals(other.getOrientation()))
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
        result = prime * result + ((getRoomsid() == null) ? 0 : getRoomsid().hashCode());
        result = prime * result + ((getRoomsname() == null) ? 0 : getRoomsname().hashCode());
        result = prime * result + ((getPropertiesid() == null) ? 0 : getPropertiesid().hashCode());
        result = prime * result + ((getBuildingid() == null) ? 0 : getBuildingid().hashCode());
        result = prime * result + ((getHousingid() == null) ? 0 : getHousingid().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getConstructionarea() == null) ? 0 : getConstructionarea().hashCode());
        result = prime * result + ((getPracticalarea() == null) ? 0 : getPracticalarea().hashCode());
        result = prime * result + ((getOrientation() == null) ? 0 : getOrientation().hashCode());
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
        sb.append(", roomsid=").append(roomsid);
        sb.append(", roomsname=").append(roomsname);
        sb.append(", propertiesid=").append(propertiesid);
        sb.append(", buildingid=").append(buildingid);
        sb.append(", housingid=").append(housingid);
        sb.append(", level=").append(level);
        sb.append(", constructionarea=").append(constructionarea);
        sb.append(", practicalarea=").append(practicalarea);
        sb.append(", orientation=").append(orientation);
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