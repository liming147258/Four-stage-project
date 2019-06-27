package com.qp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjptPsPropertiesSaleDao {
    long countByExample(YjptPsPropertiesSaleExample example);

    int deleteByExample(YjptPsPropertiesSaleExample example);

    int deleteByPrimaryKey(Integer propertiesid);

    int insert(YjptPsPropertiesSale record);

    int insertSelective(YjptPsPropertiesSale record);

    List<YjptPsPropertiesSale> selectByExample(YjptPsPropertiesSaleExample example);

    YjptPsPropertiesSale selectByPrimaryKey(Integer propertiesid);

    int updateByExampleSelective(@Param("record") YjptPsPropertiesSale record, @Param("example") YjptPsPropertiesSaleExample example);

    int updateByExample(@Param("record") YjptPsPropertiesSale record, @Param("example") YjptPsPropertiesSaleExample example);

    int updateByPrimaryKeySelective(YjptPsPropertiesSale record);

    int updateByPrimaryKey(YjptPsPropertiesSale record);
}