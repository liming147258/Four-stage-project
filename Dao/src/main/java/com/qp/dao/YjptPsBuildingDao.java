package com.qp.dao;

import com.qp.pojo.YjptPsBuilding;
import com.qp.pojo.YjptPsBuildingExample;
import com.qp.pojo.yangchun.BuildingDong;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface YjptPsBuildingDao {
    long countByExample(YjptPsBuildingExample example);

    int deleteByExample(YjptPsBuildingExample example);

    int deleteByPrimaryKey(Integer buildingid);

    int insert(YjptPsBuilding record);

    int insertSelective(YjptPsBuilding record);

    List<YjptPsBuilding> selectByExample(YjptPsBuildingExample example);

    YjptPsBuilding selectByPrimaryKey(Integer buildingid);

    int updateByExampleSelective(@Param("record") YjptPsBuilding record, @Param("example") YjptPsBuildingExample example);

    int updateByExample(@Param("record") YjptPsBuilding record, @Param("example") YjptPsBuildingExample example);

    int updateByPrimaryKeySelective(YjptPsBuilding record);

    int updateByPrimaryKey(YjptPsBuilding record);

    //查询
    List<BuildingDong> selectAll(Map<String,Object> map);
    //查询行数
    int count();
}