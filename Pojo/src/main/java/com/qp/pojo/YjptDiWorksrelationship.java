package com.qp.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * yjpt_di_worksrelationship
 * @author 
 */
public class YjptDiWorksrelationship implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 外键:设计作品ID
     */
    private String worksid;

    /**
     * 房号ID
     */
    private String userid;

    /**
     * 房号ID
     */
    private String roomsid;

    /**
     * 状态(1.用户已确认,0为否)
     */
    private String state;

    /**
     * 是否有效(0=无效 1=有效)
     */
    private String isenable;

    /**
     * 销售订单ID
     */
    private String salesorderid;

    /**
     * 是否为初始单据(1,是 0.否)
     */
    private String initstate;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorksid() {
        return worksid;
    }

    public void setWorksid(String worksid) {
        this.worksid = worksid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRoomsid() {
        return roomsid;
    }

    public void setRoomsid(String roomsid) {
        this.roomsid = roomsid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIsenable() {
        return isenable;
    }

    public void setIsenable(String isenable) {
        this.isenable = isenable;
    }

    public String getSalesorderid() {
        return salesorderid;
    }

    public void setSalesorderid(String salesorderid) {
        this.salesorderid = salesorderid;
    }

    public String getInitstate() {
        return initstate;
    }

    public void setInitstate(String initstate) {
        this.initstate = initstate;
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
        YjptDiWorksrelationship other = (YjptDiWorksrelationship) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorksid() == null ? other.getWorksid() == null : this.getWorksid().equals(other.getWorksid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getRoomsid() == null ? other.getRoomsid() == null : this.getRoomsid().equals(other.getRoomsid()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getIsenable() == null ? other.getIsenable() == null : this.getIsenable().equals(other.getIsenable()))
            && (this.getSalesorderid() == null ? other.getSalesorderid() == null : this.getSalesorderid().equals(other.getSalesorderid()))
            && (this.getInitstate() == null ? other.getInitstate() == null : this.getInitstate().equals(other.getInitstate()))
            && (this.getCreatetor() == null ? other.getCreatetor() == null : this.getCreatetor().equals(other.getCreatetor()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorksid() == null) ? 0 : getWorksid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getRoomsid() == null) ? 0 : getRoomsid().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getIsenable() == null) ? 0 : getIsenable().hashCode());
        result = prime * result + ((getSalesorderid() == null) ? 0 : getSalesorderid().hashCode());
        result = prime * result + ((getInitstate() == null) ? 0 : getInitstate().hashCode());
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
        sb.append(", id=").append(id);
        sb.append(", worksid=").append(worksid);
        sb.append(", userid=").append(userid);
        sb.append(", roomsid=").append(roomsid);
        sb.append(", state=").append(state);
        sb.append(", isenable=").append(isenable);
        sb.append(", salesorderid=").append(salesorderid);
        sb.append(", initstate=").append(initstate);
        sb.append(", createtor=").append(createtor);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}