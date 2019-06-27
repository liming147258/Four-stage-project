package com.qp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjptPdProductDao {
    long countByExample(YjptPdProductExample example);

    int deleteByExample(YjptPdProductExample example);

    int deleteByPrimaryKey(Integer pdid);

    int insert(YjptPdProduct record);

    int insertSelective(YjptPdProduct record);

    List<YjptPdProduct> selectByExample(YjptPdProductExample example);

    YjptPdProduct selectByPrimaryKey(Integer pdid);

    int updateByExampleSelective(@Param("record") YjptPdProduct record, @Param("example") YjptPdProductExample example);

    int updateByExample(@Param("record") YjptPdProduct record, @Param("example") YjptPdProductExample example);

    int updateByPrimaryKeySelective(YjptPdProduct record);

    int updateByPrimaryKey(YjptPdProduct record);
}