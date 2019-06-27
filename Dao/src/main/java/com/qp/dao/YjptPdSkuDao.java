package com.qp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjptPdSkuDao {
    long countByExample(YjptPdSkuExample example);

    int deleteByExample(YjptPdSkuExample example);

    int deleteByPrimaryKey(Integer sukid);

    int insert(YjptPdSku record);

    int insertSelective(YjptPdSku record);

    List<YjptPdSku> selectByExample(YjptPdSkuExample example);

    YjptPdSku selectByPrimaryKey(Integer sukid);

    int updateByExampleSelective(@Param("record") YjptPdSku record, @Param("example") YjptPdSkuExample example);

    int updateByExample(@Param("record") YjptPdSku record, @Param("example") YjptPdSkuExample example);

    int updateByPrimaryKeySelective(YjptPdSku record);

    int updateByPrimaryKey(YjptPdSku record);
}