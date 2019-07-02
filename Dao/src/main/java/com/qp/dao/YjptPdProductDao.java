package com.qp.dao;

import com.qp.pojo.YjptPdProduct;
import com.qp.pojo.YjptPdProductExample;
import com.qp.pojo.yangchun.ProductStatus;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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
    //查询所有未审核状态产品 create ben
    List<ProductStatus> selectNotStatus(Map<String,Object> map);
    //测试
    List<YjptPdProduct> selectAll();
    //查询行数
    int  count();
    //修改
    int updateStatus(YjptPdProduct product);
}