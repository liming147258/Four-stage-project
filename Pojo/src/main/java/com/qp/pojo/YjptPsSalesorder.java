package com.qp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * yjpt_ps_salesorder
 * @author 
 */
public class YjptPsSalesorder implements Serializable {
    /**
     * 主键
     */
    private Integer soid;

    /**
     * 销售订单编号(YYYY+MM+DD+HH+MI+SS+SSS)
     */
    private String sorderno;

    /**
     * 外键:区域公司ID(值取PARTNERID)
     */
    private Integer regionid;

    /**
     * 外键:装修公司ID(值取PARTNERID)
     */
    private Integer renovationid;

    /**
     * 外键:设计公司ID(值取PARTNERID)
     */
    private Integer designid;

    /**
     * 外建:售楼公司ID(值取PARTNERID)
     */
    private Integer afterid;

    private String salescompanyid;

    /**
     * 外键:销售人员ID
     */
    private Integer saleid;

    /**
     * 外键:业主ID
     */
    private Integer ownerid;

    /**
     * 外键:设计作品ID
     */
    private Integer workid;

    /**
     * 外键:楼盘ID
     */
    private Integer propertiesid;

    /**
     * 外键:房间ID
     */
    private Integer buildingid;

    /**
     * 定金
     */
    private BigDecimal depositamount;

    /**
     * 0,款项未支付完成,1款项已完结
     */
    private String paystate;

    /**
     * 支付时间
     */
    private Date paytime;

    /**
     * 审核状态 1未审核,0驳回,2审核通过
     */
    private String auditstate;

    /**
     * 审核人
     */
    private String audituser;

    /**
     * 审核时间
     */
    private Date auditdate;

    /**
     * 审核意见
     */
    private String auditmg;

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

    /**
     * 外键:房间ID
     */
    private Integer roomsid;

    private static final long serialVersionUID = 1L;

    public Integer getSoid() {
        return soid;
    }

    public void setSoid(Integer soid) {
        this.soid = soid;
    }

    public String getSorderno() {
        return sorderno;
    }

    public void setSorderno(String sorderno) {
        this.sorderno = sorderno;
    }

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public Integer getRenovationid() {
        return renovationid;
    }

    public void setRenovationid(Integer renovationid) {
        this.renovationid = renovationid;
    }

    public Integer getDesignid() {
        return designid;
    }

    public void setDesignid(Integer designid) {
        this.designid = designid;
    }

    public Integer getAfterid() {
        return afterid;
    }

    public void setAfterid(Integer afterid) {
        this.afterid = afterid;
    }

    public String getSalescompanyid() {
        return salescompanyid;
    }

    public void setSalescompanyid(String salescompanyid) {
        this.salescompanyid = salescompanyid;
    }

    public Integer getSaleid() {
        return saleid;
    }

