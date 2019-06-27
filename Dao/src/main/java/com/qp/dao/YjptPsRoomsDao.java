package com.qp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjptPsRoomsDao {
    long countByExample(YjptPsRoomsExample example);

    int deleteByExample(YjptPsRoomsExample example);

    int deleteByPrimaryKey(Integer roomsid);

    int insert(YjptPsRooms record);

    int insertSelective(YjptPsRooms record);

    List<YjptPsRooms> selectByExample(YjptPsRoomsExample example);

    YjptPsRooms selectByPrimaryKey(Integer roomsid);

    int updateByExampleSelective(@Param("record") YjptPsRooms record, @Param("example") YjptPsRoomsExample example);

    int updateByExample(@Param("record") YjptPsRooms record, @Param("example") YjptPsRoomsExample example);

    int updateByPrimaryKeySelective(YjptPsRooms record);

    int updateByPrimaryKey(YjptPsRooms record);
}