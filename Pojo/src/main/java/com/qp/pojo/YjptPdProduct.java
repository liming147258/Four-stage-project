package com.qp.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * yjpt_pd_product
 * @author 
 */
public class YjptPdProduct implements Serializable {
    /**
     * 产品ID 主键
     */
    private Integer pdid;

    /**
     * 外键：合作商ID
     */
    private Integer mfid;

    /**
     * 外键:产品公司id
     */
    private Integer companyid;

    /**
     * 产品名称
     */
    private String pdname;

    /**
     * 品牌ID
     */
    private String brandid;

    /**
     * 是否免运费
     */
    private String isfreight;

    /**
     * 产品类型
     */
    private Integer tid;

    /**
     * 所属区域
     */
    private String roomregion;

    /**
     * 门开向
     */
    private String direction;

    /**
     * 是否有效(0=无效 1=有效)
     */
    private String isenable;

    /**
     * 审核状态 1未审核,0驳回,2审核通过
     */
    private String auditstate;

    /**
     * 3d文件名称
     */
    private String pro3dname;

    /**
     * 产品编号
     */
    private String productno;

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
     * 是否精选:0,否,1是
     */
    private String ischoice;

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

    public Integer getPdid() {
        return pdid;
    }

    public void setPdid(Integer pdid) {
        this.pdid = pdid;
    }

    public Integer getMfid() {
        return mfid;
    }

    public void setMfid(Integer mfid) {
        this.mfid = mfid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getPdname() {
        return pdname;
    }

    public void setPdname(String pdname) {
        this.pdname = pdname;
    }

    public String getBrandid() {
        return brandid;
    }

    public void setBrandid(String brandid) {
        this.brandid = brandid;
    }

    public String getIsfreight() {
        return isfreight;
    }

    public void setIsfreight(String isfreight) {
        this.isfreight = isfreight;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getRoomregion() {
        return roomregion;
    }

    public void setRoomregion(String roomregion) {
        this.roomregion = roomregion;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getIsenable() {
        return isenable;
    }

    public void setIsenable(String isenable) {
        this.isenable = isenable;
    }

    public String getAuditstate() {
        return auditstate;
    }

    public void setAuditstate(String auditstate) {
        this.auditstate = auditstate;
    }

    public String getPro3dname() {
        return pro3dname;
    }

    public void setPro3dname(String pro3dname) {
        this.pro3dname = pro3dname;
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno;
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

    public String getIschoice() {
        return ischoice;
    }

    public void setIschoice(String ischoice) {
        this.ischoice = ischoice;
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
        YjptPdProduct other = (YjptPdProduct) that;
        return (this.getPdid() == null ? other.getPdid() == null : this.getPdid().equals(other.getPdid()))
            && (this.getMfid() == null ? other.getMfid() == null : this.getMfid().equals(other.getMfid()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getPdname() == null ? other.getPdname() == null : this.getPdname().equals(other.getPdname()))
            && (this.getBrandid() == null ? other.getBrandid() == null : this.getBrandid().equals(other.getBrandid()))
            && (this.getIsfreight() == null ? other.getIsfreight() == null : this.getIsfreight().equals(other.getIsfreight()))
            && (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getRoomregion() == null ? other.getRoomregion() == null : this.getRoomregion().equals(other.getRoomregion()))
            && (this.getDirection() == null ? other.getDirection() == null : this.getDirection().equals(other.getDirection()))
            && (this.getIsenable() == null ? other.getIsenable() == null : this.getIsenable().equals(other.getIsenable()))
            && (this.getAuditstate() == null ? other.getAuditstate() == null : this.getAuditstate().equals(other.getAuditstate()))
            && (this.getPro3dname() == null ? other.getPro3dname() == null : this.getPro3dname().equals(other.getPro3dname()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getAudituser() == null ? other.getAudituser() == null : this.getAudituser().equals(other.getAudituser()))
            && (this.getAuditdate() == null ? other.getAuditdate() == null : this.getAuditdate().equals(other.getAuditdate()))
            && (this.getAuditmg() == null ? other.getAuditmg() == null : this.getAuditmg().equals(other.getAuditmg()))
            && (this.getIschoice() == null ? other.getIschoice() == null : this.getIschoice().equals(other.getIschoice()))
            && (this.getCreatetor() == null ? other.getCreatetor() == null : this.getCreatetor().equals(other.getCreatetor()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPdid() == null) ? 0 : getPdid().hashCode());
        result = prime * result + ((getMfid() == null) ? 0 : getMfid().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getPdname() == null) ? 0 : getPdname().hashCode());
        result = prime * result + ((getBrandid() == null) ? 0 : getBrandid().hashCode());
        result = prime * result + ((getIsfreight() == null) ? 0 : getIsfreight().hashCode());
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getRoomregion() == null) ? 0 : getRoomregion().hashCode());
        result = prime * result + ((getDirection() == null) ? 0 : getDirection().hashCode());
        result = prime * result + ((getIsenable() == null) ? 0 : getIsenable().hashCode());
        result = prime * result + ((getAuditstate() == null) ? 0 : getAuditstate().hashCode());
        result = prime * result + ((getPro3dname() == null) ? 0 : getPro3dname().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getAudituser() == null) ? 0 : getAudituser().hashCode());
        result = prime * result + ((getAuditdate() == null) ? 0 : getAuditdate().hashCode());
        result = prime * result + ((getAuditmg() == null) ? 0 : getAuditmg().hashCode());
        result = prime * result + ((getIschoice() == null) ? 0 : getIschoice().hashCode());
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
        sb.append(", pdid=").append(pdid);
        sb.append(", mfid=").append(mfid);
        sb.append(", companyid=").append(companyid);
        sb.append(", pdname=").append(pdname);
        sb.append(", brandid=").append(brandid);
        sb.append(", isfreight=").append(isfreight);
        sb.append(", tid=").append(tid);
        sb.append(", roomregion=").append(roomregion);
        sb.append(", direction=").append(direction);
        sb.append(", isenable=").append(isenable);
        sb.append(", auditstate=").append(auditstate);
        sb.append(", pro3dname=").append(pro3dname);
        sb.append(", productno=").append(productno);
        sb.append(", audituser=").append(audituser);
        sb.append(", auditdate=").append(auditdate);
        sb.append(", auditmg=").append(auditmg);
        sb.append(", ischoice=").append(ischoice);
        sb.append(", createtor=").append(createtor);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}