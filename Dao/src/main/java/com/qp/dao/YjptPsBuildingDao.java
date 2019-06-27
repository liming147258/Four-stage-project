package com.qp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}