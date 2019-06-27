package com.qp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjptPdProdetailDao {
    long countByExample(YjptPdProdetailExample example);

    int deleteByExample(YjptPdProdetailExample example);

    int deleteByPrimaryKey(Integer dtid);

    int insert(YjptPdProdetail record);

    int insertSelective(YjptPdProdetail record);

    List<YjptPdProdetail> selectByExample(YjptPdProdetailExample example);

    YjptPdProdetail selectByPrimaryKey(Integer dtid);

    int updateByExampleSelective(@Param("record") YjptPdProdetail record, @Param("example") YjptPdProdetailExample example);

    int updateByExample(@Param("record") YjptPdProdetail record, @Param("example") YjptPdProdetailExample example);

    int updateByPrimaryKeySelective(YjptPdProdetail record);

    int updateByPrimaryKey(YjptPdProdetail record);
}