    public void setSaleid(Integer saleid) {
        this.saleid = saleid;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
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

    public BigDecimal getDepositamount() {
        return depositamount;
    }

    public void setDepositamount(BigDecimal depositamount) {
        this.depositamount = depositamount;
    }

    public String getPaystate() {
        return paystate;
    }

    public void setPaystate(String paystate) {
        this.paystate = paystate;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getAuditstate() {
        return auditstate;
    }

    public void setAuditstate(String auditstate) {
        this.auditstate = auditstate;
    }

    public String getAudituser() {
        return audituser;
    }

    public void setAudituser(String audituser) {
        this.audituser = audituser;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public String getAuditmg() {
        return auditmg;
    }

    public void setAuditmg(String auditmg) {
        this.auditmg = auditmg;
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

    public Integer getRoomsid() {
        return roomsid;
    }

    public void setRoomsid(Integer roomsid) {
        this.roomsid = roomsid;
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
        YjptPsSalesorder other = (YjptPsSalesorder) that;
        return (this.getSoid() == null ? other.getSoid() == null : this.getSoid().equals(other.getSoid()))
            && (this.getSorderno() == null ? other.getSorderno() == null : this.getSorderno().equals(other.getSorderno()))
            && (this.getRegionid() == null ? other.getRegionid() == null : this.getRegionid().equals(other.getRegionid()))
            && (this.getRenovationid() == null ? other.getRenovationid() == null : this.getRenovationid().equals(other.getRenovationid()))
            && (this.getDesignid() == null ? other.getDesignid() == null : this.getDesignid().equals(other.getDesignid()))
            && (this.getAfterid() == null ? other.getAfterid() == null : this.getAfterid().equals(other.getAfterid()))
            && (this.getSalescompanyid() == null ? other.getSalescompanyid() == null : this.getSalescompanyid().equals(other.getSalescompanyid()))
            && (this.getSaleid() == null ? other.getSaleid() == null : this.getSaleid().equals(other.getSaleid()))
            && (this.getOwnerid() == null ? other.getOwnerid() == null : this.getOwnerid().equals(other.getOwnerid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getPropertiesid() == null ? other.getPropertiesid() == null : this.getPropertiesid().equals(other.getPropertiesid()))
            && (this.getBuildingid() == null ? other.getBuildingid() == null : this.getBuildingid().equals(other.getBuildingid()))
            && (this.getDepositamount() == null ? other.getDepositamount() == null : this.getDepositamount().equals(other.getDepositamount()))
            && (this.getPaystate() == null ? other.getPaystate() == null : this.getPaystate().equals(other.getPaystate()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()))
            && (this.getAuditstate() == null ? other.getAuditstate() == null : this.getAuditstate().equals(other.getAuditstate()))
            && (this.getAudituser() == null ? other.getAudituser() == null : this.getAudituser().equals(other.getAudituser()))
            && (this.getAuditdate() == null ? other.getAuditdate() == null : this.getAuditdate().equals(other.getAuditdate()))
            && (this.getAuditmg() == null ? other.getAuditmg() == null : this.getAuditmg().equals(other.getAuditmg()))
            && (this.getIsenable() == null ? other.getIsenable() == null : this.getIsenable().equals(other.getIsenable()))
            && (this.getCreatetor() == null ? other.getCreatetor() == null : this.getCreatetor().equals(other.getCreatetor()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()))
            && (this.getRoomsid() == null ? other.getRoomsid() == null : this.getRoomsid().equals(other.getRoomsid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSoid() == null) ? 0 : getSoid().hashCode());
        result = prime * result + ((getSorderno() == null) ? 0 : getSorderno().hashCode());
        result = prime * result + ((getRegionid() == null) ? 0 : getRegionid().hashCode());
        result = prime * result + ((getRenovationid() == null) ? 0 : getRenovationid().hashCode());
        result = prime * result + ((getDesignid() == null) ? 0 : getDesignid().hashCode());
        result = prime * result + ((getAfterid() == null) ? 0 : getAfterid().hashCode());
        result = prime * result + ((getSalescompanyid() == null) ? 0 : getSalescompanyid().hashCode());
        result = prime * result + ((getSaleid() == null) ? 0 : getSaleid().hashCode());
        result = prime * result + ((getOwnerid() == null) ? 0 : getOwnerid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getPropertiesid() == null) ? 0 : getPropertiesid().hashCode());
        result = prime * result + ((getBuildingid() == null) ? 0 : getBuildingid().hashCode());
        result = prime * result + ((getDepositamount() == null) ? 0 : getDepositamount().hashCode());
        result = prime * result + ((getPaystate() == null) ? 0 : getPaystate().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        result = prime * result + ((getAuditstate() == null) ? 0 : getAuditstate().hashCode());
        result = prime * result + ((getAudituser() == null) ? 0 : getAudituser().hashCode());
        result = prime * result + ((getAuditdate() == null) ? 0 : getAuditdate().hashCode());
        result = prime * result + ((getAuditmg() == null) ? 0 : getAuditmg().hashCode());
        result = prime * result + ((getIsenable() == null) ? 0 : getIsenable().hashCode());
        result = prime * result + ((getCreatetor() == null) ? 0 : getCreatetor().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        result = prime * result + ((getRoomsid() == null) ? 0 : getRoomsid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", soid=").append(soid);
        sb.append(", sorderno=").append(sorderno);
        sb.append(", regionid=").append(regionid);
        sb.append(", renovationid=").append(renovationid);
        sb.append(", designid=").append(designid);
        sb.append(", afterid=").append(afterid);
        sb.append(", salescompanyid=").append(salescompanyid);
        sb.append(", saleid=").append(saleid);
        sb.append(", ownerid=").append(ownerid);
        sb.append(", workid=").append(workid);
        sb.append(", propertiesid=").append(propertiesid);
        sb.append(", buildingid=").append(buildingid);
        sb.append(", depositamount=").append(depositamount);
        sb.append(", paystate=").append(paystate);
        sb.append(", paytime=").append(paytime);
        sb.append(", auditstate=").append(auditstate);
        sb.append(", audituser=").append(audituser);
        sb.append(", auditdate=").append(auditdate);
        sb.append(", auditmg=").append(auditmg);
        sb.append(", isenable=").append(isenable);
        sb.append(", createtor=").append(createtor);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", roomsid=").append(roomsid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}