package com.qp.dao;

import com.qp.pojo.YjptPsPropertiesImg;
import com.qp.pojo.YjptPsPropertiesImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjptPsPropertiesImgDao {
    long countByExample(YjptPsPropertiesImgExample example);

    int deleteByExample(YjptPsPropertiesImgExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(YjptPsPropertiesImg record);

    int insertSelective(YjptPsPropertiesImg record);

    List<YjptPsPropertiesImg> selectByExample(YjptPsPropertiesImgExample example);

    YjptPsPropertiesImg selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") YjptPsPropertiesImg record, @Param("example") YjptPsPropertiesImgExample example);

    int updateByExample(@Param("record") YjptPsPropertiesImg record, @Param("example") YjptPsPropertiesImgExample example);

    int updateByPrimaryKeySelective(YjptPsPropertiesImg record);

    int updateByPrimaryKey(YjptPsPropertiesImg record);
}