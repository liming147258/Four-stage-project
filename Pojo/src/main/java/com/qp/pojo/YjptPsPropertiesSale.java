package com.qp.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * yjpt_ps_properties_sale
 * @author 
 */
public class YjptPsPropertiesSale implements Serializable {
    /**
     * 主键
     */
    private Integer propertiesid;

    /**
     * 楼盘名称
     */
    private String propertiesname;

    /**
     * 楼盘类型
     */
    private String propertytype;

    /**
     * 外建:售楼公司ID(值取PARTNERID)
     */
    private Integer salescompanyid;

    /**
     * 外建:物业公司(值取PARTNERID)
     */
    private Integer propertycompanyid;

    /**
     * 外建:楼盘开发商(值取PARTNERID)
     */
    private Integer developersid;

    /**
     * 外建:区域公司
     */
    private Integer regionalcompanyid;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区/县
     */
    private String area;

    /**
     * 楼盘地址
     */
    private String address;

    /**
     * 参考均价
     */
    private Long averageprice;

    /**
     * 预计收楼时间
     */
    private Date obtaintime;

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
     * 审核人
     */
    private String auditor;

    /**
     * 审核时间
     */
    private Date audittime;

    /**
     * 审核状态(0=待审 1=通过 2=不通过)
     */
    private String auditstatus;

    /**
     * 审核意见
     */
    private String auditremark;

    /**
     * 楼盘介绍信息
     */
    private String info;

    /**
     * 经度
     */
    private Long longitude;

    /**
     * 纬度
     */
    private Long latitude;

    /**
     * 激活码(审核通过生成)
     */
    private String activationcode;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 离市级商业中心距离
     */
    private String ctitydistance;

    /**
     * 离区级商业中心距离
     */
    private String areadistance;

    /**
     * 与火车站距离
     */
    private String traindistance;

    /**
     * 与地铁站距离
     */
    private String metrodistance;

    /**
     * 商业繁华程度
     */
    private String prosperity;

    /**
     * 文化科技教育设施
     */
    private String education;

    /**
     * 医疗卫生设施
     */
    private String medical;

    /**
     * 环境因素
     */
    private String environmental;

    /**
     * 地质情况
     */
    private String geological;

    /**
     * 小区交通配套
     */
    private String traffic;

    /**
     * 健身,休闲场地
     */
    private String leisurevenues;

    /**
     * 车位/房屋套数比
     */
    private String parkingproportion;

    /**
     * 小区内教育设施
     */
    private String facilities;

    /**
     * 小区内商业设施
     */
    private String commercialfacilities;

    /**
     * 环卫设施
     */
    private String sanitationfacilities;

    /**
     * 消防设施
     */
    private String protectionfacilities;

    /**
     * 安防设施
     */
    private String securityfacilities;

    /**
     * 小区开放程度
     */
    private String openness;

    /**
     * 照明
     */
    private String lighting;

    /**
     * 围栏
     */
    private String enclosure;

    /**
     * 绿化率
     */
    private String greeningrate;

    /**
     * 容积率
     */
    private String volumeratio;

    /**
     * 楼座位置
     */
    private String aposition;

    /**
     * 电梯数/每层户数比
     */
    private String numberratio;

    /**
     * 楼宇智能化
     */
    private String intelligent;

    /**
     * 中央空调
     */
    private String airconditioner;

    /**
     * 固定供气
     */
    private String supply;

    /**
     * 建筑结构
     */
    private String structure;

    /**
     * 节能与环保
     */
    private String protection;

    /**
     * 外立面装修
     */
    private String exteriordecoration;

    /**
     * 户型设计
     */
    private String design;

    /**
     * 朝向因素
     */
    private String orientation;

    /**
     * 层高
     */
    private String storey;

    /**
     * 装修标准
     */
    private String decoration;

    /**
     * 智能家居
     */
    private String smarthome;

    /**
     * 使用率
     */
    private String usagerate;

    /**
     * 开发商信誉
     */
    private String reputation;

    /**
     * 开发资质
     */
    private String qualification;

    /**
     * 品牌价值
     */
    private String brandvalue;

    /**
     * 物业管理
     */
    private String property;

