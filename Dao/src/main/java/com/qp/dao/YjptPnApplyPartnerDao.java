package com.qp.dao;

import com.qp.pojo.YjptPnApplyPartner;
import com.qp.pojo.YjptPnApplyPartnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjptPnApplyPartnerDao {
    long countByExample(YjptPnApplyPartnerExample example);

    int deleteByExample(YjptPnApplyPartnerExample example);

    int deleteByPrimaryKey(Integer partnerid);

    int insert(YjptPnApplyPartner record);

    int insertSelective(YjptPnApplyPartner record);

    List<YjptPnApplyPartner> selectByExample(YjptPnApplyPartnerExample example);

    YjptPnApplyPartner selectByPrimaryKey(Integer partnerid);

    int updateByExampleSelective(@Param("record") YjptPnApplyPartner record, @Param("example") YjptPnApplyPartnerExample example);

    int updateByExample(@Param("record") YjptPnApplyPartner record, @Param("example") YjptPnApplyPartnerExample example);

    int updateByPrimaryKeySelective(YjptPnApplyPartner record);

    int updateByPrimaryKey(YjptPnApplyPartner record);
}