package com.qp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodetypeDao {
    long countByExample(CodetypeExample example);

    int deleteByExample(CodetypeExample example);

    int deleteByPrimaryKey(Integer codetypeid);

    int insert(Codetype record);

    int insertSelective(Codetype record);

    List<Codetype> selectByExample(CodetypeExample example);

    Codetype selectByPrimaryKey(Integer codetypeid);

    int updateByExampleSelective(@Param("record") Codetype record, @Param("example") CodetypeExample example);

    int updateByExample(@Param("record") Codetype record, @Param("example") CodetypeExample example);

    int updateByPrimaryKeySelective(Codetype record);

    int updateByPrimaryKey(Codetype record);
}