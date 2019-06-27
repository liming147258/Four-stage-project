package com.qp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjptPdTextureDao {
    long countByExample(YjptPdTextureExample example);

    int deleteByExample(YjptPdTextureExample example);

    int deleteByPrimaryKey(Integer trid);

    int insert(YjptPdTexture record);

    int insertSelective(YjptPdTexture record);

    List<YjptPdTexture> selectByExample(YjptPdTextureExample example);

    YjptPdTexture selectByPrimaryKey(Integer trid);

    int updateByExampleSelective(@Param("record") YjptPdTexture record, @Param("example") YjptPdTextureExample example);

    int updateByExample(@Param("record") YjptPdTexture record, @Param("example") YjptPdTextureExample example);

    int updateByPrimaryKeySelective(YjptPdTexture record);

    int updateByPrimaryKey(YjptPdTexture record);
}