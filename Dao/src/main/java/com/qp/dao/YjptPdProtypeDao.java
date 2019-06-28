package com.qp.dao;

import com.qp.pojo.YjptPdProtype;
import com.qp.pojo.YjptPdProtypeExample;
import com.qp.pojo.com.qp.pojo.supe.ProtypeWithChild;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YjptPdProtypeDao {
    long countByExample(YjptPdProtypeExample example);

    int deleteByExample(YjptPdProtypeExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(YjptPdProtype record);

    int insertSelective(YjptPdProtype record);

    List<YjptPdProtype> selectByExample(YjptPdProtypeExample example);

    YjptPdProtype selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") YjptPdProtype record, @Param("example") YjptPdProtypeExample example);

    int updateByExample(@Param("record") YjptPdProtype record, @Param("example") YjptPdProtypeExample example);

    int updateByPrimaryKeySelective(YjptPdProtype record);

    int updateByPrimaryKey(YjptPdProtype record);

    List<ProtypeWithChild> selectAll();
}