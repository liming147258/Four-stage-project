package com.qp.dao;

import com.qp.pojo.YjptPdProperties;
import com.qp.pojo.YjptPdPropertiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjptPdPropertiesDao {
    long countByExample(YjptPdPropertiesExample example);

    int deleteByExample(YjptPdPropertiesExample example);

    int deleteByPrimaryKey(Integer prid);

    int insert(YjptPdProperties record);

    int insertSelective(YjptPdProperties record);

    List<YjptPdProperties> selectByExample(YjptPdPropertiesExample example);

    YjptPdProperties selectByPrimaryKey(Integer prid);

    int updateByExampleSelective(@Param("record") YjptPdProperties record, @Param("example") YjptPdPropertiesExample example);

    int updateByExample(@Param("record") YjptPdProperties record, @Param("example") YjptPdPropertiesExample example);

    int updateByPrimaryKeySelective(YjptPdProperties record);

    int updateByPrimaryKey(YjptPdProperties record);
}