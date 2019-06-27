package com.qp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjptPdLogisticsmatchingDao {
    long countByExample(YjptPdLogisticsmatchingExample example);

    int deleteByExample(YjptPdLogisticsmatchingExample example);

    int deleteByPrimaryKey(Integer prid);

    int insert(YjptPdLogisticsmatching record);

    int insertSelective(YjptPdLogisticsmatching record);

    List<YjptPdLogisticsmatching> selectByExample(YjptPdLogisticsmatchingExample example);

    YjptPdLogisticsmatching selectByPrimaryKey(Integer prid);

    int updateByExampleSelective(@Param("record") YjptPdLogisticsmatching record, @Param("example") YjptPdLogisticsmatchingExample example);

    int updateByExample(@Param("record") YjptPdLogisticsmatching record, @Param("example") YjptPdLogisticsmatchingExample example);

    int updateByPrimaryKeySelective(YjptPdLogisticsmatching record);

    int updateByPrimaryKey(YjptPdLogisticsmatching record);
}