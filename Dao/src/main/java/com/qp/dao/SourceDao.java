package com.qp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SourceDao {
    long countByExample(SourceExample example);

    int deleteByExample(SourceExample example);

    int deleteByPrimaryKey(Integer sourceid);

    int insert(Source record);

    int insertSelective(Source record);

    List<Source> selectByExample(SourceExample example);

    Source selectByPrimaryKey(Integer sourceid);

    int updateByExampleSelective(@Param("record") Source record, @Param("example") SourceExample example);

    int updateByExample(@Param("record") Source record, @Param("example") SourceExample example);

    int updateByPrimaryKeySelective(Source record);

    int updateByPrimaryKey(Source record);
}