package com.qp.dao;

import com.qp.pojo.YjptDiWorksrelationship;
import com.qp.pojo.YjptDiWorksrelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjptDiWorksrelationshipDao {
    long countByExample(YjptDiWorksrelationshipExample example);

    int deleteByExample(YjptDiWorksrelationshipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YjptDiWorksrelationship record);

    int insertSelective(YjptDiWorksrelationship record);

    List<YjptDiWorksrelationship> selectByExample(YjptDiWorksrelationshipExample example);

    YjptDiWorksrelationship selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YjptDiWorksrelationship record, @Param("example") YjptDiWorksrelationshipExample example);

    int updateByExample(@Param("record") YjptDiWorksrelationship record, @Param("example") YjptDiWorksrelationshipExample example);

    int updateByPrimaryKeySelective(YjptDiWorksrelationship record);

    int updateByPrimaryKey(YjptDiWorksrelationship record);
}