    private static final long serialVersionUID = 1L;

    public Integer getPropertiesid() {
        return propertiesid;
    }

    public void setPropertiesid(Integer propertiesid) {
        this.propertiesid = propertiesid;
    }

    public String getPropertiesname() {
        return propertiesname;
    }

    public void setPropertiesname(String propertiesname) {
        this.propertiesname = propertiesname;
    }

    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }

    public Integer getSalescompanyid() {
        return salescompanyid;
    }

    public void setSalescompanyid(Integer salescompanyid) {
        this.salescompanyid = salescompanyid;
    }

    public Integer getPropertycompanyid() {
        return propertycompanyid;
    }

    public void setPropertycompanyid(Integer propertycompanyid) {
        this.propertycompanyid = propertycompanyid;
    }

    public Integer getDevelopersid() {
        return developersid;
    }

    public void setDevelopersid(Integer developersid) {
        this.developersid = developersid;
    }

    public Integer getRegionalcompanyid() {
        return regionalcompanyid;
    }

    public void setRegionalcompanyid(Integer regionalcompanyid) {
        this.regionalcompanyid = regionalcompanyid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAverageprice() {
        return averageprice;
    }

    public void setAverageprice(Long averageprice) {
        this.averageprice = averageprice;
    }

    public Date getObtaintime() {
        return obtaintime;
    }

    public void setObtaintime(Date obtaintime) {
        this.obtaintime = obtaintime;
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

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public String getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus;
    }

    public String getAuditremark() {
        return auditremark;
    }

    public void setAuditremark(String auditremark) {
        this.auditremark = auditremark;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public String getActivationcode() {
        return activationcode;
    }

    public void setActivationcode(String activationcode) {
        this.activationcode = activationcode;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCtitydistance() {
        return ctitydistance;
    }

    public void setCtitydistance(String ctitydistance) {
        this.ctitydistance = ctitydistance;
    }

    public String getAreadistance() {
        return areadistance;
    }

    public void setAreadistance(String areadistance) {
        this.areadistance = areadistance;
    }

    public String getTraindistance() {
        return traindistance;
    }

    public void setTraindistance(String traindistance) {
        this.traindistance = traindistance;
    }

    public String getMetrodistance() {
        return metrodistance;
    }

    public void setMetrodistance(String metrodistance) {
        this.metrodistance = metrodistance;
    }

    public String getProsperity() {
        return prosperity;
    }

    public void setProsperity(String prosperity) {
        this.prosperity = prosperity;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMedical() {
        return medical;
    }

    public void setMedical(String medical) {
        this.medical = medical;
    }

    public String getEnvironmental() {
        return environmental;
    }

    public void setEnvironmental(String environmental) {
        this.environmental = environmental;
    }

    public String getGeological() {
        return geological;
    }

    public void setGeological(String geological) {
        this.geological = geological;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public String getLeisurevenues() {
        return leisurevenues;
    }

    public void setLeisurevenues(String leisurevenues) {
        this.leisurevenues = leisurevenues;
    }

    public String getParkingproportion() {
        return parkingproportion;
    }

    public void setParkingproportion(String parkingproportion) {
        this.parkingproportion = parkingproportion;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getCommercialfacilities() {
        return commercialfacilities;
    }

    public void setCommercialfacilities(String commercialfacilities) {
        this.commercialfacilities = commercialfacilities;
    }

    public String getSanitationfacilities() {
        return sanitationfacilities;
    }

    public void setSanitationfacilities(String sanitationfacilities) {
        this.sanitationfacilities = sanitationfacilities;
    }

    public String getProtectionfacilities() {
        return protectionfacilities;
    }

    public void setProtectionfacilities(String protectionfacilities) {
        this.protectionfacilities = protectionfacilities;
    }

    public String getSecurityfacilities() {
        return securityfacilities;
    }

    public void setSecurityfacilities(String securityfacilities) {
        this.securityfacilities = securityfacilities;
    }

    public String getOpenness() {
        return openness;
    }

    public void setOpenness(String openness) {
        this.openness = openness;
    }

    public String getLighting() {
        return lighting;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
    }

    public String getGreeningrate() {
        return greeningrate;
    }

    public void setGreeningrate(String greeningrate) {
        this.greeningrate = greeningrate;
    }

    public String getVolumeratio() {
        return volumeratio;
    }

    public void setVolumeratio(String volumeratio) {
        this.volumeratio = volumeratio;
    }

    public String getAposition() {
        return aposition;
    }

    public void setAposition(String aposition) {
        this.aposition = aposition;
    }

    public String getNumberratio() {
        return numberratio;
    }

    public void setNumberratio(String numberratio) {
        this.numberratio = numberratio;
    }

    public String getIntelligent() {
        return intelligent;
    }

    public void setIntelligent(String intelligent) {
        this.intelligent = intelligent;
    }

    public String getAirconditioner() {
        return airconditioner;
    }

    public void setAirconditioner(String airconditioner) {
        this.airconditioner = airconditioner;
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    public String getExteriordecoration() {
        return exteriordecoration;
    }

    public void setExteriordecoration(String exteriordecoration) {
        this.exteriordecoration = exteriordecoration;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getStorey() {
        return storey;
    }

    public void setStorey(String storey) {
        this.storey = storey;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public String getSmarthome() {
        return smarthome;
    }

    public void setSmarthome(String smarthome) {
        this.smarthome = smarthome;
    }

    public String getUsagerate() {
        return usagerate;
    }

    public void setUsagerate(String usagerate) {
        this.usagerate = usagerate;
    }

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getBrandvalue() {
        return brandvalue;
    }

    public void setBrandvalue(String brandvalue) {
        this.brandvalue = brandvalue;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
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
        YjptPsPropertiesSale other = (YjptPsPropertiesSale) that;
        return (this.getPropertiesid() == null ? other.getPropertiesid() == null : this.getPropertiesid().equals(other.getPropertiesid()))
            && (this.getPropertiesname() == null ? other.getPropertiesname() == null : this.getPropertiesname().equals(other.getPropertiesname()))
            && (this.getPropertytype() == null ? other.getPropertytype() == null : this.getPropertytype().equals(other.getPropertytype()))
            && (this.getSalescompanyid() == null ? other.getSalescompanyid() == null : this.getSalescompanyid().equals(other.getSalescompanyid()))
            && (this.getPropertycompanyid() == null ? other.getPropertycompanyid() == null : this.getPropertycompanyid().equals(other.getPropertycompanyid()))
            && (this.getDevelopersid() == null ? other.getDevelopersid() == null : this.getDevelopersid().equals(other.getDevelopersid()))
            && (this.getRegionalcompanyid() == null ? other.getRegionalcompanyid() == null : this.getRegionalcompanyid().equals(other.getRegionalcompanyid()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAverageprice() == null ? other.getAverageprice() == null : this.getAverageprice().equals(other.getAverageprice()))
            && (this.getObtaintime() == null ? other.getObtaintime() == null : this.getObtaintime().equals(other.getObtaintime()))
            && (this.getIsenable() == null ? other.getIsenable() == null : this.getIsenable().equals(other.getIsenable()))
            && (this.getCreatetor() == null ? other.getCreatetor() == null : this.getCreatetor().equals(other.getCreatetor()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAudittime() == null ? other.getAudittime() == null : this.getAudittime().equals(other.getAudittime()))
            && (this.getAuditstatus() == null ? other.getAuditstatus() == null : this.getAuditstatus().equals(other.getAuditstatus()))
            && (this.getAuditremark() == null ? other.getAuditremark() == null : this.getAuditremark().equals(other.getAuditremark()))
            && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getActivationcode() == null ? other.getActivationcode() == null : this.getActivationcode().equals(other.getActivationcode()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getCtitydistance() == null ? other.getCtitydistance() == null : this.getCtitydistance().equals(other.getCtitydistance()))
            && (this.getAreadistance() == null ? other.getAreadistance() == null : this.getAreadistance().equals(other.getAreadistance()))
            && (this.getTraindistance() == null ? other.getTraindistance() == null : this.getTraindistance().equals(other.getTraindistance()))
            && (this.getMetrodistance() == null ? other.getMetrodistance() == null : this.getMetrodistance().equals(other.getMetrodistance()))
            && (this.getProsperity() == null ? other.getProsperity() == null : this.getProsperity().equals(other.getProsperity()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getMedical() == null ? other.getMedical() == null : this.getMedical().equals(other.getMedical()))
            && (this.getEnvironmental() == null ? other.getEnvironmental() == null : this.getEnvironmental().equals(other.getEnvironmental()))
            && (this.getGeological() == null ? other.getGeological() == null : this.getGeological().equals(other.getGeological()))
            && (this.getTraffic() == null ? other.getTraffic() == null : this.getTraffic().equals(other.getTraffic()))
            && (this.getLeisurevenues() == null ? other.getLeisurevenues() == null : this.getLeisurevenues().equals(other.getLeisurevenues()))
            && (this.getParkingproportion() == null ? other.getParkingproportion() == null : this.getParkingproportion().equals(other.getParkingproportion()))
            && (this.getFacilities() == null ? other.getFacilities() == null : this.getFacilities().equals(other.getFacilities()))
            && (this.getCommercialfacilities() == null ? other.getCommercialfacilities() == null : this.getCommercialfacilities().equals(other.getCommercialfacilities()))
            && (this.getSanitationfacilities() == null ? other.getSanitationfacilities() == null : this.getSanitationfacilities().equals(other.getSanitationfacilities()))
            && (this.getProtectionfacilities() == null ? other.getProtectionfacilities() == null : this.getProtectionfacilities().equals(other.getProtectionfacilities()))
            && (this.getSecurityfacilities() == null ? other.getSecurityfacilities() == null : this.getSecurityfacilities().equals(other.getSecurityfacilities()))
            && (this.getOpenness() == null ? other.getOpenness() == null : this.getOpenness().equals(other.getOpenness()))
            && (this.getLighting() == null ? other.getLighting() == null : this.getLighting().equals(other.getLighting()))
            && (this.getEnclosure() == null ? other.getEnclosure() == null : this.getEnclosure().equals(other.getEnclosure()))
            && (this.getGreeningrate() == null ? other.getGreeningrate() == null : this.getGreeningrate().equals(other.getGreeningrate()))
            && (this.getVolumeratio() == null ? other.getVolumeratio() == null : this.getVolumeratio().equals(other.getVolumeratio()))
            && (this.getAposition() == null ? other.getAposition() == null : this.getAposition().equals(other.getAposition()))
            && (this.getNumberratio() == null ? other.getNumberratio() == null : this.getNumberratio().equals(other.getNumberratio()))
            && (this.getIntelligent() == null ? other.getIntelligent() == null : this.getIntelligent().equals(other.getIntelligent()))
            && (this.getAirconditioner() == null ? other.getAirconditioner() == null : this.getAirconditioner().equals(other.getAirconditioner()))
            && (this.getSupply() == null ? other.getSupply() == null : this.getSupply().equals(other.getSupply()))
            && (this.getStructure() == null ? other.getStructure() == null : this.getStructure().equals(other.getStructure()))
            && (this.getProtection() == null ? other.getProtection() == null : this.getProtection().equals(other.getProtection()))
            && (this.getExteriordecoration() == null ? other.getExteriordecoration() == null : this.getExteriordecoration().equals(other.getExteriordecoration()))
            && (this.getDesign() == null ? other.getDesign() == null : this.getDesign().equals(other.getDesign()))
            && (this.getOrientation() == null ? other.getOrientation() == null : this.getOrientation().equals(other.getOrientation()))
            && (this.getStorey() == null ? other.getStorey() == null : this.getStorey().equals(other.getStorey()))
            && (this.getDecoration() == null ? other.getDecoration() == null : this.getDecoration().equals(other.getDecoration()))
            && (this.getSmarthome() == null ? other.getSmarthome() == null : this.getSmarthome().equals(other.getSmarthome()))
            && (this.getUsagerate() == null ? other.getUsagerate() == null : this.getUsagerate().equals(other.getUsagerate()))
            && (this.getReputation() == null ? other.getReputation() == null : this.getReputation().equals(other.getReputation()))
            && (this.getQualification() == null ? other.getQualification() == null : this.getQualification().equals(other.getQualification()))
            && (this.getBrandvalue() == null ? other.getBrandvalue() == null : this.getBrandvalue().equals(other.getBrandvalue()))
            && (this.getProperty() == null ? other.getProperty() == null : this.getProperty().equals(other.getProperty()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPropertiesid() == null) ? 0 : getPropertiesid().hashCode());
        result = prime * result + ((getPropertiesname() == null) ? 0 : getPropertiesname().hashCode());
        result = prime * result + ((getPropertytype() == null) ? 0 : getPropertytype().hashCode());
        result = prime * result + ((getSalescompanyid() == null) ? 0 : getSalescompanyid().hashCode());
        result = prime * result + ((getPropertycompanyid() == null) ? 0 : getPropertycompanyid().hashCode());
        result = prime * result + ((getDevelopersid() == null) ? 0 : getDevelopersid().hashCode());
        result = prime * result + ((getRegionalcompanyid() == null) ? 0 : getRegionalcompanyid().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAverageprice() == null) ? 0 : getAverageprice().hashCode());
        result = prime * result + ((getObtaintime() == null) ? 0 : getObtaintime().hashCode());
        result = prime * result + ((getIsenable() == null) ? 0 : getIsenable().hashCode());
        result = prime * result + ((getCreatetor() == null) ? 0 : getCreatetor().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAudittime() == null) ? 0 : getAudittime().hashCode());
        result = prime * result + ((getAuditstatus() == null) ? 0 : getAuditstatus().hashCode());
        result = prime * result + ((getAuditremark() == null) ? 0 : getAuditremark().hashCode());
        result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getActivationcode() == null) ? 0 : getActivationcode().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getCtitydistance() == null) ? 0 : getCtitydistance().hashCode());
        result = prime * result + ((getAreadistance() == null) ? 0 : getAreadistance().hashCode());
        result = prime * result + ((getTraindistance() == null) ? 0 : getTraindistance().hashCode());
        result = prime * result + ((getMetrodistance() == null) ? 0 : getMetrodistance().hashCode());
        result = prime * result + ((getProsperity() == null) ? 0 : getProsperity().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getMedical() == null) ? 0 : getMedical().hashCode());
        result = prime * result + ((getEnvironmental() == null) ? 0 : getEnvironmental().hashCode());
        result = prime * result + ((getGeological() == null) ? 0 : getGeological().hashCode());
        result = prime * result + ((getTraffic() == null) ? 0 : getTraffic().hashCode());
        result = prime * result + ((getLeisurevenues() == null) ? 0 : getLeisurevenues().hashCode());
        result = prime * result + ((getParkingproportion() == null) ? 0 : getParkingproportion().hashCode());
        result = prime * result + ((getFacilities() == null) ? 0 : getFacilities().hashCode());
        result = prime * result + ((getCommercialfacilities() == null) ? 0 : getCommercialfacilities().hashCode());
        result = prime * result + ((getSanitationfacilities() == null) ? 0 : getSanitationfacilities().hashCode());
        result = prime * result + ((getProtectionfacilities() == null) ? 0 : getProtectionfacilities().hashCode());
        result = prime * result + ((getSecurityfacilities() == null) ? 0 : getSecurityfacilities().hashCode());
        result = prime * result + ((getOpenness() == null) ? 0 : getOpenness().hashCode());
        result = prime * result + ((getLighting() == null) ? 0 : getLighting().hashCode());
        result = prime * result + ((getEnclosure() == null) ? 0 : getEnclosure().hashCode());
        result = prime * result + ((getGreeningrate() == null) ? 0 : getGreeningrate().hashCode());
        result = prime * result + ((getVolumeratio() == null) ? 0 : getVolumeratio().hashCode());
        result = prime * result + ((getAposition() == null) ? 0 : getAposition().hashCode());
        result = prime * result + ((getNumberratio() == null) ? 0 : getNumberratio().hashCode());
        result = prime * result + ((getIntelligent() == null) ? 0 : getIntelligent().hashCode());
        result = prime * result + ((getAirconditioner() == null) ? 0 : getAirconditioner().hashCode());
        result = prime * result + ((getSupply() == null) ? 0 : getSupply().hashCode());
        result = prime * result + ((getStructure() == null) ? 0 : getStructure().hashCode());
        result = prime * result + ((getProtection() == null) ? 0 : getProtection().hashCode());
        result = prime * result + ((getExteriordecoration() == null) ? 0 : getExteriordecoration().hashCode());
        result = prime * result + ((getDesign() == null) ? 0 : getDesign().hashCode());
        result = prime * result + ((getOrientation() == null) ? 0 : getOrientation().hashCode());
        result = prime * result + ((getStorey() == null) ? 0 : getStorey().hashCode());
        result = prime * result + ((getDecoration() == null) ? 0 : getDecoration().hashCode());
        result = prime * result + ((getSmarthome() == null) ? 0 : getSmarthome().hashCode());
        result = prime * result + ((getUsagerate() == null) ? 0 : getUsagerate().hashCode());
        result = prime * result + ((getReputation() == null) ? 0 : getReputation().hashCode());
        result = prime * result + ((getQualification() == null) ? 0 : getQualification().hashCode());
        result = prime * result + ((getBrandvalue() == null) ? 0 : getBrandvalue().hashCode());
        result = prime * result + ((getProperty() == null) ? 0 : getProperty().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", propertiesid=").append(propertiesid);
        sb.append(", propertiesname=").append(propertiesname);
        sb.append(", propertytype=").append(propertytype);
        sb.append(", salescompanyid=").append(salescompanyid);
        sb.append(", propertycompanyid=").append(propertycompanyid);
        sb.append(", developersid=").append(developersid);
        sb.append(", regionalcompanyid=").append(regionalcompanyid);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", address=").append(address);
        sb.append(", averageprice=").append(averageprice);
        sb.append(", obtaintime=").append(obtaintime);
        sb.append(", isenable=").append(isenable);
        sb.append(", createtor=").append(createtor);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", auditor=").append(auditor);
        sb.append(", audittime=").append(audittime);
        sb.append(", auditstatus=").append(auditstatus);
        sb.append(", auditremark=").append(auditremark);
        sb.append(", info=").append(info);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", activationcode=").append(activationcode);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", ctitydistance=").append(ctitydistance);
        sb.append(", areadistance=").append(areadistance);
        sb.append(", traindistance=").append(traindistance);
        sb.append(", metrodistance=").append(metrodistance);
        sb.append(", prosperity=").append(prosperity);
        sb.append(", education=").append(education);
        sb.append(", medical=").append(medical);
        sb.append(", environmental=").append(environmental);
        sb.append(", geological=").append(geological);
        sb.append(", traffic=").append(traffic);
        sb.append(", leisurevenues=").append(leisurevenues);
        sb.append(", parkingproportion=").append(parkingproportion);
        sb.append(", facilities=").append(facilities);
        sb.append(", commercialfacilities=").append(commercialfacilities);
        sb.append(", sanitationfacilities=").append(sanitationfacilities);
        sb.append(", protectionfacilities=").append(protectionfacilities);
        sb.append(", securityfacilities=").append(securityfacilities);
        sb.append(", openness=").append(openness);
        sb.append(", lighting=").append(lighting);
        sb.append(", enclosure=").append(enclosure);
        sb.append(", greeningrate=").append(greeningrate);
        sb.append(", volumeratio=").append(volumeratio);
        sb.append(", aposition=").append(aposition);
        sb.append(", numberratio=").append(numberratio);
        sb.append(", intelligent=").append(intelligent);
        sb.append(", airconditioner=").append(airconditioner);
        sb.append(", supply=").append(supply);
        sb.append(", structure=").append(structure);
        sb.append(", protection=").append(protection);
        sb.append(", exteriordecoration=").append(exteriordecoration);
        sb.append(", design=").append(design);
        sb.append(", orientation=").append(orientation);
        sb.append(", storey=").append(storey);
        sb.append(", decoration=").append(decoration);
        sb.append(", smarthome=").append(smarthome);
        sb.append(", usagerate=").append(usagerate);
        sb.append(", reputation=").append(reputation);
        sb.append(", qualification=").append(qualification);
        sb.append(", brandvalue=").append(brandvalue);
        sb.append(", property=").append(property);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}