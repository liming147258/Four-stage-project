package com.qp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjptPsSalesorderDao {
    long countByExample(YjptPsSalesorderExample example);

    int deleteByExample(YjptPsSalesorderExample example);

    int deleteByPrimaryKey(Integer soid);

    int insert(YjptPsSalesorder record);

    int insertSelective(YjptPsSalesorder record);

    List<YjptPsSalesorder> selectByExample(YjptPsSalesorderExample example);

    YjptPsSalesorder selectByPrimaryKey(Integer soid);

    int updateByExampleSelective(@Param("record") YjptPsSalesorder record, @Param("example") YjptPsSalesorderExample example);

    int updateByExample(@Param("record") YjptPsSalesorder record, @Param("example") YjptPsSalesorderExample example);

    int updateByPrimaryKeySelective(YjptPsSalesorder record);

    int updateByPrimaryKey(YjptPsSalesorder record);
}