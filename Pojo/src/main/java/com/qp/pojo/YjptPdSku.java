package com.qp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * yjpt_pd_sku
 * @author 
 */
public class YjptPdSku implements Serializable {
    /**
     * sku id 主键
     */
    private Integer sukid;

    /**
     * 外键:组合特征值ID
     */
    private String pvids;

    /**
     * 外键:产品ID
     */
    private Integer pdid;

    /**
     * 全国统一指导价
     */
    private BigDecimal amount;

    /**
     * 数量
     */
    private Integer num;

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
     * 商品重量
     */
    private BigDecimal weight;

    /**
     * 商品体积
     */
    private BigDecimal volume;

    /**
     * 包装后商品体积
     */
    private BigDecimal packvolume;

    /**
     * 经销出厂价
     */
    private BigDecimal disamount;

    /**
     * 长
     */
    private BigDecimal longs;

    /**
     * 宽
     */
    private BigDecimal wide;

    /**
     * 高
     */
    private BigDecimal height;

    /**
     * 包装后件数
     */
    private Integer packnum;

    /**
     * 工程价
     */
    private BigDecimal projectamout;

    /**
     * 最低销售价
     */
    private BigDecimal msamount;

    /**
     * 包装后重量
     */
    private BigDecimal packweight;

    /**
     * 外键:风格ID
     */
    private Integer styleid;

    /**
     * 型号
     */
    private String model;

    /**
     * 产品描述
     */
    private String productmeg;

    /**
     * 产品简短描述
     */
    private String productjmeg;

    /**
     * 备注
     */
    private String remark;

    /**
     * 产品样式名
     */
    private String pdstylename;

    /**
     * 上市时间
     */
    private Date listdate;

    /**
     * 开始记录时间
     */
    private Date begindate;

    /**
     * 结束时间
     */
    private Date enddate;

    private static final long serialVersionUID = 1L;

    public Integer getSukid() {
        return sukid;
    }

    public void setSukid(Integer sukid) {
        this.sukid = sukid;
    }

    public String getPvids() {
        return pvids;
    }

    public void setPvids(String pvids) {
        this.pvids = pvids;
    }

    public Integer getPdid() {
        return pdid;
    }

    public void setPdid(Integer pdid) {
        this.pdid = pdid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getPackvolume() {
        return packvolume;
    }

    public void setPackvolume(BigDecimal packvolume) {
        this.packvolume = packvolume;
    }

    public BigDecimal getDisamount() {
        return disamount;
    }

    public void setDisamount(BigDecimal disamount) {
        this.disamount = disamount;
    }

    public BigDecimal getLongs() {
        return longs;
    }

    public void setLongs(BigDecimal longs) {
        this.longs = longs;
    }

    public BigDecimal getWide() {
        return wide;
    }

    public void setWide(BigDecimal wide) {
        this.wide = wide;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public Integer getPacknum() {
        return packnum;
    }

    public void setPacknum(Integer packnum) {
        this.packnum = packnum;
    }

    public BigDecimal getProjectamout() {
        return projectamout;
    }

    public void setProjectamout(BigDecimal projectamout) {
        this.projectamout = projectamout;
    }

    public BigDecimal getMsamount() {
        return msamount;
    }

    public void setMsamount(BigDecimal msamount) {
        this.msamount = msamount;
    }

    public BigDecimal getPackweight() {
        return packweight;
    }

    public void setPackweight(BigDecimal packweight) {
        this.packweight = packweight;
    }

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductmeg() {
        return productmeg;
    }

    public void setProductmeg(String productmeg) {
        this.productmeg = productmeg;
    }

    public String getProductjmeg() {
        return productjmeg;
    }

    public void setProductjmeg(String productjmeg) {
        this.productjmeg = productjmeg;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPdstylename() {
        return pdstylename;
    }

    public void setPdstylename(String pdstylename) {
        this.pdstylename = pdstylename;
    }

    public Date getListdate() {
        return listdate;
    }

    public void setListdate(Date listdate) {
        this.listdate = listdate;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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
        YjptPdSku other = (YjptPdSku) that;
        return (this.getSukid() == null ? other.getSukid() == null : this.getSukid().equals(other.getSukid()))
            && (this.getPvids() == null ? other.getPvids() == null : this.getPvids().equals(other.getPvids()))
            && (this.getPdid() == null ? other.getPdid() == null : this.getPdid().equals(other.getPdid()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getIsenable() == null ? other.getIsenable() == null : this.getIsenable().equals(other.getIsenable()))
            && (this.getCreatetor() == null ? other.getCreatetor() == null : this.getCreatetor().equals(other.getCreatetor()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getPackvolume() == null ? other.getPackvolume() == null : this.getPackvolume().equals(other.getPackvolume()))
            && (this.getDisamount() == null ? other.getDisamount() == null : this.getDisamount().equals(other.getDisamount()))
            && (this.getLongs() == null ? other.getLongs() == null : this.getLongs().equals(other.getLongs()))
            && (this.getWide() == null ? other.getWide() == null : this.getWide().equals(other.getWide()))
            && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
            && (this.getPacknum() == null ? other.getPacknum() == null : this.getPacknum().equals(other.getPacknum()))
            && (this.getProjectamout() == null ? other.getProjectamout() == null : this.getProjectamout().equals(other.getProjectamout()))
            && (this.getMsamount() == null ? other.getMsamount() == null : this.getMsamount().equals(other.getMsamount()))
            && (this.getPackweight() == null ? other.getPackweight() == null : this.getPackweight().equals(other.getPackweight()))
            && (this.getStyleid() == null ? other.getStyleid() == null : this.getStyleid().equals(other.getStyleid()))
            && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
            && (this.getProductmeg() == null ? other.getProductmeg() == null : this.getProductmeg().equals(other.getProductmeg()))
            && (this.getProductjmeg() == null ? other.getProductjmeg() == null : this.getProductjmeg().equals(other.getProductjmeg()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPdstylename() == null ? other.getPdstylename() == null : this.getPdstylename().equals(other.getPdstylename()))
            && (this.getListdate() == null ? other.getListdate() == null : this.getListdate().equals(other.getListdate()))
            && (this.getBegindate() == null ? other.getBegindate() == null : this.getBegindate().equals(other.getBegindate()))
            && (this.getEnddate() == null ? other.getEnddate() == null : this.getEnddate().equals(other.getEnddate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSukid() == null) ? 0 : getSukid().hashCode());
        result = prime * result + ((getPvids() == null) ? 0 : getPvids().hashCode());
        result = prime * result + ((getPdid() == null) ? 0 : getPdid().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getIsenable() == null) ? 0 : getIsenable().hashCode());
        result = prime * result + ((getCreatetor() == null) ? 0 : getCreatetor().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getPackvolume() == null) ? 0 : getPackvolume().hashCode());
        result = prime * result + ((getDisamount() == null) ? 0 : getDisamount().hashCode());
        result = prime * result + ((getLongs() == null) ? 0 : getLongs().hashCode());
        result = prime * result + ((getWide() == null) ? 0 : getWide().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getPacknum() == null) ? 0 : getPacknum().hashCode());
        result = prime * result + ((getProjectamout() == null) ? 0 : getProjectamout().hashCode());
        result = prime * result + ((getMsamount() == null) ? 0 : getMsamount().hashCode());
        result = prime * result + ((getPackweight() == null) ? 0 : getPackweight().hashCode());
        result = prime * result + ((getStyleid() == null) ? 0 : getStyleid().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getProductmeg() == null) ? 0 : getProductmeg().hashCode());
        result = prime * result + ((getProductjmeg() == null) ? 0 : getProductjmeg().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPdstylename() == null) ? 0 : getPdstylename().hashCode());
        result = prime * result + ((getListdate() == null) ? 0 : getListdate().hashCode());
        result = prime * result + ((getBegindate() == null) ? 0 : getBegindate().hashCode());
        result = prime * result + ((getEnddate() == null) ? 0 : getEnddate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sukid=").append(sukid);
        sb.append(", pvids=").append(pvids);
        sb.append(", pdid=").append(pdid);
        sb.append(", amount=").append(amount);
        sb.append(", num=").append(num);
        sb.append(", isenable=").append(isenable);
        sb.append(", createtor=").append(createtor);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", weight=").append(weight);
        sb.append(", volume=").append(volume);
        sb.append(", packvolume=").append(packvolume);
        sb.append(", disamount=").append(disamount);
        sb.append(", longs=").append(longs);
        sb.append(", wide=").append(wide);
        sb.append(", height=").append(height);
        sb.append(", packnum=").append(packnum);
        sb.append(", projectamout=").append(projectamout);
        sb.append(", msamount=").append(msamount);
        sb.append(", packweight=").append(packweight);
        sb.append(", styleid=").append(styleid);
        sb.append(", model=").append(model);
        sb.append(", productmeg=").append(productmeg);
        sb.append(", productjmeg=").append(productjmeg);
        sb.append(", remark=").append(remark);
        sb.append(", pdstylename=").append(pdstylename);
        sb.append(", listdate=").append(listdate);
        sb.append(", begindate=").append(begindate);
        sb.append(", enddate=").append(enddate